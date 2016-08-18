package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Advanced diagnostic of the voice call
 */

public class CallDiagnostics { 

	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting[] reporting;
	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality[] callQuality;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs[] cdrs;
	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip[] sip;

	public CallDiagnostics() {
	}

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting[] getReporting() { 
		return this.reporting;
	} 

	public void setReporting(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting[] reporting) { 
		this.reporting = reporting;
	} 

	public CallDiagnostics reporting(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting[] reporting) { 
		this.reporting = reporting;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality[] getCallQuality() { 
		return this.callQuality;
	} 

	public void setCallQuality(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality[] callQuality) { 
		this.callQuality = callQuality;
	} 

	public CallDiagnostics callQuality(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality[] callQuality) { 
		this.callQuality = callQuality;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CallDiagnostics status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs[] getCdrs() { 
		return this.cdrs;
	} 

	public void setCdrs(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs[] cdrs) { 
		this.cdrs = cdrs;
	} 

	public CallDiagnostics cdrs(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs[] cdrs) { 
		this.cdrs = cdrs;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip[] getSip() { 
		return this.sip;
	} 

	public void setSip(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip[] sip) { 
		this.sip = sip;
	} 

	public CallDiagnostics sip(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip[] sip) { 
		this.sip = sip;
		return this;
	} 

}
