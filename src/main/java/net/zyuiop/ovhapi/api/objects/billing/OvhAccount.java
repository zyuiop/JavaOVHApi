package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about an OVH account
 */

public class OvhAccount { 

	private net.zyuiop.ovhapi.api.objects.order.Price balance;
	private java.util.Date lastUpdate;
	private boolean canBeCredited;
	private java.lang.String ovhAccountId;
	private java.util.Date openDate;

	public OvhAccount() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
	} 

	public OvhAccount balance(net.zyuiop.ovhapi.api.objects.order.Price balance) { 
		this.balance = balance;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public OvhAccount lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getCanBeCredited() { 
		return this.canBeCredited;
	} 

	public void setCanBeCredited(boolean canBeCredited) { 
		this.canBeCredited = canBeCredited;
	} 

	public OvhAccount canBeCredited(boolean canBeCredited) { 
		this.canBeCredited = canBeCredited;
		return this;
	} 

	public java.lang.String getOvhAccountId() { 
		return this.ovhAccountId;
	} 

	public void setOvhAccountId(java.lang.String ovhAccountId) { 
		this.ovhAccountId = ovhAccountId;
	} 

	public OvhAccount ovhAccountId(java.lang.String ovhAccountId) { 
		this.ovhAccountId = ovhAccountId;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public OvhAccount openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

}
