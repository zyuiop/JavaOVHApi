package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.Bill;
/**
 * Project bill
 */

public class BillImpl implements Bill { 

	private java.lang.String type;
	private java.lang.String billId;

	public BillImpl() {
	}

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public BillImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getBillId() { 
		return this.billId;
	} 

	public void setBillId(java.lang.String billId) { 
		this.billId = billId;
	} 

	public BillImpl billId(java.lang.String billId) { 
		this.billId = billId;
		return this;
	} 

}
