package com.springbootapplication.springbootproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="marks")
public class Marks {

    @Id
    @Column(name="mark_id",length = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int markid;
    @Column(name="tamil",length = 10)
    private int tamil;
    @Column(name="english",length = 10)
    private int english;
    @Column(name="maths",length = 10)
    private int maths;
    @Column(name="science",length = 10)
    private int science;
    @Column(name = "social",length = 10)
    private int social;
    @Column(name ="total_marks",length = 20)
    private int totalMarks;
    @Column(name="avg_marks",length = 20)
    private float avgmarks;
}
