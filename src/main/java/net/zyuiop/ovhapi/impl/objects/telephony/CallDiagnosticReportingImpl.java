package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting;
/**
 * Reporting of the current diagnostic
 */

public class CallDiagnosticReportingImpl implements CallDiagnosticReporting { 

	private java.lang.String message;

	public CallDiagnosticReportingImpl() {
	}

	public java.lang.String getMessage() { 
		return this.message;
	} 

	public void setMessage(java.lang.String message) { 
		this.message = message;
	} 

	public CallDiagnosticReportingImpl message(java.lang.String message) { 
		this.message = message;
		return this;
	} 

}
