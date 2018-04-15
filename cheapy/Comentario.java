package cheapy;
import java.util.*;
import cheapy.Lista;
public class Comentario {
    private String titulo;
    private String contenido;
    private String respuesta;
    private ArrayList<Comentario>comentario;

    public Comentario(String titulo, String contenido, String respuesta) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.respuesta = respuesta;
    }

    public Comentario() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public ArrayList<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<Comentario> comentario) {
        this.comentario = comentario;
    }
    
    
    
}
