package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.SOTPSecret;
/**
 * Describe SOTP secret keys
 */

public class SOTPSecretImpl implements SOTPSecret { 

	private java.lang.String codes;

	public SOTPSecretImpl() {
	}

	public java.lang.String getCodes() { 
		return this.codes;
	} 

	public void setCodes(java.lang.String codes) { 
		this.codes = codes;
	} 

	public SOTPSecretImpl codes(java.lang.String codes) { 
		this.codes = codes;
		return this;
	} 

}
