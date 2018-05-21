package models;

import java.util.*;
import java.io.*;
import static models.Artista.artistas;

public class Album {
    
    public static ArrayList<Album>albums = new ArrayList<>();
    
    private String nombre;
    private String fecha_publicacion;
    private String generos;
    private String descripcion;
    private Artista artista;
    private ArrayList<Cancion>cancion;

    public Album(String nombre, String fecha_publicacion, String generos, String descripcion,Artista artista) throws IOException{
        this.setNombre(nombre);
        this.setFecha_publicacion(fecha_publicacion);
        this.setGeneros(generos);
        this.setDescripcion(descripcion);
        this.setArtista(artista);
        albums.add(this);
    }

    public Album() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }
    
    public static ArrayList<Album> buscarAlbum(String nombre) {
        ArrayList<Album> encontrados = new ArrayList();
        for (Album a : albums) {
            if (a.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                encontrados.add(a);
            }
        }
        return encontrados;
    }
    
    public Cancion buscarCancion(String nombre) {
        for (Cancion c : this.getCancion()) {
            if (c.getNombre() == nombre) {
                return c;
            }
        }
        return null;
    }
}
