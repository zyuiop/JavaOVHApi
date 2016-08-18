package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Endpoint
 */

public class Endpoint { 

	private java.lang.String region_id;
	private java.lang.String _interface;
	private java.lang.String url;
	private java.lang.String id;
	private java.lang.String legacy_endpoint_id;

	public Endpoint() {
	}

	public java.lang.String getRegion_id() { 
		return this.region_id;
	} 

	public void setRegion_id(java.lang.String region_id) { 
		this.region_id = region_id;
	} 

	public Endpoint region_id(java.lang.String region_id) { 
		this.region_id = region_id;
		return this;
	} 

	public java.lang.String getInterface() { 
		return this._interface;
	} 

	public void setInterface(java.lang.String _interface) { 
		this._interface = _interface;
	} 

	public Endpoint _interface(java.lang.String _interface) { 
		this._interface = _interface;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public Endpoint url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Endpoint id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLegacy_endpoint_id() { 
		return this.legacy_endpoint_id;
	} 

	public void setLegacy_endpoint_id(java.lang.String legacy_endpoint_id) { 
		this.legacy_endpoint_id = legacy_endpoint_id;
	} 

	public Endpoint legacy_endpoint_id(java.lang.String legacy_endpoint_id) { 
		this.legacy_endpoint_id = legacy_endpoint_id;
		return this;
	} 

}
