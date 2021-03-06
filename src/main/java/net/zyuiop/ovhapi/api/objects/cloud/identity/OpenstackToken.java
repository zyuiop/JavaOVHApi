package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * OpenstackToken
 */

public class OpenstackToken { 

	private net.zyuiop.ovhapi.api.objects.cloud.identity.Role[] roles;
	private net.zyuiop.ovhapi.api.objects.cloud.identity.Catalog[] catalog;
	private java.util.Date expires_at;
	private net.zyuiop.ovhapi.api.objects.cloud.identity.TokenProject project;
	private java.util.Date issued_at;
	private java.lang.String[] methods;
	private net.zyuiop.ovhapi.api.objects.cloud.identity.UserToken user;

	public OpenstackToken() {
	}

	public net.zyuiop.ovhapi.api.objects.cloud.identity.Role[] getRoles() { 
		return this.roles;
	} 

	public void setRoles(net.zyuiop.ovhapi.api.objects.cloud.identity.Role[] roles) { 
		this.roles = roles;
	} 

	public OpenstackToken roles(net.zyuiop.ovhapi.api.objects.cloud.identity.Role[] roles) { 
		this.roles = roles;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.identity.Catalog[] getCatalog() { 
		return this.catalog;
	} 

	public void setCatalog(net.zyuiop.ovhapi.api.objects.cloud.identity.Catalog[] catalog) { 
		this.catalog = catalog;
	} 

	public OpenstackToken catalog(net.zyuiop.ovhapi.api.objects.cloud.identity.Catalog[] catalog) { 
		this.catalog = catalog;
		return this;
	} 

	public java.util.Date getExpires_at() { 
		return this.expires_at;
	} 

	public void setExpires_at(java.util.Date expires_at) { 
		this.expires_at = expires_at;
	} 

	public OpenstackToken expires_at(java.util.Date expires_at) { 
		this.expires_at = expires_at;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.identity.TokenProject getProject() { 
		return this.project;
	} 

	public void setProject(net.zyuiop.ovhapi.api.objects.cloud.identity.TokenProject project) { 
		this.project = project;
	} 

	public OpenstackToken project(net.zyuiop.ovhapi.api.objects.cloud.identity.TokenProject project) { 
		this.project = project;
		return this;
	} 

	public java.util.Date getIssued_at() { 
		return this.issued_at;
	} 

	public void setIssued_at(java.util.Date issued_at) { 
		this.issued_at = issued_at;
	} 

	public OpenstackToken issued_at(java.util.Date issued_at) { 
		this.issued_at = issued_at;
		return this;
	} 

	public java.lang.String[] getMethods() { 
		return this.methods;
	} 

	public void setMethods(java.lang.String[] methods) { 
		this.methods = methods;
	} 

	public OpenstackToken methods(java.lang.String[] methods) { 
		this.methods = methods;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.identity.UserToken getUser() { 
		return this.user;
	} 

	public void setUser(net.zyuiop.ovhapi.api.objects.cloud.identity.UserToken user) { 
		this.user = user;
	} 

	public OpenstackToken user(net.zyuiop.ovhapi.api.objects.cloud.identity.UserToken user) { 
		this.user = user;
		return this;
	} 

}
