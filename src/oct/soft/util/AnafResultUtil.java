/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.util;

import oct.soft.model.v7.AdresaSediuSocial;
import oct.soft.model.v7.DateGenerale;
import oct.soft.model.v7.Found;
import oct.soft.model.v7.InregistrareRTVAI;
import oct.soft.model.v7.InregistrareScopTva;
import oct.soft.model.v7.InregistrareSplitTVA;
import oct.soft.model.v7.StareInactiv;

/**
 *
 * @author osantau
 */
public class AnafResultUtil {
     public static String getHtmlInfo(Found found) {
        DateGenerale dateGenerale = found.getDateGenerale();
        InregistrareScopTva scopTva = found.getInregistrareScopTva();
        InregistrareRTVAI rtvai = found.getInregistrareRTVAI();
        StareInactiv stareInactiv = found.getStareInactiv();
        InregistrareSplitTVA splitTva = found.getInregistrareSplitTVA();
        AdresaSediuSocial sediuSocial = found.getAdresaSediuSocial();
        
        StringBuilder sb = new StringBuilder();
        sb
                /*
        .append("<!doctype html>")
                .append("<html><head><meta charset='utf-8'><title>Verificare Agent economic ").append(getDenumire()).append("</title></head>")
                .append("<body>")*/
//                .append("<h2>Rezultat</h2>")
                .append("<table class=\"table table-success table-striped table-hover\" id=\"tblData\">")
                .append("<tr><td>CUI:</td><td>").append(dateGenerale.getCui()).append("</td></tr>")
                .append("<tr><td>Data pt. care se efectueaza cautarea:</td><td><strong>").append(dateGenerale.getData()).append("</td></tr>")
                .append("<tr><td>Denumire:</td><td>").append(dateGenerale.getDenumire()).append("</strong></td></tr>")
                .append("<tr><td>Adresa:</td><td>").append(dateGenerale.getAdresa()).append("</td></tr>")
                .append("<tr><td>Nr. Reg. Com. :</td><td>").append(dateGenerale.getNrRegCom()).append("</td></tr>")
                .append("<tr><td>Telefon:</td><td>").append(dateGenerale.getTelefon()).append("</td></tr>")
                .append("<tr><td>Cod Postal:</td><td>").append(dateGenerale.getCodPostal()).append("</td></tr>")
                .append("<tr><td>Stare inregistrare:</td><td>").append(dateGenerale.getStareInregistrare()).append("</td></tr>")
                .append("<tr><td>Platitor  in scopuri de TVA la data cautata:</td><td><strong>").append(
                scopTva.getScpTVA() ? "DA" : "NU").append("</strong></td></tr>")
                .append("<tr><td>Data inregistrarii in scopuri de TVA anterioara:</td><td>").append(
                scopTva.getDataInceputScpTVA()).append("</td></tr>")
                .append("<tr><td>Data anularii inregistrarii in scopuri de TVA:</td><td>").append(
                scopTva.getDataSfarsitScpTVA()).append("</td></tr>")
                .append("<tr><td>Data operarii anularii inregistrarii in scopuri de TVA:</td><td>").append(
                scopTva.getDataAnulImpScpTVA()).append("</td></tr>")
                .append("<tr><td>MESAJ:</td><td><strong>").append(
                scopTva.getMesajScpTVA()).append("</strong></td></tr>")
                .append("<tr><td>Data de la care aplica sistemul TVA la incasare:</td><td>").append(
                rtvai.getDataInceputTvaInc()).append("</td></tr>")
                .append("<tr><td>Data pana la care aplica sistemul TVA la incasare:</td><td>").append(
                rtvai.getDataSfarsitTvaInc()).append("</td></tr>")
                .append("<tr><td>Data actualizarii TVA la incasare:</td><td>").append(
                rtvai.getDataActualizareTvaInc()).append("</td></tr>")
                .append("<tr><td>Data publicarii TVA la incasare:</td><td>").append(
                rtvai.getDataPublicareTvaInc()).append("</td></tr>")
                .append("<tr><td>Tip actualizare TVA la incasare:</td><td>").append(
                rtvai.getTipActTvaInc()).append("</td></tr>")
                .append("<tr><td>Platitor TVA la incasare la data cautata:</td><td><strong>").append(
                rtvai.getStatusTvaIncasare() ? "DA" : "NU").append("</strong></td></tr>")
                .append("<tr><td>Data inactivare:</td><td>").append(
                stareInactiv.getDataInactivare()).append("</td></tr>")
                .append("<tr><td>Data reactivare:</td><td>").append(
                stareInactiv.getDataReactivare()).append("</td></tr>")
                .append("<tr><td>Data publicare:</td><td>").append(
                stareInactiv.getDataPublicare()).append("</td></tr>")
                .append("<tr><td>Data radiere:</td><td>").append(
                stareInactiv.getDataRadiere()).append("</td></tr>")
                .append("<tr><td>Inactiv la data cautata:</td><td><strong>").append(
                stareInactiv.getStatusInactivi() ? "DA" : "NU").append("</strong></td></tr>")
                .append("<tr><td>Data inceput split TVA:</td><td>").append(
                splitTva.getDataInceputSplitTVA()).append("</td></tr>")
                .append("<tr><td>Data anulare split TVA:</td><td>").append(
                splitTva.getDataAnulareSplitTVA()).append("</td></tr>")
                .append("<tr><td>Aplica plata defalcata a Tva la data cautata:</td><td><strong>").append(
                splitTva.getStatusSplitTVA() ? "DA" : "NU").append("</strong></td></tr>")
                .append("<tr><td>Contul IBAN:</td><td><strong>").append(
                dateGenerale.getIban()).append("</strong></td></tr>")
                .append("<tr><td>Figureaza in Registrul RO e-Factura:</td><td><strong>").append(
                dateGenerale.getStatusROEFactura() ? "DA" : "NU").append("</strong></td></tr>")
                .append("<tr><td>Denumire strada sediu:</td><td><strong>").append(
                sediuSocial.getSdenumireStrada()).append("</strong></td></tr>")
                .append("<tr><td>Numar strada sediu:</td><td><strong>").append(
                sediuSocial.getSnumarStrada()).append("</strong></td></tr>")
                .append("<tr><td>Denumire localitate sediu:</td><td><strong>").append(
                sediuSocial.getSdenumireLocalitate()).append("</strong></td></tr>")
                .append("<tr><td>Cod localitate sediu:</td><td><strong>").append(
                sediuSocial.getScodLocalitate()).append("</strong></td></tr>")
                .append("<tr><td>Denumire judet sediu:</td><td><strong>").append(
                sediuSocial.getSdenumireJudet()).append("</strong></td></tr>")
                .append("<tr><td>Cod judet sediu:</td><td><strong>").append(
                sediuSocial.getScodJudet()).append("</strong></td></tr>")
                .append("<tr><td>Denumire tara sediu:</td><td><strong>").append(
                sediuSocial.getStara()).append("</strong></td></tr>")
                .append("<tr><td>Detalii adresa sediu:</td><td><strong>").append(
                sediuSocial.getSdetaliiAdresa()).append("</strong></td></tr>")
                .append("<tr><td>Cod postal sediu:</td><td><strong>").append(
                sediuSocial.getScodPostal()).append("</strong></td></tr>")
                .append(
                dateGenerale.getDataInregistrare()).append("</strong></td></tr>")
                .append("<tr><td>Cod CAEN:</td><td><strong>").append(
                dateGenerale.getCodCAEN()).append("</strong></td></tr>")
                .append("</table>") /* .append("</body></html>")*/;
        return sb.toString();
    }
}
