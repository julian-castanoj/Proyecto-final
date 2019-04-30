
package Controladores;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static java.awt.Event.INSERT;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class demo extends Conexion{
       public boolean registrar(Usuario usuario) throws SQLException{

        PreparedStatement pst = null;
        
        
        try {
            String pNombres = usuario.nombres;
            String pApellidos = usuario.apellidos;
            int pEdad = usuario.edad;
            String pCedula = usuario.cedula;
            String pEc = usuario.estadoCivil;
            String pAu = usuario.auxilio;
            String pPb = usuario.productosBancarios;
            String pTe = usuario.tipoEmpleado;
            int pAd = usuario.puntos;
            
            
             String demo = "insert into demo2 (nombres,apellidos,edad,cedula,eC,aU,pB,aD,tE) values (?,?,?,?,?,?,?,?,?)";
            pst = getConexion().clientPrepareStatement(demo);
            pst.setString(1, pNombres);
            pst.setString(2, pApellidos);
            pst.setInt(3, pEdad);
            pst.setString(4, pCedula);
            pst.setString(5, pEc);
            pst.setString(6, pAu);
            pst.setString(7, pPb);
            pst.setString(8, pTe);
            pst.setInt(9, pAd);
            
            

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
                    System.out.print("se cerró");
                }
            } catch (Exception e) {
               System.err.println("Error" + e);
            }
        
            }
          
         
         return false;
     }
   public static void main(String[] args) throws SQLException{
         
         demo d = new demo();
         Usuario usuario = new Usuario("zora", "apellidos", "cedula", 99, "estadoCivil", "auxilio", "tipoEmpleado", "productosBancarios", 70);
         
         System.out.println(d.registrar(usuario));
         
    }

        

    

}
