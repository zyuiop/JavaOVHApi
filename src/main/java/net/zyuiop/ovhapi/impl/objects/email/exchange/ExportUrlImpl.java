package net.zyuiop.ovhapi.impl.objects.email.exchange;

import net.zyuiop.ovhapi.api.objects.email.exchange.ExportUrl;
/**
 * Export PST file url
 */

public class ExportUrlImpl implements ExportUrl { 

	private java.lang.String url;
	private java.util.Date expiration;

	public ExportUrlImpl() {
	}

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public ExportUrlImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public ExportUrlImpl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
