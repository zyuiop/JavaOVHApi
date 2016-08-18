package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Possible option for TCP
 */

public class FirewallOptionTCP { 

	private boolean fragments;
	private java.lang.String option;

	public FirewallOptionTCP() {
	}

	public boolean getFragments() { 
		return this.fragments;
	} 

	public void setFragments(boolean fragments) { 
		this.fragments = fragments;
	} 

	public FirewallOptionTCP fragments(boolean fragments) { 
		this.fragments = fragments;
		return this;
	} 

	public java.lang.String getOption() { 
		return this.option;
	} 

	public void setOption(java.lang.String option) { 
		this.option = option;
	} 

	public FirewallOptionTCP option(java.lang.String option) { 
		this.option = option;
		return this;
	} 

}
