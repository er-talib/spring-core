package com.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCat {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/test/NewFile.xml");
        Car c = (Car) context.getBean("car");
		
        System.out.println(c);
	}

}
