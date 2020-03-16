/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import modelo.Solicitud;
import modelo.Usuario;

/**
 *
 * @author informatica
 */
public class UserController {

    private Usuario user;
    private List<Usuario> userList;

    private Solicitud solicitud;
    private List<Solicitud> solicitudList;
    
    
    
    

    public UserController() {
        user = new Usuario("", "", "");
        userList = new ArrayList<>();
        userList.add(new Usuario("Duvan", "123", "admin"));
        userList.add(new Usuario("Pepito", "1234", "admin"));
        userList.add(new Usuario("Ferpito", "234", "estu"));
        userList.add(new Usuario("Lolito", "4578", "estu"));
        
        if(solicitudList==null){
            solicitud = new Solicitud();
           
        solicitudList = new ArrayList<>();
        }else{
            solicitud = new Solicitud();
       
        }
        
        
    }

     public boolean isListEmpty(){
        return solicitudList != null && solicitudList.size()>0;
    }
    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Usuario> getUserList() {
        return userList;
    }

    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    public void logout() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();

        context.getExternalContext().redirect("index.xhtml");
    }

    public String login() {

        String pagina = "index?faces-redirect=true";

        for (Usuario usuario : userList) {

            if ((this.user.getUserName().equals(usuario.getUserName())) && (this.user.getUserPassword().equals(usuario.getUserPassword()))) {

                if (usuario.getTipo().equals("admin")) {
                    pagina = "homeAdmin?faces-redirect=true";
                } else {
                    pagina = "homeEstu?faces-redirect=true";
                }

                break;
            }
        }

        return pagina;

    }

    public void validarAdmin() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ex = context.getExternalContext();

        if (user == null || user.getTipo().equals("estu")) {
            ex.redirect("index.xhtml");
        }
    }

    public void validarEstu() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ex = context.getExternalContext();

        if (user == null || user.getTipo().equals("admin")) {
            ex.redirect("index.xhtml");
        }
    }

    public void enviarSolicitud() {
        solicitud.getFecha();
        solicitudList.add(this.solicitud);
       

        this.solicitud = new Solicitud();

    }

}
