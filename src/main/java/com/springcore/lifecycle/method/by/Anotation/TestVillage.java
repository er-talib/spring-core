package com.springcore.lifecycle.method.by.Anotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVillage {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/method/by/Anotation/anotconf.xml");

		context.registerShutdownHook();
		Village vi = (Village) context.getBean("vill");
		System.out.println(vi);
	}

}
