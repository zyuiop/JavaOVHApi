package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.TimeseriesPricing;
/**
 * Representation of a timeseries product pricing
 */

public class TimeseriesPricingImpl implements TimeseriesPricing { 

	private long priceInUcents;
	private java.lang.String pricingMode;
	private java.lang.String duration;
	private java.lang.String description;
	private long interval;
	private long minimumRepeat;
	private long maximumQuantity;
	private long maximumRepeat;
	private long minimumQuantity;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl price;

	public TimeseriesPricingImpl() {
	}

	public long getPriceInUcents() { 
		return this.priceInUcents;
	} 

	public void setPriceInUcents(long priceInUcents) { 
		this.priceInUcents = priceInUcents;
	} 

	public TimeseriesPricingImpl priceInUcents(long priceInUcents) { 
		this.priceInUcents = priceInUcents;
		return this;
	} 

	public java.lang.String getPricingMode() { 
		return this.pricingMode;
	} 

	public void setPricingMode(java.lang.String pricingMode) { 
		this.pricingMode = pricingMode;
	} 

	public TimeseriesPricingImpl pricingMode(java.lang.String pricingMode) { 
		this.pricingMode = pricingMode;
		return this;
	} 

	public java.lang.String getDuration() { 
		return this.duration;
	} 

	public void setDuration(java.lang.String duration) { 
		this.duration = duration;
	} 

	public TimeseriesPricingImpl duration(java.lang.String duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public TimeseriesPricingImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public long getInterval() { 
		return this.interval;
	} 

	public void setInterval(long interval) { 
		this.interval = interval;
	} 

	public TimeseriesPricingImpl interval(long interval) { 
		this.interval = interval;
		return this;
	} 

	public long getMinimumRepeat() { 
		return this.minimumRepeat;
	} 

	public void setMinimumRepeat(long minimumRepeat) { 
		this.minimumRepeat = minimumRepeat;
	} 

	public TimeseriesPricingImpl minimumRepeat(long minimumRepeat) { 
		this.minimumRepeat = minimumRepeat;
		return this;
	} 

	public long getMaximumQuantity() { 
		return this.maximumQuantity;
	} 

	public void setMaximumQuantity(long maximumQuantity) { 
		this.maximumQuantity = maximumQuantity;
	} 

	public TimeseriesPricingImpl maximumQuantity(long maximumQuantity) { 
		this.maximumQuantity = maximumQuantity;
		return this;
	} 

	public long getMaximumRepeat() { 
		return this.maximumRepeat;
	} 

	public void setMaximumRepeat(long maximumRepeat) { 
		this.maximumRepeat = maximumRepeat;
	} 

	public TimeseriesPricingImpl maximumRepeat(long maximumRepeat) { 
		this.maximumRepeat = maximumRepeat;
		return this;
	} 

	public long getMinimumQuantity() { 
		return this.minimumQuantity;
	} 

	public void setMinimumQuantity(long minimumQuantity) { 
		this.minimumQuantity = minimumQuantity;
	} 

	public TimeseriesPricingImpl minimumQuantity(long minimumQuantity) { 
		this.minimumQuantity = minimumQuantity;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
	} 

	public TimeseriesPricingImpl price(net.zyuiop.ovhapi.impl.objects.order.PriceImpl price) { 
		this.price = price;
		return this;
	} 

}
