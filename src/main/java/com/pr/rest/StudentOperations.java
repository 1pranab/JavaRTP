package com.pr.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pr.model.Student;

@RestController
@RequestMapping("/stud")
public class StudentOperations {

	@PostMapping("/register")
	public ResponseEntity<Student> registerStudent(@RequestBody Student student){
		System.out.println(student);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
}
