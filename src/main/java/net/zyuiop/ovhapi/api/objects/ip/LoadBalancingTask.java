package net.zyuiop.ovhapi.api.objects.ip;

/**
 * List of tasks associated with your IP load balancing
 */

public class LoadBalancingTask { 

	private java.util.Date creationDate;
	private java.lang.String status;
	private java.lang.String action;
	private long id;

	public LoadBalancingTask() {
	}

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public LoadBalancingTask creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public LoadBalancingTask status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getAction() { 
		return this.action;
	} 

	public void setAction(java.lang.String action) { 
		this.action = action;
	} 

	public LoadBalancingTask action(java.lang.String action) { 
		this.action = action;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public LoadBalancingTask id(long id) { 
		this.id = id;
		return this;
	} 

}
