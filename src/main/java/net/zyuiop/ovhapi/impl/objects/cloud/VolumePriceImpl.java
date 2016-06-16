package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.VolumePrice;
/**
 * Details about volume pricing
 */

public class VolumePriceImpl implements VolumePrice { 

	private java.lang.String volumeName;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice;
	private java.lang.String region;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

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

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public VolumePriceImpl monthlyPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl monthlyPrice) { 
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

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public VolumePriceImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
