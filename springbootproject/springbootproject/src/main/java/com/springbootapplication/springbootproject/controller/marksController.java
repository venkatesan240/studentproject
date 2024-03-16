package com.springbootapplication.springbootproject.controller;

import com.springbootapplication.springbootproject.entity.Marks;
import com.springbootapplication.springbootproject.service.MarksService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/mark")
public class marksController {

    MarksService marksService;
    @PostMapping
    public ResponseEntity<Marks> createMarks(@RequestBody Marks marks){
        Marks saves=marksService.createMarks(marks);
        return new ResponseEntity<>(saves, HttpStatus.CREATED);
    }

    @GetMapping("{markid}")
    public Optional<Marks> getMarks(@PathVariable("markid") Integer markidid){
        return  marksService.getMarks(markidid);

    }
    @PutMapping
    public String updateMarks(@RequestBody Marks marks){
        marksService.updateMarks(marks);
        return "updated sucessfully";
    }

    @DeleteMapping("{markid}")
    public  String deleteMarks(@PathVariable("markid") Integer markid){
        marksService.deleteMarks(markid);
        return "Deleted sucessfully";
    }
}
