package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Zone dns Management
 */

public class Zone { 

	private java.util.Date lastUpdate;
	private boolean hasDnsAnycast;
	private java.lang.String[] nameServers;
	private boolean dnssecSupported;

	public Zone() {
	}

	public java.util.Date getLastUpdate() { 
		return this.lastUpdate;
	} 

	public void setLastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
	} 

	public Zone lastUpdate(java.util.Date lastUpdate) { 
		this.lastUpdate = lastUpdate;
		return this;
	} 

	public boolean getHasDnsAnycast() { 
		return this.hasDnsAnycast;
	} 

	public void setHasDnsAnycast(boolean hasDnsAnycast) { 
		this.hasDnsAnycast = hasDnsAnycast;
	} 

	public Zone hasDnsAnycast(boolean hasDnsAnycast) { 
		this.hasDnsAnycast = hasDnsAnycast;
		return this;
	} 

	public java.lang.String[] getNameServers() { 
		return this.nameServers;
	} 

	public void setNameServers(java.lang.String[] nameServers) { 
		this.nameServers = nameServers;
	} 

	public Zone nameServers(java.lang.String[] nameServers) { 
		this.nameServers = nameServers;
		return this;
	} 

	public boolean getDnssecSupported() { 
		return this.dnssecSupported;
	} 

	public void setDnssecSupported(boolean dnssecSupported) { 
		this.dnssecSupported = dnssecSupported;
	} 

	public Zone dnssecSupported(boolean dnssecSupported) { 
		this.dnssecSupported = dnssecSupported;
		return this;
	} 

}
