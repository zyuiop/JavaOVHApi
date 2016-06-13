package net.zyuiop.ovhapi.impl.objects.auth;

import net.zyuiop.ovhapi.api.objects.auth.Credential;
/**
 * Credential request to get access to the API
 */

public class CredentialImpl implements Credential { 

	private java.lang.String validationUrl;
	private java.lang.String consumerKey;
	private java.lang.String state;

	public CredentialImpl() {
	}

	public java.lang.String getValidationUrl() { 
		return this.validationUrl;
	} 

	public void setValidationUrl(java.lang.String validationUrl) { 
		this.validationUrl = validationUrl;
	} 

	public CredentialImpl validationUrl(java.lang.String validationUrl) { 
		this.validationUrl = validationUrl;
		return this;
	} 

	public java.lang.String getConsumerKey() { 
		return this.consumerKey;
	} 

	public void setConsumerKey(java.lang.String consumerKey) { 
		this.consumerKey = consumerKey;
	} 

	public CredentialImpl consumerKey(java.lang.String consumerKey) { 
		this.consumerKey = consumerKey;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public CredentialImpl state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
