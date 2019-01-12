package com.aaa.demo.service;


import com.aaa.demo.dao.PrivilegsDao;
import com.aaa.demo.entity.Privilegs;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PrivilegsService {
    @Resource
    PrivilegsDao dao;

    public List<Privilegs> getAll(Integer rno){
        return dao.getAll(rno);
    }
}
