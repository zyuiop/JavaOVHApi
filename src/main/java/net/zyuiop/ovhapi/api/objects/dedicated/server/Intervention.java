package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Intervention made on this server
 */

public class Intervention { 

	private java.util.Date date;
	private java.lang.String type;
	private long interventionId;

	public Intervention() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Intervention date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Intervention type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getInterventionId() { 
		return this.interventionId;
	} 

	public void setInterventionId(long interventionId) { 
		this.interventionId = interventionId;
	} 

	public Intervention interventionId(long interventionId) { 
		this.interventionId = interventionId;
		return this;
	} 

}
