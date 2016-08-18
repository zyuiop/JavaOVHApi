package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Token
 */

public class Token { 

	private java.lang.String XAuthToken;
	private net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken token;

	public Token() {
	}

	public java.lang.String getXAuthToken() { 
		return this.XAuthToken;
	} 

	public void setXAuthToken(java.lang.String XAuthToken) { 
		this.XAuthToken = XAuthToken;
	} 

	public Token XAuthToken(java.lang.String XAuthToken) { 
		this.XAuthToken = XAuthToken;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken getToken() { 
		return this.token;
	} 

	public void setToken(net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken token) { 
		this.token = token;
	} 

	public Token token(net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken token) { 
		this.token = token;
		return this;
	} 

}
