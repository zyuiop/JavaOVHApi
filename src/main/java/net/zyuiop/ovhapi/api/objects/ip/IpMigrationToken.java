package net.zyuiop.ovhapi.api.objects.ip;

/**
 * IP migration to OVH
 */

public class IpMigrationToken { 

	private java.lang.String customerId;
	private java.lang.String token;

	public IpMigrationToken() {
	}

	public java.lang.String getCustomerId() { 
		return this.customerId;
	} 

	public void setCustomerId(java.lang.String customerId) { 
		this.customerId = customerId;
	} 

	public IpMigrationToken customerId(java.lang.String customerId) { 
		this.customerId = customerId;
		return this;
	} 

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public IpMigrationToken token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

}
