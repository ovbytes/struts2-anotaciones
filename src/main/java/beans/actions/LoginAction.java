package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Result(name="success", location = "/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport {

    @Action("login")
    public String execute() { 
        return SUCCESS;
    }

}
