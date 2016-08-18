package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Line tones
 */

public class Tones { 

	private java.lang.String onHold;
	private java.lang.String endCall;
	private java.lang.String callWaiting;
	private java.lang.String ringback;

	public Tones() {
	}

	public java.lang.String getOnHold() { 
		return this.onHold;
	} 

	public void setOnHold(java.lang.String onHold) { 
		this.onHold = onHold;
	} 

	public Tones onHold(java.lang.String onHold) { 
		this.onHold = onHold;
		return this;
	} 

	public java.lang.String getEndCall() { 
		return this.endCall;
	} 

	public void setEndCall(java.lang.String endCall) { 
		this.endCall = endCall;
	} 

	public Tones endCall(java.lang.String endCall) { 
		this.endCall = endCall;
		return this;
	} 

	public java.lang.String getCallWaiting() { 
		return this.callWaiting;
	} 

	public void setCallWaiting(java.lang.String callWaiting) { 
		this.callWaiting = callWaiting;
	} 

	public Tones callWaiting(java.lang.String callWaiting) { 
		this.callWaiting = callWaiting;
		return this;
	} 

	public java.lang.String getRingback() { 
		return this.ringback;
	} 

	public void setRingback(java.lang.String ringback) { 
		this.ringback = ringback;
	} 

	public Tones ringback(java.lang.String ringback) { 
		this.ringback = ringback;
		return this;
	} 

}
