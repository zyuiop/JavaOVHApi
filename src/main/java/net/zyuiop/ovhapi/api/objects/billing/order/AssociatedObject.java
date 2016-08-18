package net.zyuiop.ovhapi.api.objects.billing.order;

/**
 * The object the processing of the order leaded to
 */

public class AssociatedObject { 

	private java.lang.String id;
	private java.lang.String type;

	public AssociatedObject() {
	}

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public AssociatedObject id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public AssociatedObject type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
