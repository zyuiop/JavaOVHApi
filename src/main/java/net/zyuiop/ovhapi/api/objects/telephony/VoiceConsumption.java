package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call delivery record
 */

public class VoiceConsumption { 

	private java.lang.String calling;
	private java.lang.String planType;
	private long consumptionId;
	private net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax;
	private long duration;
	private java.lang.String destinationType;
	private java.util.Date creationDatetime;
	private java.lang.String wayType;
	private java.lang.String called;

	public VoiceConsumption() {
	}

	public java.lang.String getCalling() { 
		return this.calling;
	} 

	public void setCalling(java.lang.String calling) { 
		this.calling = calling;
	} 

	public VoiceConsumption calling(java.lang.String calling) { 
		this.calling = calling;
		return this;
	} 

	public java.lang.String getPlanType() { 
		return this.planType;
	} 

	public void setPlanType(java.lang.String planType) { 
		this.planType = planType;
	} 

	public VoiceConsumption planType(java.lang.String planType) { 
		this.planType = planType;
		return this;
	} 

	public long getConsumptionId() { 
		return this.consumptionId;
	} 

	public void setConsumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
	} 

	public VoiceConsumption consumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax() { 
		return this.priceWithoutTax;
	} 

	public void setPriceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
	} 

	public VoiceConsumption priceWithoutTax(net.zyuiop.ovhapi.api.objects.order.Price priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public VoiceConsumption duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDestinationType() { 
		return this.destinationType;
	} 

	public void setDestinationType(java.lang.String destinationType) { 
		this.destinationType = destinationType;
	} 

	public VoiceConsumption destinationType(java.lang.String destinationType) { 
		this.destinationType = destinationType;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public VoiceConsumption creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public java.lang.String getWayType() { 
		return this.wayType;
	} 

	public void setWayType(java.lang.String wayType) { 
		this.wayType = wayType;
	} 

	public VoiceConsumption wayType(java.lang.String wayType) { 
		this.wayType = wayType;
		return this;
	} 

	public java.lang.String getCalled() { 
		return this.called;
	} 

	public void setCalled(java.lang.String called) { 
		this.called = called;
	} 

	public VoiceConsumption called(java.lang.String called) { 
		this.called = called;
		return this;
	} 

}
