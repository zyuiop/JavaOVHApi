package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Domain name administration
 */

public class Domain { 

	private boolean owoSupported;
	private boolean glueRecordIpv6Supported;
	private java.lang.String transferLockStatus;
	private java.lang.String offer;
	private java.lang.String whoisOwner;
	private boolean dnssecSupported;
	private net.zyuiop.ovhapi.api.objects.domain.ParentService parentService;
	private java.lang.String domain;
	private java.util.Date lastUpdate;
	private boolean glueRecordMultiIpSupported;
	private java.lang.String nameServerType;

	public Domain() {
	}

	public boolean getOwoSupported() { 
		return this.owoSupported;
	} 

	public void setOwoSupported(boolean owoSupported) { 
		this.owoSupported = owoSupported;
	} 

	public Domain owoSupported(boolean owoSupported) { 
		this.owoSupported = owoSupported;
		return this;
	} 

	public boolean getGlueRecordIpv6Supported() { 
		return this.glueRecordIpv6Supported;
	} 

	public void setGlueRecordIpv6Supported(boolean glueRecordIpv6Supported) { 
		this.glueRecordIpv6Supported = glueRecordIpv6Supported;
	} 

	public Domain glueRecordIpv6Supported(boolean glueRecordIpv6Supported) { 
		this.glueRecordIpv6Supported = glueRecordIpv6Supported;
		return this;
	} 

	public java.lang.String getTransferLockStatus() { 
		return this.transferLockStatus;
	} 

	public void setTransferLockStatus(java.lang.String transferLockStatus) { 
		this.transferLockStatus = transferLockStatus;
	} 

	public Domain transferLockStatus(java.lang.String transferLockStatus) { 
		this.transferLockStatus = transferLockStatus;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public Domain offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getWhoisOwner() { 
		return this.whoisOwner;
	} 

	public void setWhoisOwner(java.lang.String whoisOwner) { 
		this.whoisOwner = whoisOwner;
	} 

	public Domain whoisOwner(java.lang.String whoisOwner) { 
		this.whoisOwner = whoisOwner;
		return this;
	} 

	public boolean getDnssecSupported() { 
		return this.dnssecSupported;
	} 

	public void setDnssecSupported(boolean dnssecSupported) { 
		this.dnssecSupported = dnssecSupported;
	} 

	public Domain dnssecSupported(boolean dnssecSupported) { 
		this.dnssecSupported = dnssecSupported;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.domain.ParentService getParentService() { 
		return this.parentService;
	} 

	public void setParentService(net.zyuiop.ovhapi.api.objects.domain.ParentService parentService) { 
		this.parentService = parentService;
	} 

	public Domain parentService(net.zyuiop.ovhapi.api.objects.domain.ParentService parentService) { 
		this.parentService = parentService;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Domain domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public Domain lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getGlueRecordMultiIpSupported() { 
		return this.glueRecordMultiIpSupported;
	} 

	public void setGlueRecordMultiIpSupported(boolean glueRecordMultiIpSupported) { 
		this.glueRecordMultiIpSupported = glueRecordMultiIpSupported;
	} 

	public Domain glueRecordMultiIpSupported(boolean glueRecordMultiIpSupported) { 
		this.glueRecordMultiIpSupported = glueRecordMultiIpSupported;
		return this;
	} 

	public java.lang.String getNameServerType() { 
		return this.nameServerType;
	} 

	public void setNameServerType(java.lang.String nameServerType) { 
		this.nameServerType = nameServerType;
	} 

	public Domain nameServerType(java.lang.String nameServerType) { 
		this.nameServerType = nameServerType;
		return this;
	} 

}
