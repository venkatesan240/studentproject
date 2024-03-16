package com.springbootapplication.springbootproject.controller;

import com.springbootapplication.springbootproject.entity.Exam;
import com.springbootapplication.springbootproject.entity.Marks;
import com.springbootapplication.springbootproject.repo.ExamRepository;
import com.springbootapplication.springbootproject.service.ExamSErvice;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/exam")
public class ExamController {

    private ExamSErvice examSErvice;
    @PostMapping
    public ResponseEntity<Exam> createExam(@RequestBody Exam exam){
        Exam saves=examSErvice.createExam(exam);
        return new ResponseEntity<>(saves, HttpStatus.CREATED);
    }
    @GetMapping("{examid}")
    public Optional<Exam> getExam(@PathVariable("examid") Integer examid){
        return Optional.ofNullable(examSErvice.getExam(examid));

    }
    @PutMapping
    public String updateExam(@RequestBody Exam exam){
        examSErvice.updateExam(exam);
        return "updated sucessfully";
    }

    @DeleteMapping("{examid}")
    public  String deleteExam(@PathVariable("examid") Integer examid){
        examSErvice.deleteExam(examid);
        return "Deleted sucessfully";
    }
}
