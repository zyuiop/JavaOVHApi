package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * L2TP Network Server
 */

public class Lns { 

	private java.lang.String city;
	private boolean isCurrent;
	private java.lang.String name;

	public Lns() {
	}

	public java.lang.String getCity() { 
		return this.city;
	} 

	public void setCity(java.lang.String city) { 
		this.city = city;
	} 

	public Lns city(java.lang.String city) { 
		this.city = city;
		return this;
	} 

	public boolean getIsCurrent() { 
		return this.isCurrent;
	} 

	public void setIsCurrent(boolean isCurrent) { 
		this.isCurrent = isCurrent;
	} 

	public Lns isCurrent(boolean isCurrent) { 
		this.isCurrent = isCurrent;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Lns name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
