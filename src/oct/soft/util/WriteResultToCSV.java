package oct.soft.util;

import java.io.BufferedWriter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import oct.soft.model.BaseObject;
import oct.soft.model.CompanyInfo;

public class WriteResultToCSV {
public static int numRecords = 0;
    public static void writeToFile(BaseObject baseObject, String path) {
        try{ 
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(path, "")
                ,StandardCharsets.UTF_8
                ,StandardOpenOption.CREATE);   

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.EXCEL.withDelimiter(LocaleUtil.getPatternSeparator()).withFirstRecordAsHeader());
        csvPrinter.printRecord((Object[]) getHeader());
        
        numRecords = baseObject.getFound().size();
        for (CompanyInfo info : baseObject.getFound()) {
            csvPrinter.printRecord(info.getValues());        
        }
        csvPrinter.flush();
        csvPrinter.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Eroare: "+ex.getMessage(),"Eroare",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Eroare");
        }
    }

    public static String[] getHeader() {
        StringBuilder sb = new StringBuilder();

        Field[] fields = CompanyInfo.class.getDeclaredFields();
        String[] fNames = new String[fields.length];

        for (int i = 0; i < fields.length; i++) {
            fNames[i] = fields[i].getName();
        }

        return fNames;
    }
}
