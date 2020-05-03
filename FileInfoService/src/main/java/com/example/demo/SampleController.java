package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/get")
@RestController
public class SampleController {

	//@Autowired
	//NoteRepository noterepo;
	
	@GetMapping("/path")
	public String getPath() {
		return "Hello I am ayush, I am from mumbai, Pizza, idali are my favourite dishes";
	}
	
	
	/*@GetMapping("/note")
	public List<Note> getNotes() {
		return noterepo.findAll();
	}*/
	
	
}
