package com.example.demo.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpring {
@Autowired
Demo2 demo2;
@Autowired
Demo2 demo2_1;

@GetMapping(value = "/get",produces = "text/plain")
public ResponseEntity<String> getHello(){
	
	if(demo2==demo2_1) {
		System.out.println("Ref are equal");
	}
	if(demo2.equals(demo2_1)) {
		System.out.println("Equals are same");
	}
	
	return new ResponseEntity<String>(demo2.say(), HttpStatus.OK);
}
}
