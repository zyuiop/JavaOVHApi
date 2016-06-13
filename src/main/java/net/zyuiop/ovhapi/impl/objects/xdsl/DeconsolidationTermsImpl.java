package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.DeconsolidationTerms;
/**
 * Show the deconsolidation terms
 */

public class DeconsolidationTermsImpl implements DeconsolidationTerms { 

	private net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice;
	private double engagement;
	private net.zyuiop.ovhapi.api.objects.order.Price price;

	public DeconsolidationTermsImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice() { 
		return this.monthlyPrice;
	} 

	public void setMonthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
	} 

	public DeconsolidationTermsImpl monthlyPrice(net.zyuiop.ovhapi.api.objects.order.Price monthlyPrice) { 
		this.monthlyPrice = monthlyPrice;
		return this;
	} 

	public double getEngagement() { 
		return this.engagement;
	} 

	public void setEngagement(double engagement) { 
		this.engagement = engagement;
	} 

	public DeconsolidationTermsImpl engagement(double engagement) { 
		this.engagement = engagement;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getPrice() { 
		return this.price;
	} 

	public void setPrice(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
	} 

	public DeconsolidationTermsImpl price(net.zyuiop.ovhapi.api.objects.order.Price price) { 
		this.price = price;
		return this;
	} 

}
