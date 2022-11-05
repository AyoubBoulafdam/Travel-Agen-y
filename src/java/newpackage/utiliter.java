/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Local;
import java.util.Locale;
/**
 *
 * @author badre
 */
public class utiliter{

    public static void main(String[] args) {
        connecter();
    }

    public static Connection connecter() {
        try {
            Locale.setDefault(Locale.FRENCH);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        } catch (SQLException ex) {
            System.out.println(ex.toString()); return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(utiliter.class.getName()).log(Level.SEVERE, null, ex);return null;
           
        }
        
        
    }

}
