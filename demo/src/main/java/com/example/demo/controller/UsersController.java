
package com.example.demo.controller;

import com.example.demo.entity.Students;
import com.example.demo.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Student")
class StudentsController {
    @Autowired
    private StudentsService studentService;

    @RequestMapping("/getAllStudent")
    public List<Students> findAll(){
        return studentService.findAllStudent();
    }

    @RequestMapping("/getStudentByno/{no}")
    public List<Students> findUserByStudentId(@PathVariable int no){
        return studentService.findStudentByno(no);
    }
    @RequestMapping("/getStudentByname/{name}")
    public List<Students> findStudentByname(@PathVariable String name){
        return studentService.findStudentByname(name);
    }

    @RequestMapping("/insertStudent")
    public Students insertStudent(Students student){
        return studentService.insertStudent(student);
    }

    @RequestMapping("/updateStudent")
    public int updateStudent(Students student){
        return studentService.updateStudent(student);
    }

    @RequestMapping("/deleteStudent")
    public int deleteStudent(Students student){
        return studentService.deleteStudent(student);
    }
}





