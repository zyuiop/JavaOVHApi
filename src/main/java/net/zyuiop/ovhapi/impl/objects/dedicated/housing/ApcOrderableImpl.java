package net.zyuiop.ovhapi.impl.objects.dedicated.housing;

import net.zyuiop.ovhapi.api.objects.dedicated.housing.ApcOrderable;
/**
 * A structure describing informations for APC orderable for this housing bay
 */

public class ApcOrderableImpl implements ApcOrderable { 

	private boolean free;
	private boolean orderable;

	public ApcOrderableImpl() {
	}

	public boolean getFree() { 
		return this.free;
	} 

	public void setFree(boolean free) { 
		this.free = free;
	} 

	public ApcOrderableImpl free(boolean free) { 
		this.free = free;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public ApcOrderableImpl orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
