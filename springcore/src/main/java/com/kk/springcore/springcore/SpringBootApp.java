package com.kk.springcore.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication
public class SpringBootApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext  context=SpringApplication.run(SpringBootApp.class, args);
		
//		System.out.println("Contxt : "+ context+" ApplicationName : "+context.getBean(Hello.class));
		
//		Hello hello=context.getBean(Hello.class);
//		hello.happy();
	}
	
}
