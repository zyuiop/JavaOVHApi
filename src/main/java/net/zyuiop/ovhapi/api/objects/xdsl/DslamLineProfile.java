package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Profile on the DSLAM
 */

public class DslamLineProfile { 

	private boolean isCurrent;
	private java.lang.String name;
	private long id;

	public DslamLineProfile() {
	}

	public boolean getIsCurrent() { 
		return this.isCurrent;
	} 

	public void setIsCurrent(boolean isCurrent) { 
		this.isCurrent = isCurrent;
	} 

	public DslamLineProfile isCurrent(boolean isCurrent) { 
		this.isCurrent = isCurrent;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DslamLineProfile name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DslamLineProfile id(long id) { 
		this.id = id;
		return this;
	} 

}
