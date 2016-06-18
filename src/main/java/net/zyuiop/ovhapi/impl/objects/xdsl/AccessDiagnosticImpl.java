package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnostic;
/**
 * Diagnostic of the access
 */

public class AccessDiagnosticImpl implements AccessDiagnostic { 

	private boolean isActiveOnLns;
	private boolean incident;
	private long remaining;
	private boolean ping;
	private net.zyuiop.ovhapi.impl.objects.xdsl.AccessDiagnosticCapabilitiesImpl capabilities;
	private boolean isModemConnected;
	private java.util.Date diagnosticTime;
	private net.zyuiop.ovhapi.impl.objects.xdsl.LineDiagnosticImpl[] lineDetails;

	public AccessDiagnosticImpl() {
	}

	public boolean getIsActiveOnLns() { 
		return this.isActiveOnLns;
	} 

	public void setIsActiveOnLns(boolean isActiveOnLns) { 
		this.isActiveOnLns = isActiveOnLns;
	} 

	public AccessDiagnosticImpl isActiveOnLns(boolean isActiveOnLns) { 
		this.isActiveOnLns = isActiveOnLns;
		return this;
	} 

	public boolean getIncident() { 
		return this.incident;
	} 

	public void setIncident(boolean incident) { 
		this.incident = incident;
	} 

	public AccessDiagnosticImpl incident(boolean incident) { 
		this.incident = incident;
		return this;
	} 

	public long getRemaining() { 
		return this.remaining;
	} 

	public void setRemaining(long remaining) { 
		this.remaining = remaining;
	} 

	public AccessDiagnosticImpl remaining(long remaining) { 
		this.remaining = remaining;
		return this;
	} 

	public boolean getPing() { 
		return this.ping;
	} 

	public void setPing(boolean ping) { 
		this.ping = ping;
	} 

	public AccessDiagnosticImpl ping(boolean ping) { 
		this.ping = ping;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.AccessDiagnosticCapabilitiesImpl getCapabilities() { 
		return this.capabilities;
	} 

	public void setCapabilities(net.zyuiop.ovhapi.impl.objects.xdsl.AccessDiagnosticCapabilitiesImpl capabilities) { 
		this.capabilities = capabilities;
	} 

	public AccessDiagnosticImpl capabilities(net.zyuiop.ovhapi.impl.objects.xdsl.AccessDiagnosticCapabilitiesImpl capabilities) { 
		this.capabilities = capabilities;
		return this;
	} 

	public boolean getIsModemConnected() { 
		return this.isModemConnected;
	} 

	public void setIsModemConnected(boolean isModemConnected) { 
		this.isModemConnected = isModemConnected;
	} 

	public AccessDiagnosticImpl isModemConnected(boolean isModemConnected) { 
		this.isModemConnected = isModemConnected;
		return this;
	} 

	public java.util.Date getDiagnosticTime() { 
		return this.diagnosticTime;
	} 

	public void setDiagnosticTime(java.util.Date diagnosticTime) { 
		this.diagnosticTime = diagnosticTime;
	} 

	public AccessDiagnosticImpl diagnosticTime(java.util.Date diagnosticTime) { 
		this.diagnosticTime = diagnosticTime;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.LineDiagnosticImpl[] getLineDetails() { 
		return this.lineDetails;
	} 

	public void setLineDetails(net.zyuiop.ovhapi.impl.objects.xdsl.LineDiagnosticImpl[] lineDetails) { 
		this.lineDetails = lineDetails;
	} 

	public AccessDiagnosticImpl lineDetails(net.zyuiop.ovhapi.impl.objects.xdsl.LineDiagnosticImpl[] lineDetails) { 
		this.lineDetails = lineDetails;
		return this;
	} 

}
