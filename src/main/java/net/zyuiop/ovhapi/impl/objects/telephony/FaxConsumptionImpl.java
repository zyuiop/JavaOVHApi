package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.FaxConsumption;
/**
 * Fax delivery record
 */

public class FaxConsumptionImpl implements FaxConsumption { 

	private java.lang.String calling;
	private long consumptionId;
	private java.util.Date creationDatetime;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithoutTax;
	private java.lang.String wayType;
	private java.lang.String called;
	private long pages;

	public FaxConsumptionImpl() {
	}

	public java.lang.String getCalling() { 
		return this.calling;
	} 

	public void setCalling(java.lang.String calling) { 
		this.calling = calling;
	} 

	public FaxConsumptionImpl calling(java.lang.String calling) { 
		this.calling = calling;
		return this;
	} 

	public long getConsumptionId() { 
		return this.consumptionId;
	} 

	public void setConsumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
	} 

	public FaxConsumptionImpl consumptionId(long consumptionId) { 
		this.consumptionId = consumptionId;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public FaxConsumptionImpl creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getPriceWithoutTax() { 
		return this.priceWithoutTax;
	} 

	public void setPriceWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
	} 

	public FaxConsumptionImpl priceWithoutTax(net.zyuiop.ovhapi.impl.objects.order.PriceImpl priceWithoutTax) { 
		this.priceWithoutTax = priceWithoutTax;
		return this;
	} 

	public java.lang.String getWayType() { 
		return this.wayType;
	} 

	public void setWayType(java.lang.String wayType) { 
		this.wayType = wayType;
	} 

	public FaxConsumptionImpl wayType(java.lang.String wayType) { 
		this.wayType = wayType;
		return this;
	} 

	public java.lang.String getCalled() { 
		return this.called;
	} 

	public void setCalled(java.lang.String called) { 
		this.called = called;
	} 

	public FaxConsumptionImpl called(java.lang.String called) { 
		this.called = called;
		return this;
	} 

	public long getPages() { 
		return this.pages;
	} 

	public void setPages(long pages) { 
		this.pages = pages;
	} 

	public FaxConsumptionImpl pages(long pages) { 
		this.pages = pages;
		return this;
	} 

}
