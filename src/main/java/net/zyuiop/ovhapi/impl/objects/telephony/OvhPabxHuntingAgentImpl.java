package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent;
/**
 * Calls agent
 */

public class OvhPabxHuntingAgentImpl implements OvhPabxHuntingAgent { 

	private long agentId;
	private long wrapUpTime;
	private java.lang.String number;
	private long timeout;
	private java.lang.String status;
	private long simultaneousLines;

	public OvhPabxHuntingAgentImpl() {
	}

	public long getAgentId() { 
		return this.agentId;
	} 

	public void setAgentId(long agentId) { 
		this.agentId = agentId;
	} 

	public OvhPabxHuntingAgentImpl agentId(long agentId) { 
		this.agentId = agentId;
		return this;
	} 

	public long getWrapUpTime() { 
		return this.wrapUpTime;
	} 

	public void setWrapUpTime(long wrapUpTime) { 
		this.wrapUpTime = wrapUpTime;
	} 

	public OvhPabxHuntingAgentImpl wrapUpTime(long wrapUpTime) { 
		this.wrapUpTime = wrapUpTime;
		return this;
	} 

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public OvhPabxHuntingAgentImpl number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public long getTimeout() { 
		return this.timeout;
	} 

	public void setTimeout(long timeout) { 
		this.timeout = timeout;
	} 

	public OvhPabxHuntingAgentImpl timeout(long timeout) { 
		this.timeout = timeout;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OvhPabxHuntingAgentImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getSimultaneousLines() { 
		return this.simultaneousLines;
	} 

	public void setSimultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
	} 

	public OvhPabxHuntingAgentImpl simultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
		return this;
	} 

}
