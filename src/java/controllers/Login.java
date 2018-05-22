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
import models.Mensaje;
import static models.Mensaje.Mensajes;
import models.Usuario;
import models.Admin;

/**
 *
 * @author richard
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

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
        getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
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
        
           HttpSession session = request.getSession();

           String email = (request.getParameter("loginInputEmail"));
           String contraseña = (request.getParameter("loginInputPassword"));
           Boolean ingreso = false;

           ArrayList<Admin> admins = (ArrayList<Admin>) session.getAttribute("admins");
           ArrayList<Usuario> users = (ArrayList<Usuario>) session.getAttribute("users");

           if (Usuario.validateEmail(email) == true) {

               if (admins != null) {
                   for (Admin admin : admins) {
                       if (admin.isActivo() ==  email.equalsIgnoreCase(admin.getEmail()) && admin.getPassword().equals(contraseña)) {
                           session.setAttribute("tipoUsuario", "Admin");
                           session.setAttribute("usuario", admin);
                           ingreso = true;
                           RequestDispatcher view = request.getRequestDispatcher("index.jsp");
                           view.forward(request, response);
                       }
                   }
               }
               if (users != null) {
                   for (Usuario user : users) {
                       if (email.equalsIgnoreCase(user.getEmail()) && user.getPassword().equals(contraseña)) {
                           session.setAttribute("tipoUsuario", "user");
                           session.setAttribute("usuario", user);
                           ingreso = true;
                           RequestDispatcher view = request.getRequestDispatcher("index.jsp");
                           view.forward(request, response);
                       }
                   }
               }
           } 
           request.setAttribute("respuesta", Mensaje.getMensajes().get("WrongPassOrEmail"));
           request.setAttribute("ingreso", ingreso);
           RequestDispatcher view = request.getRequestDispatcher("/login.jsp");
           view.forward(request, response);

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
