package com.springcore.reference.type;

import java.util.Map;

public class Part {

	private int howManyEngine;
	private String nameOfCompany;
	private Map<String, String> validity;
	
	
	public Part() {
		super();
		
	}
	
	
	public int getHowManyEngine() {
		return howManyEngine;
	}
	public void setHowManyEngine(int howManyEngine) {
		this.howManyEngine = howManyEngine;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public Map<String, String> getValidity() {
		return validity;
	}
	public void setValidity(Map<String, String> validity) {
		this.validity = validity;
	}
	
	
	@Override
	public String toString() {
		return "Part [howManyEngine=" + howManyEngine + ", nameOfCompany=" + nameOfCompany + ", validity=" + validity
				+ "]";
	}
	
	
}
