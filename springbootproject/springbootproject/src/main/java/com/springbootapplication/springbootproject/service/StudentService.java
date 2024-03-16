package com.springbootapplication.springbootproject.service;

import com.springbootapplication.springbootproject.entity.Student;

import java.util.List;


public interface StudentService {
   public Student createStudent(Student student);
    public Student updateStudent(Student student);
    public void delateStudent(Integer student);
   public  Student getStudent(Integer student);
   public List<Student> getAllStudnts();



}
