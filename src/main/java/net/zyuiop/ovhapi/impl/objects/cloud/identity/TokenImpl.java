package net.zyuiop.ovhapi.impl.objects.cloud.identity;

import net.zyuiop.ovhapi.api.objects.cloud.identity.Token;
/**
 * Token
 */

public class TokenImpl implements Token { 

	private java.lang.String X-Auth-Token;
	private net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken token;

	public TokenImpl() {
	}

	public java.lang.String getX-Auth-Token() { 
		return this.X-Auth-Token;
	} 

	public void setX-Auth-Token(java.lang.String X-Auth-Token) { 
		this.X-Auth-Token = X-Auth-Token;
	} 

	public TokenImpl X-Auth-Token(java.lang.String X-Auth-Token) { 
		this.X-Auth-Token = X-Auth-Token;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken getToken() { 
		return this.token;
	} 

	public void setToken(net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken token) { 
		this.token = token;
	} 

	public TokenImpl token(net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken token) { 
		this.token = token;
		return this;
	} 

}
