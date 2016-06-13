package net.zyuiop.ovhapi.impl.objects.secondarydns;

import net.zyuiop.ovhapi.api.objects.secondarydns.SecondaryDNS;
/**
 * Secondary dns infos
 */

public class SecondaryDNSImpl implements SecondaryDNS { 

	private java.lang.String domain;
	private java.lang.String dns;
	private java.util.Date creationDate;
	private java.lang.String ipMaster;

	public SecondaryDNSImpl() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public SecondaryDNSImpl domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getDns() { 
		return this.dns;
	} 

	public void setDns(java.lang.String dns) { 
		this.dns = dns;
	} 

	public SecondaryDNSImpl dns(java.lang.String dns) { 
		this.dns = dns;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public SecondaryDNSImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getIpMaster() { 
		return this.ipMaster;
	} 

	public void setIpMaster(java.lang.String ipMaster) { 
		this.ipMaster = ipMaster;
	} 

	public SecondaryDNSImpl ipMaster(java.lang.String ipMaster) { 
		this.ipMaster = ipMaster;
		return this;
	} 

}
