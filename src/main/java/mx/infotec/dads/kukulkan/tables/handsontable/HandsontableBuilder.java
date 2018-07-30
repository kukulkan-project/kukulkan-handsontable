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

package mx.infotec.dads.kukulkan.tables.handsontable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import mx.infotec.dads.kukulkan.tables.handsontable.annotations.SheetColumn;

public class HandsontableBuilder {

    public static Handsontable createHansontable(Class clazz) {
        Handsontable table = new Handsontable();
        Map<Field, SheetColumn> annotatedFields = getColumnAnnotatedFields(clazz);
        addHeaders(table, annotatedFields);
        addColumns(table, annotatedFields);
        return table;
    }

    public static void addColumns(Handsontable table, Map<Field, SheetColumn> annotatedFields) {
        List<Column> columns = new ArrayList<>();
        for (Entry<Field, SheetColumn> entry : annotatedFields.entrySet()) {
            columns.add(buildColumn(entry.getKey(), entry.getValue()));
        }
        table.withColumns(columns);
    }

    private static Map<Field, SheetColumn> getColumnAnnotatedFields(Class clazz) {
        Map<Field, SheetColumn> annotatedFields = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(SheetColumn.class)) {
                annotatedFields.put(field, field.getAnnotation(SheetColumn.class));
            }
        }
        return annotatedFields;
    }

    public static void addHeaders(Handsontable table, Map<Field, SheetColumn> annotatedFields) {
        List<String> colHeaders = new ArrayList<>();
        for (Entry<Field, SheetColumn> entry : annotatedFields.entrySet()) {
            SheetColumn annotation = entry.getValue();
            Field fielt = entry.getKey();
            if (annotation.title() == null || "".equals(annotation.title())) {
                colHeaders.add(entry.getKey().getName());
            } else {
                colHeaders.add(annotation.title());
            }
        }
        table.withColHeaders(colHeaders);
    }

    private static Column buildColumn(Field field, SheetColumn annotation) {
        Column column = new Column();
        switch (annotation.type()) {
        case "text":
            column = new Column();
            break;

        case "numeric":
            column = new NumericColumn();
            break;

        case "checkbox":
            column = new CheckboxColumn();
            break;

        // TODO: add missing cell types

        default:
            return null;
        }
        return column;
    }

}
