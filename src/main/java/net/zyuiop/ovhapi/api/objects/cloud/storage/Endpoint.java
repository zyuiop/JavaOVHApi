package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * Endpoint
 */

public class Endpoint { 

	private java.lang.String region;
	private java.lang.String url;

	public Endpoint() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Endpoint region(java.lang.String region) { 
		this.region = region;
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

}
