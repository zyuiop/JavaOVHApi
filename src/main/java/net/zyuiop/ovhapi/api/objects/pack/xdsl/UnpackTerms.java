package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Terms to unpack services
 */

public class UnpackTerms { 

	private boolean isAllowed;
	private double renewPeriod;
	private net.zyuiop.ovhapi.api.objects.order.Price renewPrice;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public UnpackTerms() {
	}

	public boolean getIsAllowed() { 
		return this.isAllowed;
	} 

	public void setIsAllowed(boolean isAllowed) { 
		this.isAllowed = isAllowed;
	} 

	public UnpackTerms isAllowed(boolean isAllowed) { 
		this.isAllowed = isAllowed;
		return this;
	} 

	public double getRenewPeriod() { 
		return this.renewPeriod;
	} 

	public void setRenewPeriod(double renewPeriod) { 
		this.renewPeriod = renewPeriod;
	} 

	public UnpackTerms renewPeriod(double renewPeriod) { 
		this.renewPeriod = renewPeriod;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getRenewPrice() { 
		return this.renewPrice;
	} 

	public void setRenewPrice(net.zyuiop.ovhapi.api.objects.order.Price renewPrice) { 
		this.renewPrice = renewPrice;
	} 

	public UnpackTerms renewPrice(net.zyuiop.ovhapi.api.objects.order.Price renewPrice) { 
		this.renewPrice = renewPrice;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public UnpackTerms price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
