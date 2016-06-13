package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.WLAN;
/**
 * WLAN Configuration of the Modem
 */

public class WLANImpl implements WLAN { 

	private java.lang.String channelMode;
	private long taskId;
	private boolean SSIDAdvertisementEnabled;
	private java.lang.String SSID;
	private long channel;
	private java.lang.String securityType;
	private java.lang.String securityKey;
	private boolean enabled;
	private java.lang.String wifiName;

	public WLANImpl() {
	}

	public java.lang.String getChannelMode() { 
		return this.channelMode;
	} 

	public void setChannelMode(java.lang.String channelMode) { 
		this.channelMode = channelMode;
	} 

	public WLANImpl channelMode(java.lang.String channelMode) { 
		this.channelMode = channelMode;
		return this;
	} 

	public long getTaskId() { 
		return this.taskId;
	} 

	public void setTaskId(long taskId) { 
		this.taskId = taskId;
	} 

	public WLANImpl taskId(long taskId) { 
		this.taskId = taskId;
		return this;
	} 

	public boolean getSSIDAdvertisementEnabled() { 
		return this.SSIDAdvertisementEnabled;
	} 

	public void setSSIDAdvertisementEnabled(boolean SSIDAdvertisementEnabled) { 
		this.SSIDAdvertisementEnabled = SSIDAdvertisementEnabled;
	} 

	public WLANImpl SSIDAdvertisementEnabled(boolean SSIDAdvertisementEnabled) { 
		this.SSIDAdvertisementEnabled = SSIDAdvertisementEnabled;
		return this;
	} 

	public java.lang.String getSSID() { 
		return this.SSID;
	} 

	public void setSSID(java.lang.String SSID) { 
		this.SSID = SSID;
	} 

	public WLANImpl SSID(java.lang.String SSID) { 
		this.SSID = SSID;
		return this;
	} 

	public long getChannel() { 
		return this.channel;
	} 

	public void setChannel(long channel) { 
		this.channel = channel;
	} 

	public WLANImpl channel(long channel) { 
		this.channel = channel;
		return this;
	} 

	public java.lang.String getSecurityType() { 
		return this.securityType;
	} 

	public void setSecurityType(java.lang.String securityType) { 
		this.securityType = securityType;
	} 

	public WLANImpl securityType(java.lang.String securityType) { 
		this.securityType = securityType;
		return this;
	} 

	public java.lang.String getSecurityKey() { 
		return this.securityKey;
	} 

	public void setSecurityKey(java.lang.String securityKey) { 
		this.securityKey = securityKey;
	} 

	public WLANImpl securityKey(java.lang.String securityKey) { 
		this.securityKey = securityKey;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public WLANImpl enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

	public java.lang.String getWifiName() { 
		return this.wifiName;
	} 

	public void setWifiName(java.lang.String wifiName) { 
		this.wifiName = wifiName;
	} 

	public WLANImpl wifiName(java.lang.String wifiName) { 
		this.wifiName = wifiName;
		return this;
	} 

}
