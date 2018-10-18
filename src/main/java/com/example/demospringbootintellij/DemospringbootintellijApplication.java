package com.example.demospringbootintellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@SpringBootApplication
public class DemospringbootintellijApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemospringbootintellijApplication.class, args);
	}

	@GetMapping("/home")
	public String getHome(){
		return "home";
	}
}
