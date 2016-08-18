package net.zyuiop.ovhapi.api.objects.ip;

/**
 * IP block RIPE informations
 */

public class RipeInfos { 

	private java.lang.String netname;
	private java.lang.String description;

	public RipeInfos() {
	}

	public java.lang.String getNetname() { 
		return this.netname;
	} 

	public void setNetname(java.lang.String netname) { 
		this.netname = netname;
	} 

	public RipeInfos netname(java.lang.String netname) { 
		this.netname = netname;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public RipeInfos description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
