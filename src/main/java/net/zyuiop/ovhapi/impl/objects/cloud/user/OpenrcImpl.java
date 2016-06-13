package net.zyuiop.ovhapi.impl.objects.cloud.user;

import net.zyuiop.ovhapi.api.objects.cloud.user.Openrc;
/**
 * Openrc
 */

public class OpenrcImpl implements Openrc { 

	private java.lang.String content;

	public OpenrcImpl() {
	}

	public java.lang.String getContent() { 
		return this.content;
	} 

	public void setContent(java.lang.String content) { 
		this.content = content;
	} 

	public OpenrcImpl content(java.lang.String content) { 
		this.content = content;
		return this;
	} 

}
