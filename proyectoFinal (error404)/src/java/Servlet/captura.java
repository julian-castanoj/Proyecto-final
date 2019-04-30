/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controladores.Consultas;
import Controladores.Usuario;
import Controladores.demo;
import Controladores.registrarPrestamos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Julian.castanoj
 */
@WebServlet(name = "captura", urlPatterns = {"/captura"})
public class captura extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        demo pija = new demo();
        Usuario verga = new Usuario(request.getParameter("nombres"), request.getParameter("apellidos"), request.getParameter("cedula"), Integer.parseInt(request.getParameter("edad")), (String)request.getParameter("combolista"), (String)request.getParameter("combolista2"), (String)request.getParameter("combolista3"), (String)request.getParameter("combolista4"), Integer.parseInt(request.getParameter("puntos")));
        
        
        
        
        
        
        
        try {
            Usuario pijudo = new Usuario("zorasdfsdf", "apellidos", "cedula", 67, "estadoCivil", "auxilio", "tipoEmpleado", "productosBancarios", 70);
            if (pija.registrar(pijudo)) {
                response.sendRedirect("opAdmin.jsp");
            }
            else{
                response.sendRedirect("registroCredito.jsp");
            }
        } catch (Exception exmen) {
            System.err.print(exmen);

        }

        /*if(cou.registrar(a, b, c, d)){
            response.sendRedirect("registrarPrestamo.jsp");
        
        }
         */
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
