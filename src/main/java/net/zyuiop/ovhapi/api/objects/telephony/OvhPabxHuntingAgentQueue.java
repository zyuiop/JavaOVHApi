package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Agent assigned to a queue
 */

public class OvhPabxHuntingAgentQueue { 

	private long agentId;
	private long queueId;
	private long position;

	public OvhPabxHuntingAgentQueue() {
	}

	public long getAgentId() { 
		return this.agentId;
	} 

	public void setAgentId(long agentId) { 
		this.agentId = agentId;
	} 

	public OvhPabxHuntingAgentQueue agentId(long agentId) { 
		this.agentId = agentId;
		return this;
	} 

	public long getQueueId() { 
		return this.queueId;
	} 

	public void setQueueId(long queueId) { 
		this.queueId = queueId;
	} 

	public OvhPabxHuntingAgentQueue queueId(long queueId) { 
		this.queueId = queueId;
		return this;
	} 

	public long getPosition() { 
		return this.position;
	} 

	public void setPosition(long position) { 
		this.position = position;
	} 

	public OvhPabxHuntingAgentQueue position(long position) { 
		this.position = position;
		return this;
	} 

}
