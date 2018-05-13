package models;

public class Admin extends Usuario {
    private String Identificacion;

    public Admin(String Identificacion, String username, String password, String email) {
        super(username, password, email);
        this.Identificacion = Identificacion;
    }

    public Admin(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }
    
    
}
