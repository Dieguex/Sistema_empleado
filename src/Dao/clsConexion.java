
 
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class clsConexion {
    // variable de conexion
    Connection cn;
    public String driver = "";
    public String url = "";
    public String usuario = "root";
    public String clave = "";
    
    public Connection MyConectar(){
        try {
            Class.forName(driver);
            cn=DriverManager.getConnection(url,usuario,clave);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en : "+ e);
        }
        return cn;
    }
}
