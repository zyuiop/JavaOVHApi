package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office domain
 */

public class OfficeDomain { 

	private java.lang.String status;
	private java.lang.String txtEntry;
	private java.lang.String domainName;

	public OfficeDomain() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OfficeDomain status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getTxtEntry() { 
		return this.txtEntry;
	} 

	public void setTxtEntry(java.lang.String txtEntry) { 
		this.txtEntry = txtEntry;
	} 

	public OfficeDomain txtEntry(java.lang.String txtEntry) { 
		this.txtEntry = txtEntry;
		return this;
	} 

	public java.lang.String getDomainName() { 
		return this.domainName;
	} 

	public void setDomainName(java.lang.String domainName) { 
		this.domainName = domainName;
	} 

	public OfficeDomain domainName(java.lang.String domainName) { 
		this.domainName = domainName;
		return this;
	} 

}
