package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * DynHost record
 */

public class DynHostRecord { 

	private java.lang.String ip;
	private java.lang.String zone;
	private long id;
	private java.lang.String subDomain;

	public DynHostRecord() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DynHostRecord ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public DynHostRecord zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DynHostRecord id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public DynHostRecord subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

}
