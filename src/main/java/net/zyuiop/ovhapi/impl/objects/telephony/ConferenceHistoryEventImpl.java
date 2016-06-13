package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistoryEvent;
/**
 * Event of a conference (participant left/join)
 */

public class ConferenceHistoryEventImpl implements ConferenceHistoryEvent { 

	private java.lang.String callerid;
	private java.util.Date date;
	private java.lang.String type;

	public ConferenceHistoryEventImpl() {
	}

	public java.lang.String getCallerid() { 
		return this.callerid;
	} 

	public void setCallerid(java.lang.String callerid) { 
		this.callerid = callerid;
	} 

	public ConferenceHistoryEventImpl callerid(java.lang.String callerid) { 
		this.callerid = callerid;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public ConferenceHistoryEventImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ConferenceHistoryEventImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
