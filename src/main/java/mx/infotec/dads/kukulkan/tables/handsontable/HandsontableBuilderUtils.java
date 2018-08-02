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
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions.Type;

public class HandsontableBuilderUtils {

    private HandsontableBuilderUtils() {

    }

    public static HandsontableOptions.Type inferHandsontableType(Field field) {
        Class<?> clazz = field.getType();
        if (clazz.equals(String.class)) {
            return Type.TEXT;
        } else if (clazz.equals(Integer.class) || clazz.equals(Long.class) || clazz.equals(BigDecimal.class)) {
            return Type.NUMERIC;
        } else if (clazz.equals(Boolean.class)) {
            return Type.CHECKBOX;
        } else if (clazz.equals(LocalDate.class) || (clazz.equals(ZonedDateTime.class))
                || clazz.equals(Instant.class)) {
            return Type.DATE;
        }
        return Type.TEXT;
    }

    public static Column buildColumn(Type type) {
        Column column;
        switch (type) {
        case NUMERIC:
            column = new NumericColumn();
            break;

        case DATE:
            column = new DateColumn();
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
            column = new DropdownColumn();
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

    public static String splitCamelCase(String s) {
        return s.replaceAll(String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
                "(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
    }

    public static String camelCaseToHumanReadable(String camelCase) {
        String element = splitCamelCase(camelCase);
        return element.replaceFirst(Character.toString(element.charAt(0)),
                Character.toString(element.charAt(0)).toUpperCase());
    }

}
