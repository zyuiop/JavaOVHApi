package net.zyuiop.ovhapi.impl.objects.auth;

import net.zyuiop.ovhapi.api.objects.auth.AccessRule;
/**
 * Access rule required for the application
 */

public class AccessRuleImpl implements AccessRule { 

	private java.lang.String method;
	private java.lang.String path;

	public AccessRuleImpl() {
	}

	public java.lang.String getMethod() { 
		return this.method;
	} 

	public void setMethod(java.lang.String method) { 
		this.method = method;
	} 

	public AccessRuleImpl method(java.lang.String method) { 
		this.method = method;
		return this;
	} 

	public java.lang.String getPath() { 
		return this.path;
	} 

	public void setPath(java.lang.String path) { 
		this.path = path;
	} 

	public AccessRuleImpl path(java.lang.String path) { 
		this.path = path;
		return this;
	} 

}
