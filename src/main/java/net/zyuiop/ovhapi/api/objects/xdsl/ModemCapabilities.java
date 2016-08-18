package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describe the capabilities of the Modem
 */

public class ModemCapabilities { 

	private boolean canBeManagedByOvh;
	private boolean canChangeBridgeMode;
	private boolean canChangeMtu;
	private boolean canChangeManagement;
	private boolean canChangeDHCP;
	private boolean canChangeDMZ;
	private boolean canReset;
	private boolean canChangeLAN;
	private boolean canChangeEasyFirewallLevel;
	private boolean canChangeWLAN;
	private boolean canReboot;
	private boolean canChangePortMapping;
	private boolean canRefreshConnectedDevices;

	public ModemCapabilities() {
	}

	public boolean getCanBeManagedByOvh() { 
		return this.canBeManagedByOvh;
	} 

	public void setCanBeManagedByOvh(boolean canBeManagedByOvh) { 
		this.canBeManagedByOvh = canBeManagedByOvh;
	} 

	public ModemCapabilities canBeManagedByOvh(boolean canBeManagedByOvh) { 
		this.canBeManagedByOvh = canBeManagedByOvh;
		return this;
	} 

	public boolean getCanChangeBridgeMode() { 
		return this.canChangeBridgeMode;
	} 

	public void setCanChangeBridgeMode(boolean canChangeBridgeMode) { 
		this.canChangeBridgeMode = canChangeBridgeMode;
	} 

	public ModemCapabilities canChangeBridgeMode(boolean canChangeBridgeMode) { 
		this.canChangeBridgeMode = canChangeBridgeMode;
		return this;
	} 

	public boolean getCanChangeMtu() { 
		return this.canChangeMtu;
	} 

	public void setCanChangeMtu(boolean canChangeMtu) { 
		this.canChangeMtu = canChangeMtu;
	} 

	public ModemCapabilities canChangeMtu(boolean canChangeMtu) { 
		this.canChangeMtu = canChangeMtu;
		return this;
	} 

	public boolean getCanChangeManagement() { 
		return this.canChangeManagement;
	} 

	public void setCanChangeManagement(boolean canChangeManagement) { 
		this.canChangeManagement = canChangeManagement;
	} 

	public ModemCapabilities canChangeManagement(boolean canChangeManagement) { 
		this.canChangeManagement = canChangeManagement;
		return this;
	} 

	public boolean getCanChangeDHCP() { 
		return this.canChangeDHCP;
	} 

	public void setCanChangeDHCP(boolean canChangeDHCP) { 
		this.canChangeDHCP = canChangeDHCP;
	} 

	public ModemCapabilities canChangeDHCP(boolean canChangeDHCP) { 
		this.canChangeDHCP = canChangeDHCP;
		return this;
	} 

	public boolean getCanChangeDMZ() { 
		return this.canChangeDMZ;
	} 

	public void setCanChangeDMZ(boolean canChangeDMZ) { 
		this.canChangeDMZ = canChangeDMZ;
	} 

	public ModemCapabilities canChangeDMZ(boolean canChangeDMZ) { 
		this.canChangeDMZ = canChangeDMZ;
		return this;
	} 

	public boolean getCanReset() { 
		return this.canReset;
	} 

	public void setCanReset(boolean canReset) { 
		this.canReset = canReset;
	} 

	public ModemCapabilities canReset(boolean canReset) { 
		this.canReset = canReset;
		return this;
	} 

	public boolean getCanChangeLAN() { 
		return this.canChangeLAN;
	} 

	public void setCanChangeLAN(boolean canChangeLAN) { 
		this.canChangeLAN = canChangeLAN;
	} 

	public ModemCapabilities canChangeLAN(boolean canChangeLAN) { 
		this.canChangeLAN = canChangeLAN;
		return this;
	} 

	public boolean getCanChangeEasyFirewallLevel() { 
		return this.canChangeEasyFirewallLevel;
	} 

	public void setCanChangeEasyFirewallLevel(boolean canChangeEasyFirewallLevel) { 
		this.canChangeEasyFirewallLevel = canChangeEasyFirewallLevel;
	} 

	public ModemCapabilities canChangeEasyFirewallLevel(boolean canChangeEasyFirewallLevel) { 
		this.canChangeEasyFirewallLevel = canChangeEasyFirewallLevel;
		return this;
	} 

	public boolean getCanChangeWLAN() { 
		return this.canChangeWLAN;
	} 

	public void setCanChangeWLAN(boolean canChangeWLAN) { 
		this.canChangeWLAN = canChangeWLAN;
	} 

	public ModemCapabilities canChangeWLAN(boolean canChangeWLAN) { 
		this.canChangeWLAN = canChangeWLAN;
		return this;
	} 

	public boolean getCanReboot() { 
		return this.canReboot;
	} 

	public void setCanReboot(boolean canReboot) { 
		this.canReboot = canReboot;
	} 

	public ModemCapabilities canReboot(boolean canReboot) { 
		this.canReboot = canReboot;
		return this;
	} 

	public boolean getCanChangePortMapping() { 
		return this.canChangePortMapping;
	} 

	public void setCanChangePortMapping(boolean canChangePortMapping) { 
		this.canChangePortMapping = canChangePortMapping;
	} 

	public ModemCapabilities canChangePortMapping(boolean canChangePortMapping) { 
		this.canChangePortMapping = canChangePortMapping;
		return this;
	} 

	public boolean getCanRefreshConnectedDevices() { 
		return this.canRefreshConnectedDevices;
	} 

	public void setCanRefreshConnectedDevices(boolean canRefreshConnectedDevices) { 
		this.canRefreshConnectedDevices = canRefreshConnectedDevices;
	} 

	public ModemCapabilities canRefreshConnectedDevices(boolean canRefreshConnectedDevices) { 
		this.canRefreshConnectedDevices = canRefreshConnectedDevices;
		return this;
	} 

}
