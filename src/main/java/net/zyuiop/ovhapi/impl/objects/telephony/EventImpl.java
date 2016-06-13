package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Event;
/**
 * Events triggered by the line
 */

public class EventImpl implements Event { 

	private java.lang.String protocol;
	private java.lang.String calledIdentifier;
	private java.lang.String eventType;
	private long duration;
	private java.util.Date dateTime;
	private java.lang.String direction;
	private java.lang.String id;
	private java.lang.String callingIdentifier;

	public EventImpl() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public EventImpl protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getCalledIdentifier() { 
		return this.calledIdentifier;
	} 

	public void setCalledIdentifier(java.lang.String calledIdentifier) { 
		this.calledIdentifier = calledIdentifier;
	} 

	public EventImpl calledIdentifier(java.lang.String calledIdentifier) { 
		this.calledIdentifier = calledIdentifier;
		return this;
	} 

	public java.lang.String getEventType() { 
		return this.eventType;
	} 

	public void setEventType(java.lang.String eventType) { 
		this.eventType = eventType;
	} 

	public EventImpl eventType(java.lang.String eventType) { 
		this.eventType = eventType;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public EventImpl duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.util.Date getDateTime() { 
		return this.dateTime;
	} 

	public void setDateTime(java.util.Date dateTime) { 
		this.dateTime = dateTime;
	} 

	public EventImpl dateTime(java.util.Date dateTime) { 
		this.dateTime = dateTime;
		return this;
	} 

	public java.lang.String getDirection() { 
		return this.direction;
	} 

	public void setDirection(java.lang.String direction) { 
		this.direction = direction;
	} 

	public EventImpl direction(java.lang.String direction) { 
		this.direction = direction;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public EventImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getCallingIdentifier() { 
		return this.callingIdentifier;
	} 

	public void setCallingIdentifier(java.lang.String callingIdentifier) { 
		this.callingIdentifier = callingIdentifier;
	} 

	public EventImpl callingIdentifier(java.lang.String callingIdentifier) { 
		this.callingIdentifier = callingIdentifier;
		return this;
	} 

}
