package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Backend
 */

public class Backend { 

	private java.lang.String zone;
	private java.lang.String name;
	private long port;
	private java.lang.String stickiness;
	private java.lang.String balance;
	private long id;
	private java.lang.String type;
	private java.lang.String probe;

	public Backend() {
	}

	public java.lang.String getZone() { 
		return this.zone;
	} 

	public void setZone(java.lang.String zone) { 
		this.zone = zone;
	} 

	public Backend zone(java.lang.String zone) { 
		this.zone = zone;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Backend name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getPort() { 
		return this.port;
	} 

	public void setPort(long port) { 
		this.port = port;
	} 

	public Backend port(long port) { 
		this.port = port;
		return this;
	} 

	public java.lang.String getStickiness() { 
		return this.stickiness;
	} 

	public void setStickiness(java.lang.String stickiness) { 
		this.stickiness = stickiness;
	} 

	public Backend stickiness(java.lang.String stickiness) { 
		this.stickiness = stickiness;
		return this;
	} 

	public java.lang.String getBalance() { 
		return this.balance;
	} 

	public void setBalance(java.lang.String balance) { 
		this.balance = balance;
	} 

	public Backend balance(java.lang.String balance) { 
		this.balance = balance;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Backend id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public Backend type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getProbe() { 
		return this.probe;
	} 

	public void setProbe(java.lang.String probe) { 
		this.probe = probe;
	} 

	public Backend probe(java.lang.String probe) { 
		this.probe = probe;
		return this;
	} 

}
