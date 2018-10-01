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

package mx.infotec.dads.kukulkan.tables.handsontable.utils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import mx.infotec.dads.kukulkan.tables.annotations.SheetColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.Column;
import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions;
import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions.Type;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.AutocompleteColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.CheckboxColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.DateColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.DropdownColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.HandsontableColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.NumericColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.PasswordColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.SelectColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.TextColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.columns.TimeColumn;

/**
 * Utils for Handsontable building
 * 
 * @author Roberto Villarejo Martínez
 *
 */
public class HandsontableBuilderUtils {

    private HandsontableBuilderUtils() {

    }

    /**
     * Infers the Handsontable Column type from the Type of field
     * 
     * @param field
     * @return
     */
    public static HandsontableOptions.Type inferHandsontableType(Field field) {
        Class<?> clazz = field.getType();
        if (isNumeric(clazz)) {
            return Type.NUMERIC;
        } else if (isBoolean(clazz)) {
            return Type.CHECKBOX;
        } else if (isDate(clazz)) {
            return Type.DATE;
        } else if (isEnum(clazz)) {
            return Type.DROPDOWN;
        } else if (isTime(clazz)) {
            return Type.TIME;
        }
        return Type.TEXT;
    }

    public static boolean isTime(Class<?> clazz) {
        return clazz.equals(LocalTime.class) || clazz.equals(OffsetTime.class);
    }

    public static boolean isEnum(Class<?> clazz) {
        return clazz.isEnum();
    }

    public static boolean isDate(Class<?> clazz) {
        return clazz.equals(LocalDate.class) || (clazz.equals(ZonedDateTime.class)) || clazz.equals(Instant.class);
    }

    public static boolean isBoolean(Class<?> clazz) {
        return clazz.equals(Boolean.class) || clazz.equals(boolean.class);
    }

    public static boolean isNumeric(Class<?> clazz) {
        return isRealNumeric(clazz) || clazz.equals(Float.class) || clazz.equals(float.class)
                || clazz.equals(Double.class) || clazz.equals(double.class) || clazz.equals(BigDecimal.class);
    }

    public static boolean isRealNumeric(Class<?> clazz) {
        return clazz.equals(Integer.class) || clazz.equals(int.class) || clazz.equals(Long.class)
                || clazz.equals(long.class);
    }

    /**
     * Instantiates a new column of given type
     * 
     * @param type
     * @return the concrete column
     */
    public static Column getColumn(Type type, Class<?> clazz) {
        Column column;
        switch (type) {
        case NUMERIC:
            NumericColumn numericColumn = new NumericColumn();
            if (isRealNumeric(clazz)) {
                numericColumn.getNumericFormat().setPattern("0,00");
            }
            column = numericColumn;
            break;

        case DATE:
            column = new DateColumn();
            column.withDateFormat("YYYY-MM-DD");
            break;

        case TIME:
            column = new TimeColumn();
            break;

        case CHECKBOX:
            column = new CheckboxColumn();
            break;

        case SELECT:
            column = new SelectColumn();
            break;

        case DROPDOWN:
            column = new DropdownColumn().withSource(
                    Arrays.stream(clazz.getEnumConstants()).map(Object::toString).collect(Collectors.toList()));
            break;

        case AUTOCOMPLETE:
            column = new AutocompleteColumn();
            break;

        case PASSWORD:
            column = new PasswordColumn();
            break;

        case HANDSONTABLE:
            column = new HandsontableColumn();
            break;

        default:
            column = new TextColumn();
        }
        return column;
    }

    /**
     * Split a camel case string into tokens
     * 
     * @param s
     *            the camel case string
     * @return the tokens
     */
    public static String splitCamelCase(String s) {
        return s.replaceAll(String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
                "(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
    }

    /**
     * Converts a camel case string to human readable string
     * 
     * @param camelCase
     * @return the human readable string
     */
    public static String camelCaseToHumanReadable(String camelCase) {
        String element = splitCamelCase(camelCase);
        return element.replaceFirst(Character.toString(element.charAt(0)),
                Character.toString(element.charAt(0)).toUpperCase());
    }

    public static String buildHeaderFromAnnotatedProperty(Field field) {
        Optional<SheetColumn> annotation = getSheetColumnAnnotation(field);
        if (annotation.isPresent()) {
            if (!"".equals(annotation.get().title())) {
                return annotation.get().title();
            } else {
                return camelCaseToHumanReadable(field.getName());
            }
        }
        return null;
    }

    public static Optional<SheetColumn> getSheetColumnAnnotation(Field field) {
        if (field.isAnnotationPresent(SheetColumn.class)) {
            return Optional.of(field.getAnnotation(SheetColumn.class));
        }
        return Optional.empty();
    }

}
