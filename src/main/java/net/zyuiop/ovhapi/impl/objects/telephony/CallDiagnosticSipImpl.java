package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.CallDiagnosticSip;
/**
 * Call diagnostic analyze structure on sip signal
 */

public class CallDiagnosticSipImpl implements CallDiagnosticSip { 

	private java.lang.String headers;
	private java.lang.String timestamp;
	private java.lang.String response;
	private java.lang.String requestMethod;

	public CallDiagnosticSipImpl() {
	}

	public java.lang.String getHeaders() { 
		return this.headers;
	} 

	public void setHeaders(java.lang.String headers) { 
		this.headers = headers;
	} 

	public CallDiagnosticSipImpl headers(java.lang.String headers) { 
		this.headers = headers;
		return this;
	} 

	public java.lang.String getTimestamp() { 
		return this.timestamp;
	} 

	public void setTimestamp(java.lang.String timestamp) { 
		this.timestamp = timestamp;
	} 

	public CallDiagnosticSipImpl timestamp(java.lang.String timestamp) { 
		this.timestamp = timestamp;
		return this;
	} 

	public java.lang.String getResponse() { 
		return this.response;
	} 

	public void setResponse(java.lang.String response) { 
		this.response = response;
	} 

	public CallDiagnosticSipImpl response(java.lang.String response) { 
		this.response = response;
		return this;
	} 

	public java.lang.String getRequestMethod() { 
		return this.requestMethod;
	} 

	public void setRequestMethod(java.lang.String requestMethod) { 
		this.requestMethod = requestMethod;
	} 

	public CallDiagnosticSipImpl requestMethod(java.lang.String requestMethod) { 
		this.requestMethod = requestMethod;
		return this;
	} 

}
