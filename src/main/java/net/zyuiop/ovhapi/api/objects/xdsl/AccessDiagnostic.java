package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Diagnostic of the access
 */

public class AccessDiagnostic { 

	private boolean isActiveOnLns;
	private boolean incident;
	private long remaining;
	private boolean ping;
	private net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnosticCapabilities capabilities;
	private boolean isModemConnected;
	private java.util.Date diagnosticTime;
	private net.zyuiop.ovhapi.api.objects.xdsl.LineDiagnostic[] lineDetails;

	public AccessDiagnostic() {
	}

	public boolean getIsActiveOnLns() { 
		return this.isActiveOnLns;
	} 

	public void setIsActiveOnLns(boolean isActiveOnLns) { 
		this.isActiveOnLns = isActiveOnLns;
	} 

	public AccessDiagnostic isActiveOnLns(boolean isActiveOnLns) { 
		this.isActiveOnLns = isActiveOnLns;
		return this;
	} 

	public boolean getIncident() { 
		return this.incident;
	} 

	public void setIncident(boolean incident) { 
		this.incident = incident;
	} 

	public AccessDiagnostic incident(boolean incident) { 
		this.incident = incident;
		return this;
	} 

	public long getRemaining() { 
		return this.remaining;
	} 

	public void setRemaining(long remaining) { 
		this.remaining = remaining;
	} 

	public AccessDiagnostic remaining(long remaining) { 
		this.remaining = remaining;
		return this;
	} 

	public boolean getPing() { 
		return this.ping;
	} 

	public void setPing(boolean ping) { 
		this.ping = ping;
	} 

	public AccessDiagnostic ping(boolean ping) { 
		this.ping = ping;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnosticCapabilities getCapabilities() { 
		return this.capabilities;
	} 

	public void setCapabilities(net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnosticCapabilities capabilities) { 
		this.capabilities = capabilities;
	} 

	public AccessDiagnostic capabilities(net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnosticCapabilities capabilities) { 
		this.capabilities = capabilities;
		return this;
	} 

	public boolean getIsModemConnected() { 
		return this.isModemConnected;
	} 

	public void setIsModemConnected(boolean isModemConnected) { 
		this.isModemConnected = isModemConnected;
	} 

	public AccessDiagnostic isModemConnected(boolean isModemConnected) { 
		this.isModemConnected = isModemConnected;
		return this;
	} 

	public java.util.Date getDiagnosticTime() { 
		return this.diagnosticTime;
	} 

	public void setDiagnosticTime(java.util.Date diagnosticTime) { 
		this.diagnosticTime = diagnosticTime;
	} 

	public AccessDiagnostic diagnosticTime(java.util.Date diagnosticTime) { 
		this.diagnosticTime = diagnosticTime;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.xdsl.LineDiagnostic[] getLineDetails() { 
		return this.lineDetails;
	} 

	public void setLineDetails(net.zyuiop.ovhapi.api.objects.xdsl.LineDiagnostic[] lineDetails) { 
		this.lineDetails = lineDetails;
	} 

	public AccessDiagnostic lineDetails(net.zyuiop.ovhapi.api.objects.xdsl.LineDiagnostic[] lineDetails) { 
		this.lineDetails = lineDetails;
		return this;
	} 

}
