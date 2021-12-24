package com.springcore.reference.type;

public class Car {
	
	private int wheel ;
	private String name ;
	private Part engine;

	public Car() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", name=" + name + ", engine=" + engine + "]";
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
	public Part getEngine() {
		return engine;
	}
	public void setEngine(Part engine) {
		this.engine = engine;
	}
	
	

}
