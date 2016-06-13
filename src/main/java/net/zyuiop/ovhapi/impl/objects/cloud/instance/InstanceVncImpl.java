package net.zyuiop.ovhapi.impl.objects.cloud.instance;

import net.zyuiop.ovhapi.api.objects.cloud.instance.InstanceVnc;
/**
 * InstanceVnc
 */

public class InstanceVncImpl implements InstanceVnc { 

	private java.lang.String url;
	private java.lang.String type;

	public InstanceVncImpl() {
	}

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public InstanceVncImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public InstanceVncImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
