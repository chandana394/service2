package com.example.service21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/service2")


public class service2Controller {
	@Autowired
	RestTemplate rest;
@GetMapping("/test")
public String test1() {
	return "This is controller from test1";
}
@GetMapping("/getTest")
public String getTest() {
	String url=rest.getForObject("http://localhost:8082/test1/",String.class);
	return url;
	
}
}
