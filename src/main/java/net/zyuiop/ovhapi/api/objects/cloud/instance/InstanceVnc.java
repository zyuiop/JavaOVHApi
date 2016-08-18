package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * InstanceVnc
 */

public class InstanceVnc { 

	private java.lang.String url;
	private java.lang.String type;

	public InstanceVnc() {
	}

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public InstanceVnc url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public InstanceVnc type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
