package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.InstanceUsageDetail;
/**
 * Instance usage
 */

public class InstanceUsageDetailImpl implements InstanceUsageDetail { 

	private java.lang.String instanceId;
	private java.lang.String reference;
	private boolean monthlyBilling;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl hourly;
	private net.zyuiop.ovhapi.impl.objects.cloud.project.InstanceMonthlyBillingImpl monthly;

	public InstanceUsageDetailImpl() {
	}

	public java.lang.String getInstanceId() { 
		return this.instanceId;
	} 

	public void setInstanceId(java.lang.String instanceId) { 
		this.instanceId = instanceId;
	} 

	public InstanceUsageDetailImpl instanceId(java.lang.String instanceId) { 
		this.instanceId = instanceId;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public InstanceUsageDetailImpl reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public boolean getMonthlyBilling() { 
		return this.monthlyBilling;
	} 

	public void setMonthlyBilling(boolean monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
	} 

	public InstanceUsageDetailImpl monthlyBilling(boolean monthlyBilling) { 
		this.monthlyBilling = monthlyBilling;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getHourly() { 
		return this.hourly;
	} 

	public void setHourly(net.zyuiop.ovhapi.impl.objects.order.PriceImpl hourly) { 
		this.hourly = hourly;
	} 

	public InstanceUsageDetailImpl hourly(net.zyuiop.ovhapi.impl.objects.order.PriceImpl hourly) { 
		this.hourly = hourly;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.project.InstanceMonthlyBillingImpl getMonthly() { 
		return this.monthly;
	} 

	public void setMonthly(net.zyuiop.ovhapi.impl.objects.cloud.project.InstanceMonthlyBillingImpl monthly) { 
		this.monthly = monthly;
	} 

	public InstanceUsageDetailImpl monthly(net.zyuiop.ovhapi.impl.objects.cloud.project.InstanceMonthlyBillingImpl monthly) { 
		this.monthly = monthly;
		return this;
	} 

}
