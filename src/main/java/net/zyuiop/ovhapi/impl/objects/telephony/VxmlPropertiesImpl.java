package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties;
/**
 * Vxml Properties
 */

public class VxmlPropertiesImpl implements VxmlProperties { 

	private java.lang.String urlRecord;
	private java.lang.String url;

	public VxmlPropertiesImpl() {
	}

	public java.lang.String getUrlRecord() { 
		return this.urlRecord;
	} 

	public void setUrlRecord(java.lang.String urlRecord) { 
		this.urlRecord = urlRecord;
	} 

	public VxmlPropertiesImpl urlRecord(java.lang.String urlRecord) { 
		this.urlRecord = urlRecord;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public VxmlPropertiesImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
