
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "ddenumire_Strada",
    "dnumar_Strada",
    "ddenumire_Localitate",
    "dcod_Localitate",
    "ddenumire_Judet",
    "dcod_Judet",
    "dcod_JudetAuto",
    "dtara",
    "ddetalii_Adresa",
    "dcod_Postal"
})
public class AdresaDomiciliuFiscal {

    @JsonProperty("ddenumire_Strada")
    private String ddenumireStrada;
    @JsonProperty("dnumar_Strada")
    private String dnumarStrada;
    @JsonProperty("ddenumire_Localitate")
    private String ddenumireLocalitate;
    @JsonProperty("dcod_Localitate")
    private String dcodLocalitate;
    @JsonProperty("ddenumire_Judet")
    private String ddenumireJudet;
    @JsonProperty("dcod_Judet")
    private String dcodJudet;
    @JsonProperty("dcod_JudetAuto")
    private String dcodJudetAuto;
    @JsonProperty("dtara")
    private String dtara;
    @JsonProperty("ddetalii_Adresa")
    private String ddetaliiAdresa;
    @JsonProperty("dcod_Postal")
    private String dcodPostal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ddenumire_Strada")
    public String getDdenumireStrada() {
        return ddenumireStrada;
    }

    @JsonProperty("ddenumire_Strada")
    public void setDdenumireStrada(String ddenumireStrada) {
        this.ddenumireStrada = ddenumireStrada;
    }

    @JsonProperty("dnumar_Strada")
    public String getDnumarStrada() {
        return dnumarStrada;
    }

    @JsonProperty("dnumar_Strada")
    public void setDnumarStrada(String dnumarStrada) {
        this.dnumarStrada = dnumarStrada;
    }

    @JsonProperty("ddenumire_Localitate")
    public String getDdenumireLocalitate() {
        return ddenumireLocalitate;
    }

    @JsonProperty("ddenumire_Localitate")
    public void setDdenumireLocalitate(String ddenumireLocalitate) {
        this.ddenumireLocalitate = ddenumireLocalitate;
    }

    @JsonProperty("dcod_Localitate")
    public String getDcodLocalitate() {
        return dcodLocalitate;
    }

    @JsonProperty("dcod_Localitate")
    public void setDcodLocalitate(String dcodLocalitate) {
        this.dcodLocalitate = dcodLocalitate;
    }

    @JsonProperty("ddenumire_Judet")
    public String getDdenumireJudet() {
        return ddenumireJudet;
    }

    @JsonProperty("ddenumire_Judet")
    public void setDdenumireJudet(String ddenumireJudet) {
        this.ddenumireJudet = ddenumireJudet;
    }

    @JsonProperty("dcod_Judet")
    public String getDcodJudet() {
        return dcodJudet;
    }

    @JsonProperty("dcod_Judet")
    public void setDcodJudet(String dcodJudet) {
        this.dcodJudet = dcodJudet;
    }

    @JsonProperty("dcod_JudetAuto")
    public String getDcodJudetAuto() {
        return dcodJudetAuto;
    }

    @JsonProperty("dcod_JudetAuto")
    public void setDcodJudetAuto(String dcodJudetAuto) {
        this.dcodJudetAuto = dcodJudetAuto;
    }

    @JsonProperty("dtara")
    public String getDtara() {
        return dtara;
    }

    @JsonProperty("dtara")
    public void setDtara(String dtara) {
        this.dtara = dtara;
    }

    @JsonProperty("ddetalii_Adresa")
    public String getDdetaliiAdresa() {
        return ddetaliiAdresa;
    }

    @JsonProperty("ddetalii_Adresa")
    public void setDdetaliiAdresa(String ddetaliiAdresa) {
        this.ddetaliiAdresa = ddetaliiAdresa;
    }

    @JsonProperty("dcod_Postal")
    public String getDcodPostal() {
        return dcodPostal;
    }

    @JsonProperty("dcod_Postal")
    public void setDcodPostal(String dcodPostal) {
        this.dcodPostal = dcodPostal;
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
        sb.append(AdresaDomiciliuFiscal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ddenumireStrada");
        sb.append('=');
        sb.append(((this.ddenumireStrada == null)?"<null>":this.ddenumireStrada));
        sb.append(',');
        sb.append("dnumarStrada");
        sb.append('=');
        sb.append(((this.dnumarStrada == null)?"<null>":this.dnumarStrada));
        sb.append(',');
        sb.append("ddenumireLocalitate");
        sb.append('=');
        sb.append(((this.ddenumireLocalitate == null)?"<null>":this.ddenumireLocalitate));
        sb.append(',');
        sb.append("dcodLocalitate");
        sb.append('=');
        sb.append(((this.dcodLocalitate == null)?"<null>":this.dcodLocalitate));
        sb.append(',');
        sb.append("ddenumireJudet");
        sb.append('=');
        sb.append(((this.ddenumireJudet == null)?"<null>":this.ddenumireJudet));
        sb.append(',');
        sb.append("dcodJudet");
        sb.append('=');
        sb.append(((this.dcodJudet == null)?"<null>":this.dcodJudet));
        sb.append(',');
        sb.append("dcodJudetAuto");
        sb.append('=');
        sb.append(((this.dcodJudetAuto == null)?"<null>":this.dcodJudetAuto));
        sb.append(',');
        sb.append("dtara");
        sb.append('=');
        sb.append(((this.dtara == null)?"<null>":this.dtara));
        sb.append(',');
        sb.append("ddetaliiAdresa");
        sb.append('=');
        sb.append(((this.ddetaliiAdresa == null)?"<null>":this.ddetaliiAdresa));
        sb.append(',');
        sb.append("dcodPostal");
        sb.append('=');
        sb.append(((this.dcodPostal == null)?"<null>":this.dcodPostal));
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
