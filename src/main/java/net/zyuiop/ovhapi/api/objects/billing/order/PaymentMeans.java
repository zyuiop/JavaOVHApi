package net.zyuiop.ovhapi.api.objects.billing.order;

/**
 * TODO
 */

public class PaymentMeans { 

	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] paypal;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] edinar;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] multibanco;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] ovhAccount;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] fidelityPoints;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] promotion;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] creditCard;
	private net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] ideal;

	public PaymentMeans() {
	}

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getPaypal() { 
		return this.paypal;
	} 

	public void setPaypal(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] paypal) { 
		this.paypal = paypal;
	} 

	public PaymentMeans paypal(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] paypal) { 
		this.paypal = paypal;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getEdinar() { 
		return this.edinar;
	} 

	public void setEdinar(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] edinar) { 
		this.edinar = edinar;
	} 

	public PaymentMeans edinar(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] edinar) { 
		this.edinar = edinar;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getMultibanco() { 
		return this.multibanco;
	} 

	public void setMultibanco(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] multibanco) { 
		this.multibanco = multibanco;
	} 

	public PaymentMeans multibanco(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] multibanco) { 
		this.multibanco = multibanco;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getOvhAccount() { 
		return this.ovhAccount;
	} 

	public void setOvhAccount(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] ovhAccount) { 
		this.ovhAccount = ovhAccount;
	} 

	public PaymentMeans ovhAccount(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] ovhAccount) { 
		this.ovhAccount = ovhAccount;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getFidelityPoints() { 
		return this.fidelityPoints;
	} 

	public void setFidelityPoints(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] fidelityPoints) { 
		this.fidelityPoints = fidelityPoints;
	} 

	public PaymentMeans fidelityPoints(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] fidelityPoints) { 
		this.fidelityPoints = fidelityPoints;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getPromotion() { 
		return this.promotion;
	} 

	public void setPromotion(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] promotion) { 
		this.promotion = promotion;
	} 

	public PaymentMeans promotion(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] promotion) { 
		this.promotion = promotion;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getCreditCard() { 
		return this.creditCard;
	} 

	public void setCreditCard(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] creditCard) { 
		this.creditCard = creditCard;
	} 

	public PaymentMeans creditCard(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] creditCard) { 
		this.creditCard = creditCard;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] getIdeal() { 
		return this.ideal;
	} 

	public void setIdeal(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] ideal) { 
		this.ideal = ideal;
	} 

	public PaymentMeans ideal(net.zyuiop.ovhapi.api.objects.billing.order.PaymentMean[] ideal) { 
		this.ideal = ideal;
		return this;
	} 

}
