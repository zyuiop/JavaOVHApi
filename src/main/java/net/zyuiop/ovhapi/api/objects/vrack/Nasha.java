package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack (1.5) nasha server interfaces
 */

public class Nasha { 

	private java.lang.String serviceIp;
	private java.lang.String zpool;

	public Nasha() {
	}

	public java.lang.String getServiceIp() { 
		return this.serviceIp;
	} 

	public void setServiceIp(java.lang.String serviceIp) { 
		this.serviceIp = serviceIp;
	} 

	public Nasha serviceIp(java.lang.String serviceIp) { 
		this.serviceIp = serviceIp;
		return this;
	} 

	public java.lang.String getZpool() { 
		return this.zpool;
	} 

	public void setZpool(java.lang.String zpool) { 
		this.zpool = zpool;
	} 

	public Nasha zpool(java.lang.String zpool) { 
		this.zpool = zpool;
		return this;
	} 

}
