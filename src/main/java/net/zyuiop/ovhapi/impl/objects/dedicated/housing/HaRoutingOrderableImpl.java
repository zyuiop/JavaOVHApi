package net.zyuiop.ovhapi.impl.objects.dedicated.housing;

import net.zyuiop.ovhapi.api.objects.dedicated.housing.HaRoutingOrderable;
/**
 * A structure describing informations for High Availability routing service orderable for this housing bay
 */

public class HaRoutingOrderableImpl implements HaRoutingOrderable { 

	private java.lang.String offer;
	private boolean orderable;

	public HaRoutingOrderableImpl() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public HaRoutingOrderableImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public HaRoutingOrderableImpl orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

}
