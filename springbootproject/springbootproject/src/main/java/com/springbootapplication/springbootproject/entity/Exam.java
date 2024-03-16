package com.springbootapplication.springbootproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="exam")
public class Exam {

    @Id
    @Column(name ="examid" , length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examid;
    @Column(name="examname",length = 20)
   private String examname;

}
