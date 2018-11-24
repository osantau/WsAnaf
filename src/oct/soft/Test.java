/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft;

import java.util.List;
import oct.soft.model.CompanyInfo;
import oct.soft.model.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Octavian Santau
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        ObjectMapper mapper = new ObjectMapper(); 
//        BaseObject baseObject = mapper.readValue(new File("d:/testul.json"), BaseObject.class);
//        Session session  = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        for(CompanyInfo ci : baseObject.getFound()) {
//        session.save(ci);
//        }
//        session.getTransaction().commit();
//        System.out.println("oct.soft.Test.main()");
//        session.clear();
//        session.close();     
//        session=null; 
       Session session  = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery("FROM CompanyInfo");
        List<CompanyInfo> lista=q.list();
        session.close();
        System.out.println(lista.size());        
    }
}
