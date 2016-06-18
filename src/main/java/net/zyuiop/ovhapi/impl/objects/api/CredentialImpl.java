package net.zyuiop.ovhapi.impl.objects.api;

import net.zyuiop.ovhapi.api.objects.api.Credential;
/**
 * API Credential
 */

public class CredentialImpl implements Credential { 

	private boolean ovhSupport;
	private java.lang.String status;
	private long applicationId;
	private long credentialId;
	private net.zyuiop.ovhapi.impl.objects.auth.AccessRuleImpl[] rules;
	private java.util.Date expiration;
	private java.util.Date lastUse;
	private java.util.Date creation;

	public CredentialImpl() {
	}

	public boolean getOvhSupport() { 
		return this.ovhSupport;
	} 

	public void setOvhSupport(boolean ovhSupport) { 
		this.ovhSupport = ovhSupport;
	} 

	public CredentialImpl ovhSupport(boolean ovhSupport) { 
		this.ovhSupport = ovhSupport;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public CredentialImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getApplicationId() { 
		return this.applicationId;
	} 

	public void setApplicationId(long applicationId) { 
		this.applicationId = applicationId;
	} 

	public CredentialImpl applicationId(long applicationId) { 
		this.applicationId = applicationId;
		return this;
	} 

	public long getCredentialId() { 
		return this.credentialId;
	} 

	public void setCredentialId(long credentialId) { 
		this.credentialId = credentialId;
	} 

	public CredentialImpl credentialId(long credentialId) { 
		this.credentialId = credentialId;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.auth.AccessRuleImpl[] getRules() { 
		return this.rules;
	} 

	public void setRules(net.zyuiop.ovhapi.impl.objects.auth.AccessRuleImpl[] rules) { 
		this.rules = rules;
	} 

	public CredentialImpl rules(net.zyuiop.ovhapi.impl.objects.auth.AccessRuleImpl[] rules) { 
		this.rules = rules;
		return this;
	} 

	public java.util.Date getExpiration() { 
		return this.expiration;
	} 

	public void setExpiration(java.util.Date expiration) { 
		this.expiration = expiration;
	} 

	public CredentialImpl expiration(java.util.Date expiration) { 
		this.expiration = expiration;
		return this;
	} 

	public java.util.Date getLastUse() { 
		return this.lastUse;
	} 

	public void setLastUse(java.util.Date lastUse) { 
		this.lastUse = lastUse;
	} 

	public CredentialImpl lastUse(java.util.Date lastUse) { 
		this.lastUse = lastUse;
		return this;
	} 

	public java.util.Date getCreation() { 
		return this.creation;
	} 

	public void setCreation(java.util.Date creation) { 
		this.creation = creation;
	} 

	public CredentialImpl creation(java.util.Date creation) { 
		this.creation = creation;
		return this;
	} 

}
