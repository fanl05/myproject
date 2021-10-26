package com.vip.mybatis;

import com.vip.mybatis.entity.Student;
import com.vip.mybatis.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryland
 */
public class Test01 {

    @Test
    public void test01() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.queryAll();
        students.forEach(System.out::println);
    }

    @Test
    public void test02() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> students = sqlSession.selectList("com.vip.mybatis.mapper.StudentMapper.queryAll");
        students.forEach(System.out::println);
    }

    @Test
    public void test03() throws IOException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student("test", 1, "test", "test2");
        List<Student> students = new ArrayList<>();
        int count = mapper.insertOnDuplicateKeyUpdate(students);
        System.out.println(count);
    }

}
