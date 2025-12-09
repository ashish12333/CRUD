package com.example.democrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrudoperation.entity.Student;
import com.example.democrudoperation.repository.Studentrepository;
@RestController
public class Studentcontroler {
	
	@Autowired
	Studentrepository repo;
	@GetMapping
	("/students")
	public List<Student>  getall(){
	
		
		List<Student> stud =repo.findAll();
		return stud;
			
	}
		
		// localhost:8080
		
		@GetMapping("/students/{id}")
		public Student getid(@PathVariable int id) {
		Student stud=	repo.findById(id).get();
			return stud;			
			
		}
		
		@PostMapping("/students/add")
		@ResponseStatus(code=HttpStatus.CREATED)
		public void createstudent(@RequestBody Student student) {
			repo.save(student);			
		}
		
		
		@PutMapping("/students/update/{id}")
		public Student updatestudent(@PathVariable int id) {
			Student stud=repo.findById(id).get()	;
			stud.setName("rabina");
			stud.setPrecentage(92);
			stud.setBranch("metallurgy");
			repo.save(stud);
			return stud;
		}
		
		
		
		@DeleteMapping("students/delete/{id}")
		public void removestudent(@PathVariable int id) {
		Student stud=	repo.findById(id).get();
		repo.delete(stud);
		
			
			
		}
		
		
}















































