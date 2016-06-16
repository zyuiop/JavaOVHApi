package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationStats;
/**
 * Traffic statistics in and out on a mitigated ip
 */

public class MitigationStatsImpl implements MitigationStats { 

	private net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl out;
	private long timestamp;
	private net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl in;

	public MitigationStatsImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl getOut() { 
		return this.out;
	} 

	public void setOut(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl out) { 
		this.out = out;
	} 

	public MitigationStatsImpl out(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl out) { 
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

	public net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl getIn() { 
		return this.in;
	} 

	public void setIn(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl in) { 
		this.in = in;
	} 

	public MitigationStatsImpl in(net.zyuiop.ovhapi.impl.objects.ip.MitigationTrafficImpl in) { 
		this.in = in;
		return this;
	} 

}
