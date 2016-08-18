package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of dedicated order properties
 */

public class DedicatedSettings { 

	private java.lang.String durationUnit;
	private java.lang.String pricingMode;
	private long quantity;
	private java.lang.String planCode;
	private long duration;

	public DedicatedSettings() {
	}

	public java.lang.String getDurationUnit() { 
		return this.durationUnit;
	} 

	public void setDurationUnit(java.lang.String durationUnit) { 
		this.durationUnit = durationUnit;
	} 

	public DedicatedSettings durationUnit(java.lang.String durationUnit) { 
		this.durationUnit = durationUnit;
		return this;
	} 

	public java.lang.String getPricingMode() { 
		return this.pricingMode;
	} 

	public void setPricingMode(java.lang.String pricingMode) { 
		this.pricingMode = pricingMode;
	} 

	public DedicatedSettings pricingMode(java.lang.String pricingMode) { 
		this.pricingMode = pricingMode;
		return this;
	} 

	public long getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(long quantity) { 
		this.quantity = quantity;
	} 

	public DedicatedSettings quantity(long quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public java.lang.String getPlanCode() { 
		return this.planCode;
	} 

	public void setPlanCode(java.lang.String planCode) { 
		this.planCode = planCode;
	} 

	public DedicatedSettings planCode(java.lang.String planCode) { 
		this.planCode = planCode;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public DedicatedSettings duration(long duration) { 
		this.duration = duration;
		return this;
	} 

}
