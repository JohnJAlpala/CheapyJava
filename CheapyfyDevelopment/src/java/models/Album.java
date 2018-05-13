package models;

import java.util.*;
public class Album {
    private String nombre;
    private String fecha_publicacion;
    private String generos;
    private String descripcion;
    private ArrayList<Cancion>cancion;

    public Album(String nombre, String fecha_publicacion, String generos, String descripcion) {
        this.nombre = nombre;
        this.fecha_publicacion = fecha_publicacion;
        this.generos = generos;
        this.descripcion = descripcion;
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

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }
    
    
}
