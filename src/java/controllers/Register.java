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

/**
 *
 * @author richard
 */
@WebServlet(name = "Register", urlPatterns = {"/register"})
public class Register extends HttpServlet {

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
            
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/register.jsp");
        dispatcher.forward(request, response);
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
            
            HttpSession session = request.getSession(true);
            ArrayList<Usuario> users = (ArrayList<Usuario>)session.getAttribute("users"); 

            String userName = (request.getParameter("usernameRegister"));
            String email = (request.getParameter("emailRegister"));
            String pass = (request.getParameter("passwordRegister"));
            String verificacion = Mensaje.getMensajes().get("SuccessfulRegister");
            boolean registro = false;
                       
            if ( users != null) {
                if (Usuario.validateEmail(email)) {
                    for (Usuario user : users) {
                        if (user.getEmail().equalsIgnoreCase(email)) {
                            registro = false;
                            verificacion = Mensaje.getMensajes().get("RegisteredEmail");
                            request.setAttribute("respuesta", verificacion);
                            request.setAttribute("ingreso", registro);
                            RequestDispatcher view = request.getRequestDispatcher("/register.jsp");
                            view.forward(request, response);
                        }

                    }
                } else {
                    registro = false;
                    verificacion = Mensaje.getMensajes().get("wrongEmail");
                    request.setAttribute("respuesta", verificacion);
                    RequestDispatcher view = request.getRequestDispatcher("/register.jsp");
                    view.forward(request, response);
                }
            }else{
                users = new ArrayList<Usuario>();
            }

            Usuario NewUser = new Usuario(userName, pass, email);
            
            users.add(NewUser);
            session.setAttribute("users",users);
            request.setAttribute("respuesta", verificacion);
            request.setAttribute("registro", registro);
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
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
