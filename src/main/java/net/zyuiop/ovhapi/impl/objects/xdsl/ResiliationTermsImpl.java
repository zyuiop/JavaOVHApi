package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms;
/**
 * Show the resiliation terms
 */

public class ResiliationTermsImpl implements ResiliationTerms { 

	private java.util.Date minResiliationDate;
	private net.zyuiop.ovhapi.api.objects.order.Price due;
	private java.util.Date resiliationDate;
	private java.util.Date engageDate;

	public ResiliationTermsImpl() {
	}

	public java.util.Date getMinResiliationDate() { 
		return this.minResiliationDate;
	} 

	public void setMinResiliationDate(java.util.Date minResiliationDate) { 
		this.minResiliationDate = minResiliationDate;
	} 

	public ResiliationTermsImpl minResiliationDate(java.util.Date minResiliationDate) { 
		this.minResiliationDate = minResiliationDate;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getDue() { 
		return this.due;
	} 

	public void setDue(net.zyuiop.ovhapi.api.objects.order.Price due) { 
		this.due = due;
	} 

	public ResiliationTermsImpl due(net.zyuiop.ovhapi.api.objects.order.Price due) { 
		this.due = due;
		return this;
	} 

	public java.util.Date getResiliationDate() { 
		return this.resiliationDate;
	} 

	public void setResiliationDate(java.util.Date resiliationDate) { 
		this.resiliationDate = resiliationDate;
	} 

	public ResiliationTermsImpl resiliationDate(java.util.Date resiliationDate) { 
		this.resiliationDate = resiliationDate;
		return this;
	} 

	public java.util.Date getEngageDate() { 
		return this.engageDate;
	} 

	public void setEngageDate(java.util.Date engageDate) { 
		this.engageDate = engageDate;
	} 

	public ResiliationTermsImpl engageDate(java.util.Date engageDate) { 
		this.engageDate = engageDate;
		return this;
	} 

}
