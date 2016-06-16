package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.Catalog;
/**
 * Catalog
 */

public class CatalogImpl implements Catalog { 

	private java.lang.String id;
	private java.lang.String type;
	private net.zyuiop.ovhapi.impl.objects.cloud.identity.EndpointImpl endpoints;

	public CatalogImpl() {
	}

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public CatalogImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CatalogImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.identity.EndpointImpl getEndpoints() { 
		return this.endpoints;
	} 

	public void setEndpoints(net.zyuiop.ovhapi.impl.objects.cloud.identity.EndpointImpl endpoints) { 
		this.endpoints = endpoints;
	} 

	public CatalogImpl endpoints(net.zyuiop.ovhapi.impl.objects.cloud.identity.EndpointImpl endpoints) { 
		this.endpoints = endpoints;
		return this;
	} 

}
