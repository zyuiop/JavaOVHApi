package net.zyuiop.ovhapi.impl.objects.cloud.storage;

import net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerAccess;
/**
 * ContainerAccess
 */

public class ContainerAccessImpl implements ContainerAccess { 

	private java.lang.String token;
	private net.zyuiop.ovhapi.impl.objects.cloud.storage.EndpointImpl[] endpoints;

	public ContainerAccessImpl() {
	}

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public ContainerAccessImpl token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.storage.EndpointImpl[] getEndpoints() { 
		return this.endpoints;
	} 

	public void setEndpoints(net.zyuiop.ovhapi.impl.objects.cloud.storage.EndpointImpl[] endpoints) { 
		this.endpoints = endpoints;
	} 

	public ContainerAccessImpl endpoints(net.zyuiop.ovhapi.impl.objects.cloud.storage.EndpointImpl[] endpoints) { 
		this.endpoints = endpoints;
		return this;
	} 

}
