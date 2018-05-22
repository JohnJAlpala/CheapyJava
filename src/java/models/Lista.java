package models;

import java.util.*;
import static models.Album.albums;
public class Lista {
    
    public static ArrayList<Lista>playlist = new ArrayList<>();
    
    private String nombre;
    private String descripcion;
    private String publica;
    private Usuario Creador;
    private ArrayList<Cancion> canciones;
    private ArrayList<Comentario>comentario;

    public Lista(String nombre, String descripcion, String publica, Usuario Creador) {
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setPublica(publica);
        this.setCreador(Creador);
        
        playlist.add(this);
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

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
    }

    public Usuario getCreador() {
        return Creador;
    }

    public void setCreador(Usuario creador) {
        this.Creador = creador;
    }

    public ArrayList<Cancion> getCancion() {
        return canciones;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.canciones = cancion;
    }

    public ArrayList<Comentario> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<Comentario> comentario) {
        this.comentario = comentario;
    }
    
    public static ArrayList<Lista> buscarLista(String nombre) {
        ArrayList<Lista> encontrados = new ArrayList();
        for (Lista list : playlist) {
            if (list.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                encontrados.add(list);
            }
        }
        return encontrados;
    }
    
    @Override
    public String toString(){
     return "nombre: "+ getNombre() + "canciones: "+ getCancion();
    }
}
