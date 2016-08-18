package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * Representation of a cart item
 */

public class Item { 

	private java.lang.String offerId;
	private java.lang.String[] options;
	private java.lang.String productId;
	private java.lang.String duration;
	private net.zyuiop.ovhapi.api.objects.order.cart.DomainSettings settings;
	private long[] configurations;
	private java.lang.String cartId;
	private long itemId;
	private net.zyuiop.ovhapi.api.objects.order.cart.Price[] prices;

	public Item() {
	}

	public java.lang.String getOfferId() { 
		return this.offerId;
	} 

	public void setOfferId(java.lang.String offerId) { 
		this.offerId = offerId;
	} 

	public Item offerId(java.lang.String offerId) { 
		this.offerId = offerId;
		return this;
	} 

	public java.lang.String[] getOptions() { 
		return this.options;
	} 

	public void setOptions(java.lang.String[] options) { 
		this.options = options;
	} 

	public Item options(java.lang.String[] options) { 
		this.options = options;
		return this;
	} 

	public java.lang.String getProductId() { 
		return this.productId;
	} 

	public void setProductId(java.lang.String productId) { 
		this.productId = productId;
	} 

	public Item productId(java.lang.String productId) { 
		this.productId = productId;
		return this;
	} 

	public java.lang.String getDuration() { 
		return this.duration;
	} 

	public void setDuration(java.lang.String duration) { 
		this.duration = duration;
	} 

	public Item duration(java.lang.String duration) { 
		this.duration = duration;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.cart.DomainSettings getSettings() { 
		return this.settings;
	} 

	public void setSettings(net.zyuiop.ovhapi.api.objects.order.cart.DomainSettings settings) { 
		this.settings = settings;
	} 

	public Item settings(net.zyuiop.ovhapi.api.objects.order.cart.DomainSettings settings) { 
		this.settings = settings;
		return this;
	} 

	public long[] getConfigurations() { 
		return this.configurations;
	} 

	public void setConfigurations(long[] configurations) { 
		this.configurations = configurations;
	} 

	public Item configurations(long[] configurations) { 
		this.configurations = configurations;
		return this;
	} 

	public java.lang.String getCartId() { 
		return this.cartId;
	} 

	public void setCartId(java.lang.String cartId) { 
		this.cartId = cartId;
	} 

	public Item cartId(java.lang.String cartId) { 
		this.cartId = cartId;
		return this;
	} 

	public long getItemId() { 
		return this.itemId;
	} 

	public void setItemId(long itemId) { 
		this.itemId = itemId;
	} 

	public Item itemId(long itemId) { 
		this.itemId = itemId;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.cart.Price[] getPrices() { 
		return this.prices;
	} 

	public void setPrices(net.zyuiop.ovhapi.api.objects.order.cart.Price[] prices) { 
		this.prices = prices;
	} 

	public Item prices(net.zyuiop.ovhapi.api.objects.order.cart.Price[] prices) { 
		this.prices = prices;
		return this;
	} 

}
