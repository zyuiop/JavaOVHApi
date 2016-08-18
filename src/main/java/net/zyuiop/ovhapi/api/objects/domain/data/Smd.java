package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of a SMD Resource file
 */

public class Smd { 

	private java.util.Date notAfter;
	private long id;
	private java.lang.String data;
	private java.util.Date notBefore;
	private java.lang.String smdId;
	private net.zyuiop.ovhapi.api.objects.domain.data.SmdLabel[] protectedLabels;

	public Smd() {
	}

	public java.util.Date getNotAfter() { 
		return this.notAfter;
	} 

	public void setNotAfter(java.util.Date notAfter) { 
		this.notAfter = notAfter;
	} 

	public Smd notAfter(java.util.Date notAfter) { 
		this.notAfter = notAfter;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Smd id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getData() { 
		return this.data;
	} 

	public void setData(java.lang.String data) { 
		this.data = data;
	} 

	public Smd data(java.lang.String data) { 
		this.data = data;
		return this;
	} 

	public java.util.Date getNotBefore() { 
		return this.notBefore;
	} 

	public void setNotBefore(java.util.Date notBefore) { 
		this.notBefore = notBefore;
	} 

	public Smd notBefore(java.util.Date notBefore) { 
		this.notBefore = notBefore;
		return this;
	} 

	public java.lang.String getSmdId() { 
		return this.smdId;
	} 

	public void setSmdId(java.lang.String smdId) { 
		this.smdId = smdId;
	} 

	public Smd smdId(java.lang.String smdId) { 
		this.smdId = smdId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.domain.data.SmdLabel[] getProtectedLabels() { 
		return this.protectedLabels;
	} 

	public void setProtectedLabels(net.zyuiop.ovhapi.api.objects.domain.data.SmdLabel[] protectedLabels) { 
		this.protectedLabels = protectedLabels;
	} 

	public Smd protectedLabels(net.zyuiop.ovhapi.api.objects.domain.data.SmdLabel[] protectedLabels) { 
		this.protectedLabels = protectedLabels;
		return this;
	} 

}
