package com.vip.mybatis.mapper;

import com.vip.mybatis.entity.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> queryAll();

    int insertOnDuplicateKeyUpdate(List<Student> students);

}
