package Controladores;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class registrarPrestamos extends Conexion {
    
 public boolean registrart(String nombres, String apellidos, String cedula, String edad, String eC, String aU, String tE, String pB, String aD) throws SQLException{

        PreparedStatement pst = null;
        
        
        try {
            String registrarPrestamos = "insert into demo2 (nombres,apellidos,cedula,edad,eC,aU,tE,pB,aD) values (?,?,?,?,?,?,?,?,?)";
            pst = getConexion().clientPrepareStatement(registrarPrestamos);
            pst.setString(1, nombres);
            pst.setString(2, apellidos);
            pst.setString(3, cedula);
            pst.setString(4, edad);
            pst.setString(5, eC);
            pst.setString(6, aU);
            pst.setString(7, tE);
            pst.setString(8, pB);
            pst.setString(9, aD);

             if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception ex) {
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
               System.err.println("Error" + e);
            }
        
            }
            
         
         return false;
     }
   /* public static void main(String[] args) throws SQLException{
         registrarPrestamos co = new registrarPrestamos();
         co.registrar("res", "res" , "res" , "res" , "res" , "res" , "res" , "res" , "res" );
    }*/

    

    

}
