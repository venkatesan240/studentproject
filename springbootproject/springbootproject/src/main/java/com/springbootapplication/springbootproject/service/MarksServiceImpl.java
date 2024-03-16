package com.springbootapplication.springbootproject.service;

import com.springbootapplication.springbootproject.entity.Marks;
import com.springbootapplication.springbootproject.repo.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarksServiceImpl implements MarksService{

    @Autowired
   private MarksRepository marksRepository;
    @Override
    public Marks createMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public Marks updateMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    @Override
    public void deleteMarks(Integer marks) {
        marksRepository.deleteById(marks);
    }

    @Override
    public Optional<Marks> getMarks(Integer marks) {
        return marksRepository.findById(marks);
    }
}
