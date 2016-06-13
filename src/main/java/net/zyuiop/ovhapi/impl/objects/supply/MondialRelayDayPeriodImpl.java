package net.zyuiop.ovhapi.impl.objects.supply;

import net.zyuiop.ovhapi.api.objects.supply.MondialRelayDayPeriod;
/**
 * Opening range for mondial relay point
 */

public class MondialRelayDayPeriodImpl implements MondialRelayDayPeriod { 

	private java.lang.String start;
	private java.lang.String end;

	public MondialRelayDayPeriodImpl() {
	}

	public java.lang.String getStart() { 
		return this.start;
	} 

	public void setStart(java.lang.String start) { 
		this.start = start;
	} 

	public MondialRelayDayPeriodImpl start(java.lang.String start) { 
		this.start = start;
		return this;
	} 

	public java.lang.String getEnd() { 
		return this.end;
	} 

	public void setEnd(java.lang.String end) { 
		this.end = end;
	} 

	public MondialRelayDayPeriodImpl end(java.lang.String end) { 
		this.end = end;
		return this;
	} 

}
