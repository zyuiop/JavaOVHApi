package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing all information about an sms pack offer
 */

public class PackOffer { 

	private double smsQuantity;
	private double giftQuantity;
	private java.lang.String language;
	private double totalPrice;
	private long quantity;
	private double giftPrice;
	private java.lang.String countryDestination;
	private double price;

	public PackOffer() {
	}

	public double getSmsQuantity() { 
		return this.smsQuantity;
	} 

	public void setSmsQuantity(double smsQuantity) { 
		this.smsQuantity = smsQuantity;
	} 

	public PackOffer smsQuantity(double smsQuantity) { 
		this.smsQuantity = smsQuantity;
		return this;
	} 

	public double getGiftQuantity() { 
		return this.giftQuantity;
	} 

	public void setGiftQuantity(double giftQuantity) { 
		this.giftQuantity = giftQuantity;
	} 

	public PackOffer giftQuantity(double giftQuantity) { 
		this.giftQuantity = giftQuantity;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public PackOffer language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public double getTotalPrice() { 
		return this.totalPrice;
	} 

	public void setTotalPrice(double totalPrice) { 
		this.totalPrice = totalPrice;
	} 

	public PackOffer totalPrice(double totalPrice) { 
		this.totalPrice = totalPrice;
		return this;
	} 

	public long getQuantity() { 
		return this.quantity;
	} 

	public void setQuantity(long quantity) { 
		this.quantity = quantity;
	} 

	public PackOffer quantity(long quantity) { 
		this.quantity = quantity;
		return this;
	} 

	public double getGiftPrice() { 
		return this.giftPrice;
	} 

	public void setGiftPrice(double giftPrice) { 
		this.giftPrice = giftPrice;
	} 

	public PackOffer giftPrice(double giftPrice) { 
		this.giftPrice = giftPrice;
		return this;
	} 

	public java.lang.String getCountryDestination() { 
		return this.countryDestination;
	} 

	public void setCountryDestination(java.lang.String countryDestination) { 
		this.countryDestination = countryDestination;
	} 

	public PackOffer countryDestination(java.lang.String countryDestination) { 
		this.countryDestination = countryDestination;
		return this;
	} 

	public double getPrice() { 
		return this.price;
	} 

	public void setPrice(double price) { 
		this.price = price;
	} 

	public PackOffer price(double price) { 
		this.price = price;
		return this;
	} 

}
