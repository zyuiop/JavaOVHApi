package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * CDN Ssl
 */

public class Ssl { 

	private java.lang.String status;
	private java.lang.String cn;
	private java.lang.String name;
	private java.util.Date certificateValidFrom;
	private java.util.Date certificateValidTo;

	public Ssl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Ssl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getCn() { 
		return this.cn;
	} 

	public void setCn(java.lang.String cn) { 
		this.cn = cn;
	} 

	public Ssl cn(java.lang.String cn) { 
		this.cn = cn;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Ssl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getCertificateValidFrom() { 
		return this.certificateValidFrom;
	} 

	public void setCertificateValidFrom(java.util.Date certificateValidFrom) { 
		this.certificateValidFrom = certificateValidFrom;
	} 

	public Ssl certificateValidFrom(java.util.Date certificateValidFrom) { 
		this.certificateValidFrom = certificateValidFrom;
		return this;
	} 

	public java.util.Date getCertificateValidTo() { 
		return this.certificateValidTo;
	} 

	public void setCertificateValidTo(java.util.Date certificateValidTo) { 
		this.certificateValidTo = certificateValidTo;
	} 

	public Ssl certificateValidTo(java.util.Date certificateValidTo) { 
		this.certificateValidTo = certificateValidTo;
		return this;
	} 

}
