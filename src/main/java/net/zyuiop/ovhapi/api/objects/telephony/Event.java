package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Events triggered by the line
 */

public class Event { 

	private java.lang.String protocol;
	private java.lang.String calledIdentifier;
	private java.lang.String eventType;
	private long duration;
	private java.util.Date dateTime;
	private java.lang.String direction;
	private java.lang.String id;
	private java.lang.String callingIdentifier;

	public Event() {
	}

	public java.lang.String getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(java.lang.String protocol) { 
		this.protocol = protocol;
	} 

	public Event protocol(java.lang.String protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public java.lang.String getCalledIdentifier() { 
		return this.calledIdentifier;
	} 

	public void setCalledIdentifier(java.lang.String calledIdentifier) { 
		this.calledIdentifier = calledIdentifier;
	} 

	public Event calledIdentifier(java.lang.String calledIdentifier) { 
		this.calledIdentifier = calledIdentifier;
		return this;
	} 

	public java.lang.String getEventType() { 
		return this.eventType;
	} 

	public void setEventType(java.lang.String eventType) { 
		this.eventType = eventType;
	} 

	public Event eventType(java.lang.String eventType) { 
		this.eventType = eventType;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public Event duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.util.Date getDateTime() { 
		return this.dateTime;
	} 

	public void setDateTime(java.util.Date dateTime) { 
		this.dateTime = dateTime;
	} 

	public Event dateTime(java.util.Date dateTime) { 
		this.dateTime = dateTime;
		return this;
	} 

	public java.lang.String getDirection() { 
		return this.direction;
	} 

	public void setDirection(java.lang.String direction) { 
		this.direction = direction;
	} 

	public Event direction(java.lang.String direction) { 
		this.direction = direction;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Event id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getCallingIdentifier() { 
		return this.callingIdentifier;
	} 

	public void setCallingIdentifier(java.lang.String callingIdentifier) { 
		this.callingIdentifier = callingIdentifier;
	} 

	public Event callingIdentifier(java.lang.String callingIdentifier) { 
		this.callingIdentifier = callingIdentifier;
		return this;
	} 

}
