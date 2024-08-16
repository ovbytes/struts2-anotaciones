
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name="success", location = "/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location = "login", type = "redirectAction")
})

public class ValidarUsuarioAction extends ActionSupport {

    private String usuario;
    private String password;
    
    @Action("validarUsuario")
    public String execute() {

        if("admin".equals(this.usuario)){
            
        } else {
            return INPUT;
        }
        
        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
