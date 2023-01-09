
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "scpTVA",
    "data_inceput_ScpTVA",
    "data_sfarsit_ScpTVA",
    "data_anul_imp_ScpTVA",
    "mesaj_ScpTVA"
})

public class InregistrareScopTva {

    @JsonProperty("scpTVA")
    private Boolean scpTVA;
    @JsonProperty("data_inceput_ScpTVA")
    private String dataInceputScpTVA;
    @JsonProperty("data_sfarsit_ScpTVA")
    private String dataSfarsitScpTVA;
    @JsonProperty("data_anul_imp_ScpTVA")
    private String dataAnulImpScpTVA;
    @JsonProperty("mesaj_ScpTVA")
    private String mesajScpTVA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scpTVA")
    public Boolean getScpTVA() {
        return scpTVA;
    }

    @JsonProperty("scpTVA")
    public void setScpTVA(Boolean scpTVA) {
        this.scpTVA = scpTVA;
    }

    @JsonProperty("data_inceput_ScpTVA")
    public String getDataInceputScpTVA() {
        return dataInceputScpTVA;
    }

    @JsonProperty("data_inceput_ScpTVA")
    public void setDataInceputScpTVA(String dataInceputScpTVA) {
        this.dataInceputScpTVA = dataInceputScpTVA;
    }

    @JsonProperty("data_sfarsit_ScpTVA")
    public String getDataSfarsitScpTVA() {
        return dataSfarsitScpTVA;
    }

    @JsonProperty("data_sfarsit_ScpTVA")
    public void setDataSfarsitScpTVA(String dataSfarsitScpTVA) {
        this.dataSfarsitScpTVA = dataSfarsitScpTVA;
    }

    @JsonProperty("data_anul_imp_ScpTVA")
    public String getDataAnulImpScpTVA() {
        return dataAnulImpScpTVA;
    }

    @JsonProperty("data_anul_imp_ScpTVA")
    public void setDataAnulImpScpTVA(String dataAnulImpScpTVA) {
        this.dataAnulImpScpTVA = dataAnulImpScpTVA;
    }

    @JsonProperty("mesaj_ScpTVA")
    public String getMesajScpTVA() {
        return mesajScpTVA;
    }

    @JsonProperty("mesaj_ScpTVA")
    public void setMesajScpTVA(String mesajScpTVA) {
        this.mesajScpTVA = mesajScpTVA;
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
        sb.append(InregistrareScopTva.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scpTVA");
        sb.append('=');
        sb.append(((this.scpTVA == null)?"<null>":this.scpTVA));
        sb.append(',');
        sb.append("dataInceputScpTVA");
        sb.append('=');
        sb.append(((this.dataInceputScpTVA == null)?"<null>":this.dataInceputScpTVA));
        sb.append(',');
        sb.append("dataSfarsitScpTVA");
        sb.append('=');
        sb.append(((this.dataSfarsitScpTVA == null)?"<null>":this.dataSfarsitScpTVA));
        sb.append(',');
        sb.append("dataAnulImpScpTVA");
        sb.append('=');
        sb.append(((this.dataAnulImpScpTVA == null)?"<null>":this.dataAnulImpScpTVA));
        sb.append(',');
        sb.append("mesajScpTVA");
        sb.append('=');
        sb.append(((this.mesajScpTVA == null)?"<null>":this.mesajScpTVA));
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
