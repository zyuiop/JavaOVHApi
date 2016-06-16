package net.zyuiop.ovhapi.impl.objects.domain.data;

import net.zyuiop.ovhapi.api.objects.domain.data.Smd;
/**
 * Representation of a SMD Resource file
 */

public class SmdImpl implements Smd { 

	private java.util.Date notAfter;
	private long id;
	private java.lang.String data;
	private java.util.Date notBefore;
	private java.lang.String smdId;
	private net.zyuiop.ovhapi.impl.objects.domain.data.SmdLabelImpl protectedLabels;

	public SmdImpl() {
	}

	public java.util.Date getNotAfter() { 
		return this.notAfter;
	} 

	public void setNotAfter(java.util.Date notAfter) { 
		this.notAfter = notAfter;
	} 

	public SmdImpl notAfter(java.util.Date notAfter) { 
		this.notAfter = notAfter;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SmdImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getData() { 
		return this.data;
	} 

	public void setData(java.lang.String data) { 
		this.data = data;
	} 

	public SmdImpl data(java.lang.String data) { 
		this.data = data;
		return this;
	} 

	public java.util.Date getNotBefore() { 
		return this.notBefore;
	} 

	public void setNotBefore(java.util.Date notBefore) { 
		this.notBefore = notBefore;
	} 

	public SmdImpl notBefore(java.util.Date notBefore) { 
		this.notBefore = notBefore;
		return this;
	} 

	public java.lang.String getSmdId() { 
		return this.smdId;
	} 

	public void setSmdId(java.lang.String smdId) { 
		this.smdId = smdId;
	} 

	public SmdImpl smdId(java.lang.String smdId) { 
		this.smdId = smdId;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.domain.data.SmdLabelImpl getProtectedLabels() { 
		return this.protectedLabels;
	} 

	public void setProtectedLabels(net.zyuiop.ovhapi.impl.objects.domain.data.SmdLabelImpl protectedLabels) { 
		this.protectedLabels = protectedLabels;
	} 

	public SmdImpl protectedLabels(net.zyuiop.ovhapi.impl.objects.domain.data.SmdLabelImpl protectedLabels) { 
		this.protectedLabels = protectedLabels;
		return this;
	} 

}
