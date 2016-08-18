package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Describe SOTP secret keys
 */

public class SOTPSecret { 

	private java.lang.String[] codes;

	public SOTPSecret() {
	}

	public java.lang.String[] getCodes() { 
		return this.codes;
	} 

	public void setCodes(java.lang.String[] codes) { 
		this.codes = codes;
	} 

	public SOTPSecret codes(java.lang.String[] codes) { 
		this.codes = codes;
		return this;
	} 

}
