package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Represents an order of VoIP lines
 */

public class VoIPLineOrder { 

	private long orderId;
	private java.lang.String orderUrl;
	private long[] taskIds;
	private boolean needPayment;

	public VoIPLineOrder() {
	}

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public VoIPLineOrder orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getOrderUrl() { 
		return this.orderUrl;
	} 

	public void setOrderUrl(java.lang.String orderUrl) { 
		this.orderUrl = orderUrl;
	} 

	public VoIPLineOrder orderUrl(java.lang.String orderUrl) { 
		this.orderUrl = orderUrl;
		return this;
	} 

	public long[] getTaskIds() { 
		return this.taskIds;
	} 

	public void setTaskIds(long[] taskIds) { 
		this.taskIds = taskIds;
	} 

	public VoIPLineOrder taskIds(long[] taskIds) { 
		this.taskIds = taskIds;
		return this;
	} 

	public boolean getNeedPayment() { 
		return this.needPayment;
	} 

	public void setNeedPayment(boolean needPayment) { 
		this.needPayment = needPayment;
	} 

	public VoIPLineOrder needPayment(boolean needPayment) { 
		this.needPayment = needPayment;
		return this;
	} 

}
