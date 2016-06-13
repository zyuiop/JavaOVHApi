package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationTraffic;
/**
 * Traffic on mitigation
 */

public class MitigationTrafficImpl implements MitigationTraffic { 

	private long bps;
	private long pps;

	public MitigationTrafficImpl() {
	}

	public long getBps() { 
		return this.bps;
	} 

	public void setBps(long bps) { 
		this.bps = bps;
	} 

	public MitigationTrafficImpl bps(long bps) { 
		this.bps = bps;
		return this;
	} 

	public long getPps() { 
		return this.pps;
	} 

	public void setPps(long pps) { 
		this.pps = pps;
	} 

	public MitigationTrafficImpl pps(long pps) { 
		this.pps = pps;
		return this;
	} 

}
