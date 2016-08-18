package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Instance monthly billing details
 */

public class InstanceMonthlyBilling { 

	private net.zyuiop.ovhapi.api.objects.order.Price cost;
	private java.util.Date activatedOn;

	public InstanceMonthlyBilling() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getCost() { 
		return this.cost;
	} 

	public void setCost(net.zyuiop.ovhapi.api.objects.order.Price cost) { 
		this.cost = cost;
	} 

	public InstanceMonthlyBilling cost(net.zyuiop.ovhapi.api.objects.order.Price cost) { 
		this.cost = cost;
		return this;
	} 

	public java.util.Date getActivatedOn() { 
		return this.activatedOn;
	} 

	public void setActivatedOn(java.util.Date activatedOn) { 
		this.activatedOn = activatedOn;
	} 

	public InstanceMonthlyBilling activatedOn(java.util.Date activatedOn) { 
		this.activatedOn = activatedOn;
		return this;
	} 

}
