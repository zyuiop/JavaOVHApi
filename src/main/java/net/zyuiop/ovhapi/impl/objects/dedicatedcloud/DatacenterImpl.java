package net.zyuiop.ovhapi.impl.objects.dedicatedcloud;

import net.zyuiop.ovhapi.api.objects.dedicatedcloud.Datacenter;
/**
 * Dedicated Cloud Datacenter
 */

public class DatacenterImpl implements Datacenter { 

	private java.lang.String commercialRangeName;
	private boolean isRemovable;
	private java.lang.String version;
	private java.lang.String name;
	private long datacenterId;
	private java.lang.String description;

	public DatacenterImpl() {
	}

	public java.lang.String getCommercialRangeName() { 
		return this.commercialRangeName;
	} 

	public void setCommercialRangeName(java.lang.String commercialRangeName) { 
		this.commercialRangeName = commercialRangeName;
	} 

	public DatacenterImpl commercialRangeName(java.lang.String commercialRangeName) { 
		this.commercialRangeName = commercialRangeName;
		return this;
	} 

	public boolean getIsRemovable() { 
		return this.isRemovable;
	} 

	public void setIsRemovable(boolean isRemovable) { 
		this.isRemovable = isRemovable;
	} 

	public DatacenterImpl isRemovable(boolean isRemovable) { 
		this.isRemovable = isRemovable;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public DatacenterImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DatacenterImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getDatacenterId() { 
		return this.datacenterId;
	} 

	public void setDatacenterId(long datacenterId) { 
		this.datacenterId = datacenterId;
	} 

	public DatacenterImpl datacenterId(long datacenterId) { 
		this.datacenterId = datacenterId;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public DatacenterImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
