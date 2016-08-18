package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * State of available php versions for this account
 */

public class PhpVersion { 

	private java.lang.String support;
	private java.lang.String version;

	public PhpVersion() {
	}

	public java.lang.String getSupport() { 
		return this.support;
	} 

	public void setSupport(java.lang.String support) { 
		this.support = support;
	} 

	public PhpVersion support(java.lang.String support) { 
		this.support = support;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public PhpVersion version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
