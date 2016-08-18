package net.zyuiop.ovhapi.api.objects.order.cart;

/**
 * A shopping cart
 */

public class Cart { 

	private java.lang.String cartId;
	private java.lang.String description;
	private java.util.Date expire;
	private boolean readOnly;
	private long[] items;

	public Cart() {
	}

	public java.lang.String getCartId() { 
		return this.cartId;
	} 

	public void setCartId(java.lang.String cartId) { 
		this.cartId = cartId;
	} 

	public Cart cartId(java.lang.String cartId) { 
		this.cartId = cartId;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Cart description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.util.Date getExpire() { 
		return this.expire;
	} 

	public void setExpire(java.util.Date expire) { 
		this.expire = expire;
	} 

	public Cart expire(java.util.Date expire) { 
		this.expire = expire;
		return this;
	} 

	public boolean getReadOnly() { 
		return this.readOnly;
	} 

	public void setReadOnly(boolean readOnly) { 
		this.readOnly = readOnly;
	} 

	public Cart readOnly(boolean readOnly) { 
		this.readOnly = readOnly;
		return this;
	} 

	public long[] getItems() { 
		return this.items;
	} 

	public void setItems(long[] items) { 
		this.items = items;
	} 

	public Cart items(long[] items) { 
		this.items = items;
		return this;
	} 

}
