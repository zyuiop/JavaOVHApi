package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Diagnostic of the access
 */

public interface AccessDiagnostic { 

	/**
	 * @return Is the access active on its primary or secondary LNS
	 */
	boolean getIsActiveOnLns(); 

	/**
	 * @return Is there an ongoing genericIncident on the access ?
	 */
	boolean getIncident(); 

	/**
	 * @return Remaining number of diagnostic for this access
	 */
	long getRemaining(); 

	/**
	 * @return Does the access ping ?
	 */
	boolean getPing(); 

	/**
	 * @return Available tests for this access
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnosticCapabilities getCapabilities(); 

	/**
	 * @return Is the modem connected ?
	 */
	boolean getIsModemConnected(); 

	/**
	 * @return Datime of the diagnostic
	 */
	java.util.Date getDiagnosticTime(); 

	/**
	 * @return Test details by line
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.LineDiagnostic getLineDetails(); 

}
