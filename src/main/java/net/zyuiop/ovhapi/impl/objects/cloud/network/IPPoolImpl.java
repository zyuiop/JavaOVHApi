package net.zyuiop.ovhapi.impl.objects.cloud.network;

import net.zyuiop.ovhapi.api.objects.cloud.network.IPPool;
/**
 * IPPool
 */

public class IPPoolImpl implements IPPool { 

	private java.lang.String region;
	private java.lang.String end;
	private java.lang.String start;

	public IPPoolImpl() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public IPPoolImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getEnd() { 
		return this.end;
	} 

	public void setEnd(java.lang.String end) { 
		this.end = end;
	} 

	public IPPoolImpl end(java.lang.String end) { 
		this.end = end;
		return this;
	} 

	public java.lang.String getStart() { 
		return this.start;
	} 

	public void setStart(java.lang.String start) { 
		this.start = start;
	} 

	public IPPoolImpl start(java.lang.String start) { 
		this.start = start;
		return this;
	} 

}
