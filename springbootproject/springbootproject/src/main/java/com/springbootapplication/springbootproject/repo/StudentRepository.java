package com.springbootapplication.springbootproject.repo;

import com.springbootapplication.springbootproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Integer>{

}
