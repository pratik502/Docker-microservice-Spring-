package com.oracle.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@Component
//@FeignClient(name="file-path-service") //disabled for zuul  
//@FeignClient(name="netflix-zuul-api-gateway")  //zuul name
@FeignClient(name="zuul-gateway-server")     //zuul docker name
//@RibbonClient(name="file-path-service")  //disabled for docker zuul
public interface FilePathProxy {

	//@GetMapping("/get/path") //disabled for zuul
	@GetMapping("/file-path-service/get/path") 
	public FileLoc retrieve(@RequestHeader("Username") String username,@RequestHeader("Password") String password,@RequestHeader("GrantType") String granttype);
	
	@GetMapping("/file-info-service/get/path")
	public String getMyself();
}
