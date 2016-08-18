package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Represents an address
 */

public class Address { 

	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street street;
	private java.lang.String floor;
	private java.lang.String stair;
	private java.lang.String residence;
	private net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City city;
	private java.lang.String streetNumber;
	private java.lang.String door;
	private java.lang.String building;

	public Address() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street getStreet() { 
		return this.street;
	} 

	public void setStreet(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street street) { 
		this.street = street;
	} 

	public Address street(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street street) { 
		this.street = street;
		return this;
	} 

	public java.lang.String getFloor() { 
		return this.floor;
	} 

	public void setFloor(java.lang.String floor) { 
		this.floor = floor;
	} 

	public Address floor(java.lang.String floor) { 
		this.floor = floor;
		return this;
	} 

	public java.lang.String getStair() { 
		return this.stair;
	} 

	public void setStair(java.lang.String stair) { 
		this.stair = stair;
	} 

	public Address stair(java.lang.String stair) { 
		this.stair = stair;
		return this;
	} 

	public java.lang.String getResidence() { 
		return this.residence;
	} 

	public void setResidence(java.lang.String residence) { 
		this.residence = residence;
	} 

	public Address residence(java.lang.String residence) { 
		this.residence = residence;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City getCity() { 
		return this.city;
	} 

	public void setCity(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City city) { 
		this.city = city;
	} 

	public Address city(net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City city) { 
		this.city = city;
		return this;
	} 

	public java.lang.String getStreetNumber() { 
		return this.streetNumber;
	} 

	public void setStreetNumber(java.lang.String streetNumber) { 
		this.streetNumber = streetNumber;
	} 

	public Address streetNumber(java.lang.String streetNumber) { 
		this.streetNumber = streetNumber;
		return this;
	} 

	public java.lang.String getDoor() { 
		return this.door;
	} 

	public void setDoor(java.lang.String door) { 
		this.door = door;
	} 

	public Address door(java.lang.String door) { 
		this.door = door;
		return this;
	} 

	public java.lang.String getBuilding() { 
		return this.building;
	} 

	public void setBuilding(java.lang.String building) { 
		this.building = building;
	} 

	public Address building(java.lang.String building) { 
		this.building = building;
		return this;
	} 

}
