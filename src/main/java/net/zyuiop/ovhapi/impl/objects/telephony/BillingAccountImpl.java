package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.BillingAccount;
/**
 * Billing Account
 */

public class BillingAccountImpl implements BillingAccount { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl allowedOutplan;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl securityDeposit;
	private java.lang.String status;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl creditThreshold;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOutplan;
	private java.lang.String description;

	public BillingAccountImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getAllowedOutplan() { 
		return this.allowedOutplan;
	} 

	public void setAllowedOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl allowedOutplan) { 
		this.allowedOutplan = allowedOutplan;
	} 

	public BillingAccountImpl allowedOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl allowedOutplan) { 
		this.allowedOutplan = allowedOutplan;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getSecurityDeposit() { 
		return this.securityDeposit;
	} 

	public void setSecurityDeposit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl securityDeposit) { 
		this.securityDeposit = securityDeposit;
	} 

	public BillingAccountImpl securityDeposit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl securityDeposit) { 
		this.securityDeposit = securityDeposit;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public BillingAccountImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getCreditThreshold() { 
		return this.creditThreshold;
	} 

	public void setCreditThreshold(net.zyuiop.ovhapi.impl.objects.order.PriceImpl creditThreshold) { 
		this.creditThreshold = creditThreshold;
	} 

	public BillingAccountImpl creditThreshold(net.zyuiop.ovhapi.impl.objects.order.PriceImpl creditThreshold) { 
		this.creditThreshold = creditThreshold;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getCurrentOutplan() { 
		return this.currentOutplan;
	} 

	public void setCurrentOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOutplan) { 
		this.currentOutplan = currentOutplan;
	} 

	public BillingAccountImpl currentOutplan(net.zyuiop.ovhapi.impl.objects.order.PriceImpl currentOutplan) { 
		this.currentOutplan = currentOutplan;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public BillingAccountImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
