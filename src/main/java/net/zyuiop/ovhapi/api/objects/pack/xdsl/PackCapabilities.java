package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Describe the capabilities of this pack
 */

public class PackCapabilities { 

	private boolean canMoveAddress;
	private boolean isLegacyOffer;

	public PackCapabilities() {
	}

	public boolean getCanMoveAddress() { 
		return this.canMoveAddress;
	} 

	public void setCanMoveAddress(boolean canMoveAddress) { 
		this.canMoveAddress = canMoveAddress;
	} 

	public PackCapabilities canMoveAddress(boolean canMoveAddress) { 
		this.canMoveAddress = canMoveAddress;
		return this;
	} 

	public boolean getIsLegacyOffer() { 
		return this.isLegacyOffer;
	} 

	public void setIsLegacyOffer(boolean isLegacyOffer) { 
		this.isLegacyOffer = isLegacyOffer;
	} 

	public PackCapabilities isLegacyOffer(boolean isLegacyOffer) { 
		this.isLegacyOffer = isLegacyOffer;
		return this;
	} 

}
