package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Informations related to phone capabilities
 */

public class LinePhone { 

	private java.lang.String protocol;
	private long maxline;
	private java.lang.String brand;

	public LinePhone() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public LinePhone protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public long getMaxline() { 
		return this.maxline;
	} 

	public void setMaxline(long maxline) { 
		this.maxline = maxline;
	} 

	public LinePhone maxline(long maxline) { 
		this.maxline = maxline;
		return this;
	} 

	public java.lang.String getBrand() { 
		return this.brand;
	} 

	public void setBrand(java.lang.String brand) { 
		this.brand = brand;
	} 

	public LinePhone brand(java.lang.String brand) { 
		this.brand = brand;
		return this;
	} 

}
