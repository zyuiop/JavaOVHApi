package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Traffic on mitigation
 */

public class MitigationTraffic { 

	private long bps;
	private long pps;

	public MitigationTraffic() {
	}

	public long getBps() { 
		return this.bps;
	} 

	public void setBps(long bps) { 
		this.bps = bps;
	} 

	public MitigationTraffic bps(long bps) { 
		this.bps = bps;
		return this;
	} 

	public long getPps() { 
		return this.pps;
	} 

	public void setPps(long pps) { 
		this.pps = pps;
	} 

	public MitigationTraffic pps(long pps) { 
		this.pps = pps;
		return this;
	} 

}
