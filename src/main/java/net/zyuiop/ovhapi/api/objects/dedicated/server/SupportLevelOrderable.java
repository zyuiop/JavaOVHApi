package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations support level orderable for this dedicated server
 */

public class SupportLevelOrderable { 

	private java.lang.String[] levels;
	private boolean orderable;

	public SupportLevelOrderable() {
	}

	public java.lang.String[] getLevels() { 
		return this.levels;
	} 

	public void setLevels(java.lang.String[] levels) { 
		this.levels = levels;
	} 

	public SupportLevelOrderable levels(java.lang.String[] levels) { 
		this.levels = levels;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public SupportLevelOrderable orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
