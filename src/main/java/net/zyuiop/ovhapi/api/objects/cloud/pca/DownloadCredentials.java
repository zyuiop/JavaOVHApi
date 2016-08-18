package net.zyuiop.ovhapi.api.objects.cloud.pca;

/**
 * Openstack swift credentials for your PCA offer
 */

public class DownloadCredentials { 

	private java.lang.String tenantName;
	private java.lang.String region;
	private java.lang.String container;
	private java.lang.String login;
	private java.lang.String tenantId;
	private java.lang.String password;
	private java.lang.String storageEndpoint;
	private java.lang.String authEndpoint;

	public DownloadCredentials() {
	}

	public java.lang.String getTenantName() { 
		return this.tenantName;
	} 

	public void setTenantName(java.lang.String tenantName) { 
		this.tenantName = tenantName;
	} 

	public DownloadCredentials tenantName(java.lang.String tenantName) { 
		this.tenantName = tenantName;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public DownloadCredentials region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getContainer() { 
		return this.container;
	} 

	public void setContainer(java.lang.String container) { 
		this.container = container;
	} 

	public DownloadCredentials container(java.lang.String container) { 
		this.container = container;
		return this;
	} 

	public java.lang.String getLogin() { 
		return this.login;
	} 

	public void setLogin(java.lang.String login) { 
		this.login = login;
	} 

	public DownloadCredentials login(java.lang.String login) { 
		this.login = login;
		return this;
	} 

	public java.lang.String getTenantId() { 
		return this.tenantId;
	} 

	public void setTenantId(java.lang.String tenantId) { 
		this.tenantId = tenantId;
	} 

	public DownloadCredentials tenantId(java.lang.String tenantId) { 
		this.tenantId = tenantId;
		return this;
	} 

	public java.lang.String getPassword() { 
		return this.password;
	} 

	public void setPassword(java.lang.String password) { 
		this.password = password;
	} 

	public DownloadCredentials password(java.lang.String password) { 
		this.password = password;
		return this;
	} 

	public java.lang.String getStorageEndpoint() { 
		return this.storageEndpoint;
	} 

	public void setStorageEndpoint(java.lang.String storageEndpoint) { 
		this.storageEndpoint = storageEndpoint;
	} 

	public DownloadCredentials storageEndpoint(java.lang.String storageEndpoint) { 
		this.storageEndpoint = storageEndpoint;
		return this;
	} 

	public java.lang.String getAuthEndpoint() { 
		return this.authEndpoint;
	} 

	public void setAuthEndpoint(java.lang.String authEndpoint) { 
		this.authEndpoint = authEndpoint;
	} 

	public DownloadCredentials authEndpoint(java.lang.String authEndpoint) { 
		this.authEndpoint = authEndpoint;
		return this;
	} 

}
