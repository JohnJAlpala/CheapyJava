package cheapy;
import java.util.*;
import cheapy.Lista;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
public class Usuario {
    private String username;
    private String password;
    private String email;
    private List<Lista>playlist;

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.setEmail(email);
    }

    public Usuario(String username, String password, String email, List<Lista> playlist) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.playlist = playlist;
    }
    
    

    public Usuario() {
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
         Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
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
    
    
}
