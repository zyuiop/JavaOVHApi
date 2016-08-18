package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Export PST file url
 */

public class ExportUrl { 

	private java.lang.String url;
	private java.util.Date expiration;

	public ExportUrl() {
	}

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public ExportUrl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public ExportUrl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

}
