package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack
 */

public class Vrack { 

	private java.lang.String name;
	private java.lang.String description;

	public Vrack() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Vrack name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Vrack description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
