package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server informations
 */

public class Dedicated { 

	private java.lang.String datacenter;
	private boolean professionalUse;
	private java.lang.String supportLevel;
	private java.lang.String ip;
	private java.lang.String commercialRange;
	private java.lang.String os;
	private java.lang.String state;
	private long serverId;
	private long bootId;
	private java.lang.String name;
	private java.lang.String rescueMail;
	private java.lang.String reverse;
	private boolean monitoring;
	private java.lang.String rack;
	private java.lang.String rootDevice;
	private long linkSpeed;

	public Dedicated() {
	}

	public java.lang.String getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
	} 

	public Dedicated datacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public boolean getProfessionalUse() { 
		return this.professionalUse;
	} 

	public void setProfessionalUse(boolean professionalUse) { 
		this.professionalUse = professionalUse;
	} 

	public Dedicated professionalUse(boolean professionalUse) { 
		this.professionalUse = professionalUse;
		return this;
	} 

	public java.lang.String getSupportLevel() { 
		return this.supportLevel;
	} 

	public void setSupportLevel(java.lang.String supportLevel) { 
		this.supportLevel = supportLevel;
	} 

	public Dedicated supportLevel(java.lang.String supportLevel) { 
		this.supportLevel = supportLevel;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Dedicated ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getCommercialRange() { 
		return this.commercialRange;
	} 

	public void setCommercialRange(java.lang.String commercialRange) { 
		this.commercialRange = commercialRange;
	} 

	public Dedicated commercialRange(java.lang.String commercialRange) { 
		this.commercialRange = commercialRange;
		return this;
	} 

	public java.lang.String getOs() { 
		return this.os;
	} 

	public void setOs(java.lang.String os) { 
		this.os = os;
	} 

	public Dedicated os(java.lang.String os) { 
		this.os = os;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Dedicated state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public long getServerId() { 
		return this.serverId;
	} 

	public void setServerId(long serverId) { 
		this.serverId = serverId;
	} 

	public Dedicated serverId(long serverId) { 
		this.serverId = serverId;
		return this;
	} 

	public long getBootId() { 
		return this.bootId;
	} 

	public void setBootId(long bootId) { 
		this.bootId = bootId;
	} 

	public Dedicated bootId(long bootId) { 
		this.bootId = bootId;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Dedicated name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRescueMail() { 
		return this.rescueMail;
	} 

	public void setRescueMail(java.lang.String rescueMail) { 
		this.rescueMail = rescueMail;
	} 

	public Dedicated rescueMail(java.lang.String rescueMail) { 
		this.rescueMail = rescueMail;
		return this;
	} 

	public java.lang.String getReverse() { 
		return this.reverse;
	} 

	public void setReverse(java.lang.String reverse) { 
		this.reverse = reverse;
	} 

	public Dedicated reverse(java.lang.String reverse) { 
		this.reverse = reverse;
		return this;
	} 

	public boolean getMonitoring() { 
		return this.monitoring;
	} 

	public void setMonitoring(boolean monitoring) { 
		this.monitoring = monitoring;
	} 

	public Dedicated monitoring(boolean monitoring) { 
		this.monitoring = monitoring;
		return this;
	} 

	public java.lang.String getRack() { 
		return this.rack;
	} 

	public void setRack(java.lang.String rack) { 
		this.rack = rack;
	} 

	public Dedicated rack(java.lang.String rack) { 
		this.rack = rack;
		return this;
	} 

	public java.lang.String getRootDevice() { 
		return this.rootDevice;
	} 

	public void setRootDevice(java.lang.String rootDevice) { 
		this.rootDevice = rootDevice;
	} 

	public Dedicated rootDevice(java.lang.String rootDevice) { 
		this.rootDevice = rootDevice;
		return this;
	} 

	public long getLinkSpeed() { 
		return this.linkSpeed;
	} 

	public void setLinkSpeed(long linkSpeed) { 
		this.linkSpeed = linkSpeed;
	} 

	public Dedicated linkSpeed(long linkSpeed) { 
		this.linkSpeed = linkSpeed;
		return this;
	} 

}
