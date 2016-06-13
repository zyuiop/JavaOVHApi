package net.zyuiop.ovhapi.impl.objects.dedicated.nasha;

import net.zyuiop.ovhapi.api.objects.dedicated.nasha.Storage;
/**
 * Storage nas HA
 */

public class StorageImpl implements Storage { 

	private java.lang.String datacenter;
	private boolean canCreatePartition;
	private boolean monitored;
	private long zpoolCapacity;
	private java.lang.String ip;
	private java.lang.String serviceName;
	private java.lang.String customName;
	private long zpoolSize;

	public StorageImpl() {
	}

	public java.lang.String getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
	} 

	public StorageImpl datacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public boolean getCanCreatePartition() { 
		return this.canCreatePartition;
	} 

	public void setCanCreatePartition(boolean canCreatePartition) { 
		this.canCreatePartition = canCreatePartition;
	} 

	public StorageImpl canCreatePartition(boolean canCreatePartition) { 
		this.canCreatePartition = canCreatePartition;
		return this;
	} 

	public boolean getMonitored() { 
		return this.monitored;
	} 

	public void setMonitored(boolean monitored) { 
		this.monitored = monitored;
	} 

	public StorageImpl monitored(boolean monitored) { 
		this.monitored = monitored;
		return this;
	} 

	public long getZpoolCapacity() { 
		return this.zpoolCapacity;
	} 

	public void setZpoolCapacity(long zpoolCapacity) { 
		this.zpoolCapacity = zpoolCapacity;
	} 

	public StorageImpl zpoolCapacity(long zpoolCapacity) { 
		this.zpoolCapacity = zpoolCapacity;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public StorageImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public StorageImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getCustomName() { 
		return this.customName;
	} 

	public void setCustomName(java.lang.String customName) { 
		this.customName = customName;
	} 

	public StorageImpl customName(java.lang.String customName) { 
		this.customName = customName;
		return this;
	} 

	public long getZpoolSize() { 
		return this.zpoolSize;
	} 

	public void setZpoolSize(long zpoolSize) { 
		this.zpoolSize = zpoolSize;
	} 

	public StorageImpl zpoolSize(long zpoolSize) { 
		this.zpoolSize = zpoolSize;
		return this;
	} 

}
