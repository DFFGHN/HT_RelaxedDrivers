package com.aaa.demo.service;

import com.aaa.demo.dao.SignUpDao;
import com.aaa.demo.entity.SignUp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SignupSerivce {
    @Resource
    SignUpDao dao;

    public List<Map<String, Object>> getAll(String nickname,String schoolname,Integer page, Integer limit) {
      return dao.query(nickname,schoolname,page,limit);
    }
    public int querycount(){
        return dao.getCount();
    }
}
