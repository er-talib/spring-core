package com.springcore.constructor.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddition {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/ambiguity/conf.xml");
		Addition ad = (Addition) context.getBean("sum");
	ad.doSum();
	
	}

}
