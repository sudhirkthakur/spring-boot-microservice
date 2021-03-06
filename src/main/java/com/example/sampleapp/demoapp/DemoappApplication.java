package com.example.sampleapp.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
	return "Hello from Server" + "\n";
	}

	@RequestMapping(value = "/hello/{paramId}", method = RequestMethod.GET)
	public String getHelloWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}

	@RequestMapping(value = "/test/{paramId}", method = RequestMethod.GET)
	public String getTestWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}

	@RequestMapping(value = "/devops-demo/{paramId}", method = RequestMethod.GET)
	public String getDevopsWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}


	@RequestMapping(value = "/mydevops-demo/{paramId}", method = RequestMethod.GET)
	public String getmyDevopsWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}
}
