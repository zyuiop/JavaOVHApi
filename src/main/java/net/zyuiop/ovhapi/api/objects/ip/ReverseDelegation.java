package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your reverse delegations on IPv6 subnet
 */

public class ReverseDelegation { 

	private java.lang.String target;

	public ReverseDelegation() {
	}

	public java.lang.String getTarget() { 
		return this.target;
	} 

	public void setTarget(java.lang.String target) { 
		this.target = target;
	} 

	public ReverseDelegation target(java.lang.String target) { 
		this.target = target;
		return this;
	} 

}
