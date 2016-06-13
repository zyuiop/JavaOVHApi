package net.zyuiop.ovhapi.impl.objects.cloud.storage;

import net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerAccess;
/**
 * ContainerAccess
 */

public class ContainerAccessImpl implements ContainerAccess { 

	private java.lang.String token;
	private net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint endpoints;

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

	public net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint getEndpoints() { 
		return this.endpoints;
	} 

	public void setEndpoints(net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint endpoints) { 
		this.endpoints = endpoints;
	} 

	public ContainerAccessImpl endpoints(net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint endpoints) { 
		this.endpoints = endpoints;
		return this;
	} 

}
