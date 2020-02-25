package com.example.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findall(){
		
		User u = new User(1L, "Maria", "maria@gmail.com", "8888888", "12345");
		return ResponseEntity.ok().body(u);
				
}
	
	
}
