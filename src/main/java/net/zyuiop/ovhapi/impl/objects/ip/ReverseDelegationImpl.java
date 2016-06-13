package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation;
/**
 * Your reverse delegations on IPv6 subnet
 */

public class ReverseDelegationImpl implements ReverseDelegation { 

	private java.lang.String target;

	public ReverseDelegationImpl() {
	}

	public java.lang.String getTarget() { 
		return this.target;
	} 

	public void setTarget(java.lang.String target) { 
		this.target = target;
	} 

	public ReverseDelegationImpl target(java.lang.String target) { 
		this.target = target;
		return this;
	} 

}
