/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

    public UserController(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    private Solicitud solicitud;
    private List<Solicitud> solicitudList;
    

    /**
     * Creates a new instance of UsuarioController
     */
    public UserController() {
        user = new Usuario("", "", "");
        userList = new ArrayList<>();
        userList.add(new Usuario("Duvan", "123", "admin"));
        userList.add(new Usuario("Pepito", "1234", "admin"));
        userList.add(new Usuario("Ferpito", "234", "estu"));
        userList.add(new Usuario("Lolito", "4578", "estu"));
        solicitudList = new ArrayList<>();
        
        

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
        public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
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
    
    public void enviarSolicitud()
    { 
        solicitudList.add(this.solicitud);

    }
    

}
