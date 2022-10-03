/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.CursoDAO;
import entities.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emers
 */
public class proceso extends HttpServlet {

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

                //repueracion datos del "index.jsp"
                String strCodigo = request.getParameter("ID");
                String strNomCurso = request.getParameter("curso");
                String strNomPro = request.getParameter("profesor");
                String strMateriales = request.getParameter("materiales");
                String strDescripcion = request.getParameter("descripcion");
                
                
                //Creación objeto entity y se asignan valores
                Curso curso = new Curso();
                curso.setId(strCodigo);
                curso.setCurso(strNomCurso);
                curso.setProfesor(strNomPro);
                curso.setMateriales(strMateriales);
                curso.setDescripcion(strDescripcion);
        
                //Creación de objeto dao
                CursoDAO dao = new CursoDAO();
                    try {
                        dao.create(curso);
                        System.out.println("Grabado con exito!");

                    } catch (Exception ex) {
                        System.out.println("ERROR: ");
                        Logger.getLogger(proceso.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
                    request.getRequestDispatcher("retorno.jsp").forward(request, response);
        
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
