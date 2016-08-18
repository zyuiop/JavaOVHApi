package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack tasks
 */

public class Task { 

	private java.lang.String function;
	private java.lang.String targetDomain;
	private java.lang.String status;
	private java.lang.String serviceName;
	private long orderId;
	private java.util.Date lastUpdate;
	private java.util.Date todoDate;
	private long id;

	public Task() {
	}

	public java.lang.String getFunction() { 
		return this.function;
	} 

	public void setFunction(java.lang.String function) { 
		this.function = function;
	} 

	public Task function(java.lang.String function) { 
		this.function = function;
		return this;
	} 

	public java.lang.String getTargetDomain() { 
		return this.targetDomain;
	} 

	public void setTargetDomain(java.lang.String targetDomain) { 
		this.targetDomain = targetDomain;
	} 

	public Task targetDomain(java.lang.String targetDomain) { 
		this.targetDomain = targetDomain;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Task status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Task serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public long getOrderId() { 
		return this.orderId;
	} 

	public void setOrderId(long orderId) { 
		this.orderId = orderId;
	} 

	public Task orderId(long orderId) { 
		this.orderId = orderId;
		return this;
	} 

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public Task lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public java.util.Date getTodoDate() { 
		return this.todoDate;
	} 

	public void setTodoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
	} 

	public Task todoDate(java.util.Date todoDate) { 
		this.todoDate = todoDate;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Task id(long id) { 
		this.id = id;
		return this;
	} 

}
