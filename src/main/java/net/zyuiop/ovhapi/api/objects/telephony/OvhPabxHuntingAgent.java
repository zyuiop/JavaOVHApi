package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Calls agent
 */

public class OvhPabxHuntingAgent { 

	private long agentId;
	private long wrapUpTime;
	private java.lang.String number;
	private long timeout;
	private java.lang.String status;
	private long simultaneousLines;

	public OvhPabxHuntingAgent() {
	}

	public long getAgentId() { 
		return this.agentId;
	} 

	public void setAgentId(long agentId) { 
		this.agentId = agentId;
	} 

	public OvhPabxHuntingAgent agentId(long agentId) { 
		this.agentId = agentId;
		return this;
	} 

	public long getWrapUpTime() { 
		return this.wrapUpTime;
	} 

	public void setWrapUpTime(long wrapUpTime) { 
		this.wrapUpTime = wrapUpTime;
	} 

	public OvhPabxHuntingAgent wrapUpTime(long wrapUpTime) { 
		this.wrapUpTime = wrapUpTime;
		return this;
	} 

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public OvhPabxHuntingAgent number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public long getTimeout() { 
		return this.timeout;
	} 

	public void setTimeout(long timeout) { 
		this.timeout = timeout;
	} 

	public OvhPabxHuntingAgent timeout(long timeout) { 
		this.timeout = timeout;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public OvhPabxHuntingAgent status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getSimultaneousLines() { 
		return this.simultaneousLines;
	} 

	public void setSimultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
	} 

	public OvhPabxHuntingAgent simultaneousLines(long simultaneousLines) { 
		this.simultaneousLines = simultaneousLines;
		return this;
	} 

}
