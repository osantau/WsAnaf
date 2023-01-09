
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "dataInceputTvaInc",
    "dataSfarsitTvaInc",
    "dataActualizareTvaInc",
    "dataPublicareTvaInc",
    "tipActTvaInc",
    "statusTvaIncasare"
})

public class InregistrareRTVAI {

    @JsonProperty("dataInceputTvaInc")
    private String dataInceputTvaInc;
    @JsonProperty("dataSfarsitTvaInc")
    private String dataSfarsitTvaInc;
    @JsonProperty("dataActualizareTvaInc")
    private String dataActualizareTvaInc;
    @JsonProperty("dataPublicareTvaInc")
    private String dataPublicareTvaInc;
    @JsonProperty("tipActTvaInc")
    private String tipActTvaInc;
    @JsonProperty("statusTvaIncasare")
    private Boolean statusTvaIncasare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dataInceputTvaInc")
    public String getDataInceputTvaInc() {
        return dataInceputTvaInc;
    }

    @JsonProperty("dataInceputTvaInc")
    public void setDataInceputTvaInc(String dataInceputTvaInc) {
        this.dataInceputTvaInc = dataInceputTvaInc;
    }

    @JsonProperty("dataSfarsitTvaInc")
    public String getDataSfarsitTvaInc() {
        return dataSfarsitTvaInc;
    }

    @JsonProperty("dataSfarsitTvaInc")
    public void setDataSfarsitTvaInc(String dataSfarsitTvaInc) {
        this.dataSfarsitTvaInc = dataSfarsitTvaInc;
    }

    @JsonProperty("dataActualizareTvaInc")
    public String getDataActualizareTvaInc() {
        return dataActualizareTvaInc;
    }

    @JsonProperty("dataActualizareTvaInc")
    public void setDataActualizareTvaInc(String dataActualizareTvaInc) {
        this.dataActualizareTvaInc = dataActualizareTvaInc;
    }

    @JsonProperty("dataPublicareTvaInc")
    public String getDataPublicareTvaInc() {
        return dataPublicareTvaInc;
    }

    @JsonProperty("dataPublicareTvaInc")
    public void setDataPublicareTvaInc(String dataPublicareTvaInc) {
        this.dataPublicareTvaInc = dataPublicareTvaInc;
    }

    @JsonProperty("tipActTvaInc")
    public String getTipActTvaInc() {
        return tipActTvaInc;
    }

    @JsonProperty("tipActTvaInc")
    public void setTipActTvaInc(String tipActTvaInc) {
        this.tipActTvaInc = tipActTvaInc;
    }

    @JsonProperty("statusTvaIncasare")
    public Boolean getStatusTvaIncasare() {
        return statusTvaIncasare;
    }

    @JsonProperty("statusTvaIncasare")
    public void setStatusTvaIncasare(Boolean statusTvaIncasare) {
        this.statusTvaIncasare = statusTvaIncasare;
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
        sb.append(InregistrareRTVAI.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataInceputTvaInc");
        sb.append('=');
        sb.append(((this.dataInceputTvaInc == null)?"<null>":this.dataInceputTvaInc));
        sb.append(',');
        sb.append("dataSfarsitTvaInc");
        sb.append('=');
        sb.append(((this.dataSfarsitTvaInc == null)?"<null>":this.dataSfarsitTvaInc));
        sb.append(',');
        sb.append("dataActualizareTvaInc");
        sb.append('=');
        sb.append(((this.dataActualizareTvaInc == null)?"<null>":this.dataActualizareTvaInc));
        sb.append(',');
        sb.append("dataPublicareTvaInc");
        sb.append('=');
        sb.append(((this.dataPublicareTvaInc == null)?"<null>":this.dataPublicareTvaInc));
        sb.append(',');
        sb.append("tipActTvaInc");
        sb.append('=');
        sb.append(((this.tipActTvaInc == null)?"<null>":this.tipActTvaInc));
        sb.append(',');
        sb.append("statusTvaIncasare");
        sb.append('=');
        sb.append(((this.statusTvaIncasare == null)?"<null>":this.statusTvaIncasare));
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
