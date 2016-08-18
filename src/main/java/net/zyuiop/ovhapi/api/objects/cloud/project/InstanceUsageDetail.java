package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Instance usage
 */

public class InstanceUsageDetail { 

	private java.lang.String instanceId;
	private java.lang.String reference;
	private boolean monthlyBilling;
	private net.zyuiop.ovhapi.api.objects.order.Price hourly;
	private net.zyuiop.ovhapi.api.objects.cloud.project.InstanceMonthlyBilling monthly;

	public InstanceUsageDetail() {
	}

	public java.lang.String getInstanceId() { 
		return this.instanceId;
	} 

	public void setInstanceId(java.lang.String instanceId) { 
		this.instanceId = instanceId;
	} 

	public InstanceUsageDetail instanceId(java.lang.String instanceId) { 
		this.instanceId = instanceId;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public InstanceUsageDetail reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public boolean getMonthlyBilling() { 
		return this.monthlyBilling;
	} 

	public void setMonthlyBilling(boolean monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
	} 

	public InstanceUsageDetail monthlyBilling(boolean monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getHourly() { 
		return this.hourly;
	} 

	public void setHourly(net.zyuiop.ovhapi.api.objects.order.Price hourly) { 
		this.hourly = hourly;
	} 

	public InstanceUsageDetail hourly(net.zyuiop.ovhapi.api.objects.order.Price hourly) { 
		this.hourly = hourly;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.project.InstanceMonthlyBilling getMonthly() { 
		return this.monthly;
	} 

	public void setMonthly(net.zyuiop.ovhapi.api.objects.cloud.project.InstanceMonthlyBilling monthly) { 
		this.monthly = monthly;
	} 

	public InstanceUsageDetail monthly(net.zyuiop.ovhapi.api.objects.cloud.project.InstanceMonthlyBilling monthly) { 
		this.monthly = monthly;
		return this;
	} 

}
