package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * ContainerAccess
 */

public class ContainerAccess { 

	private java.lang.String token;
	private net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint[] endpoints;

	public ContainerAccess() {
	}

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public ContainerAccess token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint[] getEndpoints() { 
		return this.endpoints;
	} 

	public void setEndpoints(net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint[] endpoints) { 
		this.endpoints = endpoints;
	} 

	public ContainerAccess endpoints(net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint[] endpoints) { 
		this.endpoints = endpoints;
		return this;
	} 

}
