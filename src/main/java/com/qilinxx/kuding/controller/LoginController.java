package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.configure.WebConst;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginUI(){
    return "newLogin";
    }

    @RequestMapping("/loginSure")

    public  String loginSure(Model model,String adminName, String password, HttpSession session){
        if (adminName!=null&&password!=null){
            System.out.println(adminName+password);
            if (adminName.equals(WebConst.SUPER_USERNAME)&& password.equals(WebConst.SUPER_PASSWORD)){
                session.setAttribute(WebConst.SESSION_USER_KEY,WebConst.SESSION_USER_VALUE);
                return "redirect:index";
            }
            else{
          model.addAttribute("msg","请输入正确的账号密码");
                return "newLogin";
            }
        }else {
            model.addAttribute("msg","未输入账号密码");
            return "newLogin";
        }
    }

}
