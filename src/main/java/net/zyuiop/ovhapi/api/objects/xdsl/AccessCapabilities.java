package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describe the capabilities of the Access
 */

public class AccessCapabilities { 

	private boolean canChangeDslamProfile;
	private boolean canGetRadiusConnectionLogs;
	private boolean canResetDslamPort;
	private boolean hasDslamPort;
	private boolean canChangeLns;
	private boolean canApplyLnsRateLimit;

	public AccessCapabilities() {
	}

	public boolean getCanChangeDslamProfile() { 
		return this.canChangeDslamProfile;
	} 

	public void setCanChangeDslamProfile(boolean canChangeDslamProfile) { 
		this.canChangeDslamProfile = canChangeDslamProfile;
	} 

	public AccessCapabilities canChangeDslamProfile(boolean canChangeDslamProfile) { 
		this.canChangeDslamProfile = canChangeDslamProfile;
		return this;
	} 

	public boolean getCanGetRadiusConnectionLogs() { 
		return this.canGetRadiusConnectionLogs;
	} 

	public void setCanGetRadiusConnectionLogs(boolean canGetRadiusConnectionLogs) { 
		this.canGetRadiusConnectionLogs = canGetRadiusConnectionLogs;
	} 

	public AccessCapabilities canGetRadiusConnectionLogs(boolean canGetRadiusConnectionLogs) { 
		this.canGetRadiusConnectionLogs = canGetRadiusConnectionLogs;
		return this;
	} 

	public boolean getCanResetDslamPort() { 
		return this.canResetDslamPort;
	} 

	public void setCanResetDslamPort(boolean canResetDslamPort) { 
		this.canResetDslamPort = canResetDslamPort;
	} 

	public AccessCapabilities canResetDslamPort(boolean canResetDslamPort) { 
		this.canResetDslamPort = canResetDslamPort;
		return this;
	} 

	public boolean getHasDslamPort() { 
		return this.hasDslamPort;
	} 

	public void setHasDslamPort(boolean hasDslamPort) { 
		this.hasDslamPort = hasDslamPort;
	} 

	public AccessCapabilities hasDslamPort(boolean hasDslamPort) { 
		this.hasDslamPort = hasDslamPort;
		return this;
	} 

	public boolean getCanChangeLns() { 
		return this.canChangeLns;
	} 

	public void setCanChangeLns(boolean canChangeLns) { 
		this.canChangeLns = canChangeLns;
	} 

	public AccessCapabilities canChangeLns(boolean canChangeLns) { 
		this.canChangeLns = canChangeLns;
		return this;
	} 

	public boolean getCanApplyLnsRateLimit() { 
		return this.canApplyLnsRateLimit;
	} 

	public void setCanApplyLnsRateLimit(boolean canApplyLnsRateLimit) { 
		this.canApplyLnsRateLimit = canApplyLnsRateLimit;
	} 

	public AccessCapabilities canApplyLnsRateLimit(boolean canApplyLnsRateLimit) { 
		this.canApplyLnsRateLimit = canApplyLnsRateLimit;
		return this;
	} 

}
