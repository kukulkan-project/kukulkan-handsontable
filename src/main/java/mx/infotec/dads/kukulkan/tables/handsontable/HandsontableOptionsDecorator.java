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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Decorator for HandsontableOptions
 * @author Roberto Villarejo Martínez
 *
 */
public abstract class HandsontableOptionsDecorator extends HandsontableOptions {

    /**
     * 
     */
    private static final long serialVersionUID = -668790819887164240L;

    @JsonIgnore
    protected HandsontableOptions options;

    public HandsontableOptionsDecorator() {
        this.options = new HandsontableOptions();
    }

    public HandsontableOptionsDecorator(HandsontableOptions options) {
        this.options = options;
    }

    @Override
    public Boolean getAllowEmpty() {
        return options.getAllowEmpty();
    }

    @Override
    public Boolean getAllowHtml() {
        return options.getAllowHtml();
    }

    @Override
    public Boolean getAllowInsertColumn() {
        return options.getAllowInsertColumn();
    }

    @Override
    public Boolean getAllowInsertRow() {
        return options.getAllowInsertRow();
    }

    @Override
    public Boolean getAllowInvalid() {
        return options.getAllowInvalid();
    }

    @Override
    public Boolean getAllowRemoveColumn() {
        return options.getAllowRemoveColumn();
    }

    @Override
    public Boolean getAllowRemoveRow() {
        return options.getAllowRemoveRow();
    }

    @Override
    public Boolean getAutoColumnSize() {

        return options.getAutoColumnSize();
    }

    @Override
    public List<Object> getAutoComplete() {

        return options.getAutoComplete();
    }

    @Override
    public Boolean getAutoRowSize() {

        return options.getAutoRowSize();
    }

    @Override
    public Boolean getAutoWrapCol() {

        return options.getAutoWrapCol();
    }

    @Override
    public Boolean getAutoWrapRow() {

        return options.getAutoWrapRow();
    }

    @Override
    public List<Object> getCell() {

        return options.getCell();
    }

    @Override
    public String getCheckedTemplate() {

        return options.getCheckedTemplate();
    }

    @Override
    public String getClassName() {

        return options.getClassName();
    }

    @Override
    public List<String> getColHeaders() {

        return options.getColHeaders();
    }

    @Override
    public Integer getColumnHeaderHeight() {

        return options.getColumnHeaderHeight();
    }

    @Override
    public Boolean getColumnSorting() {

        return options.getColumnSorting();
    }

    @Override
    public Integer getColWidths() {

        return options.getColWidths();
    }

    @Override
    public String getCommentedCellClassName() {

        return options.getCommentedCellClassName();
    }

    @Override
    public Boolean getComments() {

        return options.getComments();
    }

    @Override
    public Boolean getContextMenu() {

        return options.getContextMenu();
    }

    @Override
    public Boolean getCopyable() {

        return options.getCopyable();
    }

    @Override
    public Integer getCopyColsLimit() {

        return options.getCopyColsLimit();
    }

    @Override
    public Boolean getCopyPaste() {

        return options.getCopyPaste();
    }

    @Override
    public Integer getCopyRowsLimit() {

        return options.getCopyRowsLimit();
    }

    @Override
    public Boolean getCorrectFormat() {

        return options.getCorrectFormat();
    }

    @Override
    public String getCurrentColClassName() {

        return options.getCurrentColClassName();
    }

    @Override
    public String getCurrentHeaderClassName() {

        return options.getCurrentHeaderClassName();
    }

    @Override
    public String getCurrentRowClassName() {

        return options.getCurrentRowClassName();
    }

    @Override
    public Boolean getCustomBorders() {

        return options.getCustomBorders();
    }

    @Override
    public String getDateFormat() {

        return options.getDateFormat();
    }

    @Override
    public Boolean getDebug() {

        return options.getDebug();
    }

    @Override
    public String getDefaultDate() {

        return options.getDefaultDate();
    }

    @Override
    public Boolean getDisableVisualSelection() {

        return options.getDisableVisualSelection();
    }

    @Override
    public String getEditor() {

        return options.getEditor();
    }

    @Override
    public Boolean getEnterBeginsEditing() {

        return options.getEnterBeginsEditing();
    }

    @Override
    public Boolean getFillHandle() {

        return options.getFillHandle();
    }

    @Override
    public Boolean getFilter() {

        return options.getFilter();
    }

    @Override
    public Boolean getFilteringCaseSensitive() {

        return options.getFilteringCaseSensitive();
    }

    @Override
    public Integer getFixedRowsTop() {

        return options.getFixedRowsTop();
    }

    @Override
    public Boolean getFragmentSelection() {

        return options.getFragmentSelection();
    }

    @Override
    public Integer getHeight() {

        return options.getHeight();
    }

    @Override
    public String getInvalidCellClassName() {

        return options.getInvalidCellClassName();
    }

    @Override
    public String getLanguage() {

        return options.getLanguage();
    }

    @Override
    public Boolean getManualColumnFreeze() {

        return options.getManualColumnFreeze();
    }

    @Override
    public Boolean getManualColumnMove() {

        return options.getManualColumnMove();
    }

    @Override
    public Boolean getManualColumnResize() {

        return options.getManualColumnResize();
    }

    @Override
    public Boolean getManualRowMove() {

        return options.getManualRowMove();
    }

    @Override
    public Boolean getManualRowResize() {

        return options.getManualRowResize();
    }

    @Override
    public Integer getMaxCols() {

        return options.getMaxCols();
    }

    @Override
    public Integer getMaxRows() {

        return options.getMaxRows();
    }

    @Override
    public Boolean getMergeCells() {

        return options.getMergeCells();
    }

    @Override
    public Integer getMinCols() {

        return options.getMinCols();
    }

    @Override
    public Integer getMinRows() {

        return options.getMinRows();
    }

    @Override
    public Integer getMinSpareCols() {

        return options.getMinSpareCols();
    }

    @Override
    public Boolean getMinSpareRows() {

        return options.getMinSpareRows();
    }

    @Override
    public String getNoWordWrapClassName() {

        return options.getNoWordWrapClassName();
    }

    @Override
    public Boolean getObserveChanges() {

        return options.getObserveChanges();
    }

    @Override
    public Boolean getObserveDOMVisibility() {

        return options.getObserveDOMVisibility();
    }

    @Override
    public String getPasteMode() {

        return options.getPasteMode();
    }

    @Override
    public Boolean getPersistentState() {

        return options.getPersistentState();
    }

    @Override
    public String getPlaceholderCellClassName() {

        return options.getPlaceholderCellClassName();
    }

    @Override
    public Boolean getPreventOverflow() {

        return options.getPreventOverflow();
    }

    @Override
    public Boolean getReadOnly() {

        return options.getReadOnly();
    }

    @Override
    public String getReadOnlyCellClassName() {

        return options.getReadOnlyCellClassName();
    }

    @Override
    public Boolean getRenderAllRows() {

        return options.getRenderAllRows();
    }

    @Override
    public String getRenderer() {

        return options.getRenderer();
    }

    @Override
    public Boolean getRowHeaders() {

        return options.getRowHeaders();
    }

    @Override
    public Integer getRowHeaderWidth() {

        return options.getRowHeaderWidth();
    }

    @Override
    public Integer getRowHeights() {

        return options.getRowHeights();
    }

    @Override
    public Boolean getSearch() {

        return options.getSearch();
    }

    @Override
    public SelectionMode getSelectionMode() {

        return options.getSelectionMode();
    }

    @Override
    public Boolean getSkipColumnOnPaste() {

        return options.getSkipColumnOnPaste();
    }

    @Override
    public Boolean getSortByRelevance() {

        return options.getSortByRelevance();
    }

    @Override
    public Boolean getSortIndicator() {

        return options.getSortIndicator();
    }

    @Override
    public List<Object> getSource() {

        return options.getSource();
    }

    @Override
    public Integer getStartCols() {

        return options.getStartCols();
    }

    @Override
    public Integer getStartRows() {

        return options.getStartRows();
    }

    @Override
    public String getStretchH() {

        return options.getStretchH();
    }

    @Override
    public Boolean getStrict() {

        return options.getStrict();
    }

    @Override
    public String getTableClassName() {

        return options.getTableClassName();
    }

    @Override
    public String getTitle() {

        return options.getTitle();
    }

    @Override
    public Boolean getTrimDropdown() {

        return options.getTrimDropdown();
    }

    @Override
    public Boolean getTrimWhitespace() {

        return options.getTrimWhitespace();
    }

    @Override
    public HandsontableOptions.Type getType() {

        return options.getType();
    }

    @Override
    public String getUncheckedTemplate() {

        return options.getUncheckedTemplate();
    }

    @Override
    public Boolean getUndo() {

        return options.getUndo();
    }

    @Override
    public Boolean getValid() {

        return options.getValid();
    }

    @Override
    public Integer getVisibleRows() {

        return options.getVisibleRows();
    }

    @Override
    public Integer getWidth() {

        return options.getWidth();
    }

    @Override
    public Boolean getWordWrap() {

        return options.getWordWrap();
    }

    @Override
    public void setAllowEmpty(Boolean allowEmpty) {

        options.setAllowEmpty(allowEmpty);
    }

    @Override
    public void setAllowHtml(Boolean allowHtml) {

        options.setAllowHtml(allowHtml);
    }

    @Override
    public void setAllowInsertColumn(Boolean allowInsertColumn) {

        options.setAllowInsertColumn(allowInsertColumn);
    }

    @Override
    public void setAllowInsertRow(Boolean allowInsertRow) {

        options.setAllowInsertRow(allowInsertRow);
    }

    @Override
    public void setAllowInvalid(Boolean allowInvalid) {

        options.setAllowInvalid(allowInvalid);
    }

    @Override
    public void setAllowRemoveColumn(Boolean allowRemoveColumn) {

        options.setAllowRemoveColumn(allowRemoveColumn);
    }

    @Override
    public void setAllowRemoveRow(Boolean allowRemoveRow) {

        options.setAllowRemoveRow(allowRemoveRow);
    }

    @Override
    public void setAutoColumnSize(Boolean autoColumnSize) {

        options.setAutoColumnSize(autoColumnSize);
    }

    @Override
    public void setAutoComplete(List<Object> autoComplete) {

        options.setAutoComplete(autoComplete);
    }

    @Override
    public void setAutoRowSize(Boolean autoRowSize) {

        options.setAutoRowSize(autoRowSize);
    }

    @Override
    public void setAutoWrapCol(Boolean autoWrapCol) {

        options.setAutoWrapCol(autoWrapCol);
    }

    @Override
    public void setAutoWrapRow(Boolean autoWrapRow) {

        options.setAutoWrapRow(autoWrapRow);
    }

    @Override
    public void setCell(List<Object> cell) {

        options.setCell(cell);
    }

    @Override
    public void setCheckedTemplate(String checkedTemplate) {

        options.setCheckedTemplate(checkedTemplate);
    }

    @Override
    public void setClassName(String className) {

        options.setClassName(className);
    }

    @Override
    public void setColHeaders(List<String> colHeaders) {

        options.setColHeaders(colHeaders);
    }

    @Override
    public void setColumnHeaderHeight(Integer columnHeaderHeight) {

        options.setColumnHeaderHeight(columnHeaderHeight);
    }

    @Override
    public void setColumnSorting(Boolean columnSorting) {

        options.setColumnSorting(columnSorting);
    }

    @Override
    public void setColWidths(Integer colWidths) {

        options.setColWidths(colWidths);
    }

    @Override
    public void setCommentedCellClassName(String commentedCellClassName) {

        options.setCommentedCellClassName(commentedCellClassName);
    }

    @Override
    public void setComments(Boolean comments) {

        options.setComments(comments);
    }

    @Override
    public void setContextMenu(Boolean contextMenu) {

        options.setContextMenu(contextMenu);
    }

    @Override
    public void setCopyable(Boolean copyable) {

        options.setCopyable(copyable);
    }

    @Override
    public void setCopyColsLimit(Integer copyColsLimit) {

        options.setCopyColsLimit(copyColsLimit);
    }

    @Override
    public void setCopyPaste(Boolean copyPaste) {

        options.setCopyPaste(copyPaste);
    }

    @Override
    public void setCopyRowsLimit(Integer copyRowsLimit) {

        options.setCopyRowsLimit(copyRowsLimit);
    }

    @Override
    public void setCorrectFormat(Boolean correctFormat) {

        options.setCorrectFormat(correctFormat);
    }

    @Override
    public void setCurrentColClassName(String currentColClassName) {

        options.setCurrentColClassName(currentColClassName);
    }

    @Override
    public void setCurrentHeaderClassName(String currentHeaderClassName) {

        options.setCurrentHeaderClassName(currentHeaderClassName);
    }

    @Override
    public void setCurrentRowClassName(String currentRowClassName) {

        options.setCurrentRowClassName(currentRowClassName);
    }

    @Override
    public void setCustomBorders(Boolean customBorders) {

        options.setCustomBorders(customBorders);
    }

    @Override
    public void setDateFormat(String dateFormat) {

        options.setDateFormat(dateFormat);
    }

    @Override
    public void setDebug(Boolean debug) {

        options.setDebug(debug);
    }

    @Override
    public void setDefaultDate(String defaultDate) {

        options.setDefaultDate(defaultDate);
    }

    @Override
    public void setDisableVisualSelection(Boolean disableVisualSelection) {

        options.setDisableVisualSelection(disableVisualSelection);
    }

    @Override
    public void setEditor(String editor) {

        options.setEditor(editor);
    }

    @Override
    public void setEnterBeginsEditing(Boolean enterBeginsEditing) {

        options.setEnterBeginsEditing(enterBeginsEditing);
    }

    @Override
    public void setFillHandle(Boolean fillHandle) {

        options.setFillHandle(fillHandle);
    }

    @Override
    public void setFilter(Boolean filter) {

        options.setFilter(filter);
    }

    @Override
    public void setFilteringCaseSensitive(Boolean filteringCaseSensitive) {

        options.setFilteringCaseSensitive(filteringCaseSensitive);
    }

    @Override
    public void setFixedRowsTop(Integer fixedRowsTop) {

        options.setFixedRowsTop(fixedRowsTop);
    }

    @Override
    public void setFragmentSelection(Boolean fragmentSelection) {

        options.setFragmentSelection(fragmentSelection);
    }

    @Override
    public void setHeight(Integer height) {

        options.setHeight(height);
    }

    @Override
    public void setInvalidCellClassName(String invalidCellClassName) {

        options.setInvalidCellClassName(invalidCellClassName);
    }

    @Override
    public void setLanguage(String language) {

        options.setLanguage(language);
    }

    @Override
    public void setManualColumnFreeze(Boolean manualColumnFreeze) {

        options.setManualColumnFreeze(manualColumnFreeze);
    }

    @Override
    public void setManualColumnMove(Boolean manualColumnMove) {

        options.setManualColumnMove(manualColumnMove);
    }

    @Override
    public void setManualColumnResize(Boolean manualColumnResize) {

        options.setManualColumnResize(manualColumnResize);
    }

    @Override
    public void setManualRowMove(Boolean manualRowMove) {

        options.setManualRowMove(manualRowMove);
    }

    @Override
    public void setManualRowResize(Boolean manualRowResize) {

        options.setManualRowResize(manualRowResize);
    }

    @Override
    public void setMaxCols(Integer maxCols) {

        options.setMaxCols(maxCols);
    }

    @Override
    public void setMaxRows(Integer maxRows) {

        options.setMaxRows(maxRows);
    }

    @Override
    public void setMergeCells(Boolean mergeCells) {

        options.setMergeCells(mergeCells);
    }

    @Override
    public void setMinCols(Integer minCols) {

        options.setMinCols(minCols);
    }

    @Override
    public void setMinRows(Integer minRows) {

        options.setMinRows(minRows);
    }

    @Override
    public void setMinSpareCols(Integer minSpareCols) {

        options.setMinSpareCols(minSpareCols);
    }

    @Override
    public void setMinSpareRows(Boolean minSpareRows) {

        options.setMinSpareRows(minSpareRows);
    }

    @Override
    public void setNoWordWrapClassName(String noWordWrapClassName) {

        options.setNoWordWrapClassName(noWordWrapClassName);
    }

    @Override
    public void setObserveChanges(Boolean observeChanges) {

        options.setObserveChanges(observeChanges);
    }

    @Override
    public void setObserveDOMVisibility(Boolean observeDOMVisibility) {

        options.setObserveDOMVisibility(observeDOMVisibility);
    }

    @Override
    public void setPasteMode(String pasteMode) {

        options.setPasteMode(pasteMode);
    }

    @Override
    public void setPersistentState(Boolean persistentState) {

        options.setPersistentState(persistentState);
    }

    @Override
    public void setPlaceholderCellClassName(String placeholderCellClassName) {

        options.setPlaceholderCellClassName(placeholderCellClassName);
    }

    @Override
    public void setPreventOverflow(Boolean preventOverflow) {

        options.setPreventOverflow(preventOverflow);
    }

    @Override
    public void setReadOnly(Boolean readOnly) {

        options.setReadOnly(readOnly);
    }

    @Override
    public void setReadOnlyCellClassName(String readOnlyCellClassName) {

        options.setReadOnlyCellClassName(readOnlyCellClassName);
    }

    @Override
    public void setRenderAllRows(Boolean renderAllRows) {

        options.setRenderAllRows(renderAllRows);
    }

    @Override
    public void setRenderer(String renderer) {

        options.setRenderer(renderer);
    }

    @Override
    public void setRowHeaders(Boolean rowHeaders) {

        options.setRowHeaders(rowHeaders);
    }

    @Override
    public void setRowHeaderWidth(Integer rowHeaderWidth) {

        options.setRowHeaderWidth(rowHeaderWidth);
    }

    @Override
    public void setRowHeights(Integer rowHeights) {

        options.setRowHeights(rowHeights);
    }

    @Override
    public void setSearch(Boolean search) {

        options.setSearch(search);
    }

    @Override
    public void setSelectionMode(SelectionMode selectionMode) {

        options.setSelectionMode(selectionMode);
    }

    @Override
    public void setSkipColumnOnPaste(Boolean skipColumnOnPaste) {

        options.setSkipColumnOnPaste(skipColumnOnPaste);
    }

    @Override
    public void setSortByRelevance(Boolean sortByRelevance) {

        options.setSortByRelevance(sortByRelevance);
    }

    @Override
    public void setSortIndicator(Boolean sortIndicator) {

        options.setSortIndicator(sortIndicator);
    }

    @Override
    public void setSource(List<Object> source) {

        options.setSource(source);
    }

    @Override
    public void setStartCols(Integer startCols) {

        options.setStartCols(startCols);
    }

    @Override
    public void setStartRows(Integer startRows) {

        options.setStartRows(startRows);
    }

    @Override
    public void setStretchH(String stretchH) {

        options.setStretchH(stretchH);
    }

    @Override
    public void setStrict(Boolean strict) {

        options.setStrict(strict);
    }

    @Override
    public void setTableClassName(String tableClassName) {

        options.setTableClassName(tableClassName);
    }

    @Override
    public void setTitle(String title) {

        options.setTitle(title);
    }

    @Override
    public void setTrimDropdown(Boolean trimDropdown) {

        options.setTrimDropdown(trimDropdown);
    }

    @Override
    public void setTrimWhitespace(Boolean trimWhitespace) {

        options.setTrimWhitespace(trimWhitespace);
    }

    @Override
    public void setType(HandsontableOptions.Type type) {

        options.setType(type);
    }

    @Override
    public void setUncheckedTemplate(String uncheckedTemplate) {

        options.setUncheckedTemplate(uncheckedTemplate);
    }

    @Override
    public void setUndo(Boolean undo) {

        options.setUndo(undo);
    }

    @Override
    public void setValid(Boolean valid) {

        options.setValid(valid);
    }

    @Override
    public void setVisibleRows(Integer visibleRows) {

        options.setVisibleRows(visibleRows);
    }

    @Override
    public void setWidth(Integer width) {

        options.setWidth(width);
    }

    @Override
    public void setWordWrap(Boolean wordWrap) {

        options.setWordWrap(wordWrap);
    }

    @Override
    public HandsontableOptions withAllowEmpty(Boolean allowEmpty) {

        return options.withAllowEmpty(allowEmpty);
    }

    @Override
    public HandsontableOptions withAllowHtml(Boolean allowHtml) {

        return options.withAllowHtml(allowHtml);
    }

    @Override
    public HandsontableOptions withAllowInsertColumn(Boolean allowInsertColumn) {

        return options.withAllowInsertColumn(allowInsertColumn);
    }

    @Override
    public HandsontableOptions withAllowInsertRow(Boolean allowInsertRow) {

        return options.withAllowInsertRow(allowInsertRow);
    }

    @Override
    public HandsontableOptions withAllowInvalid(Boolean allowInvalid) {

        return options.withAllowInvalid(allowInvalid);
    }

    @Override
    public HandsontableOptions withAllowRemoveColumn(Boolean allowRemoveColumn) {

        return options.withAllowRemoveColumn(allowRemoveColumn);
    }

    @Override
    public HandsontableOptions withAllowRemoveRow(Boolean allowRemoveRow) {
        return options.withAllowRemoveRow(allowRemoveRow);
    }

    @Override
    public HandsontableOptions withAutoColumnSize(Boolean autoColumnSize) {

        return options.withAutoColumnSize(autoColumnSize);
    }

    @Override
    public HandsontableOptions withAutoComplete(List<Object> autoComplete) {

        return options.withAutoComplete(autoComplete);
    }

    @Override
    public HandsontableOptions withAutoRowSize(Boolean autoRowSize) {

        return options.withAutoRowSize(autoRowSize);
    }

    @Override
    public HandsontableOptions withAutoWrapCol(Boolean autoWrapCol) {

        return options.withAutoWrapCol(autoWrapCol);
    }

    @Override
    public HandsontableOptions withAutoWrapRow(Boolean autoWrapRow) {

        return options.withAutoWrapRow(autoWrapRow);
    }

    @Override
    public HandsontableOptions withCell(List<Object> cell) {

        return options.withCell(cell);
    }

    @Override
    public HandsontableOptions withCheckedTemplate(String checkedTemplate) {

        return options.withCheckedTemplate(checkedTemplate);
    }

    @Override
    public HandsontableOptions withClassName(String className) {

        return options.withClassName(className);
    }

    @Override
    public HandsontableOptions withColHeaders(List<String> colHeaders) {

        return options.withColHeaders(colHeaders);
    }

    @Override
    public HandsontableOptions withColumnHeaderHeight(Integer columnHeaderHeight) {

        return options.withColumnHeaderHeight(columnHeaderHeight);
    }

    @Override
    public HandsontableOptions withColumnSorting(Boolean columnSorting) {

        return options.withColumnSorting(columnSorting);
    }

    @Override
    public HandsontableOptions withColWidths(Integer colWidths) {

        return options.withColWidths(colWidths);
    }

    @Override
    public HandsontableOptions withCommentedCellClassName(String commentedCellClassName) {

        return options.withCommentedCellClassName(commentedCellClassName);
    }

    @Override
    public HandsontableOptions withComments(Boolean comments) {

        return options.withComments(comments);
    }

    @Override
    public HandsontableOptions withContextMenu(Boolean contextMenu) {

        return options.withContextMenu(contextMenu);
    }

    @Override
    public HandsontableOptions withCopyable(Boolean copyable) {

        return options.withCopyable(copyable);
    }

    @Override
    public HandsontableOptions withCopyColsLimit(Integer copyColsLimit) {

        return options.withCopyColsLimit(copyColsLimit);
    }

    @Override
    public HandsontableOptions withCopyPaste(Boolean copyPaste) {

        return options.withCopyPaste(copyPaste);
    }

    @Override
    public HandsontableOptions withCopyRowsLimit(Integer copyRowsLimit) {

        return options.withCopyRowsLimit(copyRowsLimit);
    }

    @Override
    public HandsontableOptions withCorrectFormat(Boolean correctFormat) {

        return options.withCorrectFormat(correctFormat);
    }

    @Override
    public HandsontableOptions withCurrentColClassName(String currentColClassName) {

        return options.withCurrentColClassName(currentColClassName);
    }

    @Override
    public HandsontableOptions withCurrentHeaderClassName(String currentHeaderClassName) {

        return options.withCurrentHeaderClassName(currentHeaderClassName);
    }

    @Override
    public HandsontableOptions withCurrentRowClassName(String currentRowClassName) {

        return options.withCurrentRowClassName(currentRowClassName);
    }

    @Override
    public HandsontableOptions withCustomBorders(Boolean customBorders) {

        return options.withCustomBorders(customBorders);
    }

    @Override
    public HandsontableOptions withDateFormat(String dateFormat) {

        return options.withDateFormat(dateFormat);
    }

    @Override
    public HandsontableOptions withDebug(Boolean debug) {

        return options.withDebug(debug);
    }

    @Override
    public HandsontableOptions withDefaultDate(String defaultDate) {

        return options.withDefaultDate(defaultDate);
    }

    @Override
    public HandsontableOptions withDisableVisualSelection(Boolean disableVisualSelection) {

        return options.withDisableVisualSelection(disableVisualSelection);
    }

    @Override
    public HandsontableOptions withEditor(String editor) {

        return options.withEditor(editor);
    }

    @Override
    public HandsontableOptions withEnterBeginsEditing(Boolean enterBeginsEditing) {

        return options.withEnterBeginsEditing(enterBeginsEditing);
    }

    @Override
    public HandsontableOptions withFillHandle(Boolean fillHandle) {

        return options.withFillHandle(fillHandle);
    }

    @Override
    public HandsontableOptions withFilter(Boolean filter) {

        return options.withFilter(filter);
    }

    @Override
    public HandsontableOptions withFilteringCaseSensitive(Boolean filteringCaseSensitive) {

        return options.withFilteringCaseSensitive(filteringCaseSensitive);
    }

    @Override
    public HandsontableOptions withFixedRowsTop(Integer fixedRowsTop) {

        return options.withFixedRowsTop(fixedRowsTop);
    }

    @Override
    public HandsontableOptions withFragmentSelection(Boolean fragmentSelection) {

        return options.withFragmentSelection(fragmentSelection);
    }

    @Override
    public HandsontableOptions withHeight(Integer height) {

        return options.withHeight(height);
    }

    @Override
    public HandsontableOptions withInvalidCellClassName(String invalidCellClassName) {

        return options.withInvalidCellClassName(invalidCellClassName);
    }

    @Override
    public HandsontableOptions withLanguage(String language) {

        return options.withLanguage(language);
    }

    @Override
    public HandsontableOptions withManualColumnFreeze(Boolean manualColumnFreeze) {

        return options.withManualColumnFreeze(manualColumnFreeze);
    }

    @Override
    public HandsontableOptions withManualColumnMove(Boolean manualColumnMove) {

        return options.withManualColumnMove(manualColumnMove);
    }

    @Override
    public HandsontableOptions withManualColumnResize(Boolean manualColumnResize) {

        return options.withManualColumnResize(manualColumnResize);
    }

    @Override
    public HandsontableOptions withManualRowMove(Boolean manualRowMove) {

        return options.withManualRowMove(manualRowMove);
    }

    @Override
    public HandsontableOptions withManualRowResize(Boolean manualRowResize) {

        return options.withManualRowResize(manualRowResize);
    }

    @Override
    public HandsontableOptions withMaxCols(Integer maxCols) {

        return options.withMaxCols(maxCols);
    }

    @Override
    public HandsontableOptions withMaxRows(Integer maxRows) {

        return options.withMaxRows(maxRows);
    }

    @Override
    public HandsontableOptions withMergeCells(Boolean mergeCells) {

        return options.withMergeCells(mergeCells);
    }

    @Override
    public HandsontableOptions withMinCols(Integer minCols) {

        return options.withMinCols(minCols);
    }

    @Override
    public HandsontableOptions withMinRows(Integer minRows) {

        return options.withMinRows(minRows);
    }

    @Override
    public HandsontableOptions withMinSpareCols(Integer minSpareCols) {

        return options.withMinSpareCols(minSpareCols);
    }

    @Override
    public HandsontableOptions withMinSpareRows(Boolean minSpareRows) {

        return options.withMinSpareRows(minSpareRows);
    }

    @Override
    public HandsontableOptions withNoWordWrapClassName(String noWordWrapClassName) {

        return options.withNoWordWrapClassName(noWordWrapClassName);
    }

    @Override
    public HandsontableOptions withObserveChanges(Boolean observeChanges) {

        return options.withObserveChanges(observeChanges);
    }

    @Override
    public HandsontableOptions withObserveDOMVisibility(Boolean observeDOMVisibility) {

        return options.withObserveDOMVisibility(observeDOMVisibility);
    }

    @Override
    public HandsontableOptions withPasteMode(String pasteMode) {

        return options.withPasteMode(pasteMode);
    }

    @Override
    public HandsontableOptions withPersistentState(Boolean persistentState) {

        return options.withPersistentState(persistentState);
    }

    @Override
    public HandsontableOptions withPlaceholderCellClassName(String placeholderCellClassName) {

        return options.withPlaceholderCellClassName(placeholderCellClassName);
    }

    @Override
    public HandsontableOptions withPreventOverflow(Boolean preventOverflow) {

        return options.withPreventOverflow(preventOverflow);
    }

    @Override
    public HandsontableOptions withReadOnly(Boolean readOnly) {

        return options.withReadOnly(readOnly);
    }

    @Override
    public HandsontableOptions withReadOnlyCellClassName(String readOnlyCellClassName) {

        return options.withReadOnlyCellClassName(readOnlyCellClassName);
    }

    @Override
    public HandsontableOptions withRenderAllRows(Boolean renderAllRows) {

        return options.withRenderAllRows(renderAllRows);
    }

    @Override
    public HandsontableOptions withRenderer(String renderer) {

        return options.withRenderer(renderer);
    }

    @Override
    public HandsontableOptions withRowHeaders(Boolean rowHeaders) {

        return options.withRowHeaders(rowHeaders);
    }

    @Override
    public HandsontableOptions withRowHeaderWidth(Integer rowHeaderWidth) {

        return options.withRowHeaderWidth(rowHeaderWidth);
    }

    @Override
    public HandsontableOptions withRowHeights(Integer rowHeights) {

        return options.withRowHeights(rowHeights);
    }

    @Override
    public HandsontableOptions withSearch(Boolean search) {

        return options.withSearch(search);
    }

    @Override
    public HandsontableOptions withSelectionMode(SelectionMode selectionMode) {

        return options.withSelectionMode(selectionMode);
    }

    @Override
    public HandsontableOptions withSkipColumnOnPaste(Boolean skipColumnOnPaste) {

        return options.withSkipColumnOnPaste(skipColumnOnPaste);
    }

    @Override
    public HandsontableOptions withSortByRelevance(Boolean sortByRelevance) {

        return options.withSortByRelevance(sortByRelevance);
    }

    @Override
    public HandsontableOptions withSortIndicator(Boolean sortIndicator) {

        return options.withSortIndicator(sortIndicator);
    }

    @Override
    public HandsontableOptions withSource(List<Object> source) {

        return options.withSource(source);
    }

    @Override
    public HandsontableOptions withStartCols(Integer startCols) {

        return options.withStartCols(startCols);
    }

    @Override
    public HandsontableOptions withStartRows(Integer startRows) {

        return options.withStartRows(startRows);
    }

    @Override
    public HandsontableOptions withStretchH(String stretchH) {

        return options.withStretchH(stretchH);
    }

    @Override
    public HandsontableOptions withStrict(Boolean strict) {

        return options.withStrict(strict);
    }

    @Override
    public HandsontableOptions withTableClassName(String tableClassName) {

        return options.withTableClassName(tableClassName);
    }

    @Override
    public HandsontableOptions withTitle(String title) {

        return options.withTitle(title);
    }

    @Override
    public HandsontableOptions withTrimDropdown(Boolean trimDropdown) {

        return options.withTrimDropdown(trimDropdown);
    }

    @Override
    public HandsontableOptions withTrimWhitespace(Boolean trimWhitespace) {

        return options.withTrimWhitespace(trimWhitespace);
    }

    @Override
    public HandsontableOptions withType(HandsontableOptions.Type type) {

        return options.withType(type);
    }

    @Override
    public HandsontableOptions withUncheckedTemplate(String uncheckedTemplate) {

        return options.withUncheckedTemplate(uncheckedTemplate);
    }

    @Override
    public HandsontableOptions withUndo(Boolean undo) {

        return options.withUndo(undo);
    }

    @Override
    public HandsontableOptions withValid(Boolean valid) {

        return options.withValid(valid);
    }

    @Override
    public HandsontableOptions withVisibleRows(Integer visibleRows) {

        return options.withVisibleRows(visibleRows);
    }

    @Override
    public HandsontableOptions withWidth(Integer width) {

        return options.withWidth(width);
    }

    @Override
    public HandsontableOptions withWordWrap(Boolean wordWrap) {

        return options.withWordWrap(wordWrap);
    }

    public void setOptions(HandsontableOptions options) {
        this.options = options;
    }

    public HandsontableOptions getOptions() {
        return options;
    }
    
    public HandsontableOptionsDecorator withOptions(HandsontableOptions options) {
        this.options = options;
        return this;
    }

}
