/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2018 Roberto Villarejo Martínez
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mx.infotec.dads.kukulkan.tables.apachepoi;

import static mx.infotec.dads.kukulkan.tables.handsontable.utils.HandsontableBuilderUtils.buildHeaderFromAnnotatedProperty;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Slice;

public class PojoToXlsxConverter<T> {

    private static final Logger log = LoggerFactory.getLogger(PojoToXlsxConverter.class);

    private SXSSFWorkbook workbook = new SXSSFWorkbook();

    private Supplier<Slice<T>> dataSupplier;

    private int currentRowNumber = 1;

    private List<Method> methods = new ArrayList<>();

    private List<String> headers = new ArrayList<>();

    private SXSSFSheet sheet;

    public PojoToXlsxConverter(Class<T> clazz, Supplier<Slice<T>> dataSupplier) {
        this.dataSupplier = dataSupplier;
        this.sheet = workbook.createSheet();
        buildHeaders(clazz);
    }

    public Workbook getWorkbook() {
        return workbook;
    }

    public void convert() {
        addHeaders();
        addData();
    }

    private void buildHeaders(Class<T> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String header = buildHeaderFromAnnotatedProperty(field);
            if (header != null) {
                headers.add(header);
            }
        }
        getMethods(fields, clazz);
    }

    private void getMethods(Field[] fields, Class<T> clazz) {
        for (Field field : fields) {
            String fieldName = field.getName();
            char firstLetter = fieldName.charAt(0);
            char uppercaseFirstLetter = Character.toUpperCase(firstLetter);
            String getMethodName = "get" + field.getName().replaceFirst(Character.toString(firstLetter),
                    Character.toString(uppercaseFirstLetter));
            try {
                Method method = clazz.getMethod(getMethodName);
                methods.add(method);
            } catch (NoSuchMethodException | SecurityException e) {
                log.error("No get method for property {} in class {}", field.getName(), clazz.getName());
            }
        }
    }

    public void addHeaders() {
        SXSSFRow row = sheet.createRow(0);

        Iterator<String> it = headers.listIterator();

        int cellNum = 0;
        while (it.hasNext()) {
            String header = it.next();
            SXSSFCell cell = row.createCell(cellNum);
            cell.setCellValue(header);
            cellNum++;
        }
    }

    public void addData() {
        Slice<T> slice;
        while ((slice = dataSupplier.get()) != null) {
            for (T t : slice.getContent()) {
                addRowDataFromObject(t);
            }
        }
    }

    private List<String> getDataFromObject(T t) {
        List<String> result = new ArrayList<>();
        for (Method method : methods) {
            try {
                Object obj = method.invoke(t, null);
                String element = obj == null ? null : obj.toString();
                result.add(element);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                result.add("");
            }
        }
        return result;
    }

    private void addRowDataFromObject(T t) {
        SXSSFRow row = sheet.createRow(currentRowNumber);
        int currentCol = 0;
        List<String> data = getDataFromObject(t);
        for (String dataCell : data) {
            SXSSFCell cell = row.createCell(currentCol);
            cell.setCellValue(dataCell);
            currentCol++;
        }
        currentRowNumber++;
    }

}
