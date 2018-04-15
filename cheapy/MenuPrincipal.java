package cheapy;

import java.util.*;
import cheapy.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class MenuPrincipal {
    public Scanner input = new Scanner(System.in);
    private ArrayList lista_users = new ArrayList();

    public void menu_Principal() {
        int op = 0;
        do {  
            try{
                op = this.menu();
                switch (op) {
                    //<editor-fold defaultstate="collapsed" desc="Opciones a Ejecutar">
                    case 1:
                        this.administador();
                        break;
                    case 2:
                        this.usuario();
                        break;
                    case 3:
                        this.invitado();
                        break;
                    //</editor-fold>
                }
                    
            }catch(Exception e){
                System.out.println(e.toString());
            }
            
        } while (op != 4);
    }

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    private int menu() {
        String opciones = "";
        int op;
        opciones += "Seleccione una opcion\n"
                + "1. Administrador\n"
                + "2. Usuario\n"
                + "3. Invitado\n"
                + "4. Salir";
        System.out.println(opciones);
        System.out.print("\nIngrese opcion: ");
        op = input.nextInt();
    
        return op;
              
    }
    
    private int subMenuAdmin(){
        String opciones = "";
            int op;
            opciones += "Seleccione una opcion\n"
                    + "1. Ver usuarios\n"
                    + "2. Agregar Usuarios\n"
                    + "3. Eliminar usuario\n"
                    + "4. Agregar playlist\n"
                    + "5. Eliminar playlist\n"
                    + "6. Agregar album\n"
                    + "7. Eliminar album\n"
                    + "8. Agregar artista\n"
                    + "9. Eliminar artista\n"
                    + "10. Agregar comentario\n"
                    + "11. Eliminar comentario\n"
                    + "12. Salir";
            System.out.println(opciones);
            System.out.print("\nIngrese opcion: ");
            op = input.nextInt();
            return op;
    }
    
    private int subMenuUser(){
        String opciones = "";
            int op;
            opciones += "Seleccione una opcion\n"
                    + "1. Ver usuarios\n"
                    + "2. Agregar playlist\n"
                    + "3. Eliminar playlist\n"
                    + "4. Agregar comentario\n"
                    + "5. Eliminar comentario\n"
                    + "6. Salir";
            System.out.println(opciones);
            System.out.print("\nIngrese opcion: ");
            op = input.nextInt();
            return op;
    }
    
    private int subMenuInvitado(){
        String opciones = "";
            int op;
            opciones += "Seleccione una opcion\n"
                    + "1. Ver Playlist\n"
                    + "2. Registrarse\n"
                    + "3. Salir";
            System.out.println(opciones);
            System.out.print("\nIngrese opcion: ");
            op = input.nextInt();
            return op;
    }

    private void administador(){
        
        int op=0;
        do {
            try{
                op = this.subMenuAdmin();
                switch (op) {
                    //<editor-fold defaultstate="collapsed" desc="Opciones a Ejecutar">
                    case 1:
                        verUsuarios();
                        break;
                    case 2:
                        this.agregarUsuario();
                        break;
                    case 3:
                        //eliminarUsuario()
                        break;
                    case 4:
                        //agregarPlaylist()
                        break;
                    case 5:
                        //eliminarPlaylist()
                        break;
                    case 6:
                        //agregarAlbum()
                        break;
                    case 7:
                        //eliminarAlbum()
                        break;
                    case 8:
                        //agregarArtista
                        break;
                    case 9:
                        //eliminarArtista
                        break;
                    case 10:
                        //agregarCoometario
                        break;
                    case 11:
                        //eliminarComentario
                        break;
                    //</editor-fold>
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
        } while (op != 12);
    
    }
    private void usuario(){
        String email = input.next();
        int pos = this.validar(email);
        if(pos != -1){
            int op=0;
            do {
                try{
                    op = this.subMenuUser();
                    switch (op) {
                        //<editor-fold defaultstate="collapsed" desc="Opciones a Ejecutar">
                        case 1:
                            //verUsuarios();
                            break;
                        case 2:
                            //agregarPlaylist()
                            break;
                        case 3:
                            //eliminarPlaylist()
                            break;
                        case 4:
                            //agregarCoometario
                            break;
                        case 5:
                            //eliminarComentario
                            break;
                        //</editor-fold>
                    }
                }catch(Exception e){
                    System.out.println(e.toString());
                }

            } while (op != 6);
        }else{
            System.out.println("el usuario aun no esta registrado");
        }
    }
    private void invitado(){
        
        int op=0;
        do {
            try{
                op = this.subMenuInvitado();
                switch (op) {
                    //<editor-fold defaultstate="collapsed" desc="Opciones a Ejecutar">
                    case 1:
                        this.verPlaylist();
                        break;
                    case 2:
                        this.registrarUsuario();
                        break;
                    //</editor-fold>
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
        } while (op != 3);
    
    }
    
    private int validar(String email) {
        int pos = -1; // Devuelve -1 si el documento no se encuentra
        Usuario obj;
        for (int i = 0; i < lista_users.size(); i++) {
            obj = (Usuario)lista_users.get(i); //Obtenemos el objeto y hacemos que se comporte como usuario 
            if (obj.getEmail().equals(email)) {
                pos = i; //Devuelve la posicion del arrayList donde esta el objeto correspondiente al documento 
                break;
            }
        }
        return pos;
    }
    
private void agregarUsuario() {
        String email; int pos;
        System.out.println("Ingrese correo:");
        email=input.next();
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
             // El email a validar 
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            pos = validar(email); //Verificamos si ya existe el email
            if (pos == -1) {
                String nom, password;

                //Capturamos los datos basicos del ususario
                System.out.println("Ingrese nombre: ");
                nom = input.next();
                System.out.println("Ingrese password: ");
                password = input.next();
                //se agregan las playlist del usuario
                List<Lista> playlist = new ArrayList();
                playlist = registrarplaylist(playlist); //agregamos elementos a la lista
                Usuario objuser = new Usuario(nom,password,email,playlist);

                lista_users.add(objuser);  //Agregamos el vinculado a la coleccion (ArrayList) de objeto
                System.out.println("Usuario registrado exitosamente\n");
            } else {
                System.out.println("correo ya registrado\n");
            }
        } else {
             System.out.println("El correo ingresado no es valido\n");
        }    
    }

private void registrarUsuario(){
        String email; int pos;
        System.out.println("Ingrese correo:");
        email=input.next();
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
             // El email a validar 
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            pos = validar(email); //Verificamos si ya existe el email
            if (pos == -1) {
                String nom, password;

                //Capturamos los datos basicos del ususario
                System.out.println("Ingrese nombre: ");
                nom = input.next();
                System.out.println("Ingrese password: ");
                password = input.next();
                Usuario objuser = new Usuario(nom,password,email);
                lista_users.add(objuser);  //Agregamos el vinculado a la coleccion (ArrayList) de objeto
                System.out.println("Usuario registrado exitosamente\n"+ "ingresar por la opcion usuario y loguearse");
            } else {
                System.out.println("correo ya registrado\n"
                + "ingresar por la opcion usuario y loguearse");
            }
        } else {
             System.out.println("El correo ingresado no es valido\n");
        }
}    
    //falta
    private void verUsuarios() {
        if (lista_users.isEmpty() == false) {
            System.out.println("usuarios registrados: "+lista_users.size());
            Usuario user;
            for (int i = 0; i < lista_users.size(); i++) {
                user = (Usuario)lista_users.get(i);
                user.toString();
            }
        }
    
    }
    
   /// falta 
    private void verPlaylist(){
        if (lista_users.isEmpty() == false) {
            Usuario user = new Usuario();
            for (int i = 0; i < lista_users.size(); i++) {
                user.getPlaylist();
            }
        }
    }
    
    
private List<Lista> registrarplaylist(List<Lista> playlist) {
        String opcion;
        do {
            System.out.println("\nRegistro de playlist:");
            System.out.print("nombre playlist: ");
            String nom = input.next();
            System.out.print("Ingrese una descripcion(opcional): ");
            String descrip = input.next();
            System.out.print("ingrese el estado estado dela playlis: ");
            String pub = input.next();
            List<Cancion> canciones = new ArrayList();
            canciones = registrarCanciones(canciones);
            System.out.println("Desea crear otra playslist");
            opcion=input.next();                  
        } while (opcion.equalsIgnoreCase("si"));
        return playlist; //Devolvemos la lista de cursos
    }

private List<Cancion> registrarCanciones(List<Cancion> canciones) {
        String opcion;
        do {
            System.out.println("\nRegistro de canciones");
            System.out.print("Ingrese nombre cancion: ");
            String nom = input.next();
            System.out.print("Ingrese album: ");
            String album = input.next();
            System.out.print("Ingrese artista: ");
            String artist = input.next();
            System.out.print("Ingrese genero musical");
            String genero = input.next();
            Cancion objcancion = new Cancion(nom, album, artist, genero);
            System.out.println("Desea registrar otra cancion");
            opcion = input.next();
        } while (opcion.equalsIgnoreCase("si"));
        return canciones; //Devolvemos la lista de cursos
    }


//private String buscar(String email) {
//        String datos = "";
//        datos += "Informacion del " + obj.getTipo() + ":\n";
//        datos += "Documento: " + obj.getDocumento() + "\n";
//        datos += "Nombre: " + obj.getNombres() + "\n";
//        datos += "Apellido: " + obj.getApellidos() + "\n";
//        //Concatenamos el resto de datos segun el tipo de persona
//        switch (tipo) {
//            case "profesor contratista":
//                datos += "Profesion: " + ((Contratista) obj).getProfesion() + "\n";
//                datos += "Salario: " + ((Contratista) obj).getSalario() + "\n";
//                datos += "HT: " + ((Contratista) obj).getHt() + "\n";
//                datos += "Valor Hora: " + ((Contratista) obj).getValorHora() + "\n\n";
//                datos += "Informacion de Cursos: " + mostrarCurso(((Contratista) obj).getCurso()); //obtenemos los cursos
//                break;


public static void main(String[]ar){
    MenuPrincipal objMenu = new MenuPrincipal();
    objMenu.menu_Principal();
    System.out.println("Fin del programa");
}

}
