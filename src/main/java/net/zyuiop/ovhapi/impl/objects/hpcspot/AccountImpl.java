package net.zyuiop.ovhapi.impl.objects.hpcspot;

import net.zyuiop.ovhapi.api.objects.hpcspot.Account;
/**
 * Account HPC Spot
 */

public class AccountImpl implements Account { 

	private java.lang.String name;

	public AccountImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AccountImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
