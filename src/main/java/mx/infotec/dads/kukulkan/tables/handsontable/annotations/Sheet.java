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

package mx.infotec.dads.kukulkan.tables.handsontable.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import mx.infotec.dads.kukulkan.tables.handsontable.HandsontableOptions;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Sheet {

    public boolean allowEmpty() default true;

    public boolean allowHtml() default true;

    public boolean allowInsertColumn() default true;

    public boolean allowInsertRow() default true;

    public boolean allowInvalid() default true;

    public boolean allowRemoveColumn() default true;

    public boolean allowRemoveRow() default true;

    public boolean autoColumnSize() default true;

    public boolean autoRowSize() default true;

    public boolean autoWrapCol() default true;

    public boolean autoWrapRow() default true;

    public String checkedTemplate() default "";

    public String className() default "";

    public int colWidths() default 125;

    public int columnHeaderHeight() default 440;

    public boolean columnSorting() default true;

    public String commentedCellClassName() default "";

    public boolean comments() default true;

    public boolean contextMenu() default true;

    public int copyColsLimit() default 100;

    public boolean copyPaste() default true;

    public int copyRowsLimit() default 100;

    public boolean copyable() default true;

    public boolean correctFormat() default true;

    public String currentColClassName() default "";

    public String currentHeaderClassName() default "";

    public String currentRowClassName() default "";

    public boolean customBorders() default true;

    public String dateFormat() default "";

    public boolean debug() default true;

    public String defaultDate() default "";

    public boolean disableVisualSelection() default false;

    public String editor() default "";

    public boolean enterBeginsEditing() default true;

    public boolean fillHandle() default true;

    public boolean filter() default true;

    public boolean filteringCaseSensitive() default true;

    public int fixedRowsTop() default 20;

    public boolean fragmentSelection() default true;

    public int height() default 440;

    public String invalidCellClassName() default "";

    public String language() default "";

    public boolean manualColumnFreeze() default true;

    public boolean manualColumnMove() default true;

    public boolean manualColumnResize() default true;

    public boolean manualRowMove() default true;

    public boolean manualRowResize() default true;

    public int maxCols() default 50;

    public int maxRows() default 100;

    public boolean mergeCells() default true;

    public int minCols() default 10;

    public int minRows() default 10;

    public int minSpareCols() default 10;

    public boolean minSpareRows() default true;

    public String noWordWrapClassName() default "";

    public boolean observeChanges() default true;

    public boolean observeDOMVisibility() default true;

    public String pasteMode() default "";

    public boolean persistentState() default true;

    public String placeholderCellClassName() default "";

    public boolean preventOverflow() default true;

    public boolean readOnly() default true;

    public String readOnlyCellClassName() default "";

    public boolean renderAllRows() default true;

    public String renderer() default "";

    public int rowHeaderWidth() default 20;

    public boolean rowHeaders() default true;

    public int rowHeights() default 100;

    public boolean search() default true;

    public HandsontableOptions.SelectionMode selectionMode() default HandsontableOptions.SelectionMode.MULTIPLE;

    public boolean skipColumnOnPaste() default true;

    public boolean sortByRelevance() default true;

    public boolean sortIndicator() default true;

    public int startCols() default 0;

    public int startRows() default 0;

    public String stretchH() default "";

    public boolean strict() default true;

    public String tableClassName() default "";

    public String title() default "";

    public boolean trimDropdown() default true;

    public boolean trimWhitespace() default true;

    public HandsontableOptions.Type type() default HandsontableOptions.Type.TEXT;

    public String uncheckedTemplate() default "";

    public boolean undo() default true;

    public boolean valid() default true;

    public int visibleRows() default 100;

    public int width() default 440;

    public boolean wordWrap() default true;
}
