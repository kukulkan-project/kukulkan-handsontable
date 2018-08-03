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

import mx.infotec.dads.kukulkan.tables.handsontable.annotations.Sheet;

/**
 * An adapter from Sheet annotation to HandsontableOptions
 * 
 * @author Roberto Villarejo Martínez
 *
 */
public class AnnotationHandsontableAdapter extends HandsontableOptionsDecorator {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Sheet annotation;

    public AnnotationHandsontableAdapter(Sheet annotation) {
        this.annotation = annotation;
    }

    @Override
    public Boolean getAllowEmpty() {
        return annotation.allowEmpty();
    }

    @Override
    public Boolean getColumnSorting() {

        return annotation.columnSorting();
    }

    @Override
    public Boolean getContextMenu() {

        return annotation.contextMenu();
    }

    @Override
    public Integer getMaxCols() {

        return annotation.maxCols();
    }

    @Override
    public Integer getMaxRows() {

        return annotation.maxRows();
    }

    @Override
    public Integer getMinCols() {

        return annotation.minCols();
    }

    @Override
    public Integer getMinRows() {

        return annotation.minRows();
    }

    @Override
    public Boolean getReadOnly() {

        return annotation.readOnly();
    }

    @Override
    public Boolean getSearch() {

        return annotation.search();
    }

    @Override
    public Boolean getRowHeaders() {
        return annotation.rowHeaders();
    }

}
