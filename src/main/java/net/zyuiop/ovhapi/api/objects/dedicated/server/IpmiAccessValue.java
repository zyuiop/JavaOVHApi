package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing ipmi access value
 */

public class IpmiAccessValue { 

	private java.lang.String value;
	private java.util.Date expiration;

	public IpmiAccessValue() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public IpmiAccessValue value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public IpmiAccessValue expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
