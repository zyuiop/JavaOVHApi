package net.zyuiop.ovhapi.impl.objects.domain.zone;

import net.zyuiop.ovhapi.api.objects.domain.zone.DynHostLogin;
/**
 * Manage DynHost login
 */

public class DynHostLoginImpl implements DynHostLogin { 

	private java.lang.String zone;
	private java.lang.String subDomain;
	private java.lang.String login;

	public DynHostLoginImpl() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public DynHostLoginImpl zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public DynHostLoginImpl subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public DynHostLoginImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

}
