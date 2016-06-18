package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistory;
/**
 * List past conferences on your number
 */

public class ConferenceHistoryImpl implements ConferenceHistory { 

	private java.util.Date dateEnd;
	private long duration;
	private long countConnections;
	private java.lang.String recordUrl;
	private java.util.Date dateBegin;
	private net.zyuiop.ovhapi.impl.objects.telephony.ConferenceHistoryEventImpl[] events;
	private long id;
	private long countParticipants;

	public ConferenceHistoryImpl() {
	}

	public java.util.Date getDateEnd() { 
		return this.dateEnd;
	} 

	public void setDateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
	} 

	public ConferenceHistoryImpl dateEnd(java.util.Date dateEnd) { 
		this.dateEnd = dateEnd;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public ConferenceHistoryImpl duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public long getCountConnections() { 
		return this.countConnections;
	} 

	public void setCountConnections(long countConnections) { 
		this.countConnections = countConnections;
	} 

	public ConferenceHistoryImpl countConnections(long countConnections) { 
		this.countConnections = countConnections;
		return this;
	} 

	public java.lang.String getRecordUrl() { 
		return this.recordUrl;
	} 

	public void setRecordUrl(java.lang.String recordUrl) { 
		this.recordUrl = recordUrl;
	} 

	public ConferenceHistoryImpl recordUrl(java.lang.String recordUrl) { 
		this.recordUrl = recordUrl;
		return this;
	} 

	public java.util.Date getDateBegin() { 
		return this.dateBegin;
	} 

	public void setDateBegin(java.util.Date dateBegin) { 
		this.dateBegin = dateBegin;
	} 

	public ConferenceHistoryImpl dateBegin(java.util.Date dateBegin) { 
		this.dateBegin = dateBegin;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.telephony.ConferenceHistoryEventImpl[] getEvents() { 
		return this.events;
	} 

	public void setEvents(net.zyuiop.ovhapi.impl.objects.telephony.ConferenceHistoryEventImpl[] events) { 
		this.events = events;
	} 

	public ConferenceHistoryImpl events(net.zyuiop.ovhapi.impl.objects.telephony.ConferenceHistoryEventImpl[] events) { 
		this.events = events;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ConferenceHistoryImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public long getCountParticipants() { 
		return this.countParticipants;
	} 

	public void setCountParticipants(long countParticipants) { 
		this.countParticipants = countParticipants;
	} 

	public ConferenceHistoryImpl countParticipants(long countParticipants) { 
		this.countParticipants = countParticipants;
		return this;
	} 

}
