package models;

import java.util.HashMap;

public class Mensaje {

    public static final HashMap<String, String> Mensajes = createMap();

    public static HashMap<String, String> createMap() {
        HashMap<String, String> Mensajes = new HashMap<String, String>();
        Mensajes.put("Title", "Cheapify");
        Mensajes.put("LogIn", "Iniciar sesion");
        Mensajes.put("LogOut", "Salir");
        Mensajes.put("Registration", "Registrarse");
        Mensajes.put("ForgottenPassword", "¿Olvidó su contraseña?");
        Mensajes.put("Home", "Inicio");
        Mensajes.put("list", "Playlist");
        Mensajes.put("FictionalData", "Datos ficticios");
        Mensajes.put("FictionalDataPopUp", "'Se han creado datos ficticios'");
        Mensajes.put("InvalidEmail", "'El correo electrónico ingresado no es válido'");
        Mensajes.put("Indexwelcome", "BIENVENIDOS A CHEAPIFY");
        Mensajes.put("Footer", "2018 Equipo 10: John Jairo Alpala, Richard Alexis Montoya Londoño y Duberney Gutiérrez Bacca.");
        Mensajes.put("WrongPassOrEmail", "E-mail no registrado o contraseña inválida");
        Mensajes.put("Name", "Nombre");
        Mensajes.put("ID", "Identificacion");
        Mensajes.put("E-mail", "E-mail");
        Mensajes.put("Password", "Contraseña");
        Mensajes.put("FillBlanks", "Ingrese los datos de registro");
        Mensajes.put("Album", "Album");
        Mensajes.put("Users", "Usuarios");
        Mensajes.put("Admins", "Admins");
        Mensajes.put("AddAdmin", "Agregar Admin");
        Mensajes.put("ShowAdmin", "Ver Admins");
        Mensajes.put("ShowUser", "Ver Usuarios");
        Mensajes.put("Register", "Registrar");
        Mensajes.put("Remove", "Inhabilitar");
        Mensajes.put("InputAdminData", "Ingrese datos del Admin");
        Mensajes.put("Active", "Activo");
        Mensajes.put("AdminRemoved", "El admin fue inhabilitado");
        Mensajes.put("AdminRegistered", "Admin registrado exitosamente");
        Mensajes.put("AdminNotRegistered", "Los datos ingresados son erróneos");
        Mensajes.put("AdminExists", "El admin ya esta registrado");
        Mensajes.put("Search", "Buscar");
        Mensajes.put("Song", "Cancion");
        Mensajes.put("SearchList", "Buscar Playlist");
        Mensajes.put("UserName", "Nombre Usuario");
        Mensajes.put("SearchName", "Buscar por nombre");
        Mensajes.put("SearchResult", "Resultados: ");
        Mensajes.put("NoCoincidences", "No se encontraron coincidencias");
        Mensajes.put("RegisteredEmail", "El E-mail ingresado ya está en uso.");
        Mensajes.put("Artist", "Artista");
        Mensajes.put("EMAIL", "Correo electrónico");
        Mensajes.put("Erase", "Eliminar");
        Mensajes.put("EditAdmins", "Editar Admins");
        Mensajes.put("ClientData", "Datos del Usuario");
        Mensajes.put("OrderProductsA", "Ordenar Ascendentemente");
        Mensajes.put("OrderProductsD", "Ordenar Descendentemente");
        Mensajes.put("SearchMusic", "Buscar Cancion");
        Mensajes.put("InputProductData", "Ingrese los datos de la playlist");
        Mensajes.put("SearchProducts", "Buscar artista");
        Mensajes.put("ImageURL", "URL de imagen: ");
        Mensajes.put("Edit", "Editar");
        Mensajes.put("RecoveryPassword","Recuperar contraseña");
        Mensajes.put("RecoveryVerified","Su E-mail ha sido verificado y le hemos envado un mensaje con su contraseña. Lo esperamos pronto.");
        Mensajes.put("RegisterQuestion", "¿Ya tienes una cuenta? ");
        Mensajes.put("LoginQuestion", "¿No tienes cuenta? ");
        Mensajes.put("fakeDataError", "Datos ficticios ya creados");
        Mensajes.put("WrongEmail","Direccion de correo es Inválido");
        Mensajes.put("SuccessfulRegister","Registro Exitoso.");
        
        
        return Mensajes;
    }

    public static HashMap<String, String> getMensajes() {
        return Mensajes;
    }
}
