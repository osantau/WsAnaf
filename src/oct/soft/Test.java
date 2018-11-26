/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft;

import java.io.File;
import oct.soft.dao.CompanyInfoDao;
import oct.soft.model.BaseObject;
import oct.soft.model.CompanyInfo;
import oct.soft.model.HibernateUtil;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Octavian Santau
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper(); 
        BaseObject baseObject = mapper.readValue(new File("d:/testul.json"), BaseObject.class);        
        CompanyInfoDao companyInfoDao = new CompanyInfoDao();
        companyInfoDao.persist(baseObject.getFound());
        System.exit(0);
    }
}
