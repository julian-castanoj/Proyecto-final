package Servlet;

import Controladores.ConsultaUsuario;
import Controladores.Consultas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IniciarUsuario", urlPatterns = {"/IniciarUsuario"})
public class IniciarUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i = 0;
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            Consultas cou = new Consultas();
            ConsultaUsuario co = new ConsultaUsuario();
            
            String u = request.getParameter("usuario");
            String c = request.getParameter("password");
            

            if (co.autenticacion(u, c)) {
                i = 1;
            }

            if (cou.autenticacion(u, c)) {
                i = 2;
            }

            switch (i) {
                case 1:
                    response.sendRedirect("pagos.jsp");
                    break;
                case 2:
                    response.sendRedirect("opAdmin.jsp");
                    break;
                default:
                    response.sendRedirect("index.jsp");
            }

        } catch (SQLException ex) {
            Logger.getLogger(IniciarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
