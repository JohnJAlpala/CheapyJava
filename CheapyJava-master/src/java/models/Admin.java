package models;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Admin extends Usuario {
    
    private int Identificacion;
    public static List<Admin> admins = new ArrayList<>();
    public Admin(int Identificacion, String username, String password, String email) throws IOException{
        super(username, password, email);
        this.setIdentificacion(Identificacion);
    }

    public Admin(int Identificacion) throws IOException{
        this.setIdentificacion(Identificacion);
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }
    
     public static void crearAdministradores() throws Exception{
         File administradores = new File("administradores.txt");
       PrintWriter writer = new PrintWriter(administradores);
       writer.print("admin1@gmail.com");
       writer.print("/");
       writer.println("admin1");
       writer.print("admin2@gmail.com");
       writer.print("/");
       writer.println("admin2");
       writer.print("admin3@gmail.com");
       writer.print("/");
       writer.println("admin3");
       writer.print("admin4@gmail.com");
       writer.print("/");
       writer.println("admin4");
       writer.print("admin5@gmail.com");
       writer.print("/");
       writer.println("admin5");
       writer.print("admin6@gmail.com");
       writer.print("/");
       writer.println("admin6");
       writer.print("admin2@unal.edu.co");
       writer.print("/");
       writer.println("a222");
       writer.print("admin1@hotmail.com");
       writer.print("/");
       writer.println("a111");
       writer.print("admin0@gmail.com");
       writer.print("/");
       writer.println("a000");
       writer.close();
    }
     
//    public static ArrayList<Admin> cargarAdministradores() throws Exception{
//    ArrayList<Admin> administradores = new ArrayList<Admin>();
//    File archivo= new File("administradores.txt");
//    Scanner lectura =new Scanner(archivo);
//    int indice=0;
//    while (lectura.hasNext()){
//        String linea = lectura.nextLine();
//        indice=linea.indexOf("/");
//        String email=linea.substring(0,indice);
//        String contrasena=linea.substring(indice+1);
//        Admin admin = new Admin(contrasena,email);
//        administradores.add(admin);
//    }
//    lectura.close();
//    return administradores;
//    }
//    
}
