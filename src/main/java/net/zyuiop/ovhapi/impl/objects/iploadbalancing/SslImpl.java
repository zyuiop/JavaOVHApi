package net.zyuiop.ovhapi.impl.objects.iploadbalancing;

import net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl;
/**
 * Ssl
 */

public class SslImpl implements Ssl { 

	private java.lang.String serial;
	private java.lang.String subject;
	private long id;
	private java.lang.String type;

	public SslImpl() {
	}

	public java.lang.String getSerial() { 
		return this.serial;
	} 

	public void setSerial(java.lang.String serial) { 
		this.serial = serial;
	} 

	public SslImpl serial(java.lang.String serial) { 
		this.serial = serial;
		return this;
	} 

	public java.lang.String getSubject() { 
		return this.subject;
	} 

	public void setSubject(java.lang.String subject) { 
		this.subject = subject;
	} 

	public SslImpl subject(java.lang.String subject) { 
		this.subject = subject;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SslImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SslImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
