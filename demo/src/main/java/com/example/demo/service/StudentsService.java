package com.example.demo.service;

import com.example.demo.entity.Students;
import com.example.demo.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsService {
    @Autowired(required = false)
    public StudentsMapper studentMapper;
    public List<Students> findAllStudent() {
        return studentMapper.findAllStudent();
    }
    public List<Students> findStudentByno(int no) {
        return studentMapper.findStudentByno(no);
    }
    public List<Students> findStudentByname(String name){
        return studentMapper.findStudentByname(name);
    }
    public Students insertStudent(Students student){
        studentMapper.insertStudent(student);
        return student;
    }

    public int updateStudent(Students student){
        return studentMapper.updateStudent(student);
    }
    public int deleteStudent(Students student){
        return studentMapper.deleteStudent(student);
    }
}



