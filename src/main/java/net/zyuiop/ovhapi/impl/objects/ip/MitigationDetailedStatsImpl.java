package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationDetailedStats;
/**
 * Detailed statistics about your traffic
 */

public class MitigationDetailedStatsImpl implements MitigationDetailedStats { 

	private net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl out;
	private long protocol;
	private long srcPort;
	private long destPort;
	private long icmpType;
	private long icmpCode;
	private net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl in;
	private boolean syn;
	private boolean fragments;

	public MitigationDetailedStatsImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl getOut() { 
		return this.out;
	} 

	public void setOut(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl out) { 
		this.out = out;
	} 

	public MitigationDetailedStatsImpl out(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl out) { 
		this.out = out;
		return this;
	} 

	public long getProtocol() { 
		return this.protocol;
	} 

	public void setProtocol(long protocol) { 
		this.protocol = protocol;
	} 

	public MitigationDetailedStatsImpl protocol(long protocol) { 
		this.protocol = protocol;
		return this;
	} 

	public long getSrcPort() { 
		return this.srcPort;
	} 

	public void setSrcPort(long srcPort) { 
		this.srcPort = srcPort;
	} 

	public MitigationDetailedStatsImpl srcPort(long srcPort) { 
		this.srcPort = srcPort;
		return this;
	} 

	public long getDestPort() { 
		return this.destPort;
	} 

	public void setDestPort(long destPort) { 
		this.destPort = destPort;
	} 

	public MitigationDetailedStatsImpl destPort(long destPort) { 
		this.destPort = destPort;
		return this;
	} 

	public long getIcmpType() { 
		return this.icmpType;
	} 

	public void setIcmpType(long icmpType) { 
		this.icmpType = icmpType;
	} 

	public MitigationDetailedStatsImpl icmpType(long icmpType) { 
		this.icmpType = icmpType;
		return this;
	} 

	public long getIcmpCode() { 
		return this.icmpCode;
	} 

	public void setIcmpCode(long icmpCode) { 
		this.icmpCode = icmpCode;
	} 

	public MitigationDetailedStatsImpl icmpCode(long icmpCode) { 
		this.icmpCode = icmpCode;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl getIn() { 
		return this.in;
	} 

	public void setIn(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl in) { 
		this.in = in;
	} 

	public MitigationDetailedStatsImpl in(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl in) { 
		this.in = in;
		return this;
	} 

	public boolean getSyn() { 
		return this.syn;
	} 

	public void setSyn(boolean syn) { 
		this.syn = syn;
	} 

	public MitigationDetailedStatsImpl syn(boolean syn) { 
		this.syn = syn;
		return this;
	} 

	public boolean getFragments() { 
		return this.fragments;
	} 

	public void setFragments(boolean fragments) { 
		this.fragments = fragments;
	} 

	public MitigationDetailedStatsImpl fragments(boolean fragments) { 
		this.fragments = fragments;
		return this;
	} 

}
