package com.practice.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/primitives/config.xml");
		
		Student st=context.getBean("st3",Student.class);
		System.out.println(st);
		
	}

}
 