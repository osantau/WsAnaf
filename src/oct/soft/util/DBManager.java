package oct.soft.util;

import java.io.FileReader;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.h2.tools.Server;

public class DBManager {
     private static Server server = null;
     public static void main(String[] args) throws Exception {
         System.out.println(isH2database());
    }
     public static void startDB() {
        try {
            server= Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers","-baseDir","./db").start();
              System.out.println(server.getStatus());
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void stopDB(){
//        Server.shutdownTcpServer("tcp://localhost:9092", "", true, true);
        System.out.println(server.getStatus()+" is shutting down");
        server.shutdown();  
        System.out.println(server.getStatus());
    }
    
    public static boolean isH2database(){
         Properties properties = new Properties();
        try {
            properties.load(new FileReader("./config/app.properties"));
        } catch (Exception ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(properties.get("db.type").equals("h2")) {
            return true;
        }
        
        return false;
    }
}