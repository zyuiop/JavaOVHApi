package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.VolumePrice;
/**
 * Details about volume pricing
 */

public class VolumePriceImpl implements VolumePrice { 

	private java.lang.String volumeName;
	private net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice;
	private java.lang.String region;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public VolumePriceImpl() {
	}

	public java.lang.String getVolumeName() { 
		return this.volumeName;
	} 

	public void setVolumeName(java.lang.String volumeName) { 
		this.volumeName = volumeName;
	} 

	public VolumePriceImpl volumeName(java.lang.String volumeName) { 
		this.volumeName = volumeName;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public VolumePriceImpl monthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public VolumePriceImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public VolumePriceImpl price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}