package com.vip.mybatis.mapper;

import com.vip.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> queryAll();

    int insertByEntity(@Param("student") Student student);

    int insertOnDuplicateKeyUpdate(@Param("students") List<Student> students);

}
