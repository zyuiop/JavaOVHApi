package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.Endpoint;
/**
 * Endpoint
 */

public class EndpointImpl implements Endpoint { 

	private java.lang.String region_id;
	private java.lang.String interface;
	private java.lang.String url;
	private java.lang.String id;
	private java.lang.String legacy_endpoint_id;

	public EndpointImpl() {
	}

	public java.lang.String getRegion_id() { 
		return this.region_id;
	} 

	public void setRegion_id(java.lang.String region_id) { 
		this.region_id = region_id;
	} 

	public EndpointImpl region_id(java.lang.String region_id) { 
		this.region_id = region_id;
		return this;
	} 

	public java.lang.String getInterface() { 
		return this.interface;
	} 

	public void setInterface(java.lang.String interface) { 
		this.interface = interface;
	} 

	public EndpointImpl interface(java.lang.String interface) { 
		this.interface = interface;
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

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public EndpointImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLegacy_endpoint_id() { 
		return this.legacy_endpoint_id;
	} 

	public void setLegacy_endpoint_id(java.lang.String legacy_endpoint_id) { 
		this.legacy_endpoint_id = legacy_endpoint_id;
	} 

	public EndpointImpl legacy_endpoint_id(java.lang.String legacy_endpoint_id) { 
		this.legacy_endpoint_id = legacy_endpoint_id;
		return this;
	} 

}
