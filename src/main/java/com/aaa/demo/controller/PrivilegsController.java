package com.aaa.demo.controller;


import com.aaa.demo.entity.Privilegs;
import com.aaa.demo.entity.Sysusers;
import com.aaa.demo.service.PrivilegsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("pr")
public class PrivilegsController {
    @Resource
    PrivilegsService service;

    @RequestMapping("getAll")
    public String getAll(HttpSession session, Map<String, Object> map) {
        Sysusers sysus = (Sysusers)session.getAttribute("sysuser");
        List<Privilegs> resonceList = service.getAll(sysus.getRno());

        Map<Integer, List<Privilegs>> map1 = new HashMap<Integer, List<Privilegs>>();


        List<Privilegs> returnList = new ArrayList<>();
        for (Privilegs p : resonceList) {
            if (p.getParentno() == 1) {//是一级菜单

                returnList.add(p);

                List<Privilegs> sub = map1.get(p.getPno());
                if (sub == null) {
                    sub = new ArrayList<Privilegs>();
                    map1.put(p.getPno(), sub);
                    p.setSubPrivilegs(sub);
                } else {
                    p.setSubPrivilegs(sub);
                }
            } else {//二级菜单
                Integer parentid = p.getParentno();  //获取parentid  12
                List<Privilegs> sub = map1.get(parentid);//
                if (sub == null) {
                    sub = new ArrayList<Privilegs>();
                    map1.put(parentid, sub);
                } else {
                    sub.add(p);
                }
            }
        }
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String nowDate = sdf.format(date);
        map.put("resonceList", returnList);
        map.put("sysuser", sysus);
        map.put("nowDate", nowDate);
        return "html/main";
    }
}
