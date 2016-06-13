package net.zyuiop.ovhapi.impl.objects.license.office;

import net.zyuiop.ovhapi.api.objects.license.office.OfficeDomain;
/**
 * Office domain
 */

public class OfficeDomainImpl implements OfficeDomain { 

	private java.lang.String status;
	private java.lang.String txtEntry;
	private java.lang.String domainName;

	public OfficeDomainImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OfficeDomainImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getTxtEntry() { 
		return this.txtEntry;
	} 

	public void setTxtEntry(java.lang.String txtEntry) { 
		this.txtEntry = txtEntry;
	} 

	public OfficeDomainImpl txtEntry(java.lang.String txtEntry) { 
		this.txtEntry = txtEntry;
		return this;
	} 

	public java.lang.String getDomainName() { 
		return this.domainName;
	} 

	public void setDomainName(java.lang.String domainName) { 
		this.domainName = domainName;
	} 

	public OfficeDomainImpl domainName(java.lang.String domainName) { 
		this.domainName = domainName;
		return this;
	} 

}
