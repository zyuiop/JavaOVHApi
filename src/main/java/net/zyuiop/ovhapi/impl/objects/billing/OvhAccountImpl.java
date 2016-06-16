package net.zyuiop.ovhapi.impl.objects.billing;

import net.zyuiop.ovhapi.api.objects.billing.OvhAccount;
/**
 * Details about an OVH account
 */

public class OvhAccountImpl implements OvhAccount { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance;
	private java.util.Date lastUpdate;
	private boolean canBeCredited;
	private java.lang.String ovhAccountId;
	private java.util.Date openDate;

	public OvhAccountImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getBalance() { 
		return this.balance;
	} 

	public void setBalance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance) { 
		this.balance = balance;
	} 

	public OvhAccountImpl balance(net.zyuiop.ovhapi.impl.objects.order.PriceImpl balance) { 
		this.balance = balance;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public OvhAccountImpl lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getCanBeCredited() { 
		return this.canBeCredited;
	} 

	public void setCanBeCredited(boolean canBeCredited) { 
		this.canBeCredited = canBeCredited;
	} 

	public OvhAccountImpl canBeCredited(boolean canBeCredited) { 
		this.canBeCredited = canBeCredited;
		return this;
	} 

	public java.lang.String getOvhAccountId() { 
		return this.ovhAccountId;
	} 

	public void setOvhAccountId(java.lang.String ovhAccountId) { 
		this.ovhAccountId = ovhAccountId;
	} 

	public OvhAccountImpl ovhAccountId(java.lang.String ovhAccountId) { 
		this.ovhAccountId = ovhAccountId;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public OvhAccountImpl openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

}
