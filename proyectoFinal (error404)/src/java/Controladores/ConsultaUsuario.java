
package Controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultaUsuario extends Conexion{
    
    public boolean autenticacion(String nombres, String cedula) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            // llama la base de datos para consultar usuario y contraseña    
            String consulta = "select * from demo2 where nombres = ? and cedula = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombres);
            pst.setString(2, cedula);
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
    }
    

