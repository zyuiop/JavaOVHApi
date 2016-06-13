package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.MitigationProfile;
/**
 * Mitigation profile for your ip
 */

public class MitigationProfileImpl implements MitigationProfile { 

	private java.lang.String ipMitigationProfile;
	private long autoMitigationTimeOut;
	private java.lang.String state;

	public MitigationProfileImpl() {
	}

	public java.lang.String getIpMitigationProfile() { 
		return this.ipMitigationProfile;
	} 

	public void setIpMitigationProfile(java.lang.String ipMitigationProfile) { 
		this.ipMitigationProfile = ipMitigationProfile;
	} 

	public MitigationProfileImpl ipMitigationProfile(java.lang.String ipMitigationProfile) { 
		this.ipMitigationProfile = ipMitigationProfile;
		return this;
	} 

	public long getAutoMitigationTimeOut() { 
		return this.autoMitigationTimeOut;
	} 

	public void setAutoMitigationTimeOut(long autoMitigationTimeOut) { 
		this.autoMitigationTimeOut = autoMitigationTimeOut;
	} 

	public MitigationProfileImpl autoMitigationTimeOut(long autoMitigationTimeOut) { 
		this.autoMitigationTimeOut = autoMitigationTimeOut;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public MitigationProfileImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
