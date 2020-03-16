package modelo;


public class Usuario {
    
    
    private String userName;
    private String userPassword;
    private String nombre;
    private String apellido;
    private String genero;
    private String facultad;
    private String beca;
    private String estado;
    private String tipo;

    public Usuario(String userName, String userPassword, String tipo) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.tipo = tipo;
    }

    public Usuario(String userName) {
        this.userName = userName;
    }
    

    public Usuario(String nombre, String apellido, String genero, String facultad, String beca, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.facultad = facultad;
        this.beca = beca;
        this.estado = estado;
    }

    
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


   
    
}
