package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Hardware for VoIP line
 */

public class VoIPHardware { 

	private boolean needShipping;
	private java.lang.String url;
	private java.lang.String name;
	private long max;
	private java.lang.String label;
	private java.lang.String image;
	private net.zyuiop.ovhapi.api.objects.order.Price deposit;

	public VoIPHardware() {
	}

	public boolean getNeedShipping() { 
		return this.needShipping;
	} 

	public void setNeedShipping(boolean needShipping) { 
		this.needShipping = needShipping;
	} 

	public VoIPHardware needShipping(boolean needShipping) { 
		this.needShipping = needShipping;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public VoIPHardware url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public VoIPHardware name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getMax() { 
		return this.max;
	} 

	public void setMax(long max) { 
		this.max = max;
	} 

	public VoIPHardware max(long max) { 
		this.max = max;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public VoIPHardware label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getImage() { 
		return this.image;
	} 

	public void setImage(java.lang.String image) { 
		this.image = image;
	} 

	public VoIPHardware image(java.lang.String image) { 
		this.image = image;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getDeposit() { 
		return this.deposit;
	} 

	public void setDeposit(net.zyuiop.ovhapi.api.objects.order.Price deposit) { 
		this.deposit = deposit;
	} 

	public VoIPHardware deposit(net.zyuiop.ovhapi.api.objects.order.Price deposit) { 
		this.deposit = deposit;
		return this;
	} 

}
