package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Calls queue
 */

public class OvhPabxHuntingQueue { 

	private long maxMember;
	private long maxWaitTime;
	private long queueId;
	private java.lang.String strategy;

	public OvhPabxHuntingQueue() {
	}

	public long getMaxMember() { 
		return this.maxMember;
	} 

	public void setMaxMember(long maxMember) { 
		this.maxMember = maxMember;
	} 

	public OvhPabxHuntingQueue maxMember(long maxMember) { 
		this.maxMember = maxMember;
		return this;
	} 

	public long getMaxWaitTime() { 
		return this.maxWaitTime;
	} 

	public void setMaxWaitTime(long maxWaitTime) { 
		this.maxWaitTime = maxWaitTime;
	} 

	public OvhPabxHuntingQueue maxWaitTime(long maxWaitTime) { 
		this.maxWaitTime = maxWaitTime;
		return this;
	} 

	public long getQueueId() { 
		return this.queueId;
	} 

	public void setQueueId(long queueId) { 
		this.queueId = queueId;
	} 

	public OvhPabxHuntingQueue queueId(long queueId) { 
		this.queueId = queueId;
		return this;
	} 

	public java.lang.String getStrategy() { 
		return this.strategy;
	} 

	public void setStrategy(java.lang.String strategy) { 
		this.strategy = strategy;
	} 

	public OvhPabxHuntingQueue strategy(java.lang.String strategy) { 
		this.strategy = strategy;
		return this;
	} 

}
