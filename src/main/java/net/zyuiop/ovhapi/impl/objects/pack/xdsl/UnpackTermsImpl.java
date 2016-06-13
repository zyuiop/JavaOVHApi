package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.UnpackTerms;
/**
 * Terms to unpack services
 */

public class UnpackTermsImpl implements UnpackTerms { 

	private boolean isAllowed;
	private double renewPeriod;
	private net.zyuiop.ovhapi.api.objects.order.Price renewPrice;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public UnpackTermsImpl() {
	}

	public boolean getIsAllowed() { 
		return this.isAllowed;
	} 

	public void setIsAllowed(boolean isAllowed) { 
		this.isAllowed = isAllowed;
	} 

	public UnpackTermsImpl isAllowed(boolean isAllowed) { 
		this.isAllowed = isAllowed;
		return this;
	} 

	public double getRenewPeriod() { 
		return this.renewPeriod;
	} 

	public void setRenewPeriod(double renewPeriod) { 
		this.renewPeriod = renewPeriod;
	} 

	public UnpackTermsImpl renewPeriod(double renewPeriod) { 
		this.renewPeriod = renewPeriod;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getRenewPrice() { 
		return this.renewPrice;
	} 

	public void setRenewPrice(net.zyuiop.ovhapi.api.objects.order.Price renewPrice) { 
		this.renewPrice = renewPrice;
	} 

	public UnpackTermsImpl renewPrice(net.zyuiop.ovhapi.api.objects.order.Price renewPrice) { 
		this.renewPrice = renewPrice;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public UnpackTermsImpl price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
