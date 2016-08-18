package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Manage DynHost login
 */

public class DynHostLogin { 

	private java.lang.String zone;
	private java.lang.String subDomain;
	private java.lang.String login;

	public DynHostLogin() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public DynHostLogin zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public DynHostLogin subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public DynHostLogin login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

}
