package net.zyuiop.ovhapi.impl.objects.dedicated.nas;

import net.zyuiop.ovhapi.api.objects.dedicated.nas.Nas;
/**
 * Storage nas
 */

public class NasImpl implements Nas { 

	private java.lang.String datacenter;
	private boolean canCreatePartition;
	private java.lang.String mountPath;
	private java.lang.String customName;
	private java.lang.String ip;
	private java.lang.String serviceName;
	private long zpoolSize;

	public NasImpl() {
	}

	public java.lang.String getDatacenter() { 
		return this.datacenter;
	} 

	public void setDatacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
	} 

	public NasImpl datacenter(java.lang.String datacenter) { 
		this.datacenter = datacenter;
		return this;
	} 

	public boolean getCanCreatePartition() { 
		return this.canCreatePartition;
	} 

	public void setCanCreatePartition(boolean canCreatePartition) { 
		this.canCreatePartition = canCreatePartition;
	} 

	public NasImpl canCreatePartition(boolean canCreatePartition) { 
		this.canCreatePartition = canCreatePartition;
		return this;
	} 

	public java.lang.String getMountPath() { 
		return this.mountPath;
	} 

	public void setMountPath(java.lang.String mountPath) { 
		this.mountPath = mountPath;
	} 

	public NasImpl mountPath(java.lang.String mountPath) { 
		this.mountPath = mountPath;
		return this;
	} 

	public java.lang.String getCustomName() { 
		return this.customName;
	} 

	public void setCustomName(java.lang.String customName) { 
		this.customName = customName;
	} 

	public NasImpl customName(java.lang.String customName) { 
		this.customName = customName;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public NasImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public NasImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getZpoolSize() { 
		return this.zpoolSize;
	} 

	public void setZpoolSize(long zpoolSize) { 
		this.zpoolSize = zpoolSize;
	} 

	public NasImpl zpoolSize(long zpoolSize) { 
		this.zpoolSize = zpoolSize;
		return this;
	} 

}
