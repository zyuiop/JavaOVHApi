package net.zyuiop.ovhapi.api.objects.auth;

/**
 * Access rule required for the application
 */

public class AccessRule { 

	private java.lang.String method;
	private java.lang.String path;

	public AccessRule() {
	}

	public java.lang.String getMethod() { 
		return this.method;
	} 

	public void setMethod(java.lang.String method) { 
		this.method = method;
	} 

	public AccessRule method(java.lang.String method) { 
		this.method = method;
		return this;
	} 

	public java.lang.String getPath() { 
		return this.path;
	} 

	public void setPath(java.lang.String path) { 
		this.path = path;
	} 

	public AccessRule path(java.lang.String path) { 
		this.path = path;
		return this;
	} 

}
