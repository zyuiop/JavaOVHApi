package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Physical or Virtual Node
 */

public class Node { 

	private java.lang.String billingProfileName;
	private java.lang.String softwareProfile;
	private boolean isRemovable;
	private java.lang.String ip;
	private java.lang.String hostname;
	private java.lang.String state;

	public Node() {
	}

	public java.lang.String getBillingProfileName() { 
		return this.billingProfileName;
	} 

	public void setBillingProfileName(java.lang.String billingProfileName) { 
		this.billingProfileName = billingProfileName;
	} 

	public Node billingProfileName(java.lang.String billingProfileName) { 
		this.billingProfileName = billingProfileName;
		return this;
	} 

	public java.lang.String getSoftwareProfile() { 
		return this.softwareProfile;
	} 

	public void setSoftwareProfile(java.lang.String softwareProfile) { 
		this.softwareProfile = softwareProfile;
	} 

	public Node softwareProfile(java.lang.String softwareProfile) { 
		this.softwareProfile = softwareProfile;
		return this;
	} 

	public boolean getIsRemovable() { 
		return this.isRemovable;
	} 

	public void setIsRemovable(boolean isRemovable) { 
		this.isRemovable = isRemovable;
	} 

	public Node isRemovable(boolean isRemovable) { 
		this.isRemovable = isRemovable;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Node ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getHostname() { 
		return this.hostname;
	} 

	public void setHostname(java.lang.String hostname) { 
		this.hostname = hostname;
	} 

	public Node hostname(java.lang.String hostname) { 
		this.hostname = hostname;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Node state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
