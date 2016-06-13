package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.TOTPSecret;
/**
 * Describe TOTP secret keys
 */

public class TOTPSecretImpl implements TOTPSecret { 

	private java.lang.String qrcodeHelper;
	private java.lang.String secret;
	private long id;

	public TOTPSecretImpl() {
	}

	public java.lang.String getQrcodeHelper() { 
		return this.qrcodeHelper;
	} 

	public void setQrcodeHelper(java.lang.String qrcodeHelper) { 
		this.qrcodeHelper = qrcodeHelper;
	} 

	public TOTPSecretImpl qrcodeHelper(java.lang.String qrcodeHelper) { 
		this.qrcodeHelper = qrcodeHelper;
		return this;
	} 

	public java.lang.String getSecret() { 
		return this.secret;
	} 

	public void setSecret(java.lang.String secret) { 
		this.secret = secret;
	} 

	public TOTPSecretImpl secret(java.lang.String secret) { 
		this.secret = secret;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TOTPSecretImpl id(long id) { 
		this.id = id;
		return this;
	} 

}
