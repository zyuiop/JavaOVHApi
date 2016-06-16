package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPHardware;
/**
 * Hardware for VoIP line
 */

public class VoIPHardwareImpl implements VoIPHardware { 

	private boolean needShipping;
	private java.lang.String url;
	private java.lang.String name;
	private long max;
	private java.lang.String label;
	private java.lang.String image;
	private net.zyuiop.ovhapi.impl.objects.order.PriceImpl deposit;

	public VoIPHardwareImpl() {
	}

	public boolean getNeedShipping() { 
		return this.needShipping;
	} 

	public void setNeedShipping(boolean needShipping) { 
		this.needShipping = needShipping;
	} 

	public VoIPHardwareImpl needShipping(boolean needShipping) { 
		this.needShipping = needShipping;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public VoIPHardwareImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public VoIPHardwareImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getMax() { 
		return this.max;
	} 

	public void setMax(long max) { 
		this.max = max;
	} 

	public VoIPHardwareImpl max(long max) { 
		this.max = max;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public VoIPHardwareImpl label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getImage() { 
		return this.image;
	} 

	public void setImage(java.lang.String image) { 
		this.image = image;
	} 

	public VoIPHardwareImpl image(java.lang.String image) { 
		this.image = image;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.order.PriceImpl getDeposit() { 
		return this.deposit;
	} 

	public void setDeposit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl deposit) { 
		this.deposit = deposit;
	} 

	public VoIPHardwareImpl deposit(net.zyuiop.ovhapi.impl.objects.order.PriceImpl deposit) { 
		this.deposit = deposit;
		return this;
	} 

}
