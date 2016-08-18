package net.zyuiop.ovhapi.api.objects.cdn.website;

/**
 * Zone on CDN
 */

public class Zone { 

	private java.lang.String zone;
	private java.lang.String status;

	public Zone() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public Zone zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Zone status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
