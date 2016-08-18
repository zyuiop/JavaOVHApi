package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * PABX Hunting
 */

public class OvhPabxHunting { 

	private java.lang.String name;

	public OvhPabxHunting() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OvhPabxHunting name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
