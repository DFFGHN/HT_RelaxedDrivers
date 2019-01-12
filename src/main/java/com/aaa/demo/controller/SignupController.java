package com.aaa.demo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.aaa.demo.entity.SignUp;
import com.aaa.demo.service.SignupSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("sign")
public class SignupController {
    @Resource
    SignupSerivce serivce;
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String,Object> getAll(String nickname,String schoolname,Integer page, Integer limit){
        System.out.println(nickname);
        System.out.println(schoolname);
        if(page==null){
            page=1;
        }
        if(limit==null){
            limit=0;
        }
        List<Map<String,Object>> list = serivce.getAll(nickname,schoolname,
                limit*(page-1),limit);
        int count = serivce.querycount();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("count",count);
        map.put("code",0);
        map.put("msg","信息");
        map.put("data",list);
        return map;
    }
}
