package oct.soft.util;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import oct.soft.model.v7.AnafResult;
import oct.soft.model.v7.Found;

public class WriteResultToCSV {
public static int numRecords = 0;
    public static void writeToFile(AnafResult anafResult, String path) {
        try{ 
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(path, "")
                ,StandardCharsets.UTF_8
                ,StandardOpenOption.CREATE);   

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.EXCEL.withDelimiter(LocaleUtil.getPatternSeparator()).withFirstRecordAsHeader());
        csvPrinter.printRecord((Object[]) getHeader());
        
        numRecords = anafResult.getFound().size();
        for (Found found : anafResult.getFound()) {
            csvPrinter.printRecord(found.getValues());        
        }
        csvPrinter.flush();
        csvPrinter.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Eroare: "+ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Eroare");
        }
    }

    public static String[] getHeader() {
        List<String> fields = new LinkedList<>();
        //date generale
        fields.add("cui");
        fields.add("data");
        fields.add("denumire");
        fields.add("adresa");
        fields.add("nrRegCom");
        fields.add("telefon");
        fields.add("fax");
        fields.add("codPostal");
        fields.add("stare_inregistrare");
        fields.add("data_inregistrare");
        fields.add("cod_CAEN");
        fields.add("iban");
        fields.add("statusRO_e_Factura");
        // inregistrare_scop_TVA
        fields.add("scpTVA");
        fields.add("data_inceput_ScpTVA");
        fields.add("data_sfarsit_ScpTVA");
        fields.add("data_anul_imp_ScpTVA");
        fields.add("mesaj_ScpTVA");
        //inregistrare_RTVAI
        fields.add("dataInceputTvaInc");
        fields.add("dataSfarsitTvaInc");
        fields.add("dataActualizareTvaInc");
        fields.add("dataPublicareTvaInc");
        fields.add("tipActTvaInc");
        fields.add("statusTvaIncasare");
        //stare_inactiv
        fields.add("dataInactivare");
        fields.add("dataReactivare");
        fields.add("dataPublicare");
        fields.add("dataRadiere");
        fields.add("statusInactivi");
        //inregistrare_SplitTVA
        fields.add("dataInceputSplitTVA");
        fields.add("dataAnulareSplitTVA");
        fields.add("statusSplitTVA");
        return fields.toArray(new String[]{});
    }
}
