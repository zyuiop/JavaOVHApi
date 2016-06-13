package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.PcsFile;
/**
 * Telephony API related file hosted
 */

public class PcsFileImpl implements PcsFile { 

	private java.util.Date urlExpirationDatetime;
	private java.lang.String filename;
	private java.lang.String status;
	private java.lang.String url;

	public PcsFileImpl() {
	}

	public java.util.Date getUrlExpirationDatetime() { 
		return this.urlExpirationDatetime;
	} 

	public void setUrlExpirationDatetime(java.util.Date urlExpirationDatetime) { 
		this.urlExpirationDatetime = urlExpirationDatetime;
	} 

	public PcsFileImpl urlExpirationDatetime(java.util.Date urlExpirationDatetime) { 
		this.urlExpirationDatetime = urlExpirationDatetime;
		return this;
	} 

	public java.lang.String getFilename() { 
		return this.filename;
	} 

	public void setFilename(java.lang.String filename) { 
		this.filename = filename;
	} 

	public PcsFileImpl filename(java.lang.String filename) { 
		this.filename = filename;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public PcsFileImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public PcsFileImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
