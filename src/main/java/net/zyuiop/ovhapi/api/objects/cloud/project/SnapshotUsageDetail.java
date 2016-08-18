package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Snapshot usage
 */

public class SnapshotUsageDetail { 

	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price price;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue storedSize;

	public SnapshotUsageDetail() {
	}

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public SnapshotUsageDetail region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public SnapshotUsageDetail price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getStoredSize() { 
		return this.storedSize;
	} 

	public void setStoredSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue storedSize) { 
		this.storedSize = storedSize;
	} 

	public SnapshotUsageDetail storedSize(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue storedSize) { 
		this.storedSize = storedSize;
		return this;
	} 

}
