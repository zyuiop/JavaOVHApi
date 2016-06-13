package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics;
/**
 * Advanced diagnostic of the voice call
 */

public class CallDiagnosticsImpl implements CallDiagnostics { 

	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting reporting;
	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality callQuality;
	private java.lang.String status;
	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs cdrs;
	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip sip;

	public CallDiagnosticsImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting getReporting() { 
		return this.reporting;
	} 

	public void setReporting(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting reporting) { 
		this.reporting = reporting;
	} 

	public CallDiagnosticsImpl reporting(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticReporting reporting) { 
		this.reporting = reporting;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality getCallQuality() { 
		return this.callQuality;
	} 

	public void setCallQuality(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality callQuality) { 
		this.callQuality = callQuality;
	} 

	public CallDiagnosticsImpl callQuality(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCallQuality callQuality) { 
		this.callQuality = callQuality;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CallDiagnosticsImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs getCdrs() { 
		return this.cdrs;
	} 

	public void setCdrs(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs cdrs) { 
		this.cdrs = cdrs;
	} 

	public CallDiagnosticsImpl cdrs(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs cdrs) { 
		this.cdrs = cdrs;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip getSip() { 
		return this.sip;
	} 

	public void setSip(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip sip) { 
		this.sip = sip;
	} 

	public CallDiagnosticsImpl sip(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip sip) { 
		this.sip = sip;
		return this;
	} 

}
