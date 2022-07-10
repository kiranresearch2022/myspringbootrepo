package com.myexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/data")
	public String getData() {
		return "d1,d2,d3";
	}

}
