package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Live statistics of the queue
 */

public class OvhPabxHuntingAgentLiveStatus { 

	private java.util.Date lastStatusChange;
	private java.lang.String status;

	public OvhPabxHuntingAgentLiveStatus() {
	}

	public java.util.Date getLastStatusChange() { 
		return this.lastStatusChange;
	} 

	public void setLastStatusChange(java.util.Date lastStatusChange) { 
		this.lastStatusChange = lastStatusChange;
	} 

	public OvhPabxHuntingAgentLiveStatus lastStatusChange(java.util.Date lastStatusChange) { 
		this.lastStatusChange = lastStatusChange;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OvhPabxHuntingAgentLiveStatus status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
