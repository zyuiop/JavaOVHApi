package net.zyuiop.ovhapi.api.objects.iploadbalancing.ip;

/**
 * ProbeIp mapping
 */

public class ProbeIp { 

	private java.lang.String zone;
	private java.lang.String[] ip;

	public ProbeIp() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public ProbeIp zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String[] getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String[] ip) { 
		this.ip = ip;
	} 

	public ProbeIp ip(java.lang.String[] ip) { 
		this.ip = ip;
		return this;
	} 

}
