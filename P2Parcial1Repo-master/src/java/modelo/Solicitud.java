
package modelo;
import modelo.Usuario;
public class Solicitud{
    
    private String fecha;
    private String descripcion;
    private String prioridad;
    
    Usuario user;
    

    public Solicitud(String fecha, String descripcion, String prioridad, String userName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Solicitud() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getFecha() {
        
        return fecha;
    }

    public void setFecha(String fecha) {
        
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

}
