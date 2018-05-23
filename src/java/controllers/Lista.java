/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Cancion;
import models.Usuario;

/**
 *
 * @author richard
 */
@WebServlet(name = "lista", urlPatterns = {"/lista"})
public class Lista extends HttpServlet {

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
        
        
        RequestDispatcher view = request.getRequestDispatcher("listas.jsp");
        view.forward(request, response);
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
        //processRequest(request, response);
        HttpSession session = request.getSession();
        ArrayList<Cancion> canciones = (ArrayList<Cancion>) session.getAttribute("listaReproduccionCreacion");
        models.Usuario usuario = (models.Usuario) session.getAttribute("usuario");
        String accion = request.getParameter("accion");
        
        if(accion.equals("insertar")){ // Pasa la playlist para crear los otros datos
            RequestDispatcher view = request.getRequestDispatcher("crear-listas.jsp");
            view.forward(request, response);
            
        } else if (accion.equals("crear")){ // Crea una playlist nueva
            String nombre = request.getParameter("listNombre");
            String descripcion = request.getParameter("listDescripcion");
            String publica = request.getParameter("listPublica");
            
            models.Lista nuevaLista = new models.Lista(nombre, descripcion, publica, usuario);
            ArrayList<models.Lista> playlist = (ArrayList<models.Lista>) session.getAttribute("playlist");
            if(playlist == null){
                playlist = new ArrayList<>();
            }
            nuevaLista.setCancion((ArrayList<Cancion>) session.getAttribute("listaReproduccionCreacion"));
            
            playlist.add(nuevaLista);
            session.setAttribute("playlist", playlist);
            
            RequestDispatcher view = request.getRequestDispatcher("listas.jsp");
            view.forward(request, response);
        } else if (accion.equals("more")){
            int index = Integer.parseInt(request.getParameter("more"));
            ArrayList<models.Lista> playlist = (ArrayList<models.Lista>) session.getAttribute("playlist");
            models.Lista play = playlist.get(index);
            request.setAttribute("list", play);
            
            RequestDispatcher view = request.getRequestDispatcher("lista.jsp");
            view.forward(request, response);
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
