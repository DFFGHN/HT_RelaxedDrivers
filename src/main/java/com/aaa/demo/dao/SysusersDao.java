package com.aaa.demo.dao;


import com.aaa.demo.entity.Sysusers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysusersDao {
    @Select("select s.uno,s.uname,s.upwd,r.rno,r.rname" +
            " from ht_sysusers s" +
            " left join ht_roles r" +
            " on r.rno=s.rno" +
            " where s.uname=#{param1} and s.upwd=#{param2}")
    Sysusers query(String uname, String upwd);
}
