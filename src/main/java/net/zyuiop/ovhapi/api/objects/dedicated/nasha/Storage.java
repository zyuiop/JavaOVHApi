package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Storage nas HA
 */

public class Storage { 

	private java.lang.String datacenter;
	private boolean canCreatePartition;
	private boolean monitored;
	private long zpoolCapacity;
	private java.lang.String ip;
	private java.lang.String serviceName;
	private java.lang.String customName;
	private long zpoolSize;

	public Storage() {
	}

	public java.lang.String getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
	} 

	public Storage datacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public boolean getCanCreatePartition() { 
		return this.canCreatePartition;
	} 

	public void setCanCreatePartition(boolean canCreatePartition) { 
		this.canCreatePartition = canCreatePartition;
	} 

	public Storage canCreatePartition(boolean canCreatePartition) { 
		this.canCreatePartition = canCreatePartition;
		return this;
	} 

	public boolean getMonitored() { 
		return this.monitored;
	} 

	public void setMonitored(boolean monitored) { 
		this.monitored = monitored;
	} 

	public Storage monitored(boolean monitored) { 
		this.monitored = monitored;
		return this;
	} 

	public long getZpoolCapacity() { 
		return this.zpoolCapacity;
	} 

	public void setZpoolCapacity(long zpoolCapacity) { 
		this.zpoolCapacity = zpoolCapacity;
	} 

	public Storage zpoolCapacity(long zpoolCapacity) { 
		this.zpoolCapacity = zpoolCapacity;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public Storage ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Storage serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getCustomName() { 
		return this.customName;
	} 

	public void setCustomName(java.lang.String customName) { 
		this.customName = customName;
	} 

	public Storage customName(java.lang.String customName) { 
		this.customName = customName;
		return this;
	} 

	public long getZpoolSize() { 
		return this.zpoolSize;
	} 

	public void setZpoolSize(long zpoolSize) { 
		this.zpoolSize = zpoolSize;
	} 

	public Storage zpoolSize(long zpoolSize) { 
		this.zpoolSize = zpoolSize;
		return this;
	} 

}
