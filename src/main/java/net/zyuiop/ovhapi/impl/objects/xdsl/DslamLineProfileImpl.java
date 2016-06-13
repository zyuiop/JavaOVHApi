package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile;
/**
 * Profile on the DSLAM
 */

public class DslamLineProfileImpl implements DslamLineProfile { 

	private boolean isCurrent;
	private java.lang.String name;
	private long id;

	public DslamLineProfileImpl() {
	}

	public boolean getIsCurrent() { 
		return this.isCurrent;
	} 

	public void setIsCurrent(boolean isCurrent) { 
		this.isCurrent = isCurrent;
	} 

	public DslamLineProfileImpl isCurrent(boolean isCurrent) { 
		this.isCurrent = isCurrent;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DslamLineProfileImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DslamLineProfileImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
