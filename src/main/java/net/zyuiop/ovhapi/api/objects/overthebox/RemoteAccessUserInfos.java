package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Infos about the remote user
 */

public class RemoteAccessUserInfos { 

	private java.lang.String ip;
	private java.lang.String user;
	private java.lang.String publicKey;

	public RemoteAccessUserInfos() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public RemoteAccessUserInfos ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getUser() { 
		return this.user;
	} 

	public void setUser(java.lang.String user) { 
		this.user = user;
	} 

	public RemoteAccessUserInfos user(java.lang.String user) { 
		this.user = user;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public RemoteAccessUserInfos publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
