
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "dataInactivare",
    "dataReactivare",
    "dataPublicare",
    "dataRadiere",
    "statusInactivi"
})

public class StareInactiv {

    @JsonProperty("dataInactivare")
    private String dataInactivare;
    @JsonProperty("dataReactivare")
    private String dataReactivare;
    @JsonProperty("dataPublicare")
    private String dataPublicare;
    @JsonProperty("dataRadiere")
    private String dataRadiere;
    @JsonProperty("statusInactivi")
    private Boolean statusInactivi;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dataInactivare")
    public String getDataInactivare() {
        return dataInactivare;
    }

    @JsonProperty("dataInactivare")
    public void setDataInactivare(String dataInactivare) {
        this.dataInactivare = dataInactivare;
    }

    @JsonProperty("dataReactivare")
    public String getDataReactivare() {
        return dataReactivare;
    }

    @JsonProperty("dataReactivare")
    public void setDataReactivare(String dataReactivare) {
        this.dataReactivare = dataReactivare;
    }

    @JsonProperty("dataPublicare")
    public String getDataPublicare() {
        return dataPublicare;
    }

    @JsonProperty("dataPublicare")
    public void setDataPublicare(String dataPublicare) {
        this.dataPublicare = dataPublicare;
    }

    @JsonProperty("dataRadiere")
    public String getDataRadiere() {
        return dataRadiere;
    }

    @JsonProperty("dataRadiere")
    public void setDataRadiere(String dataRadiere) {
        this.dataRadiere = dataRadiere;
    }

    @JsonProperty("statusInactivi")
    public Boolean getStatusInactivi() {
        return statusInactivi;
    }

    @JsonProperty("statusInactivi")
    public void setStatusInactivi(Boolean statusInactivi) {
        this.statusInactivi = statusInactivi;
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
        sb.append(StareInactiv.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataInactivare");
        sb.append('=');
        sb.append(((this.dataInactivare == null)?"<null>":this.dataInactivare));
        sb.append(',');
        sb.append("dataReactivare");
        sb.append('=');
        sb.append(((this.dataReactivare == null)?"<null>":this.dataReactivare));
        sb.append(',');
        sb.append("dataPublicare");
        sb.append('=');
        sb.append(((this.dataPublicare == null)?"<null>":this.dataPublicare));
        sb.append(',');
        sb.append("dataRadiere");
        sb.append('=');
        sb.append(((this.dataRadiere == null)?"<null>":this.dataRadiere));
        sb.append(',');
        sb.append("statusInactivi");
        sb.append('=');
        sb.append(((this.statusInactivi == null)?"<null>":this.statusInactivi));
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
