package com.springbootapplication.springbootproject.controller;

import com.springbootapplication.springbootproject.Dto.StudentDto;
import com.springbootapplication.springbootproject.entity.Student;
import com.springbootapplication.springbootproject.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/student")
public class StudentController {


     StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student saves=studentService.createStudent(student);
        return new ResponseEntity<>(saves, HttpStatus.CREATED);
    }

    @GetMapping("{studentid}")
    public Student getStudent(@PathVariable("studentid") Integer studentid){
     return   studentService.getStudent(studentid);

    }
    @GetMapping()
    public List<Student> getStudent(){
        return  studentService.getAllStudnts();

    }

    @PutMapping
    public String updateStudent(@RequestBody Student student){
         studentService.updateStudent(student);
        return "updated sucessfully";
    }

    @DeleteMapping("{studentid}")
    public  String deleteStudent(@PathVariable("studentid") Integer studentid){
        studentService.delateStudent(studentid);
        return "Deleted sucessfully";
    }


}
