package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.OutlookUrl;
/**
 * Outlook url
 */

public class OutlookUrlImpl implements OutlookUrl { 

	private java.lang.String serial;
	private java.lang.String url;
	private java.util.Date expiration;

	public OutlookUrlImpl() {
	}

	public java.lang.String getSerial() { 
		return this.serial;
	} 

	public void setSerial(java.lang.String serial) { 
		this.serial = serial;
	} 

	public OutlookUrlImpl serial(java.lang.String serial) { 
		this.serial = serial;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public OutlookUrlImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public OutlookUrlImpl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
