package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Closing period for mondial relay point
 */

public class MondialRelayClosingPeriod { 

	private java.util.Date start;
	private java.util.Date end;

	public MondialRelayClosingPeriod() {
	}

	public java.util.Date getStart() { 
		return this.start;
	} 

	public void setStart(java.util.Date start) { 
		this.start = start;
	} 

	public MondialRelayClosingPeriod start(java.util.Date start) { 
		this.start = start;
		return this;
	} 

	public java.util.Date getEnd() { 
		return this.end;
	} 

	public void setEnd(java.util.Date end) { 
		this.end = end;
	} 

	public MondialRelayClosingPeriod end(java.util.Date end) { 
		this.end = end;
		return this;
	} 

}
