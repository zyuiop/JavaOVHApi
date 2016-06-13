package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.BoostHistory;
/**
 * History of your boost requests
 */

public class BoostHistoryImpl implements BoostHistory { 

	private java.lang.String accountId;
	private java.lang.String offer;
	private java.util.Date date;
	private java.lang.String boostOffer;

	public BoostHistoryImpl() {
	}

	public java.lang.String getAccountId() { 
		return this.accountId;
	} 

	public void setAccountId(java.lang.String accountId) { 
		this.accountId = accountId;
	} 

	public BoostHistoryImpl accountId(java.lang.String accountId) { 
		this.accountId = accountId;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public BoostHistoryImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public BoostHistoryImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getBoostOffer() { 
		return this.boostOffer;
	} 

	public void setBoostOffer(java.lang.String boostOffer) { 
		this.boostOffer = boostOffer;
	} 

	public BoostHistoryImpl boostOffer(java.lang.String boostOffer) { 
		this.boostOffer = boostOffer;
		return this;
	} 

}
