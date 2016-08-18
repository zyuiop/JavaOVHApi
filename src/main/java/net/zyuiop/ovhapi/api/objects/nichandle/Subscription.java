package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all OVH things you can subscribe to
 */

public class Subscription { 

	private boolean registered;
	private java.lang.String type;

	public Subscription() {
	}

	public boolean getRegistered() { 
		return this.registered;
	} 

	public void setRegistered(boolean registered) { 
		this.registered = registered;
	} 

	public Subscription registered(boolean registered) { 
		this.registered = registered;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Subscription type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
