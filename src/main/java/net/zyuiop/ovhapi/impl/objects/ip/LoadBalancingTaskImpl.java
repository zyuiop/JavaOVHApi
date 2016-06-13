package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask;
/**
 * List of tasks associated with your IP load balancing
 */

public class LoadBalancingTaskImpl implements LoadBalancingTask { 

	private java.util.Date creationDate;
	private java.lang.String status;
	private java.lang.String action;
	private long id;

	public LoadBalancingTaskImpl() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public LoadBalancingTaskImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public LoadBalancingTaskImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public LoadBalancingTaskImpl action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public LoadBalancingTaskImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
