package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Tones;
/**
 * Line tones
 */

public class TonesImpl implements Tones { 

	private java.lang.String onHold;
	private java.lang.String endCall;
	private java.lang.String callWaiting;
	private java.lang.String ringback;

	public TonesImpl() {
	}

	public java.lang.String getOnHold() { 
		return this.onHold;
	} 

	public void setOnHold(java.lang.String onHold) { 
		this.onHold = onHold;
	} 

	public TonesImpl onHold(java.lang.String onHold) { 
		this.onHold = onHold;
		return this;
	} 

	public java.lang.String getEndCall() { 
		return this.endCall;
	} 

	public void setEndCall(java.lang.String endCall) { 
		this.endCall = endCall;
	} 

	public TonesImpl endCall(java.lang.String endCall) { 
		this.endCall = endCall;
		return this;
	} 

	public java.lang.String getCallWaiting() { 
		return this.callWaiting;
	} 

	public void setCallWaiting(java.lang.String callWaiting) { 
		this.callWaiting = callWaiting;
	} 

	public TonesImpl callWaiting(java.lang.String callWaiting) { 
		this.callWaiting = callWaiting;
		return this;
	} 

	public java.lang.String getRingback() { 
		return this.ringback;
	} 

	public void setRingback(java.lang.String ringback) { 
		this.ringback = ringback;
	} 

	public TonesImpl ringback(java.lang.String ringback) { 
		this.ringback = ringback;
		return this;
	} 

}
