package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Vxml Properties
 */

public class VxmlProperties { 

	private java.lang.String urlRecord;
	private java.lang.String url;

	public VxmlProperties() {
	}

	public java.lang.String getUrlRecord() { 
		return this.urlRecord;
	} 

	public void setUrlRecord(java.lang.String urlRecord) { 
		this.urlRecord = urlRecord;
	} 

	public VxmlProperties urlRecord(java.lang.String urlRecord) { 
		this.urlRecord = urlRecord;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public VxmlProperties url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

}
