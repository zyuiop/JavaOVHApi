package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Describe the capabilities of this pack
 */

public interface PackCapabilities { 

	/**
	 * @return Whether or not this pack can move address
	 */
	boolean getCanMoveAddress(); 

	/**
	 * @return Whether or not this pack is from an old offer
	 */
	boolean getIsLegacyOffer(); 

}
