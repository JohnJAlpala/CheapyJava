package models;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static models.Lista.playlist;

public class Usuario {
    
    public static ArrayList<Usuario>users = new ArrayList<>();
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private String username;
    private String password;
    private String email;
    private boolean activo;
    private ArrayList<Lista>playlist = new ArrayList<>();
    
    public Usuario(){}

    public Usuario(String username, String password, String email) throws IOException{
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setActivo(true);
        
    }

    public Usuario(String username, String password, String email, ArrayList<Lista> playlist) throws IOException{
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setPlaylist(playlist);
        this.setActivo(true);
        
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
  public void setEmail(String email) throws  IOException {
        if (!validateEmail(email)) {
            throw new IOException("E-mail inválido.");
            
        }else if(!verificarUsuario(email)){
            throw new IOException("El e-mail ya esta en uso.");
        }
        else{
            this.email = email;
        }
    }
    
    public void registrarUsuario(){
        
    }

    public List<Lista> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Lista> playlist) {
        this.playlist = playlist;
    }

    public static void crearUsuarios() throws Exception{
        File usuarios = new File("usuarios.txt");
        PrintWriter writer = new PrintWriter(usuarios);
        writer.print("/");
        writer.print("user1");
        writer.print("/");
        writer.println("12345");
        writer.print("/");
        writer.println("user1@gmail.com");
        writer.print("/");
        writer.print("user2");
        writer.print("/");
        writer.println("567890");
        writer.print("/");
        writer.println("user2@gmail.com");
        writer.print("/");
        writer.print("user3");
        writer.print("/");
        writer.println("user3");
        writer.print("/");
        writer.print("user3@gmail.com");
        writer.print("/");
        writer.println("user4");
        writer.print("/");
        writer.print("user4");
        writer.print("/");
        writer.println("user4@gmail.com");
        writer.print("/");
        writer.print("user5");
        writer.print("/");
        writer.println("user5");
        writer.print("/");
        writer.println("user5@unal.edu.co");
        writer.close();
    }

    public static ArrayList<Usuario> cargarUsuarios() throws Exception{
        ArrayList<Usuario> usuarios = new ArrayList<>();
        File archivo= new File("usuarios.txt");
        Scanner lectura =new Scanner(archivo);
        int indice=0;
        while (lectura.hasNext()){
            String linea = lectura.nextLine();
            indice=linea.indexOf("/");
            String username = linea.substring(indice+1);
            String password = linea.substring(indice+1);
            String email=linea.substring(indice+1);
            Usuario user = new Usuario(username,password,email);
            usuarios.add(user);
    }
        
    lectura.close();
        return usuarios;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.username + "Email: " + this.email;
    }
    
     public static ArrayList<Usuario> buscarUsuario(String email) {
        ArrayList<Usuario> encontrados = new ArrayList();
        for (Usuario user : users) {
            if (user.getEmail().toLowerCase().contains(email.toLowerCase())) {
                encontrados.add(user);
            }
        }
        return encontrados;
    }

     public static boolean validateEmail(String email) {
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }
     
    public Boolean verificarUsuario(String email) {
        for (Usuario user : users) {            
            if (user.getEmail().equals(email)){
                return false;
            }            
        }return true;
    }
     
//    public boolean login(String email, String password) {
//        
//    }
//    
}
