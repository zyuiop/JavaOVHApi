package net.zyuiop.ovhapi.impl.objects.overthebox;

import net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccessUserInfos;
/**
 * Infos about the remote user
 */

public class RemoteAccessUserInfosImpl implements RemoteAccessUserInfos { 

	private java.lang.String ip;
	private java.lang.String user;
	private java.lang.String publicKey;

	public RemoteAccessUserInfosImpl() {
	}

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public RemoteAccessUserInfosImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getUser() { 
		return this.user;
	} 

	public void setUser(java.lang.String user) { 
		this.user = user;
	} 

	public RemoteAccessUserInfosImpl user(java.lang.String user) { 
		this.user = user;
		return this;
	} 

	public java.lang.String getPublicKey() { 
		return this.publicKey;
	} 

	public void setPublicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
	} 

	public RemoteAccessUserInfosImpl publicKey(java.lang.String publicKey) { 
		this.publicKey = publicKey;
		return this;
	} 

}
