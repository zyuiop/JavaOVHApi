package net.zyuiop.ovhapi.impl.objects.cluster.hadoop;

import net.zyuiop.ovhapi.api.objects.cluster.hadoop.Hadoop;
/**
 * Managed Hadoop Cluster
 */

public class HadoopImpl implements Hadoop { 

	private java.lang.String clouderaVersion;
	private long maxOrderableNodes;
	private java.lang.String name;
	private java.lang.String state;

	public HadoopImpl() {
	}

	public java.lang.String getClouderaVersion() { 
		return this.clouderaVersion;
	} 

	public void setClouderaVersion(java.lang.String clouderaVersion) { 
		this.clouderaVersion = clouderaVersion;
	} 

	public HadoopImpl clouderaVersion(java.lang.String clouderaVersion) { 
		this.clouderaVersion = clouderaVersion;
		return this;
	} 

	public long getMaxOrderableNodes() { 
		return this.maxOrderableNodes;
	} 

	public void setMaxOrderableNodes(long maxOrderableNodes) { 
		this.maxOrderableNodes = maxOrderableNodes;
	} 

	public HadoopImpl maxOrderableNodes(long maxOrderableNodes) { 
		this.maxOrderableNodes = maxOrderableNodes;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public HadoopImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public HadoopImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
