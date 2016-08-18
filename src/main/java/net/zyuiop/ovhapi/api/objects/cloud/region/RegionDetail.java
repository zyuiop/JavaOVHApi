package net.zyuiop.ovhapi.api.objects.cloud.region;

/**
 * RegionDetail
 */

public class RegionDetail { 

	private java.lang.String continentCode;
	private java.lang.String name;

	public RegionDetail() {
	}

	public java.lang.String getContinentCode() { 
		return this.continentCode;
	} 

	public void setContinentCode(java.lang.String continentCode) { 
		this.continentCode = continentCode;
	} 

	public RegionDetail continentCode(java.lang.String continentCode) { 
		this.continentCode = continentCode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RegionDetail name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
