package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.InstanceMonthlyBilling;
/**
 * Instance monthly billing details
 */

public class InstanceMonthlyBillingImpl implements InstanceMonthlyBilling { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl cost;
	private java.util.Date activatedOn;

	public InstanceMonthlyBillingImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getCost() { 
		return this.cost;
	} 

	public void setCost(net.zyuiop.ovhapi.impl.objects.order.PriceImpl cost) { 
		this.cost = cost;
	} 

	public InstanceMonthlyBillingImpl cost(net.zyuiop.ovhapi.impl.objects.order.PriceImpl cost) { 
		this.cost = cost;
		return this;
	} 

	public java.util.Date getActivatedOn() { 
		return this.activatedOn;
	} 

	public void setActivatedOn(java.util.Date activatedOn) { 
		this.activatedOn = activatedOn;
	} 

	public InstanceMonthlyBillingImpl activatedOn(java.util.Date activatedOn) { 
		this.activatedOn = activatedOn;
		return this;
	} 

}
