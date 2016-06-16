package net.zyuiop.ovhapi.impl.objects.pack.xdsl.promotioncode;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.promotioncode.Capabilities;
/**
 * Informations about a promotion code
 */

public class CapabilitiesImpl implements Capabilities { 

	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl amount;
	private java.lang.String reasonCodes;
	private boolean canGenerate;
	private long engagement;

	public CapabilitiesImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getAmount() { 
		return this.amount;
	} 

	public void setAmount(net.zyuiop.ovhapi.impl.objects.order.PriceImpl amount) { 
		this.amount = amount;
	} 

	public CapabilitiesImpl amount(net.zyuiop.ovhapi.impl.objects.order.PriceImpl amount) { 
		this.amount = amount;
		return this;
	} 

	public java.lang.String getReasonCodes() { 
		return this.reasonCodes;
	} 

	public void setReasonCodes(java.lang.String reasonCodes) { 
		this.reasonCodes = reasonCodes;
	} 

	public CapabilitiesImpl reasonCodes(java.lang.String reasonCodes) { 
		this.reasonCodes = reasonCodes;
		return this;
	} 

	public boolean getCanGenerate() { 
		return this.canGenerate;
	} 

	public void setCanGenerate(boolean canGenerate) { 
		this.canGenerate = canGenerate;
	} 

	public CapabilitiesImpl canGenerate(boolean canGenerate) { 
		this.canGenerate = canGenerate;
		return this;
	} 

	public long getEngagement() { 
		return this.engagement;
	} 

	public void setEngagement(long engagement) { 
		this.engagement = engagement;
	} 

	public CapabilitiesImpl engagement(long engagement) { 
		this.engagement = engagement;
		return this;
	} 

}
