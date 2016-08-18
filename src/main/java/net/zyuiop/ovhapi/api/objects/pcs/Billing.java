package net.zyuiop.ovhapi.api.objects.pcs;

/**
 * cloud storage billing
 */

public class Billing { 

	private java.lang.String reference;
	private java.util.Date date;
	private long quantity;
	private long id;
	private long total;
	private boolean billed;

	public Billing() {
	}

	public java.lang.String getReference() { 
		return this.reference;
	} 

	public void setReference(java.lang.String reference) { 
		this.reference = reference;
	} 

	public Billing reference(java.lang.String reference) { 
		this.reference = reference;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Billing date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public long getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(long quantity) { 
		this.quantity = quantity;
	} 

	public Billing quantity(long quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Billing id(long id) { 
		this.id = id;
		return this;
	} 

	public long getTotal() { 
		return this.total;
	} 

	public void setTotal(long total) { 
		this.total = total;
	} 

	public Billing total(long total) { 
		this.total = total;
		return this;
	} 

	public boolean getBilled() { 
		return this.billed;
	} 

	public void setBilled(boolean billed) { 
		this.billed = billed;
	} 

	public Billing billed(boolean billed) { 
		this.billed = billed;
		return this;
	} 

}
