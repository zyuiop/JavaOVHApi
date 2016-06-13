package net.zyuiop.ovhapi.impl.objects.cloud.project;

import net.zyuiop.ovhapi.api.objects.cloud.project.NewProjectCredit;
/**
 * Credit details
 */

public class NewProjectCreditImpl implements NewProjectCredit { 

	private net.zyuiop.ovhapi.api.objects.order.Price total_credit;
	private net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity validity;
	private long id;
	private java.lang.String description;
	private java.lang.String products;

	public NewProjectCreditImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal_credit() { 
		return this.total_credit;
	} 

	public void setTotal_credit(net.zyuiop.ovhapi.api.objects.order.Price total_credit) { 
		this.total_credit = total_credit;
	} 

	public NewProjectCreditImpl total_credit(net.zyuiop.ovhapi.api.objects.order.Price total_credit) { 
		this.total_credit = total_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity getValidity() { 
		return this.validity;
	} 

	public void setValidity(net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity validity) { 
		this.validity = validity;
	} 

	public NewProjectCreditImpl validity(net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity validity) { 
		this.validity = validity;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public NewProjectCreditImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public NewProjectCreditImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getProducts() { 
		return this.products;
	} 

	public void setProducts(java.lang.String products) { 
		this.products = products;
	} 

	public NewProjectCreditImpl products(java.lang.String products) { 
		this.products = products;
		return this;
	} 

}
