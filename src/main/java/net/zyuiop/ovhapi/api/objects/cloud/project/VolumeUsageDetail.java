package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Volume usage
 */

public class VolumeUsageDetail { 

	private java.lang.String volumeId;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue volumeCapacity;
	private java.lang.String volumeType;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public VolumeUsageDetail() {
	}

	public java.lang.String getVolumeId() { 
		return this.volumeId;
	} 

	public void setVolumeId(java.lang.String volumeId) { 
		this.volumeId = volumeId;
	} 

	public VolumeUsageDetail volumeId(java.lang.String volumeId) { 
		this.volumeId = volumeId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getVolumeCapacity() { 
		return this.volumeCapacity;
	} 

	public void setVolumeCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue volumeCapacity) { 
		this.volumeCapacity = volumeCapacity;
	} 

	public VolumeUsageDetail volumeCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue volumeCapacity) { 
		this.volumeCapacity = volumeCapacity;
		return this;
	} 

	public java.lang.String getVolumeType() { 
		return this.volumeType;
	} 

	public void setVolumeType(java.lang.String volumeType) { 
		this.volumeType = volumeType;
	} 

	public VolumeUsageDetail volumeType(java.lang.String volumeType) { 
		this.volumeType = volumeType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public VolumeUsageDetail price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
