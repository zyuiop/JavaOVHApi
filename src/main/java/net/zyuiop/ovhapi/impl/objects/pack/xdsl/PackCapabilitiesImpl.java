package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.PackCapabilities;
/**
 * Describe the capabilities of this pack
 */

public class PackCapabilitiesImpl implements PackCapabilities { 

	private boolean canMoveAddress;
	private boolean isLegacyOffer;

	public PackCapabilitiesImpl() {
	}

	public boolean getCanMoveAddress() { 
		return this.canMoveAddress;
	} 

	public void setCanMoveAddress(boolean canMoveAddress) { 
		this.canMoveAddress = canMoveAddress;
	} 

	public PackCapabilitiesImpl canMoveAddress(boolean canMoveAddress) { 
		this.canMoveAddress = canMoveAddress;
		return this;
	} 

	public boolean getIsLegacyOffer() { 
		return this.isLegacyOffer;
	} 

	public void setIsLegacyOffer(boolean isLegacyOffer) { 
		this.isLegacyOffer = isLegacyOffer;
	} 

	public PackCapabilitiesImpl isLegacyOffer(boolean isLegacyOffer) { 
		this.isLegacyOffer = isLegacyOffer;
		return this;
	} 

}
