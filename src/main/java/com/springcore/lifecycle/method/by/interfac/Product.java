package com.springcore.lifecycle.method.by.interfac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean, DisposableBean {
	
	
	private int price ;
	private String name;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}
	public void destroy() throws Exception {
		
		System.out.println("this is destroy method ");
	}
	public void afterPropertiesSet() throws Exception {
	
		System.out.println("This is init method");
	}
	
	
	

}
