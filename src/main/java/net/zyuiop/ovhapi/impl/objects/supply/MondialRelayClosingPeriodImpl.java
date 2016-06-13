package net.zyuiop.ovhapi.impl.objects.supply;

import net.zyuiop.ovhapi.api.objects.supply.MondialRelayClosingPeriod;
/**
 * Closing period for mondial relay point
 */

public class MondialRelayClosingPeriodImpl implements MondialRelayClosingPeriod { 

	private java.util.Date start;
	private java.util.Date end;

	public MondialRelayClosingPeriodImpl() {
	}

	public java.util.Date getStart() { 
		return this.start;
	} 

	public void setStart(java.util.Date start) { 
		this.start = start;
	} 

	public MondialRelayClosingPeriodImpl start(java.util.Date start) { 
		this.start = start;
		return this;
	} 

	public java.util.Date getEnd() { 
		return this.end;
	} 

	public void setEnd(java.util.Date end) { 
		this.end = end;
	} 

	public MondialRelayClosingPeriodImpl end(java.util.Date end) { 
		this.end = end;
		return this;
	} 

}
