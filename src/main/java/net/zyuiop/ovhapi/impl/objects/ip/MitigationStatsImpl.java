package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationStats;
/**
 * Traffic statistics in and out on a mitigated ip
 */

public class MitigationStatsImpl implements MitigationStats { 

	private net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out;
	private long timestamp;
	private net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in;

	public MitigationStatsImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getOut() { 
		return this.out;
	} 

	public void setOut(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out) { 
		this.out = out;
	} 

	public MitigationStatsImpl out(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out) { 
		this.out = out;
		return this;
	} 

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public MitigationStatsImpl timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getIn() { 
		return this.in;
	} 

	public void setIn(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in) { 
		this.in = in;
	} 

	public MitigationStatsImpl in(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in) { 
		this.in = in;
		return this;
	} 

}
