package com.practice.sepl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{2+3}")
	public int sum;
	
	@Value("#{5-3}")
	public int sub;
	
	@Value("#{3*3}")
	public int mul;
	
	@Value("#{12/3}")
	public int div;

	@Value("#{2>3 ? 'Yes' : 'No'}")
	public String checkternary;
	
	@Value("#{T(java.lang.Math).sqrt(121)}")//We can call new method independantly.
	public int num;
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + "]";
	}
	
	
	
}
