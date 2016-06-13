package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder;
/**
 * Represents an order of VoIP lines
 */

public class VoIPLineOrderImpl implements VoIPLineOrder { 

	private long orderId;
	private java.lang.String orderUrl;
	private long[] taskIds;
	private boolean needPayment;

	public VoIPLineOrderImpl() {
	}

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public VoIPLineOrderImpl orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.lang.String getOrderUrl() { 
		return this.orderUrl;
	} 

	public void setOrderUrl(java.lang.String orderUrl) { 
		this.orderUrl = orderUrl;
	} 

	public VoIPLineOrderImpl orderUrl(java.lang.String orderUrl) { 
		this.orderUrl = orderUrl;
		return this;
	} 

	public long[] getTaskIds() { 
		return this.taskIds;
	} 

	public void setTaskIds(long[] taskIds) { 
		this.taskIds = taskIds;
	} 

	public VoIPLineOrderImpl taskIds(long[] taskIds) { 
		this.taskIds = taskIds;
		return this;
	} 

	public boolean getNeedPayment() { 
		return this.needPayment;
	} 

	public void setNeedPayment(boolean needPayment) { 
		this.needPayment = needPayment;
	} 

	public VoIPLineOrderImpl needPayment(boolean needPayment) { 
		this.needPayment = needPayment;
		return this;
	} 

}
