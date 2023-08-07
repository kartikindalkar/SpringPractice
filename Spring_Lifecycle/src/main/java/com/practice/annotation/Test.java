package com.practice.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/practice/annotation/config.xml");
		context.registerShutdownHook();//That will used for call the destroy method from Spring Life Cycle.
		Student student = context.getBean("st",Student.class);
		System.out.println(student);
		

	}

}
