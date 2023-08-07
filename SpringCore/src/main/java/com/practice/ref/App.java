package com.practice.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/ref/config.xml");
		Student st = context.getBean("st",Student.class);
		
		System.out.println(st.getName());
		System.out.println(st.getAddress().getCity());

	}

}
