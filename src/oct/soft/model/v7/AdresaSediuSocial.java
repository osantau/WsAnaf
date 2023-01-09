
package oct.soft.model.v7;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "sdenumire_Strada",
    "snumar_Strada",
    "sdenumire_Localitate",
    "scod_Localitate",
    "sdenumire_Judet",
    "scod_Judet",
    "scod_JudetAuto",
    "stara",
    "sdetalii_Adresa",
    "scod_Postal"
})

public class AdresaSediuSocial {

    @JsonProperty("sdenumire_Strada")
    private String sdenumireStrada;
    @JsonProperty("snumar_Strada")
    private String snumarStrada;
    @JsonProperty("sdenumire_Localitate")
    private String sdenumireLocalitate;
    @JsonProperty("scod_Localitate")
    private String scodLocalitate;
    @JsonProperty("sdenumire_Judet")
    private String sdenumireJudet;
    @JsonProperty("scod_Judet")
    private String scodJudet;
    @JsonProperty("scod_JudetAuto")
    private String scodJudetAuto;
    @JsonProperty("stara")
    private String stara;
    @JsonProperty("sdetalii_Adresa")
    private String sdetaliiAdresa;
    @JsonProperty("scod_Postal")
    private String scodPostal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sdenumire_Strada")
    public String getSdenumireStrada() {
        return sdenumireStrada;
    }

    @JsonProperty("sdenumire_Strada")
    public void setSdenumireStrada(String sdenumireStrada) {
        this.sdenumireStrada = sdenumireStrada;
    }

    @JsonProperty("snumar_Strada")
    public String getSnumarStrada() {
        return snumarStrada;
    }

    @JsonProperty("snumar_Strada")
    public void setSnumarStrada(String snumarStrada) {
        this.snumarStrada = snumarStrada;
    }

    @JsonProperty("sdenumire_Localitate")
    public String getSdenumireLocalitate() {
        return sdenumireLocalitate;
    }

    @JsonProperty("sdenumire_Localitate")
    public void setSdenumireLocalitate(String sdenumireLocalitate) {
        this.sdenumireLocalitate = sdenumireLocalitate;
    }

    @JsonProperty("scod_Localitate")
    public String getScodLocalitate() {
        return scodLocalitate;
    }

    @JsonProperty("scod_Localitate")
    public void setScodLocalitate(String scodLocalitate) {
        this.scodLocalitate = scodLocalitate;
    }

    @JsonProperty("sdenumire_Judet")
    public String getSdenumireJudet() {
        return sdenumireJudet;
    }

    @JsonProperty("sdenumire_Judet")
    public void setSdenumireJudet(String sdenumireJudet) {
        this.sdenumireJudet = sdenumireJudet;
    }

    @JsonProperty("scod_Judet")
    public String getScodJudet() {
        return scodJudet;
    }

    @JsonProperty("scod_Judet")
    public void setScodJudet(String scodJudet) {
        this.scodJudet = scodJudet;
    }

    @JsonProperty("scod_JudetAuto")
    public String getScodJudetAuto() {
        return scodJudetAuto;
    }

    @JsonProperty("scod_JudetAuto")
    public void setScodJudetAuto(String scodJudetAuto) {
        this.scodJudetAuto = scodJudetAuto;
    }

    @JsonProperty("stara")
    public String getStara() {
        return stara;
    }

    @JsonProperty("stara")
    public void setStara(String stara) {
        this.stara = stara;
    }

    @JsonProperty("sdetalii_Adresa")
    public String getSdetaliiAdresa() {
        return sdetaliiAdresa;
    }

    @JsonProperty("sdetalii_Adresa")
    public void setSdetaliiAdresa(String sdetaliiAdresa) {
        this.sdetaliiAdresa = sdetaliiAdresa;
    }

    @JsonProperty("scod_Postal")
    public String getScodPostal() {
        return scodPostal;
    }

    @JsonProperty("scod_Postal")
    public void setScodPostal(String scodPostal) {
        this.scodPostal = scodPostal;
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
        sb.append(AdresaSediuSocial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sdenumireStrada");
        sb.append('=');
        sb.append(((this.sdenumireStrada == null)?"<null>":this.sdenumireStrada));
        sb.append(',');
        sb.append("snumarStrada");
        sb.append('=');
        sb.append(((this.snumarStrada == null)?"<null>":this.snumarStrada));
        sb.append(',');
        sb.append("sdenumireLocalitate");
        sb.append('=');
        sb.append(((this.sdenumireLocalitate == null)?"<null>":this.sdenumireLocalitate));
        sb.append(',');
        sb.append("scodLocalitate");
        sb.append('=');
        sb.append(((this.scodLocalitate == null)?"<null>":this.scodLocalitate));
        sb.append(',');
        sb.append("sdenumireJudet");
        sb.append('=');
        sb.append(((this.sdenumireJudet == null)?"<null>":this.sdenumireJudet));
        sb.append(',');
        sb.append("scodJudet");
        sb.append('=');
        sb.append(((this.scodJudet == null)?"<null>":this.scodJudet));
        sb.append(',');
        sb.append("scodJudetAuto");
        sb.append('=');
        sb.append(((this.scodJudetAuto == null)?"<null>":this.scodJudetAuto));
        sb.append(',');
        sb.append("stara");
        sb.append('=');
        sb.append(((this.stara == null)?"<null>":this.stara));
        sb.append(',');
        sb.append("sdetaliiAdresa");
        sb.append('=');
        sb.append(((this.sdetaliiAdresa == null)?"<null>":this.sdetaliiAdresa));
        sb.append(',');
        sb.append("scodPostal");
        sb.append('=');
        sb.append(((this.scodPostal == null)?"<null>":this.scodPostal));
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
