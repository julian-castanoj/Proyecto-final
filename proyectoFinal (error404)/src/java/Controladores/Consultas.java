package Controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas extends Conexion {

    public boolean autenticacion(String usuario, String contraseña) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // llama la base de datos para consultar usuario y contraseña    
            String consulta = "select * from usuarios where Usuario = ? and Contraseña = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            // busca el resgistro 
            // si lo encuentra retorna true
            if (rs.absolute(1)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);

        } finally {
            try {
                //cierra la conexion
                if (getConexion() != null) getConexion().close();
                //Cierra prepareStatement
                if (pst !=null) pst.close();
                //Cierra el resultado
                if(rs != null) rs.close();
                
                
                 } catch (Exception e) {
                   System.err.println("Error" + e);
            }
        }
        
    
        // si no lo encuentra retorna falso 
        return false;
        
    }

    /*public static void main(String[] args) throws SQLException{
         Consultas co = new Consultas();
         System.out.println(co.autenticacion("root", "root"));
     
    }*/
   }
