package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken;
/**
 * IP migration to OVH
 */

public class IpMigrationTokenImpl implements IpMigrationToken { 

	private java.lang.String customerId;
	private java.lang.String token;

	public IpMigrationTokenImpl() {
	}

	public java.lang.String getCustomerId() { 
		return this.customerId;
	} 

	public void setCustomerId(java.lang.String customerId) { 
		this.customerId = customerId;
	} 

	public IpMigrationTokenImpl customerId(java.lang.String customerId) { 
		this.customerId = customerId;
		return this;
	} 

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public IpMigrationTokenImpl token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

}
