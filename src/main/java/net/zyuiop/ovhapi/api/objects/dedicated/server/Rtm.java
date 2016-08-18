package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Servers statistics sent by RTM (Real Time Monitoring)
 */

public class Rtm { 

	private java.lang.String currentVersion;
	private java.lang.String installedVersion;
	private boolean needsUpdate;

	public Rtm() {
	}

	public java.lang.String getCurrentVersion() { 
		return this.currentVersion;
	} 

	public void setCurrentVersion(java.lang.String currentVersion) { 
		this.currentVersion = currentVersion;
	} 

	public Rtm currentVersion(java.lang.String currentVersion) { 
		this.currentVersion = currentVersion;
		return this;
	} 

	public java.lang.String getInstalledVersion() { 
		return this.installedVersion;
	} 

	public void setInstalledVersion(java.lang.String installedVersion) { 
		this.installedVersion = installedVersion;
	} 

	public Rtm installedVersion(java.lang.String installedVersion) { 
		this.installedVersion = installedVersion;
		return this;
	} 

	public boolean getNeedsUpdate() { 
		return this.needsUpdate;
	} 

	public void setNeedsUpdate(boolean needsUpdate) { 
		this.needsUpdate = needsUpdate;
	} 

	public Rtm needsUpdate(boolean needsUpdate) { 
		this.needsUpdate = needsUpdate;
		return this;
	} 

}
