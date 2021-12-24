package com.springcore.constructor.reference.injuction;

public class Room {

	public String size;
	public String roomName ;
	
	
	@Override
	public String toString() {
		return "Room [size=" + size + ", roomName=" + roomName + "]";
	}


	public Room(String size, String roomName) {
		super();
		this.size = size;
		this.roomName = roomName;
	}
}
