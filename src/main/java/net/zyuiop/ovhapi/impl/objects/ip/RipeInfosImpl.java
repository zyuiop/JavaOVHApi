package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.RipeInfos;
/**
 * IP block RIPE informations
 */

public class RipeInfosImpl implements RipeInfos { 

	private java.lang.String netname;
	private java.lang.String description;

	public RipeInfosImpl() {
	}

	public java.lang.String getNetname() { 
		return this.netname;
	} 

	public void setNetname(java.lang.String netname) { 
		this.netname = netname;
	} 

	public RipeInfosImpl netname(java.lang.String netname) { 
		this.netname = netname;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public RipeInfosImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
