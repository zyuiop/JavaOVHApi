package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Show the deconsolidation terms
 */

public class DeconsolidationTerms { 

	private net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice;
	private double engagement;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public DeconsolidationTerms() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public DeconsolidationTerms monthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public double getEngagement() { 
		return this.engagement;
	} 

	public void setEngagement(double engagement) { 
		this.engagement = engagement;
	} 

	public DeconsolidationTerms engagement(double engagement) { 
		this.engagement = engagement;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public DeconsolidationTerms price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
