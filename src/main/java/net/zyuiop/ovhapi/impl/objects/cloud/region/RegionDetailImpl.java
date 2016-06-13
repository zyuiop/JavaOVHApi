package net.zyuiop.ovhapi.impl.objects.cloud.region;

import net.zyuiop.ovhapi.api.objects.cloud.region.RegionDetail;
/**
 * RegionDetail
 */

public class RegionDetailImpl implements RegionDetail { 

	private java.lang.String continentCode;
	private java.lang.String name;

	public RegionDetailImpl() {
	}

	public java.lang.String getContinentCode() { 
		return this.continentCode;
	} 

	public void setContinentCode(java.lang.String continentCode) { 
		this.continentCode = continentCode;
	} 

	public RegionDetailImpl continentCode(java.lang.String continentCode) { 
		this.continentCode = continentCode;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public RegionDetailImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
