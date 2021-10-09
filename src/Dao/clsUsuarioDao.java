

package Dao;

import Entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class clsUsuarioDao {
    clsConexion con=new clsConexion();
    Connection cn=con.MyConectar();
    ResultSet rs;
    
    public boolean AccesoSistema(Usuario usu){
        PreparedStatement ps= null;
        String sql="";
    }
}
