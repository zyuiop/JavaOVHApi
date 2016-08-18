package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * List past conferences on your number
 */

public class ConferenceHistory { 

	private java.util.Date dateEnd;
	private long duration;
	private long countConnections;
	private java.lang.String recordUrl;
	private java.util.Date dateBegin;
	private net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistoryEvent[] events;
	private long id;
	private long countParticipants;

	public ConferenceHistory() {
	}

	public java.util.Date getDateEnd() { 
		return this.dateEnd;
	} 

	public void setDateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
	} 

	public ConferenceHistory dateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public ConferenceHistory duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public long getCountConnections() { 
		return this.countConnections;
	} 

	public void setCountConnections(long countConnections) { 
		this.countConnections = countConnections;
	} 

	public ConferenceHistory countConnections(long countConnections) { 
		this.countConnections = countConnections;
		return this;
	} 

	public java.lang.String getRecordUrl() { 
		return this.recordUrl;
	} 

	public void setRecordUrl(java.lang.String recordUrl) { 
		this.recordUrl = recordUrl;
	} 

	public ConferenceHistory recordUrl(java.lang.String recordUrl) { 
		this.recordUrl = recordUrl;
		return this;
	} 

	public java.util.Date getDateBegin() { 
		return this.dateBegin;
	} 

	public void setDateBegin(java.util.Date dateBegin) { 
		this.dateBegin = dateBegin;
	} 

	public ConferenceHistory dateBegin(java.util.Date dateBegin) { 
		this.dateBegin = dateBegin;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistoryEvent[] getEvents() { 
		return this.events;
	} 

	public void setEvents(net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistoryEvent[] events) { 
		this.events = events;
	} 

	public ConferenceHistory events(net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistoryEvent[] events) { 
		this.events = events;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ConferenceHistory id(long id) { 
		this.id = id;
		return this;
	} 

	public long getCountParticipants() { 
		return this.countParticipants;
	} 

	public void setCountParticipants(long countParticipants) { 
		this.countParticipants = countParticipants;
	} 

	public ConferenceHistory countParticipants(long countParticipants) { 
		this.countParticipants = countParticipants;
		return this;
	} 

}
