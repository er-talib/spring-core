package com.springcore.lifecycle.method;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMan {

	public static void main(String[] args) {
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/method/manconf.xml");
    Man m = (Man) context.getBean("man");
    context.registerShutdownHook();
    System.out.println(m);
	}

}
