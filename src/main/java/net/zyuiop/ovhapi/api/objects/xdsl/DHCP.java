package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * DHCP Configuration of the Modem
 */

public class DHCP { 

	private java.lang.String subnetMask;
	private boolean serverEnabled;
	private long taskId;
	private long leaseTime;
	private java.lang.String secondaryDNS;
	private java.lang.String endAddress;
	private java.lang.String dhcpName;
	private java.lang.String primaryDNS;
	private java.lang.String startAddress;
	private java.lang.String defaultGateway;
	private java.lang.String domainName;

	public DHCP() {
	}

	public java.lang.String getSubnetMask() { 
		return this.subnetMask;
	} 

	public void setSubnetMask(java.lang.String subnetMask) { 
		this.subnetMask = subnetMask;
	} 

	public DHCP subnetMask(java.lang.String subnetMask) { 
		this.subnetMask = subnetMask;
		return this;
	} 

	public boolean getServerEnabled() { 
		return this.serverEnabled;
	} 

	public void setServerEnabled(boolean serverEnabled) { 
		this.serverEnabled = serverEnabled;
	} 

	public DHCP serverEnabled(boolean serverEnabled) { 
		this.serverEnabled = serverEnabled;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public DHCP taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public long getLeaseTime() { 
		return this.leaseTime;
	} 

	public void setLeaseTime(long leaseTime) { 
		this.leaseTime = leaseTime;
	} 

	public DHCP leaseTime(long leaseTime) { 
		this.leaseTime = leaseTime;
		return this;
	} 

	public java.lang.String getSecondaryDNS() { 
		return this.secondaryDNS;
	} 

	public void setSecondaryDNS(java.lang.String secondaryDNS) { 
		this.secondaryDNS = secondaryDNS;
	} 

	public DHCP secondaryDNS(java.lang.String secondaryDNS) { 
		this.secondaryDNS = secondaryDNS;
		return this;
	} 

	public java.lang.String getEndAddress() { 
		return this.endAddress;
	} 

	public void setEndAddress(java.lang.String endAddress) { 
		this.endAddress = endAddress;
	} 

	public DHCP endAddress(java.lang.String endAddress) { 
		this.endAddress = endAddress;
		return this;
	} 

	public java.lang.String getDhcpName() { 
		return this.dhcpName;
	} 

	public void setDhcpName(java.lang.String dhcpName) { 
		this.dhcpName = dhcpName;
	} 

	public DHCP dhcpName(java.lang.String dhcpName) { 
		this.dhcpName = dhcpName;
		return this;
	} 

	public java.lang.String getPrimaryDNS() { 
		return this.primaryDNS;
	} 

	public void setPrimaryDNS(java.lang.String primaryDNS) { 
		this.primaryDNS = primaryDNS;
	} 

	public DHCP primaryDNS(java.lang.String primaryDNS) { 
		this.primaryDNS = primaryDNS;
		return this;
	} 

	public java.lang.String getStartAddress() { 
		return this.startAddress;
	} 

	public void setStartAddress(java.lang.String startAddress) { 
		this.startAddress = startAddress;
	} 

	public DHCP startAddress(java.lang.String startAddress) { 
		this.startAddress = startAddress;
		return this;
	} 

	public java.lang.String getDefaultGateway() { 
		return this.defaultGateway;
	} 

	public void setDefaultGateway(java.lang.String defaultGateway) { 
		this.defaultGateway = defaultGateway;
	} 

	public DHCP defaultGateway(java.lang.String defaultGateway) { 
		this.defaultGateway = defaultGateway;
		return this;
	} 

	public java.lang.String getDomainName() { 
		return this.domainName;
	} 

	public void setDomainName(java.lang.String domainName) { 
		this.domainName = domainName;
	} 

	public DHCP domainName(java.lang.String domainName) { 
		this.domainName = domainName;
		return this;
	} 

}
