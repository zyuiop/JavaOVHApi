package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.Rtm;
/**
 * Servers statistics sent by RTM (Real Time Monitoring)
 */

public class RtmImpl implements Rtm { 

	private java.lang.String currentVersion;
	private java.lang.String installedVersion;
	private boolean needsUpdate;

	public RtmImpl() {
	}

	public java.lang.String getCurrentVersion() { 
		return this.currentVersion;
	} 

	public void setCurrentVersion(java.lang.String currentVersion) { 
		this.currentVersion = currentVersion;
	} 

	public RtmImpl currentVersion(java.lang.String currentVersion) { 
		this.currentVersion = currentVersion;
		return this;
	} 

	public java.lang.String getInstalledVersion() { 
		return this.installedVersion;
	} 

	public void setInstalledVersion(java.lang.String installedVersion) { 
		this.installedVersion = installedVersion;
	} 

	public RtmImpl installedVersion(java.lang.String installedVersion) { 
		this.installedVersion = installedVersion;
		return this;
	} 

	public boolean getNeedsUpdate() { 
		return this.needsUpdate;
	} 

	public void setNeedsUpdate(boolean needsUpdate) { 
		this.needsUpdate = needsUpdate;
	} 

	public RtmImpl needsUpdate(boolean needsUpdate) { 
		this.needsUpdate = needsUpdate;
		return this;
	} 

}
