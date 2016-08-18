package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Opening range for mondial relay point
 */

public class MondialRelayDayPeriod { 

	private java.lang.String start;
	private java.lang.String end;

	public MondialRelayDayPeriod() {
	}

	public java.lang.String getStart() { 
		return this.start;
	} 

	public void setStart(java.lang.String start) { 
		this.start = start;
	} 

	public MondialRelayDayPeriod start(java.lang.String start) { 
		this.start = start;
		return this;
	} 

	public java.lang.String getEnd() { 
		return this.end;
	} 

	public void setEnd(java.lang.String end) { 
		this.end = end;
	} 

	public MondialRelayDayPeriod end(java.lang.String end) { 
		this.end = end;
		return this;
	} 

}
