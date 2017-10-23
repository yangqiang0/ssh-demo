package cn.me.action;

import cn.me.domain.User;
import cn.me.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller("myAction")
@Scope("prototype")
@Action(value = "hello",className = "myAction",results = {
        @Result(name = "success",location = "/index.jsp")
})
public class MyAction extends ActionSupport implements ModelDriven<User>{
    private User user = new User();
    @Autowired
    private UserService userService;

    @Override
    public String execute() throws Exception {

        Integer i = userService.save(user);
        System.out.println(i);
        ActionContext.getContext().put("name",user.getName());
        ActionContext.getContext().put("rs",i);
        return SUCCESS;
    }

    public User getModel() {
        return user;
    }
}
