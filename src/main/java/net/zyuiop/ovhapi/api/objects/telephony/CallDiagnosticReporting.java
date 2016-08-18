package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Reporting of the current diagnostic
 */

public class CallDiagnosticReporting { 

	private java.lang.String message;

	public CallDiagnosticReporting() {
	}

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public CallDiagnosticReporting message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
