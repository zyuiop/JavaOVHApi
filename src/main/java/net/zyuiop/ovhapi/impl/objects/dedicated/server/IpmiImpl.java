package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Ipmi;
/**
 * Server IPMI interface
 */

public class IpmiImpl implements Ipmi { 

	private boolean activated;

	public IpmiImpl() {
	}

	public boolean getActivated() { 
		return this.activated;
	} 

	public void setActivated(boolean activated) { 
		this.activated = activated;
	} 

	public IpmiImpl activated(boolean activated) { 
		this.activated = activated;
		return this;
	} 

}
