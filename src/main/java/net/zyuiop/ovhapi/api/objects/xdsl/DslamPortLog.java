package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * A message log from the DSLAM
 */

public class DslamPortLog { 

	private long numberOfOccurrences;
	private java.util.Date lastOccurrenceDate;
	private java.util.Date date;
	private java.lang.String message;

	public DslamPortLog() {
	}

	public long getNumberOfOccurrences() { 
		return this.numberOfOccurrences;
	} 

	public void setNumberOfOccurrences(long numberOfOccurrences) { 
		this.numberOfOccurrences = numberOfOccurrences;
	} 

	public DslamPortLog numberOfOccurrences(long numberOfOccurrences) { 
		this.numberOfOccurrences = numberOfOccurrences;
		return this;
	} 

	public java.util.Date getLastOccurrenceDate() { 
		return this.lastOccurrenceDate;
	} 

	public void setLastOccurrenceDate(java.util.Date lastOccurrenceDate) { 
		this.lastOccurrenceDate = lastOccurrenceDate;
	} 

	public DslamPortLog lastOccurrenceDate(java.util.Date lastOccurrenceDate) { 
		this.lastOccurrenceDate = lastOccurrenceDate;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public DslamPortLog date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public DslamPortLog message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
