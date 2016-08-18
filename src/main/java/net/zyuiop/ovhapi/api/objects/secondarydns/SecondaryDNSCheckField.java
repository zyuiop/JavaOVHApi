package net.zyuiop.ovhapi.api.objects.secondarydns;

/**
 * A structure describing informations about secondary dns check field
 */

public class SecondaryDNSCheckField { 

	private java.lang.String fieldType;
	private java.lang.String subDomain;
	private java.lang.String fieldValue;

	public SecondaryDNSCheckField() {
	}

	public java.lang.String getFieldType() { 
		return this.fieldType;
	} 

	public void setFieldType(java.lang.String fieldType) { 
		this.fieldType = fieldType;
	} 

	public SecondaryDNSCheckField fieldType(java.lang.String fieldType) { 
		this.fieldType = fieldType;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public SecondaryDNSCheckField subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

	public java.lang.String getFieldValue() { 
		return this.fieldValue;
	} 

	public void setFieldValue(java.lang.String fieldValue) { 
		this.fieldValue = fieldValue;
	} 

	public SecondaryDNSCheckField fieldValue(java.lang.String fieldValue) { 
		this.fieldValue = fieldValue;
		return this;
	} 

}
