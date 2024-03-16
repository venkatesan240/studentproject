package com.springbootapplication.springbootproject.service;

import com.springbootapplication.springbootproject.entity.Marks;

import java.util.Optional;

public interface MarksService {

    public Marks createMarks(Marks marks);
    public  Marks updateMarks(Marks marks);
    public void deleteMarks(Integer Marks);
    public Optional<Marks> getMarks(Integer Marks);
}
