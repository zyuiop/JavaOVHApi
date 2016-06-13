package net.zyuiop.ovhapi.impl.objects.email.domain;

import net.zyuiop.ovhapi.api.objects.email.domain.RedirectionGlobal;
/**
 * Global Redirection
 */

public class RedirectionGlobalImpl implements RedirectionGlobal { 

	private java.lang.String to;
	private java.lang.String from;
	private java.lang.String id;

	public RedirectionGlobalImpl() {
	}

	public java.lang.String getTo() { 
		return this.to;
	} 

	public void setTo(java.lang.String to) { 
		this.to = to;
	} 

	public RedirectionGlobalImpl to(java.lang.String to) { 
		this.to = to;
		return this;
	} 

	public java.lang.String getFrom() { 
		return this.from;
	} 

	public void setFrom(java.lang.String from) { 
		this.from = from;
	} 

	public RedirectionGlobalImpl from(java.lang.String from) { 
		this.from = from;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public RedirectionGlobalImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
