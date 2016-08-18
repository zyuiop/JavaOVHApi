package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Traffic statistics in and out on a mitigated ip
 */

public class MitigationStats { 

	private net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out;
	private long timestamp;
	private net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in;

	public MitigationStats() {
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getOut() { 
		return this.out;
	} 

	public void setOut(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out) { 
		this.out = out;
	} 

	public MitigationStats out(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic out) { 
		this.out = out;
		return this;
	} 

	public long getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(long timestamp) { 
		this.timestamp = timestamp;
	} 

	public MitigationStats timestamp(long timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic getIn() { 
		return this.in;
	} 

	public void setIn(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in) { 
		this.in = in;
	} 

	public MitigationStats in(net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic in) { 
		this.in = in;
		return this;
	} 

}
