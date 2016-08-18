package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Balance of the fidelity account
 */

public class FidelityAccount { 

	private long alertThreshold;
	private long balance;
	private java.util.Date lastUpdate;
	private boolean canBeCredited;
	private java.util.Date openDate;

	public FidelityAccount() {
	}

	public long getAlertThreshold() { 
		return this.alertThreshold;
	} 

	public void setAlertThreshold(long alertThreshold) { 
		this.alertThreshold = alertThreshold;
	} 

	public FidelityAccount alertThreshold(long alertThreshold) { 
		this.alertThreshold = alertThreshold;
		return this;
	} 

	public long getBalance() { 
		return this.balance;
	} 

	public void setBalance(long balance) { 
		this.balance = balance;
	} 

	public FidelityAccount balance(long balance) { 
		this.balance = balance;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public FidelityAccount lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getCanBeCredited() { 
		return this.canBeCredited;
	} 

	public void setCanBeCredited(boolean canBeCredited) { 
		this.canBeCredited = canBeCredited;
	} 

	public FidelityAccount canBeCredited(boolean canBeCredited) { 
		this.canBeCredited = canBeCredited;
		return this;
	} 

	public java.util.Date getOpenDate() { 
		return this.openDate;
	} 

	public void setOpenDate(java.util.Date openDate) { 
		this.openDate = openDate;
	} 

	public FidelityAccount openDate(java.util.Date openDate) { 
		this.openDate = openDate;
		return this;
	} 

}
