package com.aaa.demo.service;


import com.aaa.demo.dao.SysusersDao;
import com.aaa.demo.entity.Sysusers;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SysusersService {
    @Resource
    SysusersDao dao;

    public Sysusers query(String uname, String upwd){
        return dao.query(uname,upwd);
    }
}
