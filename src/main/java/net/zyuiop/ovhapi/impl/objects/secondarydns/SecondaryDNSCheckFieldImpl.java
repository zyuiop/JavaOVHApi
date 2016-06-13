package net.zyuiop.ovhapi.impl.objects.secondarydns;

import net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNSCheckField;
/**
 * A structure describing informations about secondary dns check field
 */

public class SecondaryDNSCheckFieldImpl implements SecondaryDNSCheckField { 

	private java.lang.String fieldType;
	private java.lang.String subDomain;
	private java.lang.String fieldValue;

	public SecondaryDNSCheckFieldImpl() {
	}

	public java.lang.String getFieldType() { 
		return this.fieldType;
	} 

	public void setFieldType(java.lang.String fieldType) { 
		this.fieldType = fieldType;
	} 

	public SecondaryDNSCheckFieldImpl fieldType(java.lang.String fieldType) { 
		this.fieldType = fieldType;
		return this;
	} 

	public java.lang.String getSubDomain() { 
		return this.subDomain;
	} 

	public void setSubDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
	} 

	public SecondaryDNSCheckFieldImpl subDomain(java.lang.String subDomain) { 
		this.subDomain = subDomain;
		return this;
	} 

	public java.lang.String getFieldValue() { 
		return this.fieldValue;
	} 

	public void setFieldValue(java.lang.String fieldValue) { 
		this.fieldValue = fieldValue;
	} 

	public SecondaryDNSCheckFieldImpl fieldValue(java.lang.String fieldValue) { 
		this.fieldValue = fieldValue;
		return this;
	} 

}
