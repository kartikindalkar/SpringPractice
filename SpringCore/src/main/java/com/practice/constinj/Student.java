package com.practice.constinj;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<String> course;
	private Certificate certificate;
	
	
	
	public Student(int id, String name, List<String> course, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.certificate = certificate;
	}



	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", certificate=" + certificate + "]";
	}



	
	
	

}
