package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StuDao {

    @Insert("insert into stu(name1,stu_id) values(#{name},#{stuId})")
    int insert(String name,String stuId);



}
