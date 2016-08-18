package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * ACL for allowing ip blocks to access to your cluster
 */

public class NetworkAcl { 

	private java.lang.String block;
	private java.lang.String description;
	private java.lang.String state;

	public NetworkAcl() {
	}

	public java.lang.String getBlock() { 
		return this.block;
	} 

	public void setBlock(java.lang.String block) { 
		this.block = block;
	} 

	public NetworkAcl block(java.lang.String block) { 
		this.block = block;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public NetworkAcl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public NetworkAcl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
