package net.zyuiop.ovhapi.api.objects.hpcspot;

/**
 * Detail of a HPC Spot consumtion
 */

public class Consumption { 

	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity;
	private java.lang.String description;
	private long hpcspotItemId;
	private java.lang.String hpcspotUrl;
	private java.lang.String reference;
	private long orderId;
	private long id;
	private java.lang.String type;
	private java.util.Date hpcspotItemEndDate;

	public Consumption() {
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity) { 
		this.quantity = quantity;
	} 

	public Consumption quantity(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Consumption description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public long getHpcspotItemId() { 
		return this.hpcspotItemId;
	} 

	public void setHpcspotItemId(long hpcspotItemId) { 
		this.hpcspotItemId = hpcspotItemId;
	} 

	public Consumption hpcspotItemId(long hpcspotItemId) { 
		this.hpcspotItemId = hpcspotItemId;
		return this;
	} 

	public java.lang.String getHpcspotUrl() { 
		return this.hpcspotUrl;
	} 

	public void setHpcspotUrl(java.lang.String hpcspotUrl) { 
		this.hpcspotUrl = hpcspotUrl;
	} 

	public Consumption hpcspotUrl(java.lang.String hpcspotUrl) { 
		this.hpcspotUrl = hpcspotUrl;
		return this;
	} 

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public Consumption reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public Consumption orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Consumption id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Consumption type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.util.Date getHpcspotItemEndDate() { 
		return this.hpcspotItemEndDate;
	} 

	public void setHpcspotItemEndDate(java.util.Date hpcspotItemEndDate) { 
		this.hpcspotItemEndDate = hpcspotItemEndDate;
	} 

	public Consumption hpcspotItemEndDate(java.util.Date hpcspotItemEndDate) { 
		this.hpcspotItemEndDate = hpcspotItemEndDate;
		return this;
	} 

}
