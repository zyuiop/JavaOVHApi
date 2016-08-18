package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Available option for the offer
 */

public class OfferAvailableOption { 

	private java.lang.String name;
	private long included;
	private long duration;
	private long optional;
	private net.zyuiop.ovhapi.api.objects.order.Price optionalPrice;

	public OfferAvailableOption() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OfferAvailableOption name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getIncluded() { 
		return this.included;
	} 

	public void setIncluded(long included) { 
		this.included = included;
	} 

	public OfferAvailableOption included(long included) { 
		this.included = included;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public OfferAvailableOption duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public long getOptional() { 
		return this.optional;
	} 

	public void setOptional(long optional) { 
		this.optional = optional;
	} 

	public OfferAvailableOption optional(long optional) { 
		this.optional = optional;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getOptionalPrice() { 
		return this.optionalPrice;
	} 

	public void setOptionalPrice(net.zyuiop.ovhapi.api.objects.order.Price optionalPrice) { 
		this.optionalPrice = optionalPrice;
	} 

	public OfferAvailableOption optionalPrice(net.zyuiop.ovhapi.api.objects.order.Price optionalPrice) { 
		this.optionalPrice = optionalPrice;
		return this;
	} 

}
