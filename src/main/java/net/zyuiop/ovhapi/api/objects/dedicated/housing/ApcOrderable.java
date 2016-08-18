package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing informations for APC orderable for this housing bay
 */

public class ApcOrderable { 

	private boolean free;
	private boolean orderable;

	public ApcOrderable() {
	}

	public boolean getFree() { 
		return this.free;
	} 

	public void setFree(boolean free) { 
		this.free = free;
	} 

	public ApcOrderable free(boolean free) { 
		this.free = free;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public ApcOrderable orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
