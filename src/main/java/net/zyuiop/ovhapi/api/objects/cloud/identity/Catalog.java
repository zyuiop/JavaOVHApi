package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Catalog
 */

public class Catalog { 

	private java.lang.String id;
	private java.lang.String type;
	private net.zyuiop.ovhapi.api.objects.cloud.identity.Endpoint[] endpoints;

	public Catalog() {
	}

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Catalog id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Catalog type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.identity.Endpoint[] getEndpoints() { 
		return this.endpoints;
	} 

	public void setEndpoints(net.zyuiop.ovhapi.api.objects.cloud.identity.Endpoint[] endpoints) { 
		this.endpoints = endpoints;
	} 

	public Catalog endpoints(net.zyuiop.ovhapi.api.objects.cloud.identity.Endpoint[] endpoints) { 
		this.endpoints = endpoints;
		return this;
	} 

}
