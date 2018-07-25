
package mx.infotec.dads.kukulkan.tables;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allowEmpty",
    "allowHtml",
    "allowInsertColumn",
    "allowInsertRow",
    "allowInvalid",
    "allowRemoveColumn",
    "allowRemoveRow",
    "autoColumnSize",
    "autoComplete",
    "autoRowSize",
    "autoWrapCol",
    "autoWrapRow",
    "cell",
    "checkedTemplate",
    "className",
    "colHeaders",
    "colWidths",
    "columnHeaderHeight",
    "columnSorting",
    "commentedCellClassName",
    "comments",
    "contextMenu",
    "copyColsLimit",
    "copyPaste",
    "copyRowsLimit",
    "copyable",
    "correctFormat",
    "currentColClassName",
    "currentHeaderClassName",
    "currentRowClassName",
    "customBorders",
    "data",
    "dateFormat",
    "debug",
    "defaultDate",
    "disableVisualSelection",
    "editor",
    "enterBeginsEditing",
    "fillHandle",
    "filter",
    "filteringCaseSensitive",
    "fixedRowsTop",
    "fragmentSelection",
    "height",
    "invalidCellClassName",
    "language",
    "manualColumnFreeze",
    "manualColumnMove",
    "manualColumnResize",
    "manualRowMove",
    "manualRowResize",
    "maxCols",
    "maxRows",
    "mergeCells",
    "minCols",
    "minRows",
    "minSpareCols",
    "minSpareRows",
    "noWordWrapClassName",
    "observeChanges",
    "observeDOMVisibility",
    "pasteMode",
    "persistentState",
    "placeholderCellClassName",
    "preventOverflow",
    "readOnly",
    "readOnlyCellClassName",
    "renderAllRows",
    "renderer",
    "rowHeaderWidth",
    "rowHeaders",
    "rowHeights",
    "search",
    "selectionMode",
    "skipColumnOnPaste",
    "sortByRelevance",
    "sortIndicator",
    "source",
    "startCols",
    "startRows",
    "stretchH",
    "strict",
    "tableClassName",
    "title",
    "trimDropdown",
    "trimWhitespace",
    "type",
    "uncheckedTemplate",
    "undo",
    "valid",
    "visibleRows",
    "width",
    "wordWrap"
})
public class Column {

    @JsonProperty("allowEmpty")
    private Boolean allowEmpty;
    @JsonProperty("allowHtml")
    private Boolean allowHtml;
    @JsonProperty("allowInsertColumn")
    private Boolean allowInsertColumn;
    @JsonProperty("allowInsertRow")
    private Boolean allowInsertRow;
    @JsonProperty("allowInvalid")
    private Boolean allowInvalid;
    @JsonProperty("allowRemoveColumn")
    private Boolean allowRemoveColumn;
    @JsonProperty("allowRemoveRow")
    private Boolean allowRemoveRow;
    @JsonProperty("autoColumnSize")
    private Boolean autoColumnSize;
    @JsonProperty("autoComplete")
    private List<Object> autoComplete = null;
    @JsonProperty("autoRowSize")
    private Boolean autoRowSize;
    @JsonProperty("autoWrapCol")
    private Boolean autoWrapCol;
    @JsonProperty("autoWrapRow")
    private Boolean autoWrapRow;
    @JsonProperty("cell")
    private List<Object> cell = null;
    @JsonProperty("checkedTemplate")
    private Boolean checkedTemplate;
    @JsonProperty("className")
    private String className;
    @JsonProperty("colHeaders")
    private Boolean colHeaders;
    @JsonProperty("colWidths")
    private Double colWidths;
    @JsonProperty("columnHeaderHeight")
    private Double columnHeaderHeight;
    @JsonProperty("columnSorting")
    private Boolean columnSorting;
    @JsonProperty("commentedCellClassName")
    private String commentedCellClassName;
    @JsonProperty("comments")
    private Boolean comments;
    @JsonProperty("contextMenu")
    private Boolean contextMenu;
    @JsonProperty("copyColsLimit")
    private Double copyColsLimit;
    @JsonProperty("copyPaste")
    private Boolean copyPaste;
    @JsonProperty("copyRowsLimit")
    private Double copyRowsLimit;
    @JsonProperty("copyable")
    private Boolean copyable;
    @JsonProperty("correctFormat")
    private Boolean correctFormat;
    @JsonProperty("currentColClassName")
    private String currentColClassName;
    @JsonProperty("currentHeaderClassName")
    private String currentHeaderClassName;
    @JsonProperty("currentRowClassName")
    private String currentRowClassName;
    @JsonProperty("customBorders")
    private Boolean customBorders;
    @JsonProperty("data")
    private List<Object> data = null;
    @JsonProperty("dateFormat")
    private String dateFormat;
    @JsonProperty("debug")
    private Boolean debug;
    @JsonProperty("defaultDate")
    private String defaultDate;
    @JsonProperty("disableVisualSelection")
    private Boolean disableVisualSelection;
    @JsonProperty("editor")
    private Boolean editor;
    @JsonProperty("enterBeginsEditing")
    private Boolean enterBeginsEditing;
    @JsonProperty("fillHandle")
    private Boolean fillHandle;
    @JsonProperty("filter")
    private Boolean filter;
    @JsonProperty("filteringCaseSensitive")
    private Boolean filteringCaseSensitive;
    @JsonProperty("fixedRowsTop")
    private Double fixedRowsTop;
    @JsonProperty("fragmentSelection")
    private Boolean fragmentSelection;
    @JsonProperty("height")
    private Double height;
    @JsonProperty("invalidCellClassName")
    private String invalidCellClassName;
    @JsonProperty("language")
    private String language;
    @JsonProperty("manualColumnFreeze")
    private Boolean manualColumnFreeze;
    @JsonProperty("manualColumnMove")
    private Boolean manualColumnMove;
    @JsonProperty("manualColumnResize")
    private Boolean manualColumnResize;
    @JsonProperty("manualRowMove")
    private Boolean manualRowMove;
    @JsonProperty("manualRowResize")
    private Boolean manualRowResize;
    @JsonProperty("maxCols")
    private Double maxCols;
    @JsonProperty("maxRows")
    private Double maxRows;
    @JsonProperty("mergeCells")
    private Boolean mergeCells;
    @JsonProperty("minCols")
    private Double minCols;
    @JsonProperty("minRows")
    private Double minRows;
    @JsonProperty("minSpareCols")
    private Double minSpareCols;
    @JsonProperty("minSpareRows")
    private Double minSpareRows;
    @JsonProperty("noWordWrapClassName")
    private String noWordWrapClassName;
    @JsonProperty("observeChanges")
    private Boolean observeChanges;
    @JsonProperty("observeDOMVisibility")
    private Boolean observeDOMVisibility;
    @JsonProperty("pasteMode")
    private String pasteMode;
    @JsonProperty("persistentState")
    private Boolean persistentState;
    @JsonProperty("placeholderCellClassName")
    private String placeholderCellClassName;
    @JsonProperty("preventOverflow")
    private Boolean preventOverflow;
    @JsonProperty("readOnly")
    private Boolean readOnly;
    @JsonProperty("readOnlyCellClassName")
    private String readOnlyCellClassName;
    @JsonProperty("renderAllRows")
    private Boolean renderAllRows;
    @JsonProperty("renderer")
    private String renderer;
    @JsonProperty("rowHeaderWidth")
    private Double rowHeaderWidth;
    @JsonProperty("rowHeaders")
    private Boolean rowHeaders;
    @JsonProperty("rowHeights")
    private Double rowHeights;
    @JsonProperty("search")
    private Boolean search;
    @JsonProperty("selectionMode")
    private Column.SelectionMode selectionMode;
    @JsonProperty("skipColumnOnPaste")
    private Boolean skipColumnOnPaste;
    @JsonProperty("sortByRelevance")
    private Boolean sortByRelevance;
    @JsonProperty("sortIndicator")
    private Boolean sortIndicator;
    @JsonProperty("source")
    private List<Object> source = null;
    @JsonProperty("startCols")
    private Double startCols;
    @JsonProperty("startRows")
    private Double startRows;
    @JsonProperty("stretchH")
    private String stretchH;
    @JsonProperty("strict")
    private Boolean strict;
    @JsonProperty("tableClassName")
    private String tableClassName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("trimDropdown")
    private Boolean trimDropdown;
    @JsonProperty("trimWhitespace")
    private Boolean trimWhitespace;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uncheckedTemplate")
    private Boolean uncheckedTemplate;
    @JsonProperty("undo")
    private Boolean undo;
    @JsonProperty("valid")
    private Boolean valid;
    @JsonProperty("visibleRows")
    private Double visibleRows;
    @JsonProperty("width")
    private Double width;
    @JsonProperty("wordWrap")
    private Boolean wordWrap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("allowEmpty")
    public Boolean getAllowEmpty() {
        return allowEmpty;
    }

    @JsonProperty("allowEmpty")
    public void setAllowEmpty(Boolean allowEmpty) {
        this.allowEmpty = allowEmpty;
    }

    @JsonProperty("allowHtml")
    public Boolean getAllowHtml() {
        return allowHtml;
    }

    @JsonProperty("allowHtml")
    public void setAllowHtml(Boolean allowHtml) {
        this.allowHtml = allowHtml;
    }

    @JsonProperty("allowInsertColumn")
    public Boolean getAllowInsertColumn() {
        return allowInsertColumn;
    }

    @JsonProperty("allowInsertColumn")
    public void setAllowInsertColumn(Boolean allowInsertColumn) {
        this.allowInsertColumn = allowInsertColumn;
    }

    @JsonProperty("allowInsertRow")
    public Boolean getAllowInsertRow() {
        return allowInsertRow;
    }

    @JsonProperty("allowInsertRow")
    public void setAllowInsertRow(Boolean allowInsertRow) {
        this.allowInsertRow = allowInsertRow;
    }

    @JsonProperty("allowInvalid")
    public Boolean getAllowInvalid() {
        return allowInvalid;
    }

    @JsonProperty("allowInvalid")
    public void setAllowInvalid(Boolean allowInvalid) {
        this.allowInvalid = allowInvalid;
    }

    @JsonProperty("allowRemoveColumn")
    public Boolean getAllowRemoveColumn() {
        return allowRemoveColumn;
    }

    @JsonProperty("allowRemoveColumn")
    public void setAllowRemoveColumn(Boolean allowRemoveColumn) {
        this.allowRemoveColumn = allowRemoveColumn;
    }

    @JsonProperty("allowRemoveRow")
    public Boolean getAllowRemoveRow() {
        return allowRemoveRow;
    }

    @JsonProperty("allowRemoveRow")
    public void setAllowRemoveRow(Boolean allowRemoveRow) {
        this.allowRemoveRow = allowRemoveRow;
    }

    @JsonProperty("autoColumnSize")
    public Boolean getAutoColumnSize() {
        return autoColumnSize;
    }

    @JsonProperty("autoColumnSize")
    public void setAutoColumnSize(Boolean autoColumnSize) {
        this.autoColumnSize = autoColumnSize;
    }

    @JsonProperty("autoComplete")
    public List<Object> getAutoComplete() {
        return autoComplete;
    }

    @JsonProperty("autoComplete")
    public void setAutoComplete(List<Object> autoComplete) {
        this.autoComplete = autoComplete;
    }

    @JsonProperty("autoRowSize")
    public Boolean getAutoRowSize() {
        return autoRowSize;
    }

    @JsonProperty("autoRowSize")
    public void setAutoRowSize(Boolean autoRowSize) {
        this.autoRowSize = autoRowSize;
    }

    @JsonProperty("autoWrapCol")
    public Boolean getAutoWrapCol() {
        return autoWrapCol;
    }

    @JsonProperty("autoWrapCol")
    public void setAutoWrapCol(Boolean autoWrapCol) {
        this.autoWrapCol = autoWrapCol;
    }

    @JsonProperty("autoWrapRow")
    public Boolean getAutoWrapRow() {
        return autoWrapRow;
    }

    @JsonProperty("autoWrapRow")
    public void setAutoWrapRow(Boolean autoWrapRow) {
        this.autoWrapRow = autoWrapRow;
    }

    @JsonProperty("cell")
    public List<Object> getCell() {
        return cell;
    }

    @JsonProperty("cell")
    public void setCell(List<Object> cell) {
        this.cell = cell;
    }

    @JsonProperty("checkedTemplate")
    public Boolean getCheckedTemplate() {
        return checkedTemplate;
    }

    @JsonProperty("checkedTemplate")
    public void setCheckedTemplate(Boolean checkedTemplate) {
        this.checkedTemplate = checkedTemplate;
    }

    @JsonProperty("className")
    public String getClassName() {
        return className;
    }

    @JsonProperty("className")
    public void setClassName(String className) {
        this.className = className;
    }

    @JsonProperty("colHeaders")
    public Boolean getColHeaders() {
        return colHeaders;
    }

    @JsonProperty("colHeaders")
    public void setColHeaders(Boolean colHeaders) {
        this.colHeaders = colHeaders;
    }

    @JsonProperty("colWidths")
    public Double getColWidths() {
        return colWidths;
    }

    @JsonProperty("colWidths")
    public void setColWidths(Double colWidths) {
        this.colWidths = colWidths;
    }

    @JsonProperty("columnHeaderHeight")
    public Double getColumnHeaderHeight() {
        return columnHeaderHeight;
    }

    @JsonProperty("columnHeaderHeight")
    public void setColumnHeaderHeight(Double columnHeaderHeight) {
        this.columnHeaderHeight = columnHeaderHeight;
    }

    @JsonProperty("columnSorting")
    public Boolean getColumnSorting() {
        return columnSorting;
    }

    @JsonProperty("columnSorting")
    public void setColumnSorting(Boolean columnSorting) {
        this.columnSorting = columnSorting;
    }

    @JsonProperty("commentedCellClassName")
    public String getCommentedCellClassName() {
        return commentedCellClassName;
    }

    @JsonProperty("commentedCellClassName")
    public void setCommentedCellClassName(String commentedCellClassName) {
        this.commentedCellClassName = commentedCellClassName;
    }

    @JsonProperty("comments")
    public Boolean getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Boolean comments) {
        this.comments = comments;
    }

    @JsonProperty("contextMenu")
    public Boolean getContextMenu() {
        return contextMenu;
    }

    @JsonProperty("contextMenu")
    public void setContextMenu(Boolean contextMenu) {
        this.contextMenu = contextMenu;
    }

    @JsonProperty("copyColsLimit")
    public Double getCopyColsLimit() {
        return copyColsLimit;
    }

    @JsonProperty("copyColsLimit")
    public void setCopyColsLimit(Double copyColsLimit) {
        this.copyColsLimit = copyColsLimit;
    }

    @JsonProperty("copyPaste")
    public Boolean getCopyPaste() {
        return copyPaste;
    }

    @JsonProperty("copyPaste")
    public void setCopyPaste(Boolean copyPaste) {
        this.copyPaste = copyPaste;
    }

    @JsonProperty("copyRowsLimit")
    public Double getCopyRowsLimit() {
        return copyRowsLimit;
    }

    @JsonProperty("copyRowsLimit")
    public void setCopyRowsLimit(Double copyRowsLimit) {
        this.copyRowsLimit = copyRowsLimit;
    }

    @JsonProperty("copyable")
    public Boolean getCopyable() {
        return copyable;
    }

    @JsonProperty("copyable")
    public void setCopyable(Boolean copyable) {
        this.copyable = copyable;
    }

    @JsonProperty("correctFormat")
    public Boolean getCorrectFormat() {
        return correctFormat;
    }

    @JsonProperty("correctFormat")
    public void setCorrectFormat(Boolean correctFormat) {
        this.correctFormat = correctFormat;
    }

    @JsonProperty("currentColClassName")
    public String getCurrentColClassName() {
        return currentColClassName;
    }

    @JsonProperty("currentColClassName")
    public void setCurrentColClassName(String currentColClassName) {
        this.currentColClassName = currentColClassName;
    }

    @JsonProperty("currentHeaderClassName")
    public String getCurrentHeaderClassName() {
        return currentHeaderClassName;
    }

    @JsonProperty("currentHeaderClassName")
    public void setCurrentHeaderClassName(String currentHeaderClassName) {
        this.currentHeaderClassName = currentHeaderClassName;
    }

    @JsonProperty("currentRowClassName")
    public String getCurrentRowClassName() {
        return currentRowClassName;
    }

    @JsonProperty("currentRowClassName")
    public void setCurrentRowClassName(String currentRowClassName) {
        this.currentRowClassName = currentRowClassName;
    }

    @JsonProperty("customBorders")
    public Boolean getCustomBorders() {
        return customBorders;
    }

    @JsonProperty("customBorders")
    public void setCustomBorders(Boolean customBorders) {
        this.customBorders = customBorders;
    }

    @JsonProperty("data")
    public List<Object> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Object> data) {
        this.data = data;
    }

    @JsonProperty("dateFormat")
    public String getDateFormat() {
        return dateFormat;
    }

    @JsonProperty("dateFormat")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @JsonProperty("debug")
    public Boolean getDebug() {
        return debug;
    }

    @JsonProperty("debug")
    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    @JsonProperty("defaultDate")
    public String getDefaultDate() {
        return defaultDate;
    }

    @JsonProperty("defaultDate")
    public void setDefaultDate(String defaultDate) {
        this.defaultDate = defaultDate;
    }

    @JsonProperty("disableVisualSelection")
    public Boolean getDisableVisualSelection() {
        return disableVisualSelection;
    }

    @JsonProperty("disableVisualSelection")
    public void setDisableVisualSelection(Boolean disableVisualSelection) {
        this.disableVisualSelection = disableVisualSelection;
    }

    @JsonProperty("editor")
    public Boolean getEditor() {
        return editor;
    }

    @JsonProperty("editor")
    public void setEditor(Boolean editor) {
        this.editor = editor;
    }

    @JsonProperty("enterBeginsEditing")
    public Boolean getEnterBeginsEditing() {
        return enterBeginsEditing;
    }

    @JsonProperty("enterBeginsEditing")
    public void setEnterBeginsEditing(Boolean enterBeginsEditing) {
        this.enterBeginsEditing = enterBeginsEditing;
    }

    @JsonProperty("fillHandle")
    public Boolean getFillHandle() {
        return fillHandle;
    }

    @JsonProperty("fillHandle")
    public void setFillHandle(Boolean fillHandle) {
        this.fillHandle = fillHandle;
    }

    @JsonProperty("filter")
    public Boolean getFilter() {
        return filter;
    }

    @JsonProperty("filter")
    public void setFilter(Boolean filter) {
        this.filter = filter;
    }

    @JsonProperty("filteringCaseSensitive")
    public Boolean getFilteringCaseSensitive() {
        return filteringCaseSensitive;
    }

    @JsonProperty("filteringCaseSensitive")
    public void setFilteringCaseSensitive(Boolean filteringCaseSensitive) {
        this.filteringCaseSensitive = filteringCaseSensitive;
    }

    @JsonProperty("fixedRowsTop")
    public Double getFixedRowsTop() {
        return fixedRowsTop;
    }

    @JsonProperty("fixedRowsTop")
    public void setFixedRowsTop(Double fixedRowsTop) {
        this.fixedRowsTop = fixedRowsTop;
    }

    @JsonProperty("fragmentSelection")
    public Boolean getFragmentSelection() {
        return fragmentSelection;
    }

    @JsonProperty("fragmentSelection")
    public void setFragmentSelection(Boolean fragmentSelection) {
        this.fragmentSelection = fragmentSelection;
    }

    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    @JsonProperty("invalidCellClassName")
    public String getInvalidCellClassName() {
        return invalidCellClassName;
    }

    @JsonProperty("invalidCellClassName")
    public void setInvalidCellClassName(String invalidCellClassName) {
        this.invalidCellClassName = invalidCellClassName;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("manualColumnFreeze")
    public Boolean getManualColumnFreeze() {
        return manualColumnFreeze;
    }

    @JsonProperty("manualColumnFreeze")
    public void setManualColumnFreeze(Boolean manualColumnFreeze) {
        this.manualColumnFreeze = manualColumnFreeze;
    }

    @JsonProperty("manualColumnMove")
    public Boolean getManualColumnMove() {
        return manualColumnMove;
    }

    @JsonProperty("manualColumnMove")
    public void setManualColumnMove(Boolean manualColumnMove) {
        this.manualColumnMove = manualColumnMove;
    }

    @JsonProperty("manualColumnResize")
    public Boolean getManualColumnResize() {
        return manualColumnResize;
    }

    @JsonProperty("manualColumnResize")
    public void setManualColumnResize(Boolean manualColumnResize) {
        this.manualColumnResize = manualColumnResize;
    }

    @JsonProperty("manualRowMove")
    public Boolean getManualRowMove() {
        return manualRowMove;
    }

    @JsonProperty("manualRowMove")
    public void setManualRowMove(Boolean manualRowMove) {
        this.manualRowMove = manualRowMove;
    }

    @JsonProperty("manualRowResize")
    public Boolean getManualRowResize() {
        return manualRowResize;
    }

    @JsonProperty("manualRowResize")
    public void setManualRowResize(Boolean manualRowResize) {
        this.manualRowResize = manualRowResize;
    }

    @JsonProperty("maxCols")
    public Double getMaxCols() {
        return maxCols;
    }

    @JsonProperty("maxCols")
    public void setMaxCols(Double maxCols) {
        this.maxCols = maxCols;
    }

    @JsonProperty("maxRows")
    public Double getMaxRows() {
        return maxRows;
    }

    @JsonProperty("maxRows")
    public void setMaxRows(Double maxRows) {
        this.maxRows = maxRows;
    }

    @JsonProperty("mergeCells")
    public Boolean getMergeCells() {
        return mergeCells;
    }

    @JsonProperty("mergeCells")
    public void setMergeCells(Boolean mergeCells) {
        this.mergeCells = mergeCells;
    }

    @JsonProperty("minCols")
    public Double getMinCols() {
        return minCols;
    }

    @JsonProperty("minCols")
    public void setMinCols(Double minCols) {
        this.minCols = minCols;
    }

    @JsonProperty("minRows")
    public Double getMinRows() {
        return minRows;
    }

    @JsonProperty("minRows")
    public void setMinRows(Double minRows) {
        this.minRows = minRows;
    }

    @JsonProperty("minSpareCols")
    public Double getMinSpareCols() {
        return minSpareCols;
    }

    @JsonProperty("minSpareCols")
    public void setMinSpareCols(Double minSpareCols) {
        this.minSpareCols = minSpareCols;
    }

    @JsonProperty("minSpareRows")
    public Double getMinSpareRows() {
        return minSpareRows;
    }

    @JsonProperty("minSpareRows")
    public void setMinSpareRows(Double minSpareRows) {
        this.minSpareRows = minSpareRows;
    }

    @JsonProperty("noWordWrapClassName")
    public String getNoWordWrapClassName() {
        return noWordWrapClassName;
    }

    @JsonProperty("noWordWrapClassName")
    public void setNoWordWrapClassName(String noWordWrapClassName) {
        this.noWordWrapClassName = noWordWrapClassName;
    }

    @JsonProperty("observeChanges")
    public Boolean getObserveChanges() {
        return observeChanges;
    }

    @JsonProperty("observeChanges")
    public void setObserveChanges(Boolean observeChanges) {
        this.observeChanges = observeChanges;
    }

    @JsonProperty("observeDOMVisibility")
    public Boolean getObserveDOMVisibility() {
        return observeDOMVisibility;
    }

    @JsonProperty("observeDOMVisibility")
    public void setObserveDOMVisibility(Boolean observeDOMVisibility) {
        this.observeDOMVisibility = observeDOMVisibility;
    }

    @JsonProperty("pasteMode")
    public String getPasteMode() {
        return pasteMode;
    }

    @JsonProperty("pasteMode")
    public void setPasteMode(String pasteMode) {
        this.pasteMode = pasteMode;
    }

    @JsonProperty("persistentState")
    public Boolean getPersistentState() {
        return persistentState;
    }

    @JsonProperty("persistentState")
    public void setPersistentState(Boolean persistentState) {
        this.persistentState = persistentState;
    }

    @JsonProperty("placeholderCellClassName")
    public String getPlaceholderCellClassName() {
        return placeholderCellClassName;
    }

    @JsonProperty("placeholderCellClassName")
    public void setPlaceholderCellClassName(String placeholderCellClassName) {
        this.placeholderCellClassName = placeholderCellClassName;
    }

    @JsonProperty("preventOverflow")
    public Boolean getPreventOverflow() {
        return preventOverflow;
    }

    @JsonProperty("preventOverflow")
    public void setPreventOverflow(Boolean preventOverflow) {
        this.preventOverflow = preventOverflow;
    }

    @JsonProperty("readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonProperty("readOnlyCellClassName")
    public String getReadOnlyCellClassName() {
        return readOnlyCellClassName;
    }

    @JsonProperty("readOnlyCellClassName")
    public void setReadOnlyCellClassName(String readOnlyCellClassName) {
        this.readOnlyCellClassName = readOnlyCellClassName;
    }

    @JsonProperty("renderAllRows")
    public Boolean getRenderAllRows() {
        return renderAllRows;
    }

    @JsonProperty("renderAllRows")
    public void setRenderAllRows(Boolean renderAllRows) {
        this.renderAllRows = renderAllRows;
    }

    @JsonProperty("renderer")
    public String getRenderer() {
        return renderer;
    }

    @JsonProperty("renderer")
    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    @JsonProperty("rowHeaderWidth")
    public Double getRowHeaderWidth() {
        return rowHeaderWidth;
    }

    @JsonProperty("rowHeaderWidth")
    public void setRowHeaderWidth(Double rowHeaderWidth) {
        this.rowHeaderWidth = rowHeaderWidth;
    }

    @JsonProperty("rowHeaders")
    public Boolean getRowHeaders() {
        return rowHeaders;
    }

    @JsonProperty("rowHeaders")
    public void setRowHeaders(Boolean rowHeaders) {
        this.rowHeaders = rowHeaders;
    }

    @JsonProperty("rowHeights")
    public Double getRowHeights() {
        return rowHeights;
    }

    @JsonProperty("rowHeights")
    public void setRowHeights(Double rowHeights) {
        this.rowHeights = rowHeights;
    }

    @JsonProperty("search")
    public Boolean getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(Boolean search) {
        this.search = search;
    }

    @JsonProperty("selectionMode")
    public Column.SelectionMode getSelectionMode() {
        return selectionMode;
    }

    @JsonProperty("selectionMode")
    public void setSelectionMode(Column.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
    }

    @JsonProperty("skipColumnOnPaste")
    public Boolean getSkipColumnOnPaste() {
        return skipColumnOnPaste;
    }

    @JsonProperty("skipColumnOnPaste")
    public void setSkipColumnOnPaste(Boolean skipColumnOnPaste) {
        this.skipColumnOnPaste = skipColumnOnPaste;
    }

    @JsonProperty("sortByRelevance")
    public Boolean getSortByRelevance() {
        return sortByRelevance;
    }

    @JsonProperty("sortByRelevance")
    public void setSortByRelevance(Boolean sortByRelevance) {
        this.sortByRelevance = sortByRelevance;
    }

    @JsonProperty("sortIndicator")
    public Boolean getSortIndicator() {
        return sortIndicator;
    }

    @JsonProperty("sortIndicator")
    public void setSortIndicator(Boolean sortIndicator) {
        this.sortIndicator = sortIndicator;
    }

    @JsonProperty("source")
    public List<Object> getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(List<Object> source) {
        this.source = source;
    }

    @JsonProperty("startCols")
    public Double getStartCols() {
        return startCols;
    }

    @JsonProperty("startCols")
    public void setStartCols(Double startCols) {
        this.startCols = startCols;
    }

    @JsonProperty("startRows")
    public Double getStartRows() {
        return startRows;
    }

    @JsonProperty("startRows")
    public void setStartRows(Double startRows) {
        this.startRows = startRows;
    }

    @JsonProperty("stretchH")
    public String getStretchH() {
        return stretchH;
    }

    @JsonProperty("stretchH")
    public void setStretchH(String stretchH) {
        this.stretchH = stretchH;
    }

    @JsonProperty("strict")
    public Boolean getStrict() {
        return strict;
    }

    @JsonProperty("strict")
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    @JsonProperty("tableClassName")
    public String getTableClassName() {
        return tableClassName;
    }

    @JsonProperty("tableClassName")
    public void setTableClassName(String tableClassName) {
        this.tableClassName = tableClassName;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("trimDropdown")
    public Boolean getTrimDropdown() {
        return trimDropdown;
    }

    @JsonProperty("trimDropdown")
    public void setTrimDropdown(Boolean trimDropdown) {
        this.trimDropdown = trimDropdown;
    }

    @JsonProperty("trimWhitespace")
    public Boolean getTrimWhitespace() {
        return trimWhitespace;
    }

    @JsonProperty("trimWhitespace")
    public void setTrimWhitespace(Boolean trimWhitespace) {
        this.trimWhitespace = trimWhitespace;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("uncheckedTemplate")
    public Boolean getUncheckedTemplate() {
        return uncheckedTemplate;
    }

    @JsonProperty("uncheckedTemplate")
    public void setUncheckedTemplate(Boolean uncheckedTemplate) {
        this.uncheckedTemplate = uncheckedTemplate;
    }

    @JsonProperty("undo")
    public Boolean getUndo() {
        return undo;
    }

    @JsonProperty("undo")
    public void setUndo(Boolean undo) {
        this.undo = undo;
    }

    @JsonProperty("valid")
    public Boolean getValid() {
        return valid;
    }

    @JsonProperty("valid")
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @JsonProperty("visibleRows")
    public Double getVisibleRows() {
        return visibleRows;
    }

    @JsonProperty("visibleRows")
    public void setVisibleRows(Double visibleRows) {
        this.visibleRows = visibleRows;
    }

    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    @JsonProperty("wordWrap")
    public Boolean getWordWrap() {
        return wordWrap;
    }

    @JsonProperty("wordWrap")
    public void setWordWrap(Boolean wordWrap) {
        this.wordWrap = wordWrap;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public enum SelectionMode {

        MULTIPLE("multiple"),
        RANGE("range"),
        SINGLE("single");
        private final String value;
        private final static Map<String, Column.SelectionMode> CONSTANTS = new HashMap<String, Column.SelectionMode>();

        static {
            for (Column.SelectionMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SelectionMode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Column.SelectionMode fromValue(String value) {
            Column.SelectionMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
