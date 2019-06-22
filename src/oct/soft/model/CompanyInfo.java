package oct.soft.model;

import java.util.Date;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "company_info")
public class CompanyInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cui;
    private String data;
    private String denumire;
    private String adresa;
    private boolean scpTVA;
    private String data_inceput_ScpTVA;
    private String data_sfarsit_ScpTVA;
    private String data_anul_imp_ScpTVA;
    private String mesaj_ScpTVA;
    private String dataInceputTvaInc;
    private String dataSfarsitTvaInc;
    private String dataActualizareTvaInc;
    private String dataPublicareTvaInc;
    private String tipActTvaInc;
    private boolean statusTvaIncasare;
    private String dataInactivare;
    private String dataReactivare;
    private String dataPublicare;
    private String dataRadiere;
    private boolean statusInactivi;
    private String dataInceputSplitTVA;
    private String dataAnulareSplitTVA;
    private boolean statusSplitTVA;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    private String iban;

    // Getter Methods
    public int getCui() {
        return cui;
    }

    public String getData() {
        return data;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public boolean getScpTVA() {
        return scpTVA;
    }

    public String getData_inceput_ScpTVA() {
        return data_inceput_ScpTVA;
    }

    public String getData_sfarsit_ScpTVA() {
        return data_sfarsit_ScpTVA;
    }

    public String getData_anul_imp_ScpTVA() {
        return data_anul_imp_ScpTVA;
    }

    public String getMesaj_ScpTVA() {
        return mesaj_ScpTVA;
    }

    public String getDataInceputTvaInc() {
        return dataInceputTvaInc;
    }

    public String getDataSfarsitTvaInc() {
        return dataSfarsitTvaInc;
    }

    public String getDataActualizareTvaInc() {
        return dataActualizareTvaInc;
    }

    public String getDataPublicareTvaInc() {
        return dataPublicareTvaInc;
    }

    public String getTipActTvaInc() {
        return tipActTvaInc;
    }

    public boolean getStatusTvaIncasare() {
        return statusTvaIncasare;
    }

    public String getDataInactivare() {
        return dataInactivare;
    }

    public String getDataReactivare() {
        return dataReactivare;
    }

    public String getDataPublicare() {
        return dataPublicare;
    }

    public String getDataRadiere() {
        return dataRadiere;
    }

    public boolean getStatusInactivi() {
        return statusInactivi;
    }

    public String getDataInceputSplitTVA() {
        return dataInceputSplitTVA;
    }

    public String getDataAnulareSplitTVA() {
        return dataAnulareSplitTVA;
    }

    public boolean getStatusSplitTVA() {
        return statusSplitTVA;
    }

    // Setter Methods
    public void setCui(int cui) {
        this.cui = cui;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setScpTVA(boolean scpTVA) {
        this.scpTVA = scpTVA;
    }

    public void setData_inceput_ScpTVA(String data_inceput_ScpTVA) {
        this.data_inceput_ScpTVA = data_inceput_ScpTVA;
    }

    public void setData_sfarsit_ScpTVA(String data_sfarsit_ScpTVA) {
        this.data_sfarsit_ScpTVA = data_sfarsit_ScpTVA;
    }

    public void setData_anul_imp_ScpTVA(String data_anul_imp_ScpTVA) {
        this.data_anul_imp_ScpTVA = data_anul_imp_ScpTVA;
    }

    public void setMesaj_ScpTVA(String mesaj_ScpTVA) {
        this.mesaj_ScpTVA = mesaj_ScpTVA;
    }

    public void setDataInceputTvaInc(String dataInceputTvaInc) {
        this.dataInceputTvaInc = dataInceputTvaInc;
    }

    public void setDataSfarsitTvaInc(String dataSfarsitTvaInc) {
        this.dataSfarsitTvaInc = dataSfarsitTvaInc;
    }

    public void setDataActualizareTvaInc(String dataActualizareTvaInc) {
        this.dataActualizareTvaInc = dataActualizareTvaInc;
    }

    public void setDataPublicareTvaInc(String dataPublicareTvaInc) {
        this.dataPublicareTvaInc = dataPublicareTvaInc;
    }

    public void setTipActTvaInc(String tipActTvaInc) {
        this.tipActTvaInc = tipActTvaInc;
    }

    public void setStatusTvaIncasare(boolean statusTvaIncasare) {
        this.statusTvaIncasare = statusTvaIncasare;
    }

    public void setDataInactivare(String dataInactivare) {
        this.dataInactivare = dataInactivare;
    }

    public void setDataReactivare(String dataReactivare) {
        this.dataReactivare = dataReactivare;
    }

    public void setDataPublicare(String dataPublicare) {
        this.dataPublicare = dataPublicare;
    }

    public void setDataRadiere(String dataRadiere) {
        this.dataRadiere = dataRadiere;
    }

    public void setStatusInactivi(boolean statusInactivi) {
        this.statusInactivi = statusInactivi;
    }

    public void setDataInceputSplitTVA(String dataInceputSplitTVA) {
        this.dataInceputSplitTVA = dataInceputSplitTVA;
    }

    public void setDataAnulareSplitTVA(String dataAnulareSplitTVA) {
        this.dataAnulareSplitTVA = dataAnulareSplitTVA;
    }

    public void setStatusSplitTVA(boolean statusSplitTVA) {
        this.statusSplitTVA = statusSplitTVA;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "CompanyInfo [cui=" + cui + ", data=" + data + ", denumire=" + denumire + ", adresa=" + adresa
                + ", scpTVA=" + scpTVA + ", data_inceput_ScpTVA=" + data_inceput_ScpTVA + ", data_sfarsit_ScpTVA="
                + data_sfarsit_ScpTVA + ", data_anul_imp_ScpTVA=" + data_anul_imp_ScpTVA + ", mesaj_ScpTVA="
                + mesaj_ScpTVA + ", dataInceputTvaInc=" + dataInceputTvaInc + ", dataSfarsitTvaInc=" + dataSfarsitTvaInc
                + ", dataActualizareTvaInc=" + dataActualizareTvaInc + ", dataPublicareTvaInc=" + dataPublicareTvaInc
                + ", tipActTvaInc=" + tipActTvaInc + ", statusTvaIncasare=" + statusTvaIncasare + ", dataInactivare="
                + dataInactivare + ", dataReactivare=" + dataReactivare + ", dataPublicare=" + dataPublicare
                + ", dataRadiere=" + dataRadiere + ", statusInactivi=" + statusInactivi + ", dataInceputSplitTVA="
                + dataInceputSplitTVA + ", dataAnulareSplitTVA=" + dataAnulareSplitTVA + ", statusSplitTVA="
                + statusSplitTVA + "]";
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Long getId() {
        return id;
    }

    @Transient
    public List<Object> getValues() {
        return Arrays.asList(getCui(),
                getData(),
                getDenumire(),
                getAdresa(),
                getScpTVA(),
                getData_inceput_ScpTVA(),
                getData_sfarsit_ScpTVA(),
                getData_anul_imp_ScpTVA(),
                getMesaj_ScpTVA(),
                getDataInceputTvaInc(),
                getDataSfarsitTvaInc(),
                getDataActualizareTvaInc(),
                getDataPublicareTvaInc(),
                getTipActTvaInc(),
                getStatusTvaIncasare(),
                getDataInactivare(),
                getDataReactivare(),
                getDataPublicare(),
                getDataRadiere(),
                getStatusInactivi(),
                getDataInceputSplitTVA(),
                getDataAnulareSplitTVA(),
                getStatusSplitTVA(),
                getIban()
        );
    }

    @Transient
    public String getHtmlInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!doctype html>")
                .append("<html><head><meta charset='utf-8'><title>Verificare Agent economic ").append(getDenumire()).append("</title></head>")
                .append("<body>")
                .append("<h2>Rezultat</h2>")
                .append("<table>")
                .append("<tr><td>CUI:</td><td>").append(getCui()).append("</td></tr>")
                 .append("<tr><td>Data pt. care se efectueaza cautarea:</td><td>").append(getData()).append("</td></tr>")
                 .append("<tr><td>Denumire:</td><td>").append(getDenumire()).append("</td></tr>")
                .append("<tr><td>Adresa:</td><td>").append(getAdresa()).append("</td></tr>")
                .append("<tr><td>Platitor  in scopuri de TVA la data cautata:</td><td>").append(
                        getScpTVA()==true ? "DA":"NU").append("</td></tr>")
                .append("<tr><td>Data inregistrarii in scopuri de TVA anterioara:</td><td>").append(
                        getData_inceput_ScpTVA()).append("</td></tr>")                
                .append("<tr><td>Data anularii inregistrarii in scopuri de TVA:</td><td>").append(
                        getData_sfarsit_ScpTVA()).append("</td></tr>")          
                .append("<tr><td>Data operarii anularii inregistrarii in scopuri de TVA:</td><td>").append(
                        getData_anul_imp_ScpTVA()).append("</td></tr>")          
                .append("<tr><td>MESAJ:</td><td><strong>").append(
                        getMesaj_ScpTVA()).append("</strong></td></tr>")  
                .append("</table>")
                .append("</body></html>");
        return sb.toString();
    }
}
