package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Live statistics of the queue
 */

public class OvhPabxHuntingQueueLiveStatistics { 

	private long totalWaitingDuration;
	private long callsTotal;
	private long callsLost;
	private long callsAnswered;
	private java.util.Date lastReset;
	private long totalCallDuration;

	public OvhPabxHuntingQueueLiveStatistics() {
	}

	public long getTotalWaitingDuration() { 
		return this.totalWaitingDuration;
	} 

	public void setTotalWaitingDuration(long totalWaitingDuration) { 
		this.totalWaitingDuration = totalWaitingDuration;
	} 

	public OvhPabxHuntingQueueLiveStatistics totalWaitingDuration(long totalWaitingDuration) { 
		this.totalWaitingDuration = totalWaitingDuration;
		return this;
	} 

	public long getCallsTotal() { 
		return this.callsTotal;
	} 

	public void setCallsTotal(long callsTotal) { 
		this.callsTotal = callsTotal;
	} 

	public OvhPabxHuntingQueueLiveStatistics callsTotal(long callsTotal) { 
		this.callsTotal = callsTotal;
		return this;
	} 

	public long getCallsLost() { 
		return this.callsLost;
	} 

	public void setCallsLost(long callsLost) { 
		this.callsLost = callsLost;
	} 

	public OvhPabxHuntingQueueLiveStatistics callsLost(long callsLost) { 
		this.callsLost = callsLost;
		return this;
	} 

	public long getCallsAnswered() { 
		return this.callsAnswered;
	} 

	public void setCallsAnswered(long callsAnswered) { 
		this.callsAnswered = callsAnswered;
	} 

	public OvhPabxHuntingQueueLiveStatistics callsAnswered(long callsAnswered) { 
		this.callsAnswered = callsAnswered;
		return this;
	} 

	public java.util.Date getLastReset() { 
		return this.lastReset;
	} 

	public void setLastReset(java.util.Date lastReset) { 
		this.lastReset = lastReset;
	} 

	public OvhPabxHuntingQueueLiveStatistics lastReset(java.util.Date lastReset) { 
		this.lastReset = lastReset;
		return this;
	} 

	public long getTotalCallDuration() { 
		return this.totalCallDuration;
	} 

	public void setTotalCallDuration(long totalCallDuration) { 
		this.totalCallDuration = totalCallDuration;
	} 

	public OvhPabxHuntingQueueLiveStatistics totalCallDuration(long totalCallDuration) { 
		this.totalCallDuration = totalCallDuration;
		return this;
	} 

}
