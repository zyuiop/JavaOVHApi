package net.zyuiop.ovhapi.impl.objects.order.cart;

import net.zyuiop.ovhapi.api.objects.order.cart.Cart;
/**
 * A shopping cart
 */

public class CartImpl implements Cart { 

	private java.lang.String cartId;
	private java.lang.String description;
	private java.util.Date expire;
	private boolean readOnly;
	private long[] items;

	public CartImpl() {
	}

	public java.lang.String getCartId() { 
		return this.cartId;
	} 

	public void setCartId(java.lang.String cartId) { 
		this.cartId = cartId;
	} 

	public CartImpl cartId(java.lang.String cartId) { 
		this.cartId = cartId;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public CartImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.util.Date getExpire() { 
		return this.expire;
	} 

	public void setExpire(java.util.Date expire) { 
		this.expire = expire;
	} 

	public CartImpl expire(java.util.Date expire) { 
		this.expire = expire;
		return this;
	} 

	public boolean getReadOnly() { 
		return this.readOnly;
	} 

	public void setReadOnly(boolean readOnly) { 
		this.readOnly = readOnly;
	} 

	public CartImpl readOnly(boolean readOnly) { 
		this.readOnly = readOnly;
		return this;
	} 

	public long[] getItems() { 
		return this.items;
	} 

	public void setItems(long[] items) { 
		this.items = items;
	} 

	public CartImpl items(long[] items) { 
		this.items = items;
		return this;
	} 

}
