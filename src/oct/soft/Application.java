package oct.soft;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import oct.soft.model.CompanyReqInfo;
import oct.soft.model.v7.AnafResult;
import oct.soft.util.ConfigurationUtil;
import oct.soft.util.OkHttpUtil;
import oct.soft.util.ReadCSV;
import oct.soft.util.WriteResultToCSV;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Application {

	public static void main(String[] args) throws Exception {
           
                ConfigurationUtil conf = new ConfigurationUtil();
               
		
		final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
		ObjectMapper mapper = new ObjectMapper();
                
		List<CompanyReqInfo> lista = ReadCSV.getCompanyInfoFromFile("d:/00/cuis.csv",";");		
		String postBody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista);
		
		OkHttpUtil.init(true);
		OkHttpClient client = OkHttpUtil.getClient();
		RequestBody body = RequestBody.create(JSON, postBody);
		Request request = new Request.Builder().url(conf.URL_ANAF).post(body).build();
		Response response = client.newCall(request).execute();
		String content = response.body().string();	
		AnafResult anafResult = mapper.readValue(content, AnafResult.class);
                WriteResultToCSV.writeToFile(anafResult, "d:/00/rezultat.csv"); 
	}

}
