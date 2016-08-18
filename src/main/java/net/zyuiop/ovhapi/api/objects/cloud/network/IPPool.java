package net.zyuiop.ovhapi.api.objects.cloud.network;

/**
 * IPPool
 */

public class IPPool { 

	private java.lang.String region;
	private java.lang.String end;
	private java.lang.String start;

	public IPPool() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public IPPool region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getEnd() { 
		return this.end;
	} 

	public void setEnd(java.lang.String end) { 
		this.end = end;
	} 

	public IPPool end(java.lang.String end) { 
		this.end = end;
		return this;
	} 

	public java.lang.String getStart() { 
		return this.start;
	} 

	public void setStart(java.lang.String start) { 
		this.start = start;
	} 

	public IPPool start(java.lang.String start) { 
		this.start = start;
		return this;
	} 

}
