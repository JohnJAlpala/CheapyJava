package models;

import java.util.*;
import static models.Album.albums;

public class Cancion {
    
    public static ArrayList<Cancion>canciones = new ArrayList<>();
    
    private String nombre;
    private Album album;
    private Artista artista;
    private String genero;
    
    public Cancion(String nombre, Album album, Artista artita, String genero) {
        this.setNombre(nombre);
        this.setAlbum(album);
        this.setArtista(artita);
        this.setGenero(genero);
        canciones.add(this);
    }

    public Cancion() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artita) {
        this.artista = artita;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public static ArrayList<Cancion> buscarCancion(String nombre) {
        ArrayList<Cancion> encontrados = new ArrayList();
        for (Cancion c : canciones) {
            if (c.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }
    
}
