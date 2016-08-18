package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Represents a city
 */

public class City { 

	private java.lang.String zipCode;
	private java.lang.String name;
	private java.lang.String inseeCode;

	public City() {
	}

	public java.lang.String getZipCode() { 
		return this.zipCode;
	} 

	public void setZipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
	} 

	public City zipCode(java.lang.String zipCode) { 
		this.zipCode = zipCode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public City name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getInseeCode() { 
		return this.inseeCode;
	} 

	public void setInseeCode(java.lang.String inseeCode) { 
		this.inseeCode = inseeCode;
	} 

	public City inseeCode(java.lang.String inseeCode) { 
		this.inseeCode = inseeCode;
		return this;
	} 

}
