package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Describe TOTP secret keys
 */

public class TOTPSecret { 

	private java.lang.String qrcodeHelper;
	private java.lang.String secret;
	private long id;

	public TOTPSecret() {
	}

	public java.lang.String getQrcodeHelper() { 
		return this.qrcodeHelper;
	} 

	public void setQrcodeHelper(java.lang.String qrcodeHelper) { 
		this.qrcodeHelper = qrcodeHelper;
	} 

	public TOTPSecret qrcodeHelper(java.lang.String qrcodeHelper) { 
		this.qrcodeHelper = qrcodeHelper;
		return this;
	} 

	public java.lang.String getSecret() { 
		return this.secret;
	} 

	public void setSecret(java.lang.String secret) { 
		this.secret = secret;
	} 

	public TOTPSecret secret(java.lang.String secret) { 
		this.secret = secret;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TOTPSecret id(long id) { 
		this.id = id;
		return this;
	} 

}
