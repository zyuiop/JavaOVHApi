package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call diagnostic analyze structure call cdrs
 */

public class CallDiagnosticCdrs { 

	private net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrsBasic basic;
	private java.util.Date timestamp;

	public CallDiagnosticCdrs() {
	}

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrsBasic getBasic() { 
		return this.basic;
	} 

	public void setBasic(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrsBasic basic) { 
		this.basic = basic;
	} 

	public CallDiagnosticCdrs basic(net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrsBasic basic) { 
		this.basic = basic;
		return this;
	} 

	public java.util.Date getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
	} 

	public CallDiagnosticCdrs timestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

}
