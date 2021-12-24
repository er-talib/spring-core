package com.springcore.test;

public class Car {
	
	private int wheel;
	private String name;
	private String company;
	
	
	public Car(int wheel, String name, String company) {
		super();
		this.wheel = wheel;
		this.name = name;
		this.company = company;
	}


	public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		this.wheel = wheel;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", name=" + name + ", company=" + company + "]";
	}


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
