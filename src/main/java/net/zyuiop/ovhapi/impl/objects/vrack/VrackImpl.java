package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.Vrack;
/**
 * vrack
 */

public class VrackImpl implements Vrack { 

	private java.lang.String name;
	private java.lang.String description;

	public VrackImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public VrackImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public VrackImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
