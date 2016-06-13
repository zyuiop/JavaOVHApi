package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.Antiphishing;
/**
 * Phishing URLs hosted on your IP
 */

public class AntiphishingImpl implements Antiphishing { 

	private java.util.Date creationDate;
	private java.lang.String ipOnAntiphishing;
	private long id;
	private java.lang.String urlPhishing;
	private java.lang.String state;

	public AntiphishingImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public AntiphishingImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getIpOnAntiphishing() { 
		return this.ipOnAntiphishing;
	} 

	public void setIpOnAntiphishing(java.lang.String ipOnAntiphishing) { 
		this.ipOnAntiphishing = ipOnAntiphishing;
	} 

	public AntiphishingImpl ipOnAntiphishing(java.lang.String ipOnAntiphishing) { 
		this.ipOnAntiphishing = ipOnAntiphishing;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public AntiphishingImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getUrlPhishing() { 
		return this.urlPhishing;
	} 

	public void setUrlPhishing(java.lang.String urlPhishing) { 
		this.urlPhishing = urlPhishing;
	} 

	public AntiphishingImpl urlPhishing(java.lang.String urlPhishing) { 
		this.urlPhishing = urlPhishing;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public AntiphishingImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
