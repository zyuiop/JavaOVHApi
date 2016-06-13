package net.zyuiop.ovhapi.impl.objects.billing.order;

import net.zyuiop.ovhapi.api.objects.billing.order.AssociatedObject;
/**
 * The object the processing of the order leaded to
 */

public class AssociatedObjectImpl implements AssociatedObject { 

	private java.lang.String id;
	private java.lang.String type;

	public AssociatedObjectImpl() {
	}

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public AssociatedObjectImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public AssociatedObjectImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
