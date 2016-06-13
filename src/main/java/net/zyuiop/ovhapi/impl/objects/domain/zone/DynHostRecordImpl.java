package net.zyuiop.ovhapi.impl.objects.domain.zone;

import net.zyuiop.ovhapi.api.objects.domain.zone.DynHostRecord;
/**
 * DynHost record
 */

public class DynHostRecordImpl implements DynHostRecord { 

	private java.lang.String ip;
	private java.lang.String zone;
	private long id;
	private java.lang.String subDomain;

	public DynHostRecordImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public DynHostRecordImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public DynHostRecordImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DynHostRecordImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public DynHostRecordImpl subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

}
