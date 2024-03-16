package com.springbootapplication.springbootproject.repo;

import com.springbootapplication.springbootproject.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<Marks,Integer> {
}
