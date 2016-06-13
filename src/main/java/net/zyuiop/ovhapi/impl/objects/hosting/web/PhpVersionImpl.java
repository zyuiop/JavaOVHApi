package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.PhpVersion;
/**
 * State of available php versions for this account
 */

public class PhpVersionImpl implements PhpVersion { 

	private java.lang.String support;
	private java.lang.String version;

	public PhpVersionImpl() {
	}

	public java.lang.String getSupport() { 
		return this.support;
	} 

	public void setSupport(java.lang.String support) { 
		this.support = support;
	} 

	public PhpVersionImpl support(java.lang.String support) { 
		this.support = support;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public PhpVersionImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
