package com.springbootapplication.springbootproject.service;

import com.springbootapplication.springbootproject.entity.Student;
import com.springbootapplication.springbootproject.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSeviceImpl implements StudentService{


    @Autowired
    public StudentRepository studentRepository;


    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Integer studentid) {
        return studentRepository.findById(studentid).get();
    }

    @Override
    public List<Student> getAllStudnts() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delateStudent(Integer studentid) {
        studentRepository.deleteById(studentid);
    }

}
