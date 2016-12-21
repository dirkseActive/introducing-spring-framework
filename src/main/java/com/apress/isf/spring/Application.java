package com.apress.isf.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan
/**
 * 
 * 12/13/2016  Created from the first chapter of Introducing spring framework
 * 12/21/2016  Updated this messaging
 * 
 */

public class Application {
	@Bean
	MessageService helloWorldMessageService(){
		return new HelloWorldMessage();
	}
	
	public static void main(String[] args){
		ApplicationContext context =
				new AnnotationConfigApplicationContext(Application.class);
		
		MessageService service =
				context.getBean(MessageService.class);
		System.out.println(service.getMessage());
	}

}
