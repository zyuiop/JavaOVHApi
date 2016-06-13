package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.LinePhone;
/**
 * Informations related to phone capabilities
 */

public class LinePhoneImpl implements LinePhone { 

	private java.lang.String protocol;
	private long maxline;
	private java.lang.String brand;

	public LinePhoneImpl() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public LinePhoneImpl protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public long getMaxline() { 
		return this.maxline;
	} 

	public void setMaxline(long maxline) { 
		this.maxline = maxline;
	} 

	public LinePhoneImpl maxline(long maxline) { 
		this.maxline = maxline;
		return this;
	} 

	public java.lang.String getBrand() { 
		return this.brand;
	} 

	public void setBrand(java.lang.String brand) { 
		this.brand = brand;
	} 

	public LinePhoneImpl brand(java.lang.String brand) { 
		this.brand = brand;
		return this;
	} 

}
