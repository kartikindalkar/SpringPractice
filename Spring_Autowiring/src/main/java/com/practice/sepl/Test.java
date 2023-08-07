package com.practice.sepl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/sepl/config.xml");
		
		Student st = context.getBean("student", Student.class);
		System.out.println(st);
		System.out.println(st.checkternary);
		
		System.out.println(st.num);
	}

}
