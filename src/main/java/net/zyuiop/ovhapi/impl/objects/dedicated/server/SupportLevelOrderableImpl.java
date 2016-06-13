package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.SupportLevelOrderable;
/**
 * A structure describing informations support level orderable for this dedicated server
 */

public class SupportLevelOrderableImpl implements SupportLevelOrderable { 

	private java.lang.String levels;
	private boolean orderable;

	public SupportLevelOrderableImpl() {
	}

	public java.lang.String getLevels() { 
		return this.levels;
	} 

	public void setLevels(java.lang.String levels) { 
		this.levels = levels;
	} 

	public SupportLevelOrderableImpl levels(java.lang.String levels) { 
		this.levels = levels;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public SupportLevelOrderableImpl orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
