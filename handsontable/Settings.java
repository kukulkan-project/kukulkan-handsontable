
package handsontable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "rowHeaders",
    "colHeaders",
    "afterChange",
    "dropdownMenu",
    "filters",
    "contextMenu",
    "minSpareRows",
    "columnSorting",
    "autoWrapRow",
    "height",
    "rowHeights",
    "colWidths",
    "minRows",
    "columns"
})
public class Settings {

    @JsonProperty("data")
    private Data data;
    @JsonProperty("rowHeaders")
    private Boolean rowHeaders;
    @JsonProperty("colHeaders")
    private List<Object> colHeaders = null;
    @JsonProperty("afterChange")
    private Boolean afterChange;
    @JsonProperty("dropdownMenu")
    private Boolean dropdownMenu;
    @JsonProperty("filters")
    private Boolean filters;
    @JsonProperty("contextMenu")
    private Boolean contextMenu;
    @JsonProperty("minSpareRows")
    private Boolean minSpareRows;
    @JsonProperty("columnSorting")
    private Boolean columnSorting;
    @JsonProperty("autoWrapRow")
    private Boolean autoWrapRow;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("rowHeights")
    private Integer rowHeights;
    @JsonProperty("colWidths")
    private Integer colWidths;
    @JsonProperty("minRows")
    private Integer minRows;
    @JsonProperty("columns")
    private Columns columns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("rowHeaders")
    public Boolean getRowHeaders() {
        return rowHeaders;
    }

    @JsonProperty("rowHeaders")
    public void setRowHeaders(Boolean rowHeaders) {
        this.rowHeaders = rowHeaders;
    }

    @JsonProperty("colHeaders")
    public List<Object> getColHeaders() {
        return colHeaders;
    }

    @JsonProperty("colHeaders")
    public void setColHeaders(List<Object> colHeaders) {
        this.colHeaders = colHeaders;
    }

    @JsonProperty("afterChange")
    public Boolean getAfterChange() {
        return afterChange;
    }

    @JsonProperty("afterChange")
    public void setAfterChange(Boolean afterChange) {
        this.afterChange = afterChange;
    }

    @JsonProperty("dropdownMenu")
    public Boolean getDropdownMenu() {
        return dropdownMenu;
    }

    @JsonProperty("dropdownMenu")
    public void setDropdownMenu(Boolean dropdownMenu) {
        this.dropdownMenu = dropdownMenu;
    }

    @JsonProperty("filters")
    public Boolean getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(Boolean filters) {
        this.filters = filters;
    }

    @JsonProperty("contextMenu")
    public Boolean getContextMenu() {
        return contextMenu;
    }

    @JsonProperty("contextMenu")
    public void setContextMenu(Boolean contextMenu) {
        this.contextMenu = contextMenu;
    }

    @JsonProperty("minSpareRows")
    public Boolean getMinSpareRows() {
        return minSpareRows;
    }

    @JsonProperty("minSpareRows")
    public void setMinSpareRows(Boolean minSpareRows) {
        this.minSpareRows = minSpareRows;
    }

    @JsonProperty("columnSorting")
    public Boolean getColumnSorting() {
        return columnSorting;
    }

    @JsonProperty("columnSorting")
    public void setColumnSorting(Boolean columnSorting) {
        this.columnSorting = columnSorting;
    }

    @JsonProperty("autoWrapRow")
    public Boolean getAutoWrapRow() {
        return autoWrapRow;
    }

    @JsonProperty("autoWrapRow")
    public void setAutoWrapRow(Boolean autoWrapRow) {
        this.autoWrapRow = autoWrapRow;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("rowHeights")
    public Integer getRowHeights() {
        return rowHeights;
    }

    @JsonProperty("rowHeights")
    public void setRowHeights(Integer rowHeights) {
        this.rowHeights = rowHeights;
    }

    @JsonProperty("colWidths")
    public Integer getColWidths() {
        return colWidths;
    }

    @JsonProperty("colWidths")
    public void setColWidths(Integer colWidths) {
        this.colWidths = colWidths;
    }

    @JsonProperty("minRows")
    public Integer getMinRows() {
        return minRows;
    }

    @JsonProperty("minRows")
    public void setMinRows(Integer minRows) {
        this.minRows = minRows;
    }

    @JsonProperty("columns")
    public Columns getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(Columns columns) {
        this.columns = columns;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
