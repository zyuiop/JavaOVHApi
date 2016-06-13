package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call diagnostic analyze structure call cdrs
 */

public interface CallDiagnosticCdrsBasic { 

	/**
	 * @return SS7 ISUP cause codes
	 */
	java.lang.String getCauseDescription(); 

	/**
	 * @return Release location type : forward if the calling hangup, backward if the caller hangup, else local
	 */
	java.lang.String getReleaseLocation(); 

	/**
	 * @return Hexadecimal SIP-to-SS7 ISUP cause codes
	 */
	java.lang.String getCause(); 

}
