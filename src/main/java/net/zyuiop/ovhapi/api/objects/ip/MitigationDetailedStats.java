package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Detailed statistics about your traffic
 */

public class MitigationDetailedStats { 

	private net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out;
	private long protocol;
	private long srcPort;
	private long destPort;
	private long icmpType;
	private long icmpCode;
	private net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in;
	private boolean syn;
	private boolean fragments;

	public MitigationDetailedStats() {
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getOut() { 
		return this.out;
	} 

	public void setOut(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out) { 
		this.out = out;
	} 

	public MitigationDetailedStats out(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out) { 
		this.out = out;
		return this;
	} 

	public long getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(long protocol) { 
		this.protocol = protocol;
	} 

	public MitigationDetailedStats protocol(long protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public long getSrcPort() { 
		return this.srcPort;
	} 

	public void setSrcPort(long srcPort) { 
		this.srcPort = srcPort;
	} 

	public MitigationDetailedStats srcPort(long srcPort) { 
		this.srcPort = srcPort;
		return this;
	} 

	public long getDestPort() { 
		return this.destPort;
	} 

	public void setDestPort(long destPort) { 
		this.destPort = destPort;
	} 

	public MitigationDetailedStats destPort(long destPort) { 
		this.destPort = destPort;
		return this;
	} 

	public long getIcmpType() { 
		return this.icmpType;
	} 

	public void setIcmpType(long icmpType) { 
		this.icmpType = icmpType;
	} 

	public MitigationDetailedStats icmpType(long icmpType) { 
		this.icmpType = icmpType;
		return this;
	} 

	public long getIcmpCode() { 
		return this.icmpCode;
	} 

	public void setIcmpCode(long icmpCode) { 
		this.icmpCode = icmpCode;
	} 

	public MitigationDetailedStats icmpCode(long icmpCode) { 
		this.icmpCode = icmpCode;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getIn() { 
		return this.in;
	} 

	public void setIn(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in) { 
		this.in = in;
	} 

	public MitigationDetailedStats in(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in) { 
		this.in = in;
		return this;
	} 

	public boolean getSyn() { 
		return this.syn;
	} 

	public void setSyn(boolean syn) { 
		this.syn = syn;
	} 

	public MitigationDetailedStats syn(boolean syn) { 
		this.syn = syn;
		return this;
	} 

	public boolean getFragments() { 
		return this.fragments;
	} 

	public void setFragments(boolean fragments) { 
		this.fragments = fragments;
	} 

	public MitigationDetailedStats fragments(boolean fragments) { 
		this.fragments = fragments;
		return this;
	} 

}
