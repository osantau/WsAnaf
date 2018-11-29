/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.model;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Octavian Santau
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    public static void main(String[] args) throws Exception{
    Properties properties = new Properties();           
            properties.load(new FileReader("./config/app.properties"));
        System.out.println(properties.get("db.type"));        
    }
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            Properties appProps = new Properties();           
            appProps.load(new FileReader("./config/app.properties"));
            
            Properties properties = new Properties();           
            properties.load(new FileInputStream("./config/hibernate-"+appProps.getProperty("db.type")+".properties"));
            Configuration configuration = new Configuration();
            configuration.setProperties(properties);         
            configuration.addAnnotatedClass(CompanyInfo.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);            
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
