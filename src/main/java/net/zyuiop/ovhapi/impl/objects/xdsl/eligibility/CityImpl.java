package net.zyuiop.ovhapi.impl.objects.xdsl.eligibility;

import net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City;
/**
 * Represents a city
 */

public class CityImpl implements City { 

	private java.lang.String zipCode;
	private java.lang.String name;
	private java.lang.String inseeCode;

	public CityImpl() {
	}

	public java.lang.String getZipCode() { 
		return this.zipCode;
	} 

	public void setZipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
	} 

	public CityImpl zipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public CityImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getInseeCode() { 
		return this.inseeCode;
	} 

	public void setInseeCode(java.lang.String inseeCode) { 
		this.inseeCode = inseeCode;
	} 

	public CityImpl inseeCode(java.lang.String inseeCode) { 
		this.inseeCode = inseeCode;
		return this;
	} 

}
