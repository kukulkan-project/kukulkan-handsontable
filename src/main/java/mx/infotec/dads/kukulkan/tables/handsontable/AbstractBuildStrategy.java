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

import mx.infotec.dads.kukulkan.tables.handsontable.columns.TextColumn;

/**
 * Abstract Build Strategy
 * @author Roberto Villarejo Martínez
 *
 */
public abstract class AbstractBuildStrategy implements BuildStrategy {

    /**
     * Builds a {@link HandsontableOptions} using the information from clazz
     */
    @Override
    public <T> HandsontableOptions buildOptions(Class<T> clazz) {
        return new HandsontableOptions();
    }

    /**
     * Builds a concrete {@link Column} using information from field
     */
    @Override
    public Column buildColumn(Field field) {
        return new TextColumn().withData(field.getName());
    }

    /**
     * Buils a header using information from the field
     */
    @Override
    public String buildHeader(Field field) {
        return field.getName();
    }

}
