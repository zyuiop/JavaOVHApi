package net.zyuiop.ovhapi.impl.objects.vrack;

import net.zyuiop.ovhapi.api.objects.vrack.LegacyVrack;
/**
 * interface between legacy vrack (vrackXXXX) and vrack (pn-XXXX)
 */

public class LegacyVrackImpl implements LegacyVrack { 

	private java.lang.String legacyVrack;
	private long vlanId;

	public LegacyVrackImpl() {
	}

	public java.lang.String getLegacyVrack() { 
		return this.legacyVrack;
	} 

	public void setLegacyVrack(java.lang.String legacyVrack) { 
		this.legacyVrack = legacyVrack;
	} 

	public LegacyVrackImpl legacyVrack(java.lang.String legacyVrack) { 
		this.legacyVrack = legacyVrack;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public LegacyVrackImpl vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

}
