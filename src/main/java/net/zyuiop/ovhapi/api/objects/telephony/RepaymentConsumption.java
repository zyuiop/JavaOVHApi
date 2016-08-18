package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call which are repayable
 */

public class RepaymentConsumption { 

	private java.lang.String calling;
	private long consumptionId;
	private java.util.Date creationDatetime;
	private double price;
	private long duration;
	private java.lang.String called;

	public RepaymentConsumption() {
	}

	public java.lang.String getCalling() { 
		return this.calling;
	} 

	public void setCalling(java.lang.String calling) { 
		this.calling = calling;
	} 

	public RepaymentConsumption calling(java.lang.String calling) { 
		this.calling = calling;
		return this;
	} 

	public long getConsumptionId() { 
		return this.consumptionId;
	} 

	public void setConsumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
	} 

	public RepaymentConsumption consumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public RepaymentConsumption creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public double getPrice() { 
		return this.price;
	} 

	public void setPrice(double price) { 
		this.price = price;
	} 

	public RepaymentConsumption price(double price) { 
		this.price = price;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public RepaymentConsumption duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getCalled() { 
		return this.called;
	} 

	public void setCalled(java.lang.String called) { 
		this.called = called;
	} 

	public RepaymentConsumption called(java.lang.String called) { 
		this.called = called;
		return this;
	} 

}
