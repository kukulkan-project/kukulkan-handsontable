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

    private HandsontableBuilder() {

    }

    public static <T> Handsontable<T> createHandsontable(Class<T> clazz, List<T> data) {
        Handsontable<T> table = createHandsontable(clazz);
        table.withData(data);
        return table;
    }

    public static <T> Handsontable<T> createHandsontable(Class<T> clazz) {
        Handsontable<T> table = new Handsontable<>();
        Map<Field, SheetColumn> annotatedFields = getColumnAnnotatedFields(clazz);
        addHeaders(table, annotatedFields);
        addColumns(table, annotatedFields);
        return table;
    }

    public static <T> void addColumns(Handsontable<T> table, Map<Field, SheetColumn> annotatedFields) {
        List<Column> columns = new ArrayList<>();
        for (Entry<Field, SheetColumn> entry : annotatedFields.entrySet()) {
            columns.add(buildColumn(entry.getKey(), entry.getValue()));
        }
        table.withColumns(columns);
    }

    private static <T> Map<Field, SheetColumn> getColumnAnnotatedFields(Class<T> clazz) {
        Map<Field, SheetColumn> annotatedFields = new HashMap<>();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(SheetColumn.class)) {
                annotatedFields.put(field, field.getAnnotation(SheetColumn.class));
            }
        }
        return annotatedFields;
    }

    public static <T> void addHeaders(Handsontable<T> table, Map<Field, SheetColumn> annotatedFields) {
        List<String> colHeaders = new ArrayList<>();
        for (Entry<Field, SheetColumn> entry : annotatedFields.entrySet()) {
            SheetColumn annotation = entry.getValue();
            Field field = entry.getKey();
            if (annotation.title() == null || "".equals(annotation.title())) {
                colHeaders.add(field.getName());
            } else {
                colHeaders.add(annotation.title());
            }
        }
        table.withColHeaders(colHeaders);
    }

    private static Column buildColumn(Field field, SheetColumn annotation) {
        Column column;
        switch (annotation.type()) {
        case "numeric":
            column = new NumericColumn();
            break;

        case "date":
            column = new DateColumn();
            break;

        case "time":
            column = new TimeColumn();
            break;

        case "checkbox":
            column = new CheckboxColumn();
            break;

        case "select":
            column = new SelectColumn();
            break;

        case "dropdown":
            column = new DropdownColumn();
            break;

        case "autocomplete":
            column = new AutocompleteColumn();
            break;

        case "password":
            column = new PasswordColumn();
            break;

        case "handsontable":
            column = new HandsontableColumn();
            break;

        default:
            column = new TextColumn();
        }
        return column.withData(field.getName());
    }

}
