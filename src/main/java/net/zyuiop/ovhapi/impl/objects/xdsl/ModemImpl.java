package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.Modem;
/**
 * Modem
 */

public class ModemImpl implements Modem { 

	private long mtuSize;
	private java.lang.String macAddress;
	private java.util.Date lastCwmpRequestDate;
	private java.lang.String model;
	private boolean ipv6Support;
	private boolean managedByOvh;
	private java.lang.String dmzIP;
	private java.lang.String easyFirewallLevel;
	private boolean isBridged;
	private java.lang.String brandName;
	private net.zyuiop.ovhapi.impl.objects.xdsl.ModemCapabilitiesImpl capabilities;

	public ModemImpl() {
	}

	public long getMtuSize() { 
		return this.mtuSize;
	} 

	public void setMtuSize(long mtuSize) { 
		this.mtuSize = mtuSize;
	} 

	public ModemImpl mtuSize(long mtuSize) { 
		this.mtuSize = mtuSize;
		return this;
	} 

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public ModemImpl macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.util.Date getLastCwmpRequestDate() { 
		return this.lastCwmpRequestDate;
	} 

	public void setLastCwmpRequestDate(java.util.Date lastCwmpRequestDate) { 
		this.lastCwmpRequestDate = lastCwmpRequestDate;
	} 

	public ModemImpl lastCwmpRequestDate(java.util.Date lastCwmpRequestDate) { 
		this.lastCwmpRequestDate = lastCwmpRequestDate;
		return this;
	} 

	public java.lang.String getModel() { 
		return this.model;
	} 

	public void setModel(java.lang.String model) { 
		this.model = model;
	} 

	public ModemImpl model(java.lang.String model) { 
		this.model = model;
		return this;
	} 

	public boolean getIpv6Support() { 
		return this.ipv6Support;
	} 

	public void setIpv6Support(boolean ipv6Support) { 
		this.ipv6Support = ipv6Support;
	} 

	public ModemImpl ipv6Support(boolean ipv6Support) { 
		this.ipv6Support = ipv6Support;
		return this;
	} 

	public boolean getManagedByOvh() { 
		return this.managedByOvh;
	} 

	public void setManagedByOvh(boolean managedByOvh) { 
		this.managedByOvh = managedByOvh;
	} 

	public ModemImpl managedByOvh(boolean managedByOvh) { 
		this.managedByOvh = managedByOvh;
		return this;
	} 

	public java.lang.String getDmzIP() { 
		return this.dmzIP;
	} 

	public void setDmzIP(java.lang.String dmzIP) { 
		this.dmzIP = dmzIP;
	} 

	public ModemImpl dmzIP(java.lang.String dmzIP) { 
		this.dmzIP = dmzIP;
		return this;
	} 

	public java.lang.String getEasyFirewallLevel() { 
		return this.easyFirewallLevel;
	} 

	public void setEasyFirewallLevel(java.lang.String easyFirewallLevel) { 
		this.easyFirewallLevel = easyFirewallLevel;
	} 

	public ModemImpl easyFirewallLevel(java.lang.String easyFirewallLevel) { 
		this.easyFirewallLevel = easyFirewallLevel;
		return this;
	} 

	public boolean getIsBridged() { 
		return this.isBridged;
	} 

	public void setIsBridged(boolean isBridged) { 
		this.isBridged = isBridged;
	} 

	public ModemImpl isBridged(boolean isBridged) { 
		this.isBridged = isBridged;
		return this;
	} 

	public java.lang.String getBrandName() { 
		return this.brandName;
	} 

	public void setBrandName(java.lang.String brandName) { 
		this.brandName = brandName;
	} 

	public ModemImpl brandName(java.lang.String brandName) { 
		this.brandName = brandName;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.ModemCapabilitiesImpl getCapabilities() { 
		return this.capabilities;
	} 

	public void setCapabilities(net.zyuiop.ovhapi.impl.objects.xdsl.ModemCapabilitiesImpl capabilities) { 
		this.capabilities = capabilities;
	} 

	public ModemImpl capabilities(net.zyuiop.ovhapi.impl.objects.xdsl.ModemCapabilitiesImpl capabilities) { 
		this.capabilities = capabilities;
		return this;
	} 

}
