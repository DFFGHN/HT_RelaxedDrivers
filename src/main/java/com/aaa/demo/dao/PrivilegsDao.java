package com.aaa.demo.dao;


import com.aaa.demo.entity.Privilegs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PrivilegsDao {

    @Select("select p.* from ht_privilegs p" +
            " left join ht_relationship r" +
            " on p.pno=r.pno" +
            " where r.rno=#{param1} and p.parentno is not null" +
            " order by p.pno")
    List<Privilegs> getAll(Integer rno);
}
