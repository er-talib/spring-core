package com.springcore.listtype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProduct {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/listtype/product.xml");
		ProductDetails pd = (ProductDetails) context.getBean("details");
        
		System.out.println(pd.getName());
		System.out.println(pd.getType());
		System.out.println(pd.getWheel());
		System.out.println(pd.getValidity());
		
	}

}
