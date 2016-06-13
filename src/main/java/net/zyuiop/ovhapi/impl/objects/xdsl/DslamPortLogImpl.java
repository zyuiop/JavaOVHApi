package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.DslamPortLog;
/**
 * A message log from the DSLAM
 */

public class DslamPortLogImpl implements DslamPortLog { 

	private long numberOfOccurrences;
	private java.util.Date lastOccurrenceDate;
	private java.util.Date date;
	private java.lang.String message;

	public DslamPortLogImpl() {
	}

	public long getNumberOfOccurrences() { 
		return this.numberOfOccurrences;
	} 

	public void setNumberOfOccurrences(long numberOfOccurrences) { 
		this.numberOfOccurrences = numberOfOccurrences;
	} 

	public DslamPortLogImpl numberOfOccurrences(long numberOfOccurrences) { 
		this.numberOfOccurrences = numberOfOccurrences;
		return this;
	} 

	public java.util.Date getLastOccurrenceDate() { 
		return this.lastOccurrenceDate;
	} 

	public void setLastOccurrenceDate(java.util.Date lastOccurrenceDate) { 
		this.lastOccurrenceDate = lastOccurrenceDate;
	} 

	public DslamPortLogImpl lastOccurrenceDate(java.util.Date lastOccurrenceDate) { 
		this.lastOccurrenceDate = lastOccurrenceDate;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public DslamPortLogImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public DslamPortLogImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
