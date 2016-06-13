package net.zyuiop.ovhapi.impl.objects.nichandle;

import net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken;
/**
 * Newly created OVH identifier and a login token for the API
 */

public class NewAccountAndTokenImpl implements NewAccountAndToken { 

	private java.lang.String ovhIdentifier;
	private java.lang.String consumerKey;

	public NewAccountAndTokenImpl() {
	}

	public java.lang.String getOvhIdentifier() { 
		return this.ovhIdentifier;
	} 

	public void setOvhIdentifier(java.lang.String ovhIdentifier) { 
		this.ovhIdentifier = ovhIdentifier;
	} 

	public NewAccountAndTokenImpl ovhIdentifier(java.lang.String ovhIdentifier) { 
		this.ovhIdentifier = ovhIdentifier;
		return this;
	} 

	public java.lang.String getConsumerKey() { 
		return this.consumerKey;
	} 

	public void setConsumerKey(java.lang.String consumerKey) { 
		this.consumerKey = consumerKey;
	} 

	public NewAccountAndTokenImpl consumerKey(java.lang.String consumerKey) { 
		this.consumerKey = consumerKey;
		return this;
	} 

}
