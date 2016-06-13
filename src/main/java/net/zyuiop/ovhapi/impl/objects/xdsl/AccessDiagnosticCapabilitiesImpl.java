package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnosticCapabilities;
/**
 * Describe the capabilities of the access diagnostic
 */

public class AccessDiagnosticCapabilitiesImpl implements AccessDiagnosticCapabilities { 

	private boolean isActiveOnLns;
	private boolean incident;
	private boolean ping;
	private boolean sync;
	private boolean isModemConnected;
	private boolean proposedProfileId;
	private boolean lineTest;

	public AccessDiagnosticCapabilitiesImpl() {
	}

	public boolean getIsActiveOnLns() { 
		return this.isActiveOnLns;
	} 

	public void setIsActiveOnLns(boolean isActiveOnLns) { 
		this.isActiveOnLns = isActiveOnLns;
	} 

	public AccessDiagnosticCapabilitiesImpl isActiveOnLns(boolean isActiveOnLns) { 
		this.isActiveOnLns = isActiveOnLns;
		return this;
	} 

	public boolean getIncident() { 
		return this.incident;
	} 

	public void setIncident(boolean incident) { 
		this.incident = incident;
	} 

	public AccessDiagnosticCapabilitiesImpl incident(boolean incident) { 
		this.incident = incident;
		return this;
	} 

	public boolean getPing() { 
		return this.ping;
	} 

	public void setPing(boolean ping) { 
		this.ping = ping;
	} 

	public AccessDiagnosticCapabilitiesImpl ping(boolean ping) { 
		this.ping = ping;
		return this;
	} 

	public boolean getSync() { 
		return this.sync;
	} 

	public void setSync(boolean sync) { 
		this.sync = sync;
	} 

	public AccessDiagnosticCapabilitiesImpl sync(boolean sync) { 
		this.sync = sync;
		return this;
	} 

	public boolean getIsModemConnected() { 
		return this.isModemConnected;
	} 

	public void setIsModemConnected(boolean isModemConnected) { 
		this.isModemConnected = isModemConnected;
	} 

	public AccessDiagnosticCapabilitiesImpl isModemConnected(boolean isModemConnected) { 
		this.isModemConnected = isModemConnected;
		return this;
	} 

	public boolean getProposedProfileId() { 
		return this.proposedProfileId;
	} 

	public void setProposedProfileId(boolean proposedProfileId) { 
		this.proposedProfileId = proposedProfileId;
	} 

	public AccessDiagnosticCapabilitiesImpl proposedProfileId(boolean proposedProfileId) { 
		this.proposedProfileId = proposedProfileId;
		return this;
	} 

	public boolean getLineTest() { 
		return this.lineTest;
	} 

	public void setLineTest(boolean lineTest) { 
		this.lineTest = lineTest;
	} 

	public AccessDiagnosticCapabilitiesImpl lineTest(boolean lineTest) { 
		this.lineTest = lineTest;
		return this;
	} 

}
