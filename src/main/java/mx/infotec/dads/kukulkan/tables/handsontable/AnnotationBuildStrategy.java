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

import static mx.infotec.dads.kukulkan.tables.handsontable.utils.HandsontableBuilderUtils.buildHeaderFromAnnotatedProperty;
import static mx.infotec.dads.kukulkan.tables.handsontable.utils.HandsontableBuilderUtils.getColumn;
import static mx.infotec.dads.kukulkan.tables.handsontable.utils.HandsontableBuilderUtils.getSheetColumnAnnotation;
import static mx.infotec.dads.kukulkan.tables.handsontable.utils.HandsontableBuilderUtils.inferHandsontableType;

import java.lang.reflect.Field;
import java.util.Optional;

import org.springframework.util.StringUtils;

import mx.infotec.dads.kukulkan.tables.annotations.Sheet;
import mx.infotec.dads.kukulkan.tables.annotations.SheetColumn;
import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions.Type;

/**
 * The Annotation Build Strategy Used for build a Handsontable from an annotated
 * class
 * 
 * @author Roberto Villarejo Martínez
 *
 */
public class AnnotationBuildStrategy extends AbstractBuildStrategy {

    @Override
    public Column buildColumn(Field field) {
        Optional<SheetColumn> annotation = getSheetColumnAnnotation(field);
        if (annotation.isPresent()) {
            HandsontableOptions.Type type;
            if (Type.NONE.equals(annotation.get().type())) {
                type = inferHandsontableType(field);
            } else {
                type = annotation.get().type();
            }
            Column column = getColumn(type, field.getType()).withData(field.getName());
            if (annotation.get().readOnly()) {
                column.setReadOnly(true);
            }
            if (!StringUtils.isEmpty(annotation.get().data())) {
                column.data = annotation.get().data();
            }
            return column;
        }
        return null;
    }

    @Override
    public String buildHeader(Field field) {
        return buildHeaderFromAnnotatedProperty(field);
    }

    @Override
    public <T> HandsontableOptions buildOptions(Class<T> clazz) {
        if (clazz.isAnnotationPresent(Sheet.class)) {
            return new AnnotationHandsontableAdapter(clazz.getAnnotation(Sheet.class));
        }
        return super.buildOptions(clazz);
    }

}
