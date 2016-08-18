package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Mitigation profile for your ip
 */

public class MitigationProfile { 

	private java.lang.String ipMitigationProfile;
	private long autoMitigationTimeOut;
	private java.lang.String state;

	public MitigationProfile() {
	}

	public java.lang.String getIpMitigationProfile() { 
		return this.ipMitigationProfile;
	} 

	public void setIpMitigationProfile(java.lang.String ipMitigationProfile) { 
		this.ipMitigationProfile = ipMitigationProfile;
	} 

	public MitigationProfile ipMitigationProfile(java.lang.String ipMitigationProfile) { 
		this.ipMitigationProfile = ipMitigationProfile;
		return this;
	} 

	public long getAutoMitigationTimeOut() { 
		return this.autoMitigationTimeOut;
	} 

	public void setAutoMitigationTimeOut(long autoMitigationTimeOut) { 
		this.autoMitigationTimeOut = autoMitigationTimeOut;
	} 

	public MitigationProfile autoMitigationTimeOut(long autoMitigationTimeOut) { 
		this.autoMitigationTimeOut = autoMitigationTimeOut;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public MitigationProfile state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
