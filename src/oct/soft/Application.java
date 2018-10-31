package oct.soft;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import oct.soft.model.BaseObject;
import oct.soft.model.CompanyReqInfo;
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

		String url = "https://webservicesp.anaf.ro/PlatitorTvaRest/api/v3/ws/tva";
		final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
		ObjectMapper mapper = new ObjectMapper();
		List<CompanyReqInfo> lista = ReadCSV.getCompanyInfoFromFile(args[0]);		
		String postBody = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(lista);
		
		OkHttpUtil.init(true);
		OkHttpClient client = OkHttpUtil.getClient();
		RequestBody body = RequestBody.create(JSON, postBody);
		Request request = new Request.Builder().url(url).post(body).build();
		Response response = client.newCall(request).execute();
		String content = response.body().string();
	
		BaseObject baseObject = mapper.readValue(content, BaseObject.class);
            WriteResultToCSV.writeToFile(baseObject, args[1]);
//		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("d:/borodi/response.json"), StandardCharsets.UTF_8);
//		writer.write( mapper.writerWithDefaultPrettyPrinter().writeValueAsString(baseObject));		
//		writer.flush();
//		writer.close();
	}

}
