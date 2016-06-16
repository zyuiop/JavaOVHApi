package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticCdrs;
/**
 * Call diagnostic analyze structure call cdrs
 */

public class CallDiagnosticCdrsImpl implements CallDiagnosticCdrs { 

	private net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsBasicImpl basic;
	private java.util.Date timestamp;

	public CallDiagnosticCdrsImpl() {
	}

	public net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsBasicImpl getBasic() { 
		return this.basic;
	} 

	public void setBasic(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsBasicImpl basic) { 
		this.basic = basic;
	} 

	public CallDiagnosticCdrsImpl basic(net.zyuiop.ovhapi.impl.objects.telephony.CallDiagnosticCdrsBasicImpl basic) { 
		this.basic = basic;
		return this;
	} 

	public java.util.Date getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
	} 

	public CallDiagnosticCdrsImpl timestamp(java.util.Date timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

}
