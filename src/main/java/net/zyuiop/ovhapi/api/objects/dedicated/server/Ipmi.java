package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Server IPMI interface
 */

public class Ipmi { 

	private boolean activated;

	public Ipmi() {
	}

	public boolean getActivated() { 
		return this.activated;
	} 

	public void setActivated(boolean activated) { 
		this.activated = activated;
	} 

	public Ipmi activated(boolean activated) { 
		this.activated = activated;
		return this;
	} 

}
