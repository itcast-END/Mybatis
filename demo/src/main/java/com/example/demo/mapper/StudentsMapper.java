package com.example.demo.mapper;

import com.example.demo.entity.Students;
import com.example.demo.entity.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentsMapper {
    public List<Students> findAllStudent();
    public List<Students> findStudentByno(int no);
    public List<Students> findStudentByname(String name);
    public int insertStudent(Students student);
    public int updateStudent(Students student);
    public int deleteStudent(Students student);
}




