package net.zyuiop.ovhapi.impl.objects.cdn.website;

import net.zyuiop.ovhapi.api.objects.cdn.website.Zone;
/**
 * Zone on CDN
 */

public class ZoneImpl implements Zone { 

	private java.lang.String zone;
	private java.lang.String status;

	public ZoneImpl() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public ZoneImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public ZoneImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
