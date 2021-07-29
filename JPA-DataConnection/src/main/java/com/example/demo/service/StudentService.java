package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.tablename.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repo;
	
     public Student getObject(int id)
     {
    	Student st=repo.findById(id).get();
		return st;	 
     }

	public List<Student> getAllDetails() {
		List<Student> st=repo.findAll();
		return st;
	}

	public List<Student> getInsert(int studid, String studname, int balance) {
		Student st1=new Student(studid,studname,balance);
		Student st=repo.save(st1);
		List<Student> st2=repo.findAll();
		return st2;
	}
	
	public List<Student> getdelete(int id) {
		repo.deleteById(id);
		List<Student> st1=repo.findAll();
		return st1;
		
	}
	

	public List<Student> getupdate(int id, int data) {
		// TODO Auto-generated method stub
		Student st=repo.findById(id).get();
		repo.deleteById(id);		
			st.setBalance(data);
		
        
		repo.save(st);
		List<Student> st1=repo.findAll();
		return st1;
	}
	
}
