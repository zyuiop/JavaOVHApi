package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.Token;
/**
 * Token
 */

public class TokenImpl implements Token { 

	private java.lang.String XAuthToken;
	private net.zyuiop.ovhapi.impl.objects.cloud.identity.OpenstackTokenImpl token;

	public TokenImpl() {
	}

	public java.lang.String getXAuthToken() { 
		return this.XAuthToken;
	} 

	public void setXAuthToken(java.lang.String XAuthToken) { 
		this.XAuthToken = XAuthToken;
	} 

	public TokenImpl XAuthToken(java.lang.String XAuthToken) { 
		this.XAuthToken = XAuthToken;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.cloud.identity.OpenstackTokenImpl getToken() { 
		return this.token;
	} 

	public void setToken(net.zyuiop.ovhapi.impl.objects.cloud.identity.OpenstackTokenImpl token) { 
		this.token = token;
	} 

	public TokenImpl token(net.zyuiop.ovhapi.impl.objects.cloud.identity.OpenstackTokenImpl token) { 
		this.token = token;
		return this;
	} 

}
