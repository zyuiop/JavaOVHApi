package net.zyuiop.ovhapi.api.objects.pack.xdsl.promotioncode;

/**
 * Informations about a promotion code
 */

public class Capabilities { 

	private net.zyuiop.ovhapi.api.objects.order.Price amount;
	private java.lang.String[] reasonCodes;
	private boolean canGenerate;
	private long engagement;

	public Capabilities() {
	}

	public net.zyuiop.ovhapi.api.objects.order.Price getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
	} 

	public Capabilities amount(net.zyuiop.ovhapi.api.objects.order.Price amount) { 
		this.amount = amount;
		return this;
	} 

	public java.lang.String[] getReasonCodes() { 
		return this.reasonCodes;
	} 

	public void setReasonCodes(java.lang.String[] reasonCodes) { 
		this.reasonCodes = reasonCodes;
	} 

	public Capabilities reasonCodes(java.lang.String[] reasonCodes) { 
		this.reasonCodes = reasonCodes;
		return this;
	} 

	public boolean getCanGenerate() { 
		return this.canGenerate;
	} 

	public void setCanGenerate(boolean canGenerate) { 
		this.canGenerate = canGenerate;
	} 

	public Capabilities canGenerate(boolean canGenerate) { 
		this.canGenerate = canGenerate;
		return this;
	} 

	public long getEngagement() { 
		return this.engagement;
	} 

	public void setEngagement(long engagement) { 
		this.engagement = engagement;
	} 

	public Capabilities engagement(long engagement) { 
		this.engagement = engagement;
		return this;
	} 

}
