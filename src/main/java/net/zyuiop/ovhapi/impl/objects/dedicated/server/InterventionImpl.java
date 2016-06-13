package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Intervention;
/**
 * Intervention made on this server
 */

public class InterventionImpl implements Intervention { 

	private java.util.Date date;
	private java.lang.String type;
	private long interventionId;

	public InterventionImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public InterventionImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public InterventionImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public long getInterventionId() { 
		return this.interventionId;
	} 

	public void setInterventionId(long interventionId) { 
		this.interventionId = interventionId;
	} 

	public InterventionImpl interventionId(long interventionId) { 
		this.interventionId = interventionId;
		return this;
	} 

}
