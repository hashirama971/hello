package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.tablename.Student;


public interface StudentRepository extends JpaRepository<Student,Integer> {

	
	
}
