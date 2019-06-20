package com.example.demowebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoWebAppApplication {

	@Autowired
	private List<WebSecurityConfigurerAdapter> list;

	public static void main(String[] args) {

		SpringApplication.run(DemoWebAppApplication.class, args);
	}

	@RequestMapping("/")
	public String index(){
		return "Hello world !! " + list.size() + list.get(0).toString();
	}

}
