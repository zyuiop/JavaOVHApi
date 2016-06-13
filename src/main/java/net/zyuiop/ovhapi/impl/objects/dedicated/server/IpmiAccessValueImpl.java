package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiAccessValue;
/**
 * A structure describing ipmi access value
 */

public class IpmiAccessValueImpl implements IpmiAccessValue { 

	private java.lang.String value;
	private java.util.Date expiration;

	public IpmiAccessValueImpl() {
	}

	public java.lang.String getValue() { 
		return this.value;
	} 

	public void setValue(java.lang.String value) { 
		this.value = value;
	} 

	public IpmiAccessValueImpl value(java.lang.String value) { 
		this.value = value;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public IpmiAccessValueImpl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
