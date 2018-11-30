/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct.soft.db.util;

import java.io.FileReader;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import oct.soft.ApplicationUI;
import org.h2.tools.Server;

/**
 *
 * @author osantau
 */
public class DBManager {

    private static Server server = null;

    public static void main(String[] args) throws Exception {
        startDB();
        
        stopDB();
    }

    public static void startDB() {
        try {             
            server= Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers","-baseDir","./db").start();
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void stopDB(){
//        Server.shutdownTcpServer("tcp://localhost:9092", "", true, true);
        server.shutdown();        
    }
    
    public static boolean isH2database(){
         Properties properties = new Properties();
        try {
            properties.load(new FileReader("./config/app.properties"));
        } catch (Exception ex) {
            Logger.getLogger(ApplicationUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(properties.get("db.type").equals("h2")) {
            return true;
        }
        
        return false;
    }
}
