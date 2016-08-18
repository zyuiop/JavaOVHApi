package net.zyuiop.ovhapi.api.objects.cloud.project;

/**
 * Project bill
 */

public class Bill { 

	private java.lang.String type;
	private java.lang.String billId;

	public Bill() {
	}

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Bill type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getBillId() { 
		return this.billId;
	} 

	public void setBillId(java.lang.String billId) { 
		this.billId = billId;
	} 

	public Bill billId(java.lang.String billId) { 
		this.billId = billId;
		return this;
	} 

}
