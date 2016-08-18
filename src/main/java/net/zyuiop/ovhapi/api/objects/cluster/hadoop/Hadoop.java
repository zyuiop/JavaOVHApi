package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Managed Hadoop Cluster
 */

public class Hadoop { 

	private java.lang.String clouderaVersion;
	private long maxOrderableNodes;
	private java.lang.String name;
	private java.lang.String state;

	public Hadoop() {
	}

	public java.lang.String getClouderaVersion() { 
		return this.clouderaVersion;
	} 

	public void setClouderaVersion(java.lang.String clouderaVersion) { 
		this.clouderaVersion = clouderaVersion;
	} 

	public Hadoop clouderaVersion(java.lang.String clouderaVersion) { 
		this.clouderaVersion = clouderaVersion;
		return this;
	} 

	public long getMaxOrderableNodes() { 
		return this.maxOrderableNodes;
	} 

	public void setMaxOrderableNodes(long maxOrderableNodes) { 
		this.maxOrderableNodes = maxOrderableNodes;
	} 

	public Hadoop maxOrderableNodes(long maxOrderableNodes) { 
		this.maxOrderableNodes = maxOrderableNodes;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Hadoop name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Hadoop state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
