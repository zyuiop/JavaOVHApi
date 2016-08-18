package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Status and Mondial Relay Point Details
 */

public class MondialRelayResult { 

	private java.lang.String referenceAddress;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelay[] relayPoints;

	public MondialRelayResult() {
	}

	public java.lang.String getReferenceAddress() { 
		return this.referenceAddress;
	} 

	public void setReferenceAddress(java.lang.String referenceAddress) { 
		this.referenceAddress = referenceAddress;
	} 

	public MondialRelayResult referenceAddress(java.lang.String referenceAddress) { 
		this.referenceAddress = referenceAddress;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelay[] getRelayPoints() { 
		return this.relayPoints;
	} 

	public void setRelayPoints(net.zyuiop.ovhapi.api.objects.supply.MondialRelay[] relayPoints) { 
		this.relayPoints = relayPoints;
	} 

	public MondialRelayResult relayPoints(net.zyuiop.ovhapi.api.objects.supply.MondialRelay[] relayPoints) { 
		this.relayPoints = relayPoints;
		return this;
	} 

}
