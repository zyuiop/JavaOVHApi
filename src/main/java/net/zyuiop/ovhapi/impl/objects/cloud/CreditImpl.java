package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.Credit;
/**
 * Cloud credit
 */

public class CreditImpl implements Credit { 

	private java.lang.String voucher;
	private java.lang.String description;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl used_credit;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl available_credit;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl total_credit;
	private net.zyuiop.ovhapi.impl.objects.cloud.common.VoucherValidityImpl validity;
	private long id;
	private java.lang.String bill;
	private java.lang.String products;

	public CreditImpl() {
	}

	public java.lang.String getVoucher() { 
		return this.voucher;
	} 

	public void setVoucher(java.lang.String voucher) { 
		this.voucher = voucher;
	} 

	public CreditImpl voucher(java.lang.String voucher) { 
		this.voucher = voucher;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public CreditImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getUsed_credit() { 
		return this.used_credit;
	} 

	public void setUsed_credit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl used_credit) { 
		this.used_credit = used_credit;
	} 

	public CreditImpl used_credit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl used_credit) { 
		this.used_credit = used_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getAvailable_credit() { 
		return this.available_credit;
	} 

	public void setAvailable_credit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl available_credit) { 
		this.available_credit = available_credit;
	} 

	public CreditImpl available_credit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl available_credit) { 
		this.available_credit = available_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getTotal_credit() { 
		return this.total_credit;
	} 

	public void setTotal_credit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl total_credit) { 
		this.total_credit = total_credit;
	} 

	public CreditImpl total_credit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl total_credit) { 
		this.total_credit = total_credit;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.common.VoucherValidityImpl getValidity() { 
		return this.validity;
	} 

	public void setValidity(net.zyuiop.ovhapi.impl.objects.cloud.common.VoucherValidityImpl validity) { 
		this.validity = validity;
	} 

	public CreditImpl validity(net.zyuiop.ovhapi.impl.objects.cloud.common.VoucherValidityImpl validity) { 
		this.validity = validity;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public CreditImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getBill() { 
		return this.bill;
	} 

	public void setBill(java.lang.String bill) { 
		this.bill = bill;
	} 

	public CreditImpl bill(java.lang.String bill) { 
		this.bill = bill;
		return this;
	} 

	public java.lang.String getProducts() { 
		return this.products;
	} 

	public void setProducts(java.lang.String products) { 
		this.products = products;
	} 

	public CreditImpl products(java.lang.String products) { 
		this.products = products;
		return this;
	} 

}
