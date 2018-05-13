package models;

import java.util.*;
public class Cancion {
    private String nombre;
    private String album;
    private String artita;
    private String genero;


    public Cancion(String nombre, String album, String artita, String genero) {
        this.nombre = nombre;
        this.album = album;
        this.artita = artita;
        this.genero = genero;
        
    }

    public Cancion() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtita() {
        return artita;
    }

    public void setArtita(String artita) {
        this.artita = artita;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
