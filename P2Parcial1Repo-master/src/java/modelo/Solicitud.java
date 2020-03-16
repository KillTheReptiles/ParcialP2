
package modelo;

import java.util.Date;

public class Solicitud{
    
    private Date fecha;
    private String descripcion;
    private String prioridad;
    private String usuario;

    public Solicitud(String descripcion, String prioridad, String usuario) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.usuario = usuario;
        
    }

    public Date getFecha() {
        this.fecha= new Date();
        return fecha;
    }

    public Solicitud() {
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void getUsuario(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    



}
