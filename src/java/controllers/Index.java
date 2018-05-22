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
        
        //COLOCA TIPO DE USUARIO VISITANTE SI NO SE TIENE DICHO TIPO -------------------------------------------------------------------
//        if (session.getAttribute("tipoUsuario") == null) {
//            session.setAttribute("tipoUsuario", "Visitante");
//        }
        //ENVIA TIPO DE USUARIO AL INDEX -------------------------------------------------------------------------------------------------
//        request.setAttribute("tipoUsuario", session.getAttribute("tipoUsuario"));

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //super.doPost(request, response);
        HttpSession session = request.getSession(false);
        Object ficticiosObj = session.getAttribute("ficticios");
        boolean ficticios = ficticiosObj != null ? true : false;
        String accion = request.getParameter("accion");
        
        if(accion != null){
            if (accion.equals("ficticios") && ficticios == false) { // GENERAR DATOS FICTICIO
                
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

                Lista playList1 = new Lista("Crossover", "lo mas escuchado", "si", administrador);
                Lista playList2 = new Lista("Romantica", "lo mas escuchado", "si", administrador);
                Lista playList3 = new Lista("Rock", "lo mas escuchado", "si", administrador);
                playList1.setCancion(C1);
                playList1.setCancion(C2);
                playList1.setCancion(C3);


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
                    admins.add(administrador);
                    session.setAttribute("admins", admins);
                } 
                if (session.getAttribute("usuarios") == null) {
                    users = new ArrayList();
                    users.add(Ul0);
                    session.setAttribute("users", users);
                }
                if (session.getAttribute("albums") == null) {
                    albums = new ArrayList();
                    albums.add(album1);
                    albums.add(album2);
                    session.setAttribute("albums", albums);
                }
                if (session.getAttribute("artistas") == null) {
                    artistas = new ArrayList();
                    artistas.add(Art1);
                    artistas.add(Art2);
                    artistas.add(Art3);
                    artistas.add(Art4);
                    artistas.add(Art5);
                    session.setAttribute("artistas", artistas);
                } 
                if (session.getAttribute("playlist") == null) {
                    playlist = new ArrayList();
                    playlist.add(playList1);
                    session.setAttribute("playlist", playlist);
                }
                if (session.getAttribute("canciones") == null) {
                    canciones = new ArrayList();
                    canciones.add(C1);
                    canciones.add(C2);
                    canciones.add(C3);
                    canciones.add(C4);
                    canciones.add(C5);
                    session.setAttribute("canciones", canciones);
                } 

                //aquí se agregan datos ficticios desde un txt
                try {
                    Usuario.crearUsuarios();
                    users.addAll(Admin.cargarUsuarios());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                session.setAttribute("ficticios", true);
            } 
        }
        
        else if (ficticios == true){
            request.setAttribute("errorFicticios", true);
        }
        if(request.getParameter("txtSearch") != null){
            ArrayList<Cancion> canciones = (ArrayList<Cancion>) session.getAttribute("canciones");
            if (canciones == null){
                canciones = new ArrayList<>();
            }
            ArrayList<Cancion> solucion = new ArrayList<>();
            String search = request.getParameter("txtSearch");
            for(Cancion cancion : canciones){
                if(cancion.getNombre().toLowerCase().contains(search.toLowerCase())){
                    solucion.add(cancion);
                }
            }
            session.setAttribute("solucion", solucion);
        }
        if(request.getParameter("add") != null){
            int i = Integer.parseInt(request.getParameter("add"));
            ArrayList<Cancion> canciones =  (ArrayList<Cancion>) session.getAttribute("solucion");
            Cancion cancion = canciones.get(i);
            ArrayList<Cancion> listaReproduccion = (ArrayList<Cancion>) session.getAttribute("listaReproduccionCreacion");
            if(listaReproduccion == null)
                listaReproduccion = new ArrayList<>();
            listaReproduccion.add(cancion);
            session.setAttribute("listaReproduccionCreacion", listaReproduccion);            
        }
        
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}
