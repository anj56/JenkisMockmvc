package com.zensar.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//writing test code case for every piece of business code including spring controller is mandate
@RestController
public class HelloRestController{
  @GetMapping("/hello")
  public String getmessage()
  {
	  System.out.println("Testing saying hello");
    return "Welcome to Tomcat Server";
  }
  
  @PostMapping("/hello")
  public ResponseEntity<String>createMessage(@RequestBody String msg) {
	  System.out.println("Message created");
	  return new ResponseEntity<String>("Message created"+msg,HttpStatus.CREATED);
	  
  }
}
