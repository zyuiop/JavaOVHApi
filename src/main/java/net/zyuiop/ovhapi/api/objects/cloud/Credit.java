package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud credit
 */

public class Credit { 

	private java.lang.String voucher;
	private java.lang.String description;
	private net.zyuiop.ovhapi.api.objects.order.Price used_credit;
	private net.zyuiop.ovhapi.api.objects.order.Price available_credit;
	private net.zyuiop.ovhapi.api.objects.order.Price total_credit;
	private net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity validity;
	private long id;
	private java.lang.String bill;
	private java.lang.String[] products;

	public Credit() {
	}

	public java.lang.String getVoucher() { 
		return this.voucher;
	} 

	public void setVoucher(java.lang.String voucher) { 
		this.voucher = voucher;
	} 

	public Credit voucher(java.lang.String voucher) { 
		this.voucher = voucher;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Credit description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getUsed_credit() { 
		return this.used_credit;
	} 

	public void setUsed_credit(net.zyuiop.ovhapi.api.objects.order.Price used_credit) { 
		this.used_credit = used_credit;
	} 

	public Credit used_credit(net.zyuiop.ovhapi.api.objects.order.Price used_credit) { 
		this.used_credit = used_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getAvailable_credit() { 
		return this.available_credit;
	} 

	public void setAvailable_credit(net.zyuiop.ovhapi.api.objects.order.Price available_credit) { 
		this.available_credit = available_credit;
	} 

	public Credit available_credit(net.zyuiop.ovhapi.api.objects.order.Price available_credit) { 
		this.available_credit = available_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getTotal_credit() { 
		return this.total_credit;
	} 

	public void setTotal_credit(net.zyuiop.ovhapi.api.objects.order.Price total_credit) { 
		this.total_credit = total_credit;
	} 

	public Credit total_credit(net.zyuiop.ovhapi.api.objects.order.Price total_credit) { 
		this.total_credit = total_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity getValidity() { 
		return this.validity;
	} 

	public void setValidity(net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity validity) { 
		this.validity = validity;
	} 

	public Credit validity(net.zyuiop.ovhapi.api.objects.cloud.common.VoucherValidity validity) { 
		this.validity = validity;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Credit id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getBill() { 
		return this.bill;
	} 

	public void setBill(java.lang.String bill) { 
		this.bill = bill;
	} 

	public Credit bill(java.lang.String bill) { 
		this.bill = bill;
		return this;
	} 

	public java.lang.String[] getProducts() { 
		return this.products;
	} 

	public void setProducts(java.lang.String[] products) { 
		this.products = products;
	} 

	public Credit products(java.lang.String[] products) { 
		this.products = products;
		return this;
	} 

}
