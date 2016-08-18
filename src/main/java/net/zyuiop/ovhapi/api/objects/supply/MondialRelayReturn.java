package net.zyuiop.ovhapi.api.objects.supply;

/**
 * Status and Mondial Relay Point Details
 */

public class MondialRelayReturn { 

	private java.lang.String status;
	private java.lang.String error;
	private net.zyuiop.ovhapi.api.objects.supply.MondialRelayResult result;

	public MondialRelayReturn() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public MondialRelayReturn status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getError() { 
		return this.error;
	} 

	public void setError(java.lang.String error) { 
		this.error = error;
	} 

	public MondialRelayReturn error(java.lang.String error) { 
		this.error = error;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.supply.MondialRelayResult getResult() { 
		return this.result;
	} 

	public void setResult(net.zyuiop.ovhapi.api.objects.supply.MondialRelayResult result) { 
		this.result = result;
	} 

	public MondialRelayReturn result(net.zyuiop.ovhapi.api.objects.supply.MondialRelayResult result) { 
		this.result = result;
		return this;
	} 

}
