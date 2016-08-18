package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server raid informations
 */

public class RtmRaid { 

	private java.lang.String unit;

	public RtmRaid() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public RtmRaid unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

}
