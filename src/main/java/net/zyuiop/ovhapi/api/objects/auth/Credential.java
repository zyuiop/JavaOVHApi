package net.zyuiop.ovhapi.api.objects.auth;

/**
 * Credential request to get access to the API
 */

public class Credential { 

	private java.lang.String validationUrl;
	private java.lang.String consumerKey;
	private java.lang.String state;

	public Credential() {
	}

	public java.lang.String getValidationUrl() { 
		return this.validationUrl;
	} 

	public void setValidationUrl(java.lang.String validationUrl) { 
		this.validationUrl = validationUrl;
	} 

	public Credential validationUrl(java.lang.String validationUrl) { 
		this.validationUrl = validationUrl;
		return this;
	} 

	public java.lang.String getConsumerKey() { 
		return this.consumerKey;
	} 

	public void setConsumerKey(java.lang.String consumerKey) { 
		this.consumerKey = consumerKey;
	} 

	public Credential consumerKey(java.lang.String consumerKey) { 
		this.consumerKey = consumerKey;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Credential state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
