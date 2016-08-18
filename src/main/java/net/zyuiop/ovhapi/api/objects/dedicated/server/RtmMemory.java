package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about server memory
 */

public class RtmMemory { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity;
	private java.lang.String slot;

	public RtmMemory() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getCapacity() { 
		return this.capacity;
	} 

	public void setCapacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
	} 

	public RtmMemory capacity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue capacity) { 
		this.capacity = capacity;
		return this;
	} 

	public java.lang.String getSlot() { 
		return this.slot;
	} 

	public void setSlot(java.lang.String slot) { 
		this.slot = slot;
	} 

	public RtmMemory slot(java.lang.String slot) { 
		this.slot = slot;
		return this;
	} 

}
