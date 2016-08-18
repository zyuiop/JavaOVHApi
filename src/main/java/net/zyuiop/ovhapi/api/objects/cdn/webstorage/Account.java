package net.zyuiop.ovhapi.api.objects.cdn.webstorage;

/**
 * Static CDN
 */

public class Account { 

	private java.lang.String domain;
	private long storageLimit;
	private java.lang.String server;

	public Account() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Account domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getStorageLimit() { 
		return this.storageLimit;
	} 

	public void setStorageLimit(long storageLimit) { 
		this.storageLimit = storageLimit;
	} 

	public Account storageLimit(long storageLimit) { 
		this.storageLimit = storageLimit;
		return this;
	} 

	public java.lang.String getServer() { 
		return this.server;
	} 

	public void setServer(java.lang.String server) { 
		this.server = server;
	} 

	public Account server(java.lang.String server) { 
		this.server = server;
		return this;
	} 

}
