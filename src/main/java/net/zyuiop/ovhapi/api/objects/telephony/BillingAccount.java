package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Billing Account
 */

public class BillingAccount { 

	private net.zyuiop.ovhapi.api.objects.order.Price allowedOutplan;
	private net.zyuiop.ovhapi.api.objects.order.Price securityDeposit;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.order.Price creditThreshold;
	private net.zyuiop.ovhapi.api.objects.order.Price currentOutplan;
	private java.lang.String description;

	public BillingAccount() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getAllowedOutplan() { 
		return this.allowedOutplan;
	} 

	public void setAllowedOutplan(net.zyuiop.ovhapi.api.objects.order.Price allowedOutplan) { 
		this.allowedOutplan = allowedOutplan;
	} 

	public BillingAccount allowedOutplan(net.zyuiop.ovhapi.api.objects.order.Price allowedOutplan) { 
		this.allowedOutplan = allowedOutplan;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getSecurityDeposit() { 
		return this.securityDeposit;
	} 

	public void setSecurityDeposit(net.zyuiop.ovhapi.api.objects.order.Price securityDeposit) { 
		this.securityDeposit = securityDeposit;
	} 

	public BillingAccount securityDeposit(net.zyuiop.ovhapi.api.objects.order.Price securityDeposit) { 
		this.securityDeposit = securityDeposit;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public BillingAccount status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getCreditThreshold() { 
		return this.creditThreshold;
	} 

	public void setCreditThreshold(net.zyuiop.ovhapi.api.objects.order.Price creditThreshold) { 
		this.creditThreshold = creditThreshold;
	} 

	public BillingAccount creditThreshold(net.zyuiop.ovhapi.api.objects.order.Price creditThreshold) { 
		this.creditThreshold = creditThreshold;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getCurrentOutplan() { 
		return this.currentOutplan;
	} 

	public void setCurrentOutplan(net.zyuiop.ovhapi.api.objects.order.Price currentOutplan) { 
		this.currentOutplan = currentOutplan;
	} 

	public BillingAccount currentOutplan(net.zyuiop.ovhapi.api.objects.order.Price currentOutplan) { 
		this.currentOutplan = currentOutplan;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public BillingAccount description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
