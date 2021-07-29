package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;
import com.example.demo.tablename.Student;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class CRUD_operation {
	
	@Autowired
	StudentService service;
		
	@GetMapping("/Student")
	public Object  retrived(@RequestParam("id") int id){
		System.out.println(id);
		Student st=service.getObject(id);
		return st;
		
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@GetMapping("/Student/All")
	public ResponseEntity<List<Student>> retrievedAll() {
		
		List<Student> st=service.getAllDetails();
	  	return new ResponseEntity<List<Student>>(st,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/Student/delete/{id}")
	    public Object delete(@PathVariable("id") int id) {
		System.out.println(id);
		List<Student> st=(List<Student>) service.getdelete(id);
		return st;
		
	}
	@CrossOrigin(origins ="http://localhost:4200")
	@PostMapping("/Student/Add")
	public void insert(@RequestBody Student stud) {
		int id=stud.getStudid();
		String name=stud.getStudname();
		int bal=stud.getBalance();
		List<Student> st=(List<Student>) service.getInsert(id, name, bal);
	
	}
	
	@CrossOrigin(origins ="http://localhost:4200")
	@PostMapping("/Student/update")
    public void update(@RequestBody Student stud) {

int id=stud.getStudid();
int data=stud.getBalance();
		List<Student> st=(List<Student>) service.getupdate(id,data);
	}
	

}
