package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing informations for High Availability routing service orderable for this housing bay
 */

public class HaRoutingOrderable { 

	private java.lang.String[] offer;
	private boolean orderable;

	public HaRoutingOrderable() {
	}

	public java.lang.String[] getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String[] offer) { 
		this.offer = offer;
	} 

	public HaRoutingOrderable offer(java.lang.String[] offer) { 
		this.offer = offer;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public HaRoutingOrderable orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
