package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus;
/**
 * Live statistics of the queue
 */

public class OvhPabxHuntingAgentLiveStatusImpl implements OvhPabxHuntingAgentLiveStatus { 

	private java.util.Date lastStatusChange;
	private java.lang.String status;

	public OvhPabxHuntingAgentLiveStatusImpl() {
	}

	public java.util.Date getLastStatusChange() { 
		return this.lastStatusChange;
	} 

	public void setLastStatusChange(java.util.Date lastStatusChange) { 
		this.lastStatusChange = lastStatusChange;
	} 

	public OvhPabxHuntingAgentLiveStatusImpl lastStatusChange(java.util.Date lastStatusChange) { 
		this.lastStatusChange = lastStatusChange;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OvhPabxHuntingAgentLiveStatusImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
