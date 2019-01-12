package com.aaa.demo.controller;

import com.aaa.demo.entity.Sysusers;
import com.aaa.demo.service.SysusersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/sysu")
public class SysusersController {

    @Resource
    SysusersService service;
    @RequestMapping("/login")
    public String login(HttpSession session,Sysusers user){

        Sysusers sysusers = service.query(user.getUname(), user.getUpwd());
        String msg="";
        if(sysusers!=null){
            session.setAttribute("sysuser",sysusers);
            return "redirect:/pr/getAll";
        }
        msg="账号不存在";
        return "index";
    }
    @RequestMapping("/logOut")
    public String logOut(HttpSession session){
        //销毁session
        session.invalidate();
        return "index";
    }
}
