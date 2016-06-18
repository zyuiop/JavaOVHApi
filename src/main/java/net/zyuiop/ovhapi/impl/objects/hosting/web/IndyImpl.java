package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.Indy;
/**
 * Hosting indys
 */

public class IndyImpl implements Indy { 

	private java.lang.String[] attachedDomains;
	private java.lang.String home;
	private java.lang.String login;
	private java.lang.String state;

	public IndyImpl() {
	}

	public java.lang.String[] getAttachedDomains() { 
		return this.attachedDomains;
	} 

	public void setAttachedDomains(java.lang.String[] attachedDomains) { 
		this.attachedDomains = attachedDomains;
	} 

	public IndyImpl attachedDomains(java.lang.String[] attachedDomains) { 
		this.attachedDomains = attachedDomains;
		return this;
	} 

	public java.lang.String getHome() { 
		return this.home;
	} 

	public void setHome(java.lang.String home) { 
		this.home = home;
	} 

	public IndyImpl home(java.lang.String home) { 
		this.home = home;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public IndyImpl login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public IndyImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
