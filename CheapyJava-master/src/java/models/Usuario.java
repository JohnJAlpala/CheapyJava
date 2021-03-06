package models;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static models.Lista.playlist;

public class Usuario {
    
    public static ArrayList<Usuario>users = new ArrayList<>();
    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private String username;
    private String password;
    private String email;
    private ArrayList<Lista>playlist = new ArrayList<>();
    
    public Usuario(){}

    public Usuario(String username, String password, String email) throws IOException{
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        users.add(this);
    }

    public Usuario(String username, String password, String email, ArrayList<Lista> playlist) throws IOException{
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.setPlaylist(playlist);
        
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

    public void setEmail(String email) {
             // El email a validar 
            Matcher mather = pattern.matcher(email);
             if (mather.find() == true) {
                this.email= email;
            } else {
                 System.out.println("El correo ingresado no es valido");
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
    
}
