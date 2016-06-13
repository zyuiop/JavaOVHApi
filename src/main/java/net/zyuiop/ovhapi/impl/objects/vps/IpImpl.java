package net.zyuiop.ovhapi.impl.objects.vps;

import net.zyuiop.ovhapi.api.objects.vps.Ip;
/**
 * Information about an IP address for a VPS Virtual Machine
 */

public class IpImpl implements Ip { 

	private java.lang.String macAddress;
	private java.lang.String version;
	private java.lang.String ipAddress;
	private java.lang.String type;
	private java.lang.String geolocation;
	private java.lang.String reverse;

	public IpImpl() {
	}

	public java.lang.String getMacAddress() { 
		return this.macAddress;
	} 

	public void setMacAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
	} 

	public IpImpl macAddress(java.lang.String macAddress) { 
		this.macAddress = macAddress;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public IpImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getIpAddress() { 
		return this.ipAddress;
	} 

	public void setIpAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
	} 

	public IpImpl ipAddress(java.lang.String ipAddress) { 
		this.ipAddress = ipAddress;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public IpImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getGeolocation() { 
		return this.geolocation;
	} 

	public void setGeolocation(java.lang.String geolocation) { 
		this.geolocation = geolocation;
	} 

	public IpImpl geolocation(java.lang.String geolocation) { 
		this.geolocation = geolocation;
		return this;
	} 

	public java.lang.String getReverse() { 
		return this.reverse;
	} 

	public void setReverse(java.lang.String reverse) { 
		this.reverse = reverse;
	} 

	public IpImpl reverse(java.lang.String reverse) { 
		this.reverse = reverse;
		return this;
	} 

}
