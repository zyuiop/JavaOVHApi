package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting;
/**
 * PABX Hunting
 */

public class OvhPabxHuntingImpl implements OvhPabxHunting { 

	private java.lang.String name;

	public OvhPabxHuntingImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OvhPabxHuntingImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

}
