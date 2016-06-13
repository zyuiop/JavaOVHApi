package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * interface between legacy vrack (vrackXXXX) and vrack (pn-XXXX)
 */

public interface LegacyVrack { 

	/**
	 * @return your legacy vrack service
	 */
	java.lang.String getLegacyVrack(); 

	/**
	 * @return vlan to set on legacy vrack equipments
	 */
	long getVlanId(); 

}
