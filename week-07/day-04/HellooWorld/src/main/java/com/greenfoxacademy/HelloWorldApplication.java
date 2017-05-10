package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{
	@Autowired
	HelloWorld hello;
	@Autowired
	RedColor red;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		hello.setMessage("Hello World!");
		hello.getMessage();
		red.printColor();
	}
}
