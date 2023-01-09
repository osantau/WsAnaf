
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "dataInceputSplitTVA",
    "dataAnulareSplitTVA",
    "statusSplitTVA"
})

public class InregistrareSplitTVA {

    @JsonProperty("dataInceputSplitTVA")
    private String dataInceputSplitTVA;
    @JsonProperty("dataAnulareSplitTVA")
    private String dataAnulareSplitTVA;
    @JsonProperty("statusSplitTVA")
    private Boolean statusSplitTVA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dataInceputSplitTVA")
    public String getDataInceputSplitTVA() {
        return dataInceputSplitTVA;
    }

    @JsonProperty("dataInceputSplitTVA")
    public void setDataInceputSplitTVA(String dataInceputSplitTVA) {
        this.dataInceputSplitTVA = dataInceputSplitTVA;
    }

    @JsonProperty("dataAnulareSplitTVA")
    public String getDataAnulareSplitTVA() {
        return dataAnulareSplitTVA;
    }

    @JsonProperty("dataAnulareSplitTVA")
    public void setDataAnulareSplitTVA(String dataAnulareSplitTVA) {
        this.dataAnulareSplitTVA = dataAnulareSplitTVA;
    }

    @JsonProperty("statusSplitTVA")
    public Boolean getStatusSplitTVA() {
        return statusSplitTVA;
    }

    @JsonProperty("statusSplitTVA")
    public void setStatusSplitTVA(Boolean statusSplitTVA) {
        this.statusSplitTVA = statusSplitTVA;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InregistrareSplitTVA.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataInceputSplitTVA");
        sb.append('=');
        sb.append(((this.dataInceputSplitTVA == null)?"<null>":this.dataInceputSplitTVA));
        sb.append(',');
        sb.append("dataAnulareSplitTVA");
        sb.append('=');
        sb.append(((this.dataAnulareSplitTVA == null)?"<null>":this.dataAnulareSplitTVA));
        sb.append(',');
        sb.append("statusSplitTVA");
        sb.append('=');
        sb.append(((this.statusSplitTVA == null)?"<null>":this.statusSplitTVA));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
