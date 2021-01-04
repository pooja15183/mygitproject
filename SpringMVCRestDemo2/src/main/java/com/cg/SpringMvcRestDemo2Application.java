package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages="com.cg")
public class SpringMvcRestDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcRestDemo2Application.class, args);
		System.out.println("Started at 8087");
	}
}
