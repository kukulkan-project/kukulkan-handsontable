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
import static mx.infotec.dads.kukulkan.tables.handsontable.utils.HandsontableBuilderUtils.inferApacheCellType;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkbookFactory {

    private static final Logger log = LoggerFactory.getLogger(WorkbookFactory.class);

    private WorkbookFactory() {
    }

    @SuppressWarnings("rawtypes")
    private static WeakHashMap<Class, XSSFWorkbook> workbookMap = new WeakHashMap<>();

    @SuppressWarnings("rawtypes")
    private static WeakHashMap<Class, List<Method>> getterMethods = new WeakHashMap<>();

    @SuppressWarnings("rawtypes")
    private static WeakHashMap<Class, List<CellType>> cellTypeList = new WeakHashMap<>();

    @SuppressWarnings("rawtypes")
    public static XSSFWorkbook getWorkbook(Class clazz) {
        if (workbookMap.containsKey(clazz)) {
            return workbookMap.get(clazz);
        } else {
            XSSFWorkbook workbook = buildWorkbook(clazz);
            workbookMap.put(clazz, workbook);
            return workbook;
        }
    }

    private static XSSFWorkbook buildWorkbook(Class<?> clazz) {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet();
        List<String> headers = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String header = buildHeaderFromAnnotatedProperty(field);
            if (header != null) {
                headers.add(header);
            }
        }
        addHeaders(sheet, headers);
        return workbook;

    }

    public static List<Method> getGetterMethods(Class<?> clazz) {
        if (getterMethods.containsKey(clazz)) {
            return getterMethods.get(clazz);
        } else {
            Field[] fields = clazz.getDeclaredFields();
            List<Method> methods = new ArrayList<>();
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
                    log.debug("No get method for property {} in class {}", field.getName(), clazz.getName());
                }
            }
            return methods;
        }
    }

    public static List<CellType> getCellTypes(Class<?> clazz) {
        if (cellTypeList.containsKey(clazz)) {
            return cellTypeList.get(clazz);
        }
        Field[] fields = clazz.getDeclaredFields();
        List<CellType> cellTypes = new ArrayList<>();
        for (Field field : fields) {
            cellTypes.add(inferApacheCellType(field));
        }
        cellTypeList.put(clazz, cellTypes);
        return cellTypes;
    }

    private static void addHeaders(XSSFSheet sheet, List<String> headers) {
        XSSFRow row = sheet.createRow(0);

        Iterator<String> it = headers.listIterator();

        int cellNum = 0;
        while (it.hasNext()) {
            String header = it.next();
            XSSFCell cell = row.createCell(cellNum);
            cell.setCellValue(header);
            cellNum++;
        }
    }

}
