package com.springcore.lifecycle.method.by.interfac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/method/by/interfac/interconf.xml");
		context.registerShutdownHook();
		
		Product pd = (Product) context.getBean("pro");
		
		System.out.println(pd);

	}

}
