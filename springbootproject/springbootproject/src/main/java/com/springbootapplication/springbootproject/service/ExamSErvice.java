package com.springbootapplication.springbootproject.service;

import com.springbootapplication.springbootproject.entity.Exam;
import com.springbootapplication.springbootproject.entity.Marks;

import java.util.Optional;

public interface ExamSErvice {

    public Exam createExam(Exam exam);
    public  Exam updateExam(Exam exam);
    public void deleteExam(Integer exam);
    public Exam getExam(Integer exam);
}
