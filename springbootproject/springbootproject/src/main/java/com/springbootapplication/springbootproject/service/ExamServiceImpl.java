package com.springbootapplication.springbootproject.service;

import com.springbootapplication.springbootproject.entity.Exam;
import com.springbootapplication.springbootproject.repo.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExamServiceImpl implements ExamSErvice{

    @Autowired
    private ExamRepository examRepository;
    @Override
    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam updateExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public void deleteExam(Integer exam) {
            examRepository.deleteById(exam);
    }

    @Override
    public Exam getExam(Integer exam) {
        return examRepository.findById(exam).get();
    }
}
