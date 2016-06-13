package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call diagnostic analyze structure call cdrs
 */

public interface CallDiagnosticCdrs { 

	/**
	 * @return Basic information about call details record
	 */
	net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrsBasic getBasic(); 

	/**
	 * @return The timestamp of the call details record capture
	 */
	java.util.Date getTimestamp(); 

}
