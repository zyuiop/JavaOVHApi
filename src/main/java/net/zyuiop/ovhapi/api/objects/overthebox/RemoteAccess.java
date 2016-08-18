package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * If authorized, a remote access will expose a port, allowing an access to the device remotely
 */

public class RemoteAccess { 

	private java.lang.String status;
	private java.lang.String authorizedBy;
	private java.util.Date expirationDate;
	private net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessConnectionInfos connectionInfos;
	private net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessUserInfos remoteUserInfos;
	private long exposedPort;
	private java.lang.String remoteAccessId;
	private boolean accepted;
	private java.util.Date askDate;

	public RemoteAccess() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public RemoteAccess status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getAuthorizedBy() { 
		return this.authorizedBy;
	} 

	public void setAuthorizedBy(java.lang.String authorizedBy) { 
		this.authorizedBy = authorizedBy;
	} 

	public RemoteAccess authorizedBy(java.lang.String authorizedBy) { 
		this.authorizedBy = authorizedBy;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public RemoteAccess expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessConnectionInfos getConnectionInfos() { 
		return this.connectionInfos;
	} 

	public void setConnectionInfos(net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessConnectionInfos connectionInfos) { 
		this.connectionInfos = connectionInfos;
	} 

	public RemoteAccess connectionInfos(net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessConnectionInfos connectionInfos) { 
		this.connectionInfos = connectionInfos;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessUserInfos getRemoteUserInfos() { 
		return this.remoteUserInfos;
	} 

	public void setRemoteUserInfos(net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessUserInfos remoteUserInfos) { 
		this.remoteUserInfos = remoteUserInfos;
	} 

	public RemoteAccess remoteUserInfos(net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessUserInfos remoteUserInfos) { 
		this.remoteUserInfos = remoteUserInfos;
		return this;
	} 

	public long getExposedPort() { 
		return this.exposedPort;
	} 

	public void setExposedPort(long exposedPort) { 
		this.exposedPort = exposedPort;
	} 

	public RemoteAccess exposedPort(long exposedPort) { 
		this.exposedPort = exposedPort;
		return this;
	} 

	public java.lang.String getRemoteAccessId() { 
		return this.remoteAccessId;
	} 

	public void setRemoteAccessId(java.lang.String remoteAccessId) { 
		this.remoteAccessId = remoteAccessId;
	} 

	public RemoteAccess remoteAccessId(java.lang.String remoteAccessId) { 
		this.remoteAccessId = remoteAccessId;
		return this;
	} 

	public boolean getAccepted() { 
		return this.accepted;
	} 

	public void setAccepted(boolean accepted) { 
		this.accepted = accepted;
	} 

	public RemoteAccess accepted(boolean accepted) { 
		this.accepted = accepted;
		return this;
	} 

	public java.util.Date getAskDate() { 
		return this.askDate;
	} 

	public void setAskDate(java.util.Date askDate) { 
		this.askDate = askDate;
	} 

	public RemoteAccess askDate(java.util.Date askDate) { 
		this.askDate = askDate;
		return this;
	} 

}
