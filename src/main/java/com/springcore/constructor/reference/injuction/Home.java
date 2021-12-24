package com.springcore.constructor.reference.injuction;

public class Home {
	
	private String land;
	private int purches;
	private String city;
	private Room room;
	
	public Home(String land, int purches, String city, Room room) {
		super();
		this.land = land;
		this.purches = purches;
		this.city = city;
		this.room = room;
	}

	@Override
	public String toString() {
		return "Home" +"\n" + "[land=" + land + ", purches=" + purches + ", city=" + city + ", ]" + "\n" + " [room=" + room + "]";
	}
	
	
	
	

}
