package net.zyuiop.ovhapi.api.objects.cdn.webstorage;

/**
 * A structure with credentials for using openstack account
 */

public class AccountCredentials { 

	private java.lang.String password;
	private java.lang.String tenant;
	private java.lang.String login;
	private java.lang.String endpoint;

	public AccountCredentials() {
	}

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public AccountCredentials password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getTenant() { 
		return this.tenant;
	} 

	public void setTenant(java.lang.String tenant) { 
		this.tenant = tenant;
	} 

	public AccountCredentials tenant(java.lang.String tenant) { 
		this.tenant = tenant;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public AccountCredentials login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getEndpoint() { 
		return this.endpoint;
	} 

	public void setEndpoint(java.lang.String endpoint) { 
		this.endpoint = endpoint;
	} 

	public AccountCredentials endpoint(java.lang.String endpoint) { 
		this.endpoint = endpoint;
		return this;
	} 

}
