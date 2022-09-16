/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Clase1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; // permite retomar o capturar datos
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Lopez
 */
@WebServlet(name = "servlets", urlPatterns = {"/servlets"})
public class servlets extends HttpServlet {

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
       
      

        //aqui declara un objeto de lo que es printwriter para poner lenguaje HTML        
        
    
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
        
         response.setContentType("text/html;charset=UTF-8");
        String rut = request.getParameter("rut");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String comuna = request.getParameter("comuna");
        
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        
        String genero = request.getParameter("genero");
        String[] redesSociales = request.getParameterValues("redesSociales");
        
        
        processRequest(request, response);
            try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");

                    

            out.println("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuestas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container-fluid\">");
            out.println("<h3>Datos ingresados Correctamente: </h3><br>");
            out.println("<label>Rut:"+ " " + rut +"</label><br>");
            out.println("<label>Nombres:"+ " " + nombre +"</label><br>");
            out.println("<label>Apellido:"+ " " + apellido +"</label><br>");
            out.println("<label>Dirección:"+ " " + direccion +"</label><br>");
            out.println("<label>Comuna:"+ " " + comuna +"</label><br>");
            out.println("<label>Fecha de nacimiento:"+ " " + fechaNacimiento +"</label><br>");
            out.println("<label>Genero:"+ " " + genero +"</label><br>");
            out.println("<label>Redes Sociales:</label><br>");
            for (String redesSociale : redesSociales) {
                out.println("<li>"+" " + redesSociale + "</li>");
            }
             out.println("</div>");


            out.println("</body>");
            out.println("</html>");
        }
            
            
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
