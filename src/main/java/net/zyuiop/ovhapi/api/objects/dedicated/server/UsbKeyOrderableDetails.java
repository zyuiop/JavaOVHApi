package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about orderable USB keys
 */

public class UsbKeyOrderableDetails { 

	private java.lang.String optionRequired;
	private long number;
	private boolean orderable;
	private long[] capacity;

	public UsbKeyOrderableDetails() {
	}

	public java.lang.String getOptionRequired() { 
		return this.optionRequired;
	} 

	public void setOptionRequired(java.lang.String optionRequired) { 
		this.optionRequired = optionRequired;
	} 

	public UsbKeyOrderableDetails optionRequired(java.lang.String optionRequired) { 
		this.optionRequired = optionRequired;
		return this;
	} 

	public long getNumber() { 
		return this.number;
	} 

	public void setNumber(long number) { 
		this.number = number;
	} 

	public UsbKeyOrderableDetails number(long number) { 
		this.number = number;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public UsbKeyOrderableDetails orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

	public long[] getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(long[] capacity) { 
		this.capacity = capacity;
	} 

	public UsbKeyOrderableDetails capacity(long[] capacity) { 
		this.capacity = capacity;
		return this;
	} 

}
