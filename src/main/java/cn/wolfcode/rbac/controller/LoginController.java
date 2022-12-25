package cn.wolfcode.rbac.controller;

import cn.wolfcode.rbac.pojo.User;
import cn.wolfcode.rbac.service.ILoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

/**
 * @author Waylon
 */

@Controller
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @RequestMapping("/")
    public String login() {
            return "/user/login";
    }

    @RequestMapping("/login")
    public String verify(User user) {
        if (user != null) {
            User u = loginService.selectAccount(user);
            System.out.println(u);
            if (u.getPassword().equals(user.getPassword())) {
                return "/department/list";
            }
        }
        return "redirect:/";
    }

    @RequestMapping("/register")
    public String register() {
        return "/user/register";
    }

    @RequestMapping("/adduser")
    public String add(User user) {
        if (user != null) {
            loginService.addUser(user);
            System.out.println(user);
            return "redirect:/";
        }
        return "/user/register";
    }


}
