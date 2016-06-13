package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.FirewallOptionTCP;
/**
 * Possible option for TCP
 */

public class FirewallOptionTCPImpl implements FirewallOptionTCP { 

	private boolean fragments;
	private java.lang.String option;

	public FirewallOptionTCPImpl() {
	}

	public boolean getFragments() { 
		return this.fragments;
	} 

	public void setFragments(boolean fragments) { 
		this.fragments = fragments;
	} 

	public FirewallOptionTCPImpl fragments(boolean fragments) { 
		this.fragments = fragments;
		return this;
	} 

	public java.lang.String getOption() { 
		return this.option;
	} 

	public void setOption(java.lang.String option) { 
		this.option = option;
	} 

	public FirewallOptionTCPImpl option(java.lang.String option) { 
		this.option = option;
		return this;
	} 

}
