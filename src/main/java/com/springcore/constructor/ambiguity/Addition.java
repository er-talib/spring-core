package com.springcore.constructor.ambiguity;

public class Addition {

	 int number1;
     int number2;

	public void Addition(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;

		System.out.println("This is int constructor");
	}

	public void Addition(double number1, double number2) {
		this.number1 = (int) number1;
		this.number2 = (int) number2;

		System.out.println("This is  double constructor");

	}
	
	public void Addition(String number1, String number2) {
		this.number1 =  Integer.parseInt(number1);
		this.number2 =Integer.parseInt(number2);

		System.out.println("This is  double constructor");

	}

	public void doSum() {
		System.out.println("Sum is: " + (this.number1 + this.number2));
	}

}
