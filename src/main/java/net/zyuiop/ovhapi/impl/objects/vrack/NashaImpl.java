package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.Nasha;
/**
 * vrack (1.5) nasha server interfaces
 */

public class NashaImpl implements Nasha { 

	private java.lang.String serviceIp;
	private java.lang.String zpool;

	public NashaImpl() {
	}

	public java.lang.String getServiceIp() { 
		return this.serviceIp;
	} 

	public void setServiceIp(java.lang.String serviceIp) { 
		this.serviceIp = serviceIp;
	} 

	public NashaImpl serviceIp(java.lang.String serviceIp) { 
		this.serviceIp = serviceIp;
		return this;
	} 

	public java.lang.String getZpool() { 
		return this.zpool;
	} 

	public void setZpool(java.lang.String zpool) { 
		this.zpool = zpool;
	} 

	public NashaImpl zpool(java.lang.String zpool) { 
		this.zpool = zpool;
		return this;
	} 

}
