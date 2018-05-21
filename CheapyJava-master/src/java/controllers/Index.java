package controllers;

import com.oracle.jrockit.jfr.DataType;
import models.Admin;
import models.Album;
import models.Artista;
import models.Cancion;
import models.Lista;
import models.Comentario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author SCU
 */
@WebServlet(urlPatterns = {"/Index"})
public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Boolean ficticios = false;
        HttpSession session = request.getSession(true);

        if (session.getAttribute("ficticios") != null) {
            ficticios = true;
        }
        //COLOCA TIPO DE USUARIO VISITANTE SI NO SE TIENE DICHO TIPO -------------------------------------------------------------------
        if (session.getAttribute("tipoUsuario") == null) {
            session.setAttribute("tipoUsuario", "Visitante");
        }
        //ENVIA TIPO DE USUARIO AL INDEX -------------------------------------------------------------------------------------------------
        request.setAttribute("tipoUsuario", session.getAttribute("tipoUsuario"));

        String accion = request.getParameter("accion");
        // SI NO SE HAN GENERADO ACCIONES ---------------------------------------------------------------------------
        if (accion == null) {
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
        } //AQUI VAN DATOS FICTICIOS ---------------------------------------------------------------------------------
        else if (accion.equals("ficticios")) {
            if (ficticios == false) {
                
                Usuario Ul0 = new Usuario("Default", "123456789","jp@hotmail.com");
                Usuario Ul1 = new Usuario("Luis Torres", "1121297380","lt@zoofonia.co");
                Usuario Ul2 = new Usuario("Andres Jaramillo", "1026894593", "afjaramillo@unal.edu.co");
                
                Admin administrador = new Admin(11111111,"Luisa Rodriguez", "70063360", "Quando@hotmail.com");
                
                Artista Art1 = new Artista("Goodwana","Grupo musical de reggae", "Reggae");
                Artista Art2 = new Artista("System of down","Banda de rock estadounidense", ": Metal alternativo, Hard rock, Metal progresivo");
                Artista Art3 = new Artista("Mago de oz","Banda de rock Español", "Folk metal, Celtic metal");
                Artista Art4 = new Artista("Avicii","Disc jockey, productor", "EDM");
                Artista Art5 = new Artista("Gustavo Adrián Cerati","músico, cantautor, compositor y productor ", "Rock, Pop rock");

                Album album1 = new Album("Toxicity", "27 de agosto de 2001", "rock", "",Art2);
                Album album2 = new Album("Siempre es hoy", "26/11/2002", "Pop rock", "",Art5);
                
                Cancion C1 = new Cancion("Toxity", album1, Art2, "hard rock");
                Cancion C2 = new Cancion("Chop suey", album1,Art2, "hard rock");
                Cancion C3 = new Cancion("felicidad",null , Art1, "reggea");
                Cancion C4 = new Cancion("Cosas imposibles",album2, Art5, "romantica");
                Cancion C5 = new Cancion("fiesta pagana",null, Art3, "hard rock");
                
                Lista playList1 = new Lista("Crossover", "lo mas escuchado", "si", Ul0);
                Lista playList2 = new Lista("Romantica", "lo mas escuchado", "si", administrador);
                Lista playList3 = new Lista("Rock", "lo mas escuchado", "si", Ul0);
                playList1.setCancion(C1);
                playList1.setCancion(C2);
                playList1.setCancion(C3);
                
                System.out.println(playList1);
                
                Comentario msg1 = new Comentario("Comentario", "la pagina esta muy genial", "gracias");
                Comentario msg2 = new Comentario("Comentario", "le sugiero amplien la biblioteca de canciones", "Muchas gracias, lo tendremos encuenta");
                Comentario msg3 = new Comentario("Comentario", "la pagina esta muy genial", "gracias");
                
               
                                
                
                
                
                ArrayList<Admin> admins;
                ArrayList<Usuario> users;
                ArrayList<Album> albums;
                ArrayList<Artista> artistas;
                ArrayList<Lista> playlist;
                ArrayList<Cancion> canciones;

                if (session.getAttribute("admins") == null) {
                    admins = new ArrayList();
                } else {
                    admins = (ArrayList<Admin>) session.getAttribute("admins");
                }
                if (session.getAttribute("usuarios") == null) {
                    users = new ArrayList();
                } else {
                    users = (ArrayList<Usuario>) session.getAttribute("usuarios");
                }
                if (session.getAttribute("albums") == null) {
                    albums = new ArrayList();
                } else {
                    albums = (ArrayList<Album>) session.getAttribute("albums");
                }
                if (session.getAttribute("artistas") == null) {
                    artistas = new ArrayList();
                } else {
                    artistas = (ArrayList<Artista>) session.getAttribute("artistas");
                }
                if (session.getAttribute("playlist") == null) {
                    playlist = new ArrayList();
                } else {
                    playlist = (ArrayList<Lista>) session.getAttribute("playlist");
                }
                if (session.getAttribute("canciones") == null) {
                    canciones = new ArrayList();
                } else {
                    canciones = (ArrayList<Cancion>) session.getAttribute("canciones");
                }

                //aquí se agregan datos ficticios desde un txt
                try {
                    Admin.crearAdministradores();
                    //admins.addAll(Admin.cargarAdministradores());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                users.add(Ul0);
                admins.add(administrador);
                albums.add(album1);
                albums.add(album2);
                artistas.add(Art1);
                artistas.add(Art2);
                artistas.add(Art3);
                artistas.add(Art4);
                artistas.add(Art5);
                playlist.add(playList1);
                canciones.add(C1);
                canciones.add(C2);
                canciones.add(C3);
                canciones.add(C4);
                canciones.add(C5);
                session.setAttribute("artistas", artistas);
                session.setAttribute("users", users);
                session.setAttribute("admins", admins);
                session.setAttribute("canciones", canciones);
                session.setAttribute("ficticios", true);
                
                
            }
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
        } // PARA IR A LA PARTE DE CONTACTO -------------------------------------------------------------------------------------
        else if (accion.equals("Iniciar sesion")) {
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
            view.forward(request, response);
        }
        else if (accion.equals("Registrar")) {
            RequestDispatcher view = request.getRequestDispatcher("register.jsp");
            view.forward(request, response);
        }
        
    }
 
}
