package com.springbootapplication.springbootproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {

    @Id
    @Column(name="student_id",length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;
    @Column(name="name",length = 30)
    private String name;
    @Column(name="roll_num",length = 10)
    private int roll_num;
    @Column(name="user_name",length = 20)
    private String user_name;
    @Column(name="pass_word",length = 20)
    private int pass_word;
 }
