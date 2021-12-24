package com.springcore.listtype;

import java.util.List;
import java.util.Map;

import java.util.Set;

public class ProductDetails {
	
	private String name ;
	private List<String> wheel; 
	private Set<String> type ;
	private Map<String , String> validity;
	
	public ProductDetails() {
		super();
		
	}

	public ProductDetails(String name, List<String> wheel, Set<String> type, Map<String, String> validity) {
		super();
		this.name = name;
		this.wheel = wheel;
		this.type = type;
		this.validity = validity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getWheel() {
		return wheel;
	}

	public void setWheel(List<String> wheel) {
		this.wheel = wheel;
	}

	public Set<String> getType() {
		return type;
	}

	public void setType(Set<String> type) {
		this.type = type;
	}

	public Map<String, String> getValidity() {
		return validity;
	}

	public void setValidity(Map<String, String> validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "ProductDetails [name=" + name + ", wheel=" + wheel + ", type=" + type + ", validity=" + validity + "]";
	}


}