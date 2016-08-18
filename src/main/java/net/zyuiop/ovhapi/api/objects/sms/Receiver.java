package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms receivers preloaded
 */

public class Receiver { 

	private long slotId;
	private long records;
	private java.lang.String description;
	private java.util.Date datetime;

	public Receiver() {
	}

	public long getSlotId() { 
		return this.slotId;
	} 

	public void setSlotId(long slotId) { 
		this.slotId = slotId;
	} 

	public Receiver slotId(long slotId) { 
		this.slotId = slotId;
		return this;
	} 

	public long getRecords() { 
		return this.records;
	} 

	public void setRecords(long records) { 
		this.records = records;
	} 

	public Receiver records(long records) { 
		this.records = records;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Receiver description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public Receiver datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

}
