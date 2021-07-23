package com.wastescrapper.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WastescrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(WastescrapperApplication.class, args);
	}


	@GetMapping("/index")
	public String redirectToHome(){

	return "/index.html";
	}


}
