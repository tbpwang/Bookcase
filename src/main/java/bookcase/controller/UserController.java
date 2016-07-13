package bookcase.controller;

/**
 * Administrator
 * Created by tbpwang
 * 2016/7/13.
 */

import bookcase.dao.UserDao;
import bookcase.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    public UserDao userDao;

    @RequestMapping("create")
    public String create(User user){
        userDao.create(user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("login")
    public String login(User user){
        List<User> users = userDao.query(user);
        if (users.size() > 0) {
            session.setAttribute("user", users.get(0));
            return "redirect:/book/queryAll";
        } else {
            request.setAttribute("message","用户名或密码输入错误");
            return "/index.jsp";
        }
    }

    @RequestMapping("logout")
    public String logout(){
        session.invalidate();
        return "redirect:/index.jsp";
    }
}
