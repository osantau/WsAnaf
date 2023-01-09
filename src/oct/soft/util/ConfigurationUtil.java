/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author osantau
 */
public class ConfigurationUtil {

    public  String URL_ANAF=null;
    public  Properties props = null;
    
    public ConfigurationUtil() {
        try(InputStream input = ConfigurationUtil.class.getClassLoader().getResourceAsStream("config.properties"))
        {
            props = new Properties();
            if(input == null)
            {
                System.out.println("Nu exista / poate fi gasit config.properties");
                return;
            }
            props.load(input);
            URL_ANAF = props.getProperty("URL_ANAF");
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
}
