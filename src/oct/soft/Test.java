/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft;

import java.io.ByteArrayInputStream;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import oct.soft.dao.CompanyInfoDao;
import oct.soft.model.BaseObject;
import oct.soft.util.DBManager;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Octavian Santau
 */
public class Test {
    public static void main(String[] args) throws Exception {
        DBManager.startDB();
        ObjectMapper mapper = new ObjectMapper();                   
        Path path = Paths.get("e:/testul.json");
        String content = URLDecoder.decode(new String(Files.readAllBytes(path)), "UTF-8"); 
        ByteArrayInputStream bais = new ByteArrayInputStream(content.getBytes("UTF-8"));
        BaseObject baseObject = mapper.readValue(bais, BaseObject.class);          
        CompanyInfoDao companyInfoDao = new CompanyInfoDao();                
        companyInfoDao.save(baseObject.getFound());
        DBManager.stopDB();
//        System.out.println(companyInfoDao.findAll().size());
        
//        Connection conn = HibernateUtil.getSessionFactory().getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class).getConnection();
  /*  BaseDao baseDao = new BaseDao();  
     SessionImpl sessionImpl = (SessionImpl) baseDao.openCurrentSession();
     Connection conn =sessionImpl.connection();
        System.out.println("oct.soft.Test.main()");
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("MSG", "Salutare de la mare!");
        JasperPrint jasperPrint = JasperFillManager.fillReport("./reports/report.jasper",parameters ,conn);    
        sessionImpl.close();
        baseDao.closeCurrentSession();
        JasperViewer.viewReport(jasperPrint); */
        System.exit(0);
    }
}