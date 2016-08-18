package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange server
 */

public class Server { 

	private java.lang.String ip;
	private java.lang.String ipV6;
	private boolean isPtrValid;
	private boolean isAValid;
	private long version;
	private long diskSize;
	private long currentDiskUsage;
	private java.lang.String state;
	private java.lang.String commercialVersion;
	private boolean isPtrV6Valid;
	private boolean isAaaaValid;
	private long taskPendingId;
	private boolean individual2010;

	public Server() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Server ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getIpV6() { 
		return this.ipV6;
	} 

	public void setIpV6(java.lang.String ipV6) { 
		this.ipV6 = ipV6;
	} 

	public Server ipV6(java.lang.String ipV6) { 
		this.ipV6 = ipV6;
		return this;
	} 

	public boolean getIsPtrValid() { 
		return this.isPtrValid;
	} 

	public void setIsPtrValid(boolean isPtrValid) { 
		this.isPtrValid = isPtrValid;
	} 

	public Server isPtrValid(boolean isPtrValid) { 
		this.isPtrValid = isPtrValid;
		return this;
	} 

	public boolean getIsAValid() { 
		return this.isAValid;
	} 

	public void setIsAValid(boolean isAValid) { 
		this.isAValid = isAValid;
	} 

	public Server isAValid(boolean isAValid) { 
		this.isAValid = isAValid;
		return this;
	} 

	public long getVersion() { 
		return this.version;
	} 

	public void setVersion(long version) { 
		this.version = version;
	} 

	public Server version(long version) { 
		this.version = version;
		return this;
	} 

	public long getDiskSize() { 
		return this.diskSize;
	} 

	public void setDiskSize(long diskSize) { 
		this.diskSize = diskSize;
	} 

	public Server diskSize(long diskSize) { 
		this.diskSize = diskSize;
		return this;
	} 

	public long getCurrentDiskUsage() { 
		return this.currentDiskUsage;
	} 

	public void setCurrentDiskUsage(long currentDiskUsage) { 
		this.currentDiskUsage = currentDiskUsage;
	} 

	public Server currentDiskUsage(long currentDiskUsage) { 
		this.currentDiskUsage = currentDiskUsage;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Server state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.lang.String getCommercialVersion() { 
		return this.commercialVersion;
	} 

	public void setCommercialVersion(java.lang.String commercialVersion) { 
		this.commercialVersion = commercialVersion;
	} 

	public Server commercialVersion(java.lang.String commercialVersion) { 
		this.commercialVersion = commercialVersion;
		return this;
	} 

	public boolean getIsPtrV6Valid() { 
		return this.isPtrV6Valid;
	} 

	public void setIsPtrV6Valid(boolean isPtrV6Valid) { 
		this.isPtrV6Valid = isPtrV6Valid;
	} 

	public Server isPtrV6Valid(boolean isPtrV6Valid) { 
		this.isPtrV6Valid = isPtrV6Valid;
		return this;
	} 

	public boolean getIsAaaaValid() { 
		return this.isAaaaValid;
	} 

	public void setIsAaaaValid(boolean isAaaaValid) { 
		this.isAaaaValid = isAaaaValid;
	} 

	public Server isAaaaValid(boolean isAaaaValid) { 
		this.isAaaaValid = isAaaaValid;
		return this;
	} 

	public long getTaskPendingId() { 
		return this.taskPendingId;
	} 

	public void setTaskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
	} 

	public Server taskPendingId(long taskPendingId) { 
		this.taskPendingId = taskPendingId;
		return this;
	} 

	public boolean getIndividual2010() { 
		return this.individual2010;
	} 

	public void setIndividual2010(boolean individual2010) { 
		this.individual2010 = individual2010;
	} 

	public Server individual2010(boolean individual2010) { 
		this.individual2010 = individual2010;
		return this;
	} 

}
