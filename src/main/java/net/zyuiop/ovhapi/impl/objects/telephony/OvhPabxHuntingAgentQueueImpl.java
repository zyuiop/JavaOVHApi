package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue;
/**
 * Agent assigned to a queue
 */

public class OvhPabxHuntingAgentQueueImpl implements OvhPabxHuntingAgentQueue { 

	private long agentId;
	private long queueId;
	private long position;

	public OvhPabxHuntingAgentQueueImpl() {
	}

	public long getAgentId() { 
		return this.agentId;
	} 

	public void setAgentId(long agentId) { 
		this.agentId = agentId;
	} 

	public OvhPabxHuntingAgentQueueImpl agentId(long agentId) { 
		this.agentId = agentId;
		return this;
	} 

	public long getQueueId() { 
		return this.queueId;
	} 

	public void setQueueId(long queueId) { 
		this.queueId = queueId;
	} 

	public OvhPabxHuntingAgentQueueImpl queueId(long queueId) { 
		this.queueId = queueId;
		return this;
	} 

	public long getPosition() { 
		return this.position;
	} 

	public void setPosition(long position) { 
		this.position = position;
	} 

	public OvhPabxHuntingAgentQueueImpl position(long position) { 
		this.position = position;
		return this;
	} 

}
