package com.springcore.lifecycle.method;

public class Man {

	private String work;
	private String name;

	public Man() {
		super();

	}
	

public Man(String work, String name) {
		super();
		this.work = work;
		this.name = name;
	}


//	public String getWork() {
//		return work;
//	}
//
//	public void setWork(String work) {
//		this.work = work;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		return "Man [work=" + work + ", name=" + name + "]";
	}
	
	public void init()
	{
		System.out.println("this  is init mathod");
		
	}

	public void destroy() {
		System.out.println("this is destroy method");
	}
}
