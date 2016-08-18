package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a timeseries product pricing
 */

public class TimeseriesPricing { 

	private long priceInUcents;
	private java.lang.String pricingMode;
	private java.lang.String duration;
	private java.lang.String description;
	private long interval;
	private long minimumRepeat;
	private long maximumQuantity;
	private long maximumRepeat;
	private long minimumQuantity;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public TimeseriesPricing() {
	}

	public long getPriceInUcents() { 
		return this.priceInUcents;
	} 

	public void setPriceInUcents(long priceInUcents) { 
		this.priceInUcents = priceInUcents;
	} 

	public TimeseriesPricing priceInUcents(long priceInUcents) { 
		this.priceInUcents = priceInUcents;
		return this;
	} 

	public java.lang.String getPricingMode() { 
		return this.pricingMode;
	} 

	public void setPricingMode(java.lang.String pricingMode) { 
		this.pricingMode = pricingMode;
	} 

	public TimeseriesPricing pricingMode(java.lang.String pricingMode) { 
		this.pricingMode = pricingMode;
		return this;
	} 

	public java.lang.String getDuration() { 
		return this.duration;
	} 

	public void setDuration(java.lang.String duration) { 
		this.duration = duration;
	} 

	public TimeseriesPricing duration(java.lang.String duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public TimeseriesPricing description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public long getInterval() { 
		return this.interval;
	} 

	public void setInterval(long interval) { 
		this.interval = interval;
	} 

	public TimeseriesPricing interval(long interval) { 
		this.interval = interval;
		return this;
	} 

	public long getMinimumRepeat() { 
		return this.minimumRepeat;
	} 

	public void setMinimumRepeat(long minimumRepeat) { 
		this.minimumRepeat = minimumRepeat;
	} 

	public TimeseriesPricing minimumRepeat(long minimumRepeat) { 
		this.minimumRepeat = minimumRepeat;
		return this;
	} 

	public long getMaximumQuantity() { 
		return this.maximumQuantity;
	} 

	public void setMaximumQuantity(long maximumQuantity) { 
		this.maximumQuantity = maximumQuantity;
	} 

	public TimeseriesPricing maximumQuantity(long maximumQuantity) { 
		this.maximumQuantity = maximumQuantity;
		return this;
	} 

	public long getMaximumRepeat() { 
		return this.maximumRepeat;
	} 

	public void setMaximumRepeat(long maximumRepeat) { 
		this.maximumRepeat = maximumRepeat;
	} 

	public TimeseriesPricing maximumRepeat(long maximumRepeat) { 
		this.maximumRepeat = maximumRepeat;
		return this;
	} 

	public long getMinimumQuantity() { 
		return this.minimumQuantity;
	} 

	public void setMinimumQuantity(long minimumQuantity) { 
		this.minimumQuantity = minimumQuantity;
	} 

	public TimeseriesPricing minimumQuantity(long minimumQuantity) { 
		this.minimumQuantity = minimumQuantity;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public TimeseriesPricing price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
