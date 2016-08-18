package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Information about a product for Order/Cart
 */

public class ProductInformation { 

	private java.lang.String deliveryTime;
	private java.lang.String productId;
	private java.lang.String[] duration;
	private boolean orderable;
	private net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements[] configurations;
	private java.lang.String phase;
	private long quantityMax;
	private net.zyuiop.ovhapi.api.objects.order.cart.Price prices;

	public ProductInformation() {
	}

	public java.lang.String getDeliveryTime() { 
		return this.deliveryTime;
	} 

	public void setDeliveryTime(java.lang.String deliveryTime) { 
		this.deliveryTime = deliveryTime;
	} 

	public ProductInformation deliveryTime(java.lang.String deliveryTime) { 
		this.deliveryTime = deliveryTime;
		return this;
	} 

	public java.lang.String getProductId() { 
		return this.productId;
	} 

	public void setProductId(java.lang.String productId) { 
		this.productId = productId;
	} 

	public ProductInformation productId(java.lang.String productId) { 
		this.productId = productId;
		return this;
	} 

	public java.lang.String[] getDuration() { 
		return this.duration;
	} 

	public void setDuration(java.lang.String[] duration) { 
		this.duration = duration;
	} 

	public ProductInformation duration(java.lang.String[] duration) { 
		this.duration = duration;
		return this;
	} 

	public boolean getOrderable() { 
		return this.orderable;
	} 

	public void setOrderable(boolean orderable) { 
		this.orderable = orderable;
	} 

	public ProductInformation orderable(boolean orderable) { 
		this.orderable = orderable;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements[] getConfigurations() { 
		return this.configurations;
	} 

	public void setConfigurations(net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements[] configurations) { 
		this.configurations = configurations;
	} 

	public ProductInformation configurations(net.zyuiop.ovhapi.api.objects.order.cart.ConfigurationRequirements[] configurations) { 
		this.configurations = configurations;
		return this;
	} 

	public java.lang.String getPhase() { 
		return this.phase;
	} 

	public void setPhase(java.lang.String phase) { 
		this.phase = phase;
	} 

	public ProductInformation phase(java.lang.String phase) { 
		this.phase = phase;
		return this;
	} 

	public long getQuantityMax() { 
		return this.quantityMax;
	} 

	public void setQuantityMax(long quantityMax) { 
		this.quantityMax = quantityMax;
	} 

	public ProductInformation quantityMax(long quantityMax) { 
		this.quantityMax = quantityMax;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.cart.Price getPrices() { 
		return this.prices;
	} 

	public void setPrices(net.zyuiop.ovhapi.api.objects.order.cart.Price prices) { 
		this.prices = prices;
	} 

	public ProductInformation prices(net.zyuiop.ovhapi.api.objects.order.cart.Price prices) { 
		this.prices = prices;
		return this;
	} 

}
