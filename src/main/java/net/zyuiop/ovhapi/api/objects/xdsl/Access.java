package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * XDSL Access
 */

public class Access { 

	private boolean ipv6Enabled;
	private java.lang.String status;
	private long pairsNumber;
	private long lnsRateLimit;
	private java.lang.String accessName;
	private java.lang.String description;
	private java.lang.String accessType;
	private boolean monitoring;
	private net.zyuiop.ovhapi.api.objects.xdsl.AccessCapabilities capabilities;
	private net.zyuiop.ovhapi.api.objects.xdsl.AddressDetail address;
	private java.lang.String nra;
	private java.lang.String role;

	public Access() {
	}

	public boolean getIpv6Enabled() { 
		return this.ipv6Enabled;
	} 

	public void setIpv6Enabled(boolean ipv6Enabled) { 
		this.ipv6Enabled = ipv6Enabled;
	} 

	public Access ipv6Enabled(boolean ipv6Enabled) { 
		this.ipv6Enabled = ipv6Enabled;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Access status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getPairsNumber() { 
		return this.pairsNumber;
	} 

	public void setPairsNumber(long pairsNumber) { 
		this.pairsNumber = pairsNumber;
	} 

	public Access pairsNumber(long pairsNumber) { 
		this.pairsNumber = pairsNumber;
		return this;
	} 

	public long getLnsRateLimit() { 
		return this.lnsRateLimit;
	} 

	public void setLnsRateLimit(long lnsRateLimit) { 
		this.lnsRateLimit = lnsRateLimit;
	} 

	public Access lnsRateLimit(long lnsRateLimit) { 
		this.lnsRateLimit = lnsRateLimit;
		return this;
	} 

	public java.lang.String getAccessName() { 
		return this.accessName;
	} 

	public void setAccessName(java.lang.String accessName) { 
		this.accessName = accessName;
	} 

	public Access accessName(java.lang.String accessName) { 
		this.accessName = accessName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Access description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getAccessType() { 
		return this.accessType;
	} 

	public void setAccessType(java.lang.String accessType) { 
		this.accessType = accessType;
	} 

	public Access accessType(java.lang.String accessType) { 
		this.accessType = accessType;
		return this;
	} 

	public boolean getMonitoring() { 
		return this.monitoring;
	} 

	public void setMonitoring(boolean monitoring) { 
		this.monitoring = monitoring;
	} 

	public Access monitoring(boolean monitoring) { 
		this.monitoring = monitoring;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.AccessCapabilities getCapabilities() { 
		return this.capabilities;
	} 

	public void setCapabilities(net.zyuiop.ovhapi.api.objects.xdsl.AccessCapabilities capabilities) { 
		this.capabilities = capabilities;
	} 

	public Access capabilities(net.zyuiop.ovhapi.api.objects.xdsl.AccessCapabilities capabilities) { 
		this.capabilities = capabilities;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.AddressDetail getAddress() { 
		return this.address;
	} 

	public void setAddress(net.zyuiop.ovhapi.api.objects.xdsl.AddressDetail address) { 
		this.address = address;
	} 

	public Access address(net.zyuiop.ovhapi.api.objects.xdsl.AddressDetail address) { 
		this.address = address;
		return this;
	} 

	public java.lang.String getNra() { 
		return this.nra;
	} 

	public void setNra(java.lang.String nra) { 
		this.nra = nra;
	} 

	public Access nra(java.lang.String nra) { 
		this.nra = nra;
		return this;
	} 

	public java.lang.String getRole() { 
		return this.role;
	} 

	public void setRole(java.lang.String role) { 
		this.role = role;
	} 

	public Access role(java.lang.String role) { 
		this.role = role;
		return this;
	} 

}
