package net.zyuiop.ovhapi.impl.objects.cloud.storage;

import net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint;
/**
 * Endpoint
 */

public class EndpointImpl implements Endpoint { 

	private java.lang.String region;
	private java.lang.String url;

	public EndpointImpl() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public EndpointImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public EndpointImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
