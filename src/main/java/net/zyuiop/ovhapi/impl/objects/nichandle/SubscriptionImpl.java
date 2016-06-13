package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.Subscription;
/**
 * List of all OVH things you can subscribe to
 */

public class SubscriptionImpl implements Subscription { 

	private boolean registered;
	private java.lang.String type;

	public SubscriptionImpl() {
	}

	public boolean getRegistered() { 
		return this.registered;
	} 

	public void setRegistered(boolean registered) { 
		this.registered = registered;
	} 

	public SubscriptionImpl registered(boolean registered) { 
		this.registered = registered;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public SubscriptionImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
