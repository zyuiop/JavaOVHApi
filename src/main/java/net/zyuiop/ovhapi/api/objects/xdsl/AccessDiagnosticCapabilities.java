package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describe the capabilities of the access diagnostic
 */

public interface AccessDiagnosticCapabilities { 

	/**
	 * @return null
	 */
	boolean getIsActiveOnLns(); 

	/**
	 * @return null
	 */
	boolean getIncident(); 

	/**
	 * @return null
	 */
	boolean getPing(); 

	/**
	 * @return null
	 */
	boolean getSync(); 

	/**
	 * @return null
	 */
	boolean getIsModemConnected(); 

	/**
	 * @return null
	 */
	boolean getProposedProfileId(); 

	/**
	 * @return null
	 */
	boolean getLineTest(); 

}
