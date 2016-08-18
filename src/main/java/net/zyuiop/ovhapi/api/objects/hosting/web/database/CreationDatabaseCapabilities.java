package net.zyuiop.ovhapi.api.objects.hosting.web.database;

/**
 * Struct which describs quota and available for a specific type of database
 */

public class CreationDatabaseCapabilities { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota;
	private java.lang.String type;
	private long available;

	public CreationDatabaseCapabilities() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuota() { 
		return this.quota;
	} 

	public void setQuota(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota) { 
		this.quota = quota;
	} 

	public CreationDatabaseCapabilities quota(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quota) { 
		this.quota = quota;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public CreationDatabaseCapabilities type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getAvailable() { 
		return this.available;
	} 

	public void setAvailable(long available) { 
		this.available = available;
	} 

	public CreationDatabaseCapabilities available(long available) { 
		this.available = available;
		return this;
	} 

}
