package com.oracle.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")

public class FilePathController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	HttpServletRequest req;
	@GetMapping("/path")
	public FileLoc getPath() {
		System.out.println("IN CONTROLLER Auth "+req.getHeader("Authorization"));
		FileLoc fileLoc=new FileLoc();
		//fileLoc.setLocation("C://Notes1//"); 
		//changed for docker /tmp/ is docker volume mapped on local(host) file system
		fileLoc.setLocation("/tmp/");  
		fileLoc.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return fileLoc;
	}

}
