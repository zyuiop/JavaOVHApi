package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Outlook url
 */

public class OutlookUrl { 

	private java.lang.String serial;
	private java.lang.String url;
	private java.util.Date expiration;

	public OutlookUrl() {
	}

	public java.lang.String getSerial() { 
		return this.serial;
	} 

	public void setSerial(java.lang.String serial) { 
		this.serial = serial;
	} 

	public OutlookUrl serial(java.lang.String serial) { 
		this.serial = serial;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public OutlookUrl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public OutlookUrl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
