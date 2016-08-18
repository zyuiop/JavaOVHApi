package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Information about the port on the DSLAM
 */

public class DslamPort { 

	private net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile profile;
	private java.util.Date lastSyncDate;
	private java.lang.String status;
	private java.util.Date lastDesyncDate;

	public DslamPort() {
	}

	public net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile getProfile() { 
		return this.profile;
	} 

	public void setProfile(net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile profile) { 
		this.profile = profile;
	} 

	public DslamPort profile(net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile profile) { 
		this.profile = profile;
		return this;
	} 

	public java.util.Date getLastSyncDate() { 
		return this.lastSyncDate;
	} 

	public void setLastSyncDate(java.util.Date lastSyncDate) { 
		this.lastSyncDate = lastSyncDate;
	} 

	public DslamPort lastSyncDate(java.util.Date lastSyncDate) { 
		this.lastSyncDate = lastSyncDate;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DslamPort status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getLastDesyncDate() { 
		return this.lastDesyncDate;
	} 

	public void setLastDesyncDate(java.util.Date lastDesyncDate) { 
		this.lastDesyncDate = lastDesyncDate;
	} 

	public DslamPort lastDesyncDate(java.util.Date lastDesyncDate) { 
		this.lastDesyncDate = lastDesyncDate;
		return this;
	} 

}
