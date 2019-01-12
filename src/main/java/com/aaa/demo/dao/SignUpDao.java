package com.aaa.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SignUpDao {
    @Select(" <script>" +
            " select s.*,u.nickname,d.drivername,ds.schoolname,m.mealname" +
            " from signup s " +
            " join userinfo u " +
            " on s.userno=u.userno" +
            " join driverstype d" +
            " on s.driverno=d.driverno" +
            " join driverschool ds" +
            " on s.schoolno=ds.schoolno" +
            " join mealtype m" +
            " on s.mealno=m.mealno" +
            " <where>" +
            " <if test='param1!=null '>" +
            " and u.nickname like concat('%',#{param1},'%')" +
            " </if>" +
            " <if test='param2!=null'>" +
            " and ds.schoolname like concat('%',#{param2},'%')" +
            " </if>" +
            " </where>" +
            " limit #{param3},#{param4}" +
            " </script>")
    List<Map<String,Object>> query(String nickname,String schoolname,Integer page, Integer limit);

    @Select("select count(*) from signup")
    int getCount();
}
