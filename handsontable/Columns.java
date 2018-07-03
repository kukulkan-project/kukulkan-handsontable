
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
    "type",
    "format",
    "source",
    "dateFormat",
    "correctFormat",
    "defaultDate",
    "strict",
    "allowEmpty"
})
public class Columns {

    @JsonProperty("type")
    private String type;
    @JsonProperty("format")
    private String format;
    @JsonProperty("source")
    private List<Object> source = null;
    @JsonProperty("dateFormat")
    private String dateFormat;
    @JsonProperty("correctFormat")
    private Boolean correctFormat;
    @JsonProperty("defaultDate")
    private String defaultDate;
    @JsonProperty("strict")
    private Boolean strict;
    @JsonProperty("allowEmpty")
    private Boolean allowEmpty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("source")
    public List<Object> getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(List<Object> source) {
        this.source = source;
    }

    @JsonProperty("dateFormat")
    public String getDateFormat() {
        return dateFormat;
    }

    @JsonProperty("dateFormat")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @JsonProperty("correctFormat")
    public Boolean getCorrectFormat() {
        return correctFormat;
    }

    @JsonProperty("correctFormat")
    public void setCorrectFormat(Boolean correctFormat) {
        this.correctFormat = correctFormat;
    }

    @JsonProperty("defaultDate")
    public String getDefaultDate() {
        return defaultDate;
    }

    @JsonProperty("defaultDate")
    public void setDefaultDate(String defaultDate) {
        this.defaultDate = defaultDate;
    }

    @JsonProperty("strict")
    public Boolean getStrict() {
        return strict;
    }

    @JsonProperty("strict")
    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    @JsonProperty("allowEmpty")
    public Boolean getAllowEmpty() {
        return allowEmpty;
    }

    @JsonProperty("allowEmpty")
    public void setAllowEmpty(Boolean allowEmpty) {
        this.allowEmpty = allowEmpty;
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
