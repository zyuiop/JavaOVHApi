package net.zyuiop.ovhapi.impl.objects.cdnanycast;

import net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl;
/**
 * CDN Ssl
 */

public class SslImpl implements Ssl { 

	private java.lang.String status;
	private java.lang.String cn;
	private java.lang.String name;
	private java.util.Date certificateValidFrom;
	private java.util.Date certificateValidTo;

	public SslImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SslImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getCn() { 
		return this.cn;
	} 

	public void setCn(java.lang.String cn) { 
		this.cn = cn;
	} 

	public SslImpl cn(java.lang.String cn) { 
		this.cn = cn;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public SslImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getCertificateValidFrom() { 
		return this.certificateValidFrom;
	} 

	public void setCertificateValidFrom(java.util.Date certificateValidFrom) { 
		this.certificateValidFrom = certificateValidFrom;
	} 

	public SslImpl certificateValidFrom(java.util.Date certificateValidFrom) { 
		this.certificateValidFrom = certificateValidFrom;
		return this;
	} 

	public java.util.Date getCertificateValidTo() { 
		return this.certificateValidTo;
	} 

	public void setCertificateValidTo(java.util.Date certificateValidTo) { 
		this.certificateValidTo = certificateValidTo;
	} 

	public SslImpl certificateValidTo(java.util.Date certificateValidTo) { 
		this.certificateValidTo = certificateValidTo;
		return this;
	} 

}
