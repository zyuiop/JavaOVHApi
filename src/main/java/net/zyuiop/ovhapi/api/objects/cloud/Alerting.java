package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Cloud alerting consumption
 */

public class Alerting { 

	private java.lang.String email;
	private long monthlyThreshold;
	private java.util.Date creationDate;
	private long delay;
	private java.lang.String id;
	private net.zyuiop.ovhapi.api.objects.order.Price formattedMonthlyThreshold;

	public Alerting() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public Alerting email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public long getMonthlyThreshold() { 
		return this.monthlyThreshold;
	} 

	public void setMonthlyThreshold(long monthlyThreshold) { 
		this.monthlyThreshold = monthlyThreshold;
	} 

	public Alerting monthlyThreshold(long monthlyThreshold) { 
		this.monthlyThreshold = monthlyThreshold;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Alerting creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public long getDelay() { 
		return this.delay;
	} 

	public void setDelay(long delay) { 
		this.delay = delay;
	} 

	public Alerting delay(long delay) { 
		this.delay = delay;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Alerting id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.order.Price getFormattedMonthlyThreshold() { 
		return this.formattedMonthlyThreshold;
	} 

	public void setFormattedMonthlyThreshold(net.zyuiop.ovhapi.api.objects.order.Price formattedMonthlyThreshold) { 
		this.formattedMonthlyThreshold = formattedMonthlyThreshold;
	} 

	public Alerting formattedMonthlyThreshold(net.zyuiop.ovhapi.api.objects.order.Price formattedMonthlyThreshold) { 
		this.formattedMonthlyThreshold = formattedMonthlyThreshold;
		return this;
	} 

}
