package cheapy;
import cheapy.Cancion;
import java.util.*;
public class Lista {
    private String nombre;
    private String descripcion;
    private boolean publica;
    private String Creador;
    private ArrayList<Cancion>cancion;
    private ArrayList<Comentario>comentario;

    public Lista(String nombre, String descripcion, boolean publica, String Creador, ArrayList<Cancion> cancion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.publica = publica;
        this.Creador = Creador;
        this.cancion = cancion;
    }

    public Lista() {
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPublica() {
        return publica;
    }

    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String Creador) {
        this.Creador = Creador;
    }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    public ArrayList<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<Comentario> comentario) {
        this.comentario = comentario;
    }
    
    
    
}
