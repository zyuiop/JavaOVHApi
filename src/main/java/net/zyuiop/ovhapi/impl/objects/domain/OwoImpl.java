package net.zyuiop.ovhapi.impl.objects.domain;

import net.zyuiop.ovhapi.api.objects.domain.Owo;
/**
 * Obfuscate whois
 */

public class OwoImpl implements Owo { 

	private java.lang.String field;

	public OwoImpl() {
	}

	public java.lang.String getField() { 
		return this.field;
	} 

	public void setField(java.lang.String field) { 
		this.field = field;
	} 

	public OwoImpl field(java.lang.String field) { 
		this.field = field;
		return this;
	} 

}
