package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics;
/**
 * Advanced diagnostic of the voice call
 */

public class CallDiagnosticsImpl implements CallDiagnostics { 

	private net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticReportingImpl[] reporting;
	private net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCallQualityImpl[] callQuality;
	private java.lang.String status;
	private net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsImpl[] cdrs;
	private net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticSipImpl[] sip;

	public CallDiagnosticsImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticReportingImpl[] getReporting() { 
		return this.reporting;
	} 

	public void setReporting(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticReportingImpl[] reporting) { 
		this.reporting = reporting;
	} 

	public CallDiagnosticsImpl reporting(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticReportingImpl[] reporting) { 
		this.reporting = reporting;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCallQualityImpl[] getCallQuality() { 
		return this.callQuality;
	} 

	public void setCallQuality(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCallQualityImpl[] callQuality) { 
		this.callQuality = callQuality;
	} 

	public CallDiagnosticsImpl callQuality(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCallQualityImpl[] callQuality) { 
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

	public net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsImpl[] getCdrs() { 
		return this.cdrs;
	} 

	public void setCdrs(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsImpl[] cdrs) { 
		this.cdrs = cdrs;
	} 

	public CallDiagnosticsImpl cdrs(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsImpl[] cdrs) { 
		this.cdrs = cdrs;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticSipImpl[] getSip() { 
		return this.sip;
	} 

	public void setSip(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticSipImpl[] sip) { 
		this.sip = sip;
	} 

	public CallDiagnosticsImpl sip(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticSipImpl[] sip) { 
		this.sip = sip;
		return this;
	} 

}
