
package oct.soft.model.v7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "date_generale",
    "inregistrare_scop_Tva",
    "inregistrare_RTVAI",
    "stare_inactiv",
    "inregistrare_SplitTVA",
    "adresa_sediu_social",
    "adresa_domiciliu_fiscal"
})

public class Found {

    @JsonProperty("date_generale")
    private DateGenerale dateGenerale;
    @JsonProperty("inregistrare_scop_Tva")
    private InregistrareScopTva inregistrareScopTva;
    @JsonProperty("inregistrare_RTVAI")
    private InregistrareRTVAI inregistrareRTVAI;
    @JsonProperty("stare_inactiv")
    private StareInactiv stareInactiv;
    @JsonProperty("inregistrare_SplitTVA")
    private InregistrareSplitTVA inregistrareSplitTVA;
    @JsonProperty("adresa_sediu_social")
    private AdresaSediuSocial adresaSediuSocial;
    @JsonProperty("adresa_domiciliu_fiscal")
    private AdresaDomiciliuFiscal adresaDomiciliuFiscal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date_generale")
    public DateGenerale getDateGenerale() {
        return dateGenerale;
    }

    @JsonProperty("date_generale")
    public void setDateGenerale(DateGenerale dateGenerale) {
        this.dateGenerale = dateGenerale;
    }

    @JsonProperty("inregistrare_scop_Tva")
    public InregistrareScopTva getInregistrareScopTva() {
        return inregistrareScopTva;
    }

    @JsonProperty("inregistrare_scop_Tva")
    public void setInregistrareScopTva(InregistrareScopTva inregistrareScopTva) {
        this.inregistrareScopTva = inregistrareScopTva;
    }

    @JsonProperty("inregistrare_RTVAI")
    public InregistrareRTVAI getInregistrareRTVAI() {
        return inregistrareRTVAI;
    }

    @JsonProperty("inregistrare_RTVAI")
    public void setInregistrareRTVAI(InregistrareRTVAI inregistrareRTVAI) {
        this.inregistrareRTVAI = inregistrareRTVAI;
    }

    @JsonProperty("stare_inactiv")
    public StareInactiv getStareInactiv() {
        return stareInactiv;
    }

    @JsonProperty("stare_inactiv")
    public void setStareInactiv(StareInactiv stareInactiv) {
        this.stareInactiv = stareInactiv;
    }

    @JsonProperty("inregistrare_SplitTVA")
    public InregistrareSplitTVA getInregistrareSplitTVA() {
        return inregistrareSplitTVA;
    }

    @JsonProperty("inregistrare_SplitTVA")
    public void setInregistrareSplitTVA(InregistrareSplitTVA inregistrareSplitTVA) {
        this.inregistrareSplitTVA = inregistrareSplitTVA;
    }

    @JsonProperty("adresa_sediu_social")
    public AdresaSediuSocial getAdresaSediuSocial() {
        return adresaSediuSocial;
    }

    @JsonProperty("adresa_sediu_social")
    public void setAdresaSediuSocial(AdresaSediuSocial adresaSediuSocial) {
        this.adresaSediuSocial = adresaSediuSocial;
    }

    @JsonProperty("adresa_domiciliu_fiscal")
    public AdresaDomiciliuFiscal getAdresaDomiciliuFiscal() {
        return adresaDomiciliuFiscal;
    }

    @JsonProperty("adresa_domiciliu_fiscal")
    public void setAdresaDomiciliuFiscal(AdresaDomiciliuFiscal adresaDomiciliuFiscal) {
        this.adresaDomiciliuFiscal = adresaDomiciliuFiscal;
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
        sb.append(Found.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dateGenerale");
        sb.append('=');
        sb.append(((this.dateGenerale == null)?"<null>":this.dateGenerale));
        sb.append(',');
        sb.append("inregistrareScopTva");
        sb.append('=');
        sb.append(((this.inregistrareScopTva == null)?"<null>":this.inregistrareScopTva));
        sb.append(',');
        sb.append("inregistrareRTVAI");
        sb.append('=');
        sb.append(((this.inregistrareRTVAI == null)?"<null>":this.inregistrareRTVAI));
        sb.append(',');
        sb.append("stareInactiv");
        sb.append('=');
        sb.append(((this.stareInactiv == null)?"<null>":this.stareInactiv));
        sb.append(',');
        sb.append("inregistrareSplitTVA");
        sb.append('=');
        sb.append(((this.inregistrareSplitTVA == null)?"<null>":this.inregistrareSplitTVA));
        sb.append(',');
        sb.append("adresaSediuSocial");
        sb.append('=');
        sb.append(((this.adresaSediuSocial == null)?"<null>":this.adresaSediuSocial));
        sb.append(',');
        sb.append("adresaDomiciliuFiscal");
        sb.append('=');
        sb.append(((this.adresaDomiciliuFiscal == null)?"<null>":this.adresaDomiciliuFiscal));
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
public List<Object> getValues() {    
    return Arrays.asList(
     dateGenerale.getCui(),
     dateGenerale.getData(),
     dateGenerale.getDenumire(),
     dateGenerale.getAdresa(),
     dateGenerale.getNrRegCom(),
     dateGenerale.getTelefon(),
     dateGenerale.getFax(),
     dateGenerale.getCodPostal(),
     dateGenerale.getStareInregistrare(),
     dateGenerale.getDataInregistrare(),
     dateGenerale.getCodCAEN(),
     dateGenerale.getIban(),
     dateGenerale.getStatusROEFactura(),
     inregistrareScopTva.getScpTVA(),
     inregistrareScopTva.getDataInceputScpTVA(),
     inregistrareScopTva.getDataSfarsitScpTVA(),
     inregistrareScopTva.getDataAnulImpScpTVA(),
     inregistrareScopTva.getMesajScpTVA(),
     inregistrareRTVAI.getDataInceputTvaInc(),
     inregistrareRTVAI.getDataSfarsitTvaInc(),
     inregistrareRTVAI.getDataActualizareTvaInc(),
     inregistrareRTVAI.getDataPublicareTvaInc(),
     inregistrareRTVAI.getTipActTvaInc(),
     inregistrareRTVAI.getStatusTvaIncasare(),
     stareInactiv.getDataInactivare(),
     stareInactiv.getDataReactivare(),
     stareInactiv.getDataPublicare(),
     stareInactiv.getDataRadiere(),
     stareInactiv.getStatusInactivi(),
     inregistrareSplitTVA.getDataAnulareSplitTVA(),
     inregistrareSplitTVA.getDataAnulareSplitTVA(),
     inregistrareSplitTVA.getStatusSplitTVA()
     );
}
}
