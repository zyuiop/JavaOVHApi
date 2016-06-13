package net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferAvailableOption;
/**
 * Available option for the offer
 */

public class OfferAvailableOptionImpl implements OfferAvailableOption { 

	private java.lang.String name;
	private long included;
	private long duration;
	private long optional;
	private net.zyuiop.ovhapi.api.objects.order.Price optionalPrice;

	public OfferAvailableOptionImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OfferAvailableOptionImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getIncluded() { 
		return this.included;
	} 

	public void setIncluded(long included) { 
		this.included = included;
	} 

	public OfferAvailableOptionImpl included(long included) { 
		this.included = included;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public OfferAvailableOptionImpl duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public long getOptional() { 
		return this.optional;
	} 

	public void setOptional(long optional) { 
		this.optional = optional;
	} 

	public OfferAvailableOptionImpl optional(long optional) { 
		this.optional = optional;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getOptionalPrice() { 
		return this.optionalPrice;
	} 

	public void setOptionalPrice(net.zyuiop.ovhapi.api.objects.order.Price optionalPrice) { 
		this.optionalPrice = optionalPrice;
	} 

	public OfferAvailableOptionImpl optionalPrice(net.zyuiop.ovhapi.api.objects.order.Price optionalPrice) { 
		this.optionalPrice = optionalPrice;
		return this;
	} 

}
