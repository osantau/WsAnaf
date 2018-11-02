package oct.soft.util;

import java.io.FileReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import oct.soft.model.CompanyReqInfo;

public class ReadCSV {

	public static int numRecords = 0;
        
	public static List<CompanyReqInfo> getCompanyInfoFromFile(String filePath, String csvSeparator)  {
		List<CompanyReqInfo> companyInfoList = new ArrayList<CompanyReqInfo>();
		SimpleDateFormat sdfIn = new SimpleDateFormat("dd.mm.yyyy");
		SimpleDateFormat sdfOut = new SimpleDateFormat("yyyy-mm-dd");
		Reader in;                 
                char separator = (csvSeparator==null ? LocaleUtil.getPatternSeparator() : csvSeparator.charAt(0));
		try {
			in = new FileReader(filePath);			
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(separator).parse(in);
			
			for(CSVRecord record : records) {
				Date tmpDate = sdfIn.parse(record.get(0));				
//				System.out.println(sdfOut.format(tmpDate)+" | "+record.get(1));
				companyInfoList.add(new CompanyReqInfo(Integer.valueOf(record.get(1)),sdfOut.format(tmpDate)));
			numRecords++;
			}
			in.close();
		} catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Verificati structura fisierului sursa: separator,data,cui!", "Eroare", JOptionPane.ERROR_MESSAGE);
                    throw new RuntimeException("Eroare");
		} 				
		return companyInfoList;
	}
}
