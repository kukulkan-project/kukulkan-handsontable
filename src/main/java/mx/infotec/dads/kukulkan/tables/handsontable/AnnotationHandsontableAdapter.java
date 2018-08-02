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
    public Boolean getAllowHtml() {
        return annotation.allowHtml();
    }

    @Override
    public Boolean getAllowInsertColumn() {
        return annotation.allowInsertColumn();
    }

    @Override
    public Boolean getAllowInsertRow() {
        return annotation.allowInsertRow();
    }

    @Override
    public Boolean getAllowInvalid() {
        return annotation.allowInvalid();
    }

    @Override
    public Boolean getAllowRemoveColumn() {
        return annotation.allowRemoveColumn();
    }

    @Override
    public Boolean getAllowRemoveRow() {
        return annotation.allowRemoveRow();
    }

    @Override
    public Boolean getAutoColumnSize() {

        return annotation.autoColumnSize();
    }

    @Override
    public Boolean getAutoRowSize() {

        return annotation.autoRowSize();
    }

    @Override
    public Boolean getAutoWrapCol() {

        return annotation.autoWrapCol();
    }

    @Override
    public Boolean getAutoWrapRow() {

        return annotation.autoWrapRow();
    }

    @Override
    public String getCheckedTemplate() {
        return annotation.checkedTemplate();
    }

    @Override
    public String getClassName() {

        return annotation.className();
    }

    @Override
    public Integer getColumnHeaderHeight() {

        return annotation.columnHeaderHeight();
    }

    @Override
    public Boolean getColumnSorting() {

        return annotation.columnSorting();
    }

    @Override
    public Integer getColWidths() {

        return annotation.colWidths();
    }

    @Override
    public String getCommentedCellClassName() {

        return annotation.commentedCellClassName();
    }

    @Override
    public Boolean getComments() {

        return annotation.comments();
    }

    @Override
    public Boolean getContextMenu() {

        return annotation.contextMenu();
    }

    @Override
    public Boolean getCopyable() {

        return annotation.copyable();
    }

    @Override
    public Integer getCopyColsLimit() {

        return annotation.copyColsLimit();
    }

    @Override
    public Boolean getCopyPaste() {

        return annotation.copyPaste();
    }

    @Override
    public Integer getCopyRowsLimit() {

        return annotation.copyRowsLimit();
    }

    @Override
    public Boolean getCorrectFormat() {

        return annotation.correctFormat();
    }

    @Override
    public String getCurrentColClassName() {

        return annotation.currentColClassName();
    }

    @Override
    public String getCurrentHeaderClassName() {

        return annotation.currentHeaderClassName();
    }

    @Override
    public String getCurrentRowClassName() {

        return annotation.currentRowClassName();
    }

    @Override
    public Boolean getCustomBorders() {

        return annotation.customBorders();
    }

    @Override
    public String getDateFormat() {

        return annotation.dateFormat();
    }

    @Override
    public Boolean getDebug() {

        return annotation.debug();
    }

    @Override
    public String getDefaultDate() {

        return annotation.defaultDate();
    }

    @Override
    public Boolean getDisableVisualSelection() {

        return annotation.disableVisualSelection();
    }

    @Override
    public String getEditor() {

        return annotation.editor();
    }

    @Override
    public Boolean getEnterBeginsEditing() {

        return annotation.enterBeginsEditing();
    }

    @Override
    public Boolean getFillHandle() {

        return annotation.fillHandle();
    }

    @Override
    public Boolean getFilter() {

        return annotation.filter();
    }

    @Override
    public Boolean getFilteringCaseSensitive() {

        return annotation.filteringCaseSensitive();
    }

    @Override
    public Integer getFixedRowsTop() {

        return annotation.fixedRowsTop();
    }

    @Override
    public Boolean getFragmentSelection() {

        return annotation.fragmentSelection();
    }

    @Override
    public Integer getHeight() {

        return annotation.height();
    }

    @Override
    public String getInvalidCellClassName() {

        return annotation.invalidCellClassName();
    }

    @Override
    public String getLanguage() {

        return annotation.language();
    }

    @Override
    public Boolean getManualColumnFreeze() {

        return annotation.manualColumnFreeze();
    }

    @Override
    public Boolean getManualColumnMove() {

        return annotation.manualColumnMove();
    }

    @Override
    public Boolean getManualColumnResize() {

        return annotation.manualColumnResize();
    }

    @Override
    public Boolean getManualRowMove() {

        return annotation.manualRowMove();
    }

    @Override
    public Boolean getManualRowResize() {

        return annotation.manualRowResize();
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
    public Boolean getMergeCells() {

        return annotation.mergeCells();
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
    public Integer getMinSpareCols() {

        return annotation.minSpareCols();
    }

    @Override
    public Boolean getMinSpareRows() {

        return annotation.minSpareRows();
    }

    @Override
    public String getNoWordWrapClassName() {

        return annotation.noWordWrapClassName();
    }

    @Override
    public Boolean getObserveChanges() {

        return annotation.observeChanges();
    }

    @Override
    public Boolean getObserveDOMVisibility() {

        return annotation.observeDOMVisibility();
    }

    @Override
    public String getPasteMode() {

        return annotation.pasteMode();
    }

    @Override
    public Boolean getPersistentState() {

        return annotation.persistentState();
    }

    @Override
    public String getPlaceholderCellClassName() {

        return annotation.placeholderCellClassName();
    }

    @Override
    public Boolean getPreventOverflow() {

        return annotation.preventOverflow();
    }

    @Override
    public Boolean getReadOnly() {

        return annotation.readOnly();
    }

    @Override
    public String getReadOnlyCellClassName() {

        return annotation.readOnlyCellClassName();
    }

    @Override
    public Boolean getRenderAllRows() {

        return annotation.renderAllRows();
    }

    @Override
    public String getRenderer() {

        return annotation.renderer();
    }

    @Override
    public Boolean getRowHeaders() {

        return annotation.rowHeaders();
    }

    @Override
    public Integer getRowHeaderWidth() {

        return annotation.rowHeaderWidth();
    }

    @Override
    public Integer getRowHeights() {

        return annotation.rowHeights();
    }

    @Override
    public Boolean getSearch() {

        return annotation.search();
    }

    @Override
    public SelectionMode getSelectionMode() {

        return annotation.selectionMode();
    }

    @Override
    public Boolean getSkipColumnOnPaste() {

        return annotation.skipColumnOnPaste();
    }

    @Override
    public Boolean getSortByRelevance() {

        return annotation.sortByRelevance();
    }

    @Override
    public Boolean getSortIndicator() {

        return annotation.sortIndicator();
    }

    @Override
    public Integer getStartCols() {

        return annotation.startCols();
    }

    @Override
    public Integer getStartRows() {

        return annotation.startRows();
    }

    @Override
    public String getStretchH() {

        return annotation.stretchH();
    }

    @Override
    public Boolean getStrict() {

        return annotation.strict();
    }

    @Override
    public String getTableClassName() {

        return annotation.tableClassName();
    }

    @Override
    public String getTitle() {

        return annotation.title();
    }

    @Override
    public Boolean getTrimDropdown() {

        return annotation.trimDropdown();
    }

    @Override
    public Boolean getTrimWhitespace() {

        return annotation.trimWhitespace();
    }

    @Override
    public HandsontableOptions.Type getType() {

        return annotation.type();
    }

    @Override
    public String getUncheckedTemplate() {

        return annotation.uncheckedTemplate();
    }

    @Override
    public Boolean getUndo() {

        return annotation.undo();
    }

    @Override
    public Boolean getValid() {

        return annotation.valid();
    }

    @Override
    public Integer getVisibleRows() {

        return annotation.visibleRows();
    }

    @Override
    public Integer getWidth() {

        return annotation.width();
    }

    @Override
    public Boolean getWordWrap() {

        return annotation.wordWrap();
    }

}
