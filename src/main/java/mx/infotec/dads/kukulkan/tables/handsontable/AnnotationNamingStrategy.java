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

import static mx.infotec.dads.kukulkan.tables.handsontable.HandsontableBuilderUtils.buildColumn;
import static mx.infotec.dads.kukulkan.tables.handsontable.HandsontableBuilderUtils.inferHandsontableType;

import static mx.infotec.dads.kukulkan.tables.handsontable.HandsontableBuilderUtils.camelCaseToHumanReadable;

import java.lang.reflect.Field;
import java.util.Optional;

import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions.Type;
import mx.infotec.dads.kukulkan.tables.handsontable.annotations.Sheet;
import mx.infotec.dads.kukulkan.tables.handsontable.annotations.SheetColumn;

public class AnnotationNamingStrategy extends AbstractNamingStrategy {

    @Override
    public Column makeColumn(Field field) {
        Optional<SheetColumn> annotation = getSheetColumnAnnotation(field);
        if (annotation.isPresent()) {
            HandsontableOptions.Type type;
            if (Type.NONE.equals(annotation.get().type())) {
                type = inferHandsontableType(field);
            } else {
                type = annotation.get().type();
            }
            return buildColumn(type).withData(field.getName());
        }
        return null;
    }

    @Override
    public String makeHeader(Field field) {
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

    @Override
    public <T> HandsontableOptions makeOptions(Class<T> clazz) {
        if (clazz.isAnnotationPresent(Sheet.class)) {
            return new AnnotationHandsontableAdapter(clazz.getAnnotation(Sheet.class));
        }
        return super.makeOptions(clazz);
    }

    private Optional<SheetColumn> getSheetColumnAnnotation(Field field) {
        if (field.isAnnotationPresent(SheetColumn.class)) {
            return Optional.of(field.getAnnotation(SheetColumn.class));
        }
        return Optional.empty();
    }

}
