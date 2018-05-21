package models;

import java.util.*;
import java.io.*;

public class Artista{
    
    public static ArrayList<Artista> artistas = new ArrayList<Artista>();
    
    private String nombre;
    private String descripcion;
    private String generos;
    private ArrayList<Album> Albums = new ArrayList<>();

    public Artista(String nombre, String descripcion, String generos) throws IOException{
        this.setNombre(nombre);
        this.setDescripcion(descripcion);
        this.setGeneros(generos);
        artistas.add(this);
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

    public List<Album> getAlbums() {
        return Albums;
    }

    public void setAlbums(ArrayList<Album> Album) {
        this.Albums = Album;
    }

     public static ArrayList<Artista> buscarArtista(String nombre) {
        ArrayList<Artista> encontrados = new ArrayList();
        for (Artista art : artistas) {
            if (art.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                encontrados.add(art);
            }
        }
        return encontrados;
    }

    
    /// Estos son para no poder crear clientes con misma cedula
    public Boolean verificarArtista(String nom) {
        for (Artista art : artistas) {
            if (art.getNombre().equals(nombre)) {
                return false;
            }
        }
        return true;
    }

    public Album buscarAlbum(String nombre) {
        for (Album Art : this.getAlbums()) {
            if (Art.getNombre() == nombre) {
                return Art;
            }
        }
        return null;
    }

   
}
