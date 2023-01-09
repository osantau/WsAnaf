
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "cui",
    "data",
    "denumire",
    "adresa",
    "nrRegCom",
    "telefon",
    "fax",
    "codPostal",
    "act",
    "stare_inregistrare",
    "data_inregistrare",
    "cod_CAEN",
    "iban",
    "statusRO_e_Factura",
    "organFiscalCompetent"
})

public class DateGenerale {

    @JsonProperty("cui")
    private Integer cui;
    @JsonProperty("data")
    private String data;
    @JsonProperty("denumire")
    private String denumire;
    @JsonProperty("adresa")
    private String adresa;
    @JsonProperty("nrRegCom")
    private String nrRegCom;
    @JsonProperty("telefon")
    private String telefon;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("codPostal")
    private String codPostal;
    @JsonProperty("act")
    private String act;
    @JsonProperty("stare_inregistrare")
    private String stareInregistrare;
    @JsonProperty("data_inregistrare")
    private String dataInregistrare;
    @JsonProperty("cod_CAEN")
    private String codCAEN;
    @JsonProperty("iban")
    private String iban;
    @JsonProperty("statusRO_e_Factura")
    private Boolean statusROEFactura;
    @JsonProperty("organFiscalCompetent")
    private String organFiscalCompetent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cui")
    public Integer getCui() {
        return cui;
    }

    @JsonProperty("cui")
    public void setCui(Integer cui) {
        this.cui = cui;
    }

    @JsonProperty("data")
    public String getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty("denumire")
    public String getDenumire() {
        return denumire;
    }

    @JsonProperty("denumire")
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @JsonProperty("adresa")
    public String getAdresa() {
        return adresa;
    }

    @JsonProperty("adresa")
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @JsonProperty("nrRegCom")
    public String getNrRegCom() {
        return nrRegCom;
    }

    @JsonProperty("nrRegCom")
    public void setNrRegCom(String nrRegCom) {
        this.nrRegCom = nrRegCom;
    }

    @JsonProperty("telefon")
    public String getTelefon() {
        return telefon;
    }

    @JsonProperty("telefon")
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonProperty("codPostal")
    public String getCodPostal() {
        return codPostal;
    }

    @JsonProperty("codPostal")
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @JsonProperty("act")
    public String getAct() {
        return act;
    }

    @JsonProperty("act")
    public void setAct(String act) {
        this.act = act;
    }

    @JsonProperty("stare_inregistrare")
    public String getStareInregistrare() {
        return stareInregistrare;
    }

    @JsonProperty("stare_inregistrare")
    public void setStareInregistrare(String stareInregistrare) {
        this.stareInregistrare = stareInregistrare;
    }

    @JsonProperty("data_inregistrare")
    public String getDataInregistrare() {
        return dataInregistrare;
    }

    @JsonProperty("data_inregistrare")
    public void setDataInregistrare(String dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    @JsonProperty("cod_CAEN")
    public String getCodCAEN() {
        return codCAEN;
    }

    @JsonProperty("cod_CAEN")
    public void setCodCAEN(String codCAEN) {
        this.codCAEN = codCAEN;
    }

    @JsonProperty("iban")
    public String getIban() {
        return iban;
    }

    @JsonProperty("iban")
    public void setIban(String iban) {
        this.iban = iban;
    }

    @JsonProperty("statusRO_e_Factura")
    public Boolean getStatusROEFactura() {
        return statusROEFactura;
    }

    @JsonProperty("statusRO_e_Factura")
    public void setStatusROEFactura(Boolean statusROEFactura) {
        this.statusROEFactura = statusROEFactura;
    }

    @JsonProperty("organFiscalCompetent")
    public String getOrganFiscalCompetent() {
        return organFiscalCompetent;
    }

    @JsonProperty("organFiscalCompetent")
    public void setOrganFiscalCompetent(String organFiscalCompetent) {
        this.organFiscalCompetent = organFiscalCompetent;
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
        sb.append(DateGenerale.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cui");
        sb.append('=');
        sb.append(((this.cui == null)?"<null>":this.cui));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("denumire");
        sb.append('=');
        sb.append(((this.denumire == null)?"<null>":this.denumire));
        sb.append(',');
        sb.append("adresa");
        sb.append('=');
        sb.append(((this.adresa == null)?"<null>":this.adresa));
        sb.append(',');
        sb.append("nrRegCom");
        sb.append('=');
        sb.append(((this.nrRegCom == null)?"<null>":this.nrRegCom));
        sb.append(',');
        sb.append("telefon");
        sb.append('=');
        sb.append(((this.telefon == null)?"<null>":this.telefon));
        sb.append(',');
        sb.append("fax");
        sb.append('=');
        sb.append(((this.fax == null)?"<null>":this.fax));
        sb.append(',');
        sb.append("codPostal");
        sb.append('=');
        sb.append(((this.codPostal == null)?"<null>":this.codPostal));
        sb.append(',');
        sb.append("act");
        sb.append('=');
        sb.append(((this.act == null)?"<null>":this.act));
        sb.append(',');
        sb.append("stareInregistrare");
        sb.append('=');
        sb.append(((this.stareInregistrare == null)?"<null>":this.stareInregistrare));
        sb.append(',');
        sb.append("dataInregistrare");
        sb.append('=');
        sb.append(((this.dataInregistrare == null)?"<null>":this.dataInregistrare));
        sb.append(',');
        sb.append("codCAEN");
        sb.append('=');
        sb.append(((this.codCAEN == null)?"<null>":this.codCAEN));
        sb.append(',');
        sb.append("iban");
        sb.append('=');
        sb.append(((this.iban == null)?"<null>":this.iban));
        sb.append(',');
        sb.append("statusROEFactura");
        sb.append('=');
        sb.append(((this.statusROEFactura == null)?"<null>":this.statusROEFactura));
        sb.append(',');
        sb.append("organFiscalCompetent");
        sb.append('=');
        sb.append(((this.organFiscalCompetent == null)?"<null>":this.organFiscalCompetent));
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
