package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Event of a conference (participant left/join)
 */

public class ConferenceHistoryEvent { 

	private java.lang.String callerid;
	private java.util.Date date;
	private java.lang.String type;

	public ConferenceHistoryEvent() {
	}

	public java.lang.String getCallerid() { 
		return this.callerid;
	} 

	public void setCallerid(java.lang.String callerid) { 
		this.callerid = callerid;
	} 

	public ConferenceHistoryEvent callerid(java.lang.String callerid) { 
		this.callerid = callerid;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public ConferenceHistoryEvent date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ConferenceHistoryEvent type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
