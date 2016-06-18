package net.zyuiop.ovhapi.impl.objects.supply;

import net.zyuiop.ovhapi.api.objects.supply.MondialRelayResult;
/**
 * Status and Mondial Relay Point Details
 */

public class MondialRelayResultImpl implements MondialRelayResult { 

	private java.lang.String referenceAddress;
	private net.zyuiop.ovhapi.impl.objects.supply.MondialRelayImpl[] relayPoints;

	public MondialRelayResultImpl() {
	}

	public java.lang.String getReferenceAddress() { 
		return this.referenceAddress;
	} 

	public void setReferenceAddress(java.lang.String referenceAddress) { 
		this.referenceAddress = referenceAddress;
	} 

	public MondialRelayResultImpl referenceAddress(java.lang.String referenceAddress) { 
		this.referenceAddress = referenceAddress;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.supply.MondialRelayImpl[] getRelayPoints() { 
		return this.relayPoints;
	} 

	public void setRelayPoints(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayImpl[] relayPoints) { 
		this.relayPoints = relayPoints;
	} 

	public MondialRelayResultImpl relayPoints(net.zyuiop.ovhapi.impl.objects.supply.MondialRelayImpl[] relayPoints) { 
		this.relayPoints = relayPoints;
		return this;
	} 

}
