package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.RtmRaid;
/**
 * Server raid informations
 */

public class RtmRaidImpl implements RtmRaid { 

	private java.lang.String unit;

	public RtmRaidImpl() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public RtmRaidImpl unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

}
