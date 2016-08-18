package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Live statistics of the queue
 */

public class OvhPabxHuntingQueueLiveCalls { 

	private java.lang.String callerIdNumber;
	private java.lang.String callerIdName;
	private java.lang.String state;
	private java.util.Date end;
	private java.lang.String agent;
	private long id;
	private java.util.Date begin;
	private java.util.Date answered;

	public OvhPabxHuntingQueueLiveCalls() {
	}

	public java.lang.String getCallerIdNumber() { 
		return this.callerIdNumber;
	} 

	public void setCallerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
	} 

	public OvhPabxHuntingQueueLiveCalls callerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
		return this;
	} 

	public java.lang.String getCallerIdName() { 
		return this.callerIdName;
	} 

	public void setCallerIdName(java.lang.String callerIdName) { 
		this.callerIdName = callerIdName;
	} 

	public OvhPabxHuntingQueueLiveCalls callerIdName(java.lang.String callerIdName) { 
		this.callerIdName = callerIdName;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public OvhPabxHuntingQueueLiveCalls state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

	public java.util.Date getEnd() { 
		return this.end;
	} 

	public void setEnd(java.util.Date end) { 
		this.end = end;
	} 

	public OvhPabxHuntingQueueLiveCalls end(java.util.Date end) { 
		this.end = end;
		return this;
	} 

	public java.lang.String getAgent() { 
		return this.agent;
	} 

	public void setAgent(java.lang.String agent) { 
		this.agent = agent;
	} 

	public OvhPabxHuntingQueueLiveCalls agent(java.lang.String agent) { 
		this.agent = agent;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public OvhPabxHuntingQueueLiveCalls id(long id) { 
		this.id = id;
		return this;
	} 

	public java.util.Date getBegin() { 
		return this.begin;
	} 

	public void setBegin(java.util.Date begin) { 
		this.begin = begin;
	} 

	public OvhPabxHuntingQueueLiveCalls begin(java.util.Date begin) { 
		this.begin = begin;
		return this;
	} 

	public java.util.Date getAnswered() { 
		return this.answered;
	} 

	public void setAnswered(java.util.Date answered) { 
		this.answered = answered;
	} 

	public OvhPabxHuntingQueueLiveCalls answered(java.util.Date answered) { 
		this.answered = answered;
		return this;
	} 

}
