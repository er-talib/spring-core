package com.springcore.lifecycle.method.by.Anotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Village {
	
	private  String area;
	private String name;
//	public Village() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Village [area=" + area + ", name=" + name + "]";
	}
	
	@PostConstruct	
	public void init() {
		System.out.println("This is init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println(("This is destroy method"));
	}
	
	

}
