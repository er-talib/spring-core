package com.springcore.constructor.injuction;

public class Person {

	private String name ;
	private String phone;
	private String city;
	
	public Person(String name , String phone , String city) {
		 this.name = name;
		 this.phone = phone;
		 this.city  =city;
 
	}
	
	public String toString() {
		
		return "Name" + " " + this.name +  "\n" + "Phone" + " " + this.phone + "\n" +  "City"  + " " + this.city ;
				
	}
	
	
//	   Same output both toString method 
	
//	public String toString() {
//		
//		return "Name" + " " + name +  "\n" + "Phone" + " " + phone + "\n" +  "City"  + " " + city ;
//	}
}
