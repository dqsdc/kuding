package com.qilinxx.kuding.controller;

import com.qilinxx.kuding.configure.WebConst;
import com.qilinxx.kuding.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController extends BaseController {

    @Autowired
    LogService logService;

    @RequestMapping("/login")
    public String loginUI() {
        return "newLogin";
    }

    @RequestMapping("/loginSure")

    public String loginSure(Model model, String adminName, String password, HttpServletRequest request) {
        if (adminName != null && password != null) {
            System.out.println(adminName + password);
            if (adminName.equals(WebConst.SUPER_USERNAME) && password.equals(WebConst.SUPER_PASSWORD)) {
                request.getSession().setAttribute(WebConst.SESSION_USER_KEY, WebConst.SESSION_USER_VALUE);
                logService.insertLog("登录成功", WebConst.SESSION_USER_VALUE, userIp(request));
                return "redirect:index";
            } else {
                model.addAttribute("msg", "请输入正确的账号密码");
                return "newLogin";
            }
        } else {
            model.addAttribute("msg", "未输入账号密码");
            return "newLogin";
        }
    }

}
