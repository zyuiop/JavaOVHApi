package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * interface between legacy vrack (vrackXXXX) and vrack (pn-XXXX)
 */

public class LegacyVrack { 

	private java.lang.String legacyVrack;
	private long vlanId;

	public LegacyVrack() {
	}

	public java.lang.String getLegacyVrack() { 
		return this.legacyVrack;
	} 

	public void setLegacyVrack(java.lang.String legacyVrack) { 
		this.legacyVrack = legacyVrack;
	} 

	public LegacyVrack legacyVrack(java.lang.String legacyVrack) { 
		this.legacyVrack = legacyVrack;
		return this;
	} 

	public long getVlanId() { 
		return this.vlanId;
	} 

	public void setVlanId(long vlanId) { 
		this.vlanId = vlanId;
	} 

	public LegacyVrack vlanId(long vlanId) { 
		this.vlanId = vlanId;
		return this;
	} 

}
