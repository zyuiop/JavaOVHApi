package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.UsbKeyOrderableDetails;
/**
 * A structure describing informations about orderable USB keys
 */

public class UsbKeyOrderableDetailsImpl implements UsbKeyOrderableDetails { 

	private java.lang.String optionRequired;
	private long number;
	private boolean orderable;
	private long[] capacity;

	public UsbKeyOrderableDetailsImpl() {
	}

	public java.lang.String getOptionRequired() { 
		return this.optionRequired;
	} 

	public void setOptionRequired(java.lang.String optionRequired) { 
		this.optionRequired = optionRequired;
	} 

	public UsbKeyOrderableDetailsImpl optionRequired(java.lang.String optionRequired) { 
		this.optionRequired = optionRequired;
		return this;
	} 

	public long getNumber() { 
		return this.number;
	} 

	public void setNumber(long number) { 
		this.number = number;
	} 

	public UsbKeyOrderableDetailsImpl number(long number) { 
		this.number = number;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public UsbKeyOrderableDetailsImpl orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

	public long[] getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(long[] capacity) { 
		this.capacity = capacity;
	} 

	public UsbKeyOrderableDetailsImpl capacity(long[] capacity) { 
		this.capacity = capacity;
		return this;
	} 

}
