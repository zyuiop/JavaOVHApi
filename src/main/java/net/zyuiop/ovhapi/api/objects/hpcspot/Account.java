package net.zyuiop.ovhapi.api.objects.hpcspot;

/**
 * Account HPC Spot
 */

public class Account { 

	private java.lang.String name;

	public Account() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Account name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
