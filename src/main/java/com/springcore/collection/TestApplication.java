package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/coll.xml");
		Employee emp = (Employee) context.getBean("emp");
		
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhone());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());

	}

}
