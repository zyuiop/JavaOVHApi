package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality;
/**
 * Call diagnostic analyze structure on metric performance values
 */

public class CallDiagnosticCallQualityImpl implements CallDiagnosticCallQuality { 

	private java.lang.String codec;
	private long portDst;
	private java.lang.String callId;
	private double maxJitter;
	private java.lang.String ipDst;
	private long packets;
	private double maxDelay;
	private long portSrc;
	private long rtpLost;
	private long flowId;
	private java.util.Date timestamp;
	private java.lang.String ipSrc;
	private long mos;

	public CallDiagnosticCallQualityImpl() {
	}

	public java.lang.String getCodec() { 
		return this.codec;
	} 

	public void setCodec(java.lang.String codec) { 
		this.codec = codec;
	} 

	public CallDiagnosticCallQualityImpl codec(java.lang.String codec) { 
		this.codec = codec;
		return this;
	} 

	public long getPortDst() { 
		return this.portDst;
	} 

	public void setPortDst(long portDst) { 
		this.portDst = portDst;
	} 

	public CallDiagnosticCallQualityImpl portDst(long portDst) { 
		this.portDst = portDst;
		return this;
	} 

	public java.lang.String getCallId() { 
		return this.callId;
	} 

	public void setCallId(java.lang.String callId) { 
		this.callId = callId;
	} 

	public CallDiagnosticCallQualityImpl callId(java.lang.String callId) { 
		this.callId = callId;
		return this;
	} 

	public double getMaxJitter() { 
		return this.maxJitter;
	} 

	public void setMaxJitter(double maxJitter) { 
		this.maxJitter = maxJitter;
	} 

	public CallDiagnosticCallQualityImpl maxJitter(double maxJitter) { 
		this.maxJitter = maxJitter;
		return this;
	} 

	public java.lang.String getIpDst() { 
		return this.ipDst;
	} 

	public void setIpDst(java.lang.String ipDst) { 
		this.ipDst = ipDst;
	} 

	public CallDiagnosticCallQualityImpl ipDst(java.lang.String ipDst) { 
		this.ipDst = ipDst;
		return this;
	} 

	public long getPackets() { 
		return this.packets;
	} 

	public void setPackets(long packets) { 
		this.packets = packets;
	} 

	public CallDiagnosticCallQualityImpl packets(long packets) { 
		this.packets = packets;
		return this;
	} 

	public double getMaxDelay() { 
		return this.maxDelay;
	} 

	public void setMaxDelay(double maxDelay) { 
		this.maxDelay = maxDelay;
	} 

	public CallDiagnosticCallQualityImpl maxDelay(double maxDelay) { 
		this.maxDelay = maxDelay;
		return this;
	} 

	public long getPortSrc() { 
		return this.portSrc;
	} 

	public void setPortSrc(long portSrc) { 
		this.portSrc = portSrc;
	} 

	public CallDiagnosticCallQualityImpl portSrc(long portSrc) { 
		this.portSrc = portSrc;
		return this;
	} 

	public long getRtpLost() { 
		return this.rtpLost;
	} 

	public void setRtpLost(long rtpLost) { 
		this.rtpLost = rtpLost;
	} 

	public CallDiagnosticCallQualityImpl rtpLost(long rtpLost) { 
		this.rtpLost = rtpLost;
		return this;
	} 

	public long getFlowId() { 
		return this.flowId;
	} 

	public void setFlowId(long flowId) { 
		this.flowId = flowId;
	} 

	public CallDiagnosticCallQualityImpl flowId(long flowId) { 
		this.flowId = flowId;
		return this;
	} 

	public java.util.Date getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
	} 

	public CallDiagnosticCallQualityImpl timestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public java.lang.String getIpSrc() { 
		return this.ipSrc;
	} 

	public void setIpSrc(java.lang.String ipSrc) { 
		this.ipSrc = ipSrc;
	} 

	public CallDiagnosticCallQualityImpl ipSrc(java.lang.String ipSrc) { 
		this.ipSrc = ipSrc;
		return this;
	} 

	public long getMos() { 
		return this.mos;
	} 

	public void setMos(long mos) { 
		this.mos = mos;
	} 

	public CallDiagnosticCallQualityImpl mos(long mos) { 
		this.mos = mos;
		return this;
	} 

}
