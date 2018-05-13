package models;
import java.util.*;
public class Artista {
    private String nombre;
    private String descripcion;
    private String generos;
    private ArrayList<Album> Album;

    public Artista(String nombre, String descripcion, String generos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generos = generos;
    }

    public Artista() {
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

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public ArrayList<Album> getAlbum() {
        return Album;
    }

    public void setAlbum(ArrayList<Album> Album) {
        this.Album = Album;
    }
    
    
        
}
