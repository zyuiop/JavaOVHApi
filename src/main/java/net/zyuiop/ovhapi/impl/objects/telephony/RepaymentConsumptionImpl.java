package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.RepaymentConsumption;
/**
 * Call which are repayable
 */

public class RepaymentConsumptionImpl implements RepaymentConsumption { 

	private java.lang.String calling;
	private long consumptionId;
	private java.util.Date creationDatetime;
	private double price;
	private long duration;
	private java.lang.String called;

	public RepaymentConsumptionImpl() {
	}

	public java.lang.String getCalling() { 
		return this.calling;
	} 

	public void setCalling(java.lang.String calling) { 
		this.calling = calling;
	} 

	public RepaymentConsumptionImpl calling(java.lang.String calling) { 
		this.calling = calling;
		return this;
	} 

	public long getConsumptionId() { 
		return this.consumptionId;
	} 

	public void setConsumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
	} 

	public RepaymentConsumptionImpl consumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public RepaymentConsumptionImpl creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public double getPrice() { 
		return this.price;
	} 

	public void setPrice(double price) { 
		this.price = price;
	} 

	public RepaymentConsumptionImpl price(double price) { 
		this.price = price;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public RepaymentConsumptionImpl duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getCalled() { 
		return this.called;
	} 

	public void setCalled(java.lang.String called) { 
		this.called = called;
	} 

	public RepaymentConsumptionImpl called(java.lang.String called) { 
		this.called = called;
		return this;
	} 

}
