package net.zyuiop.ovhapi.impl.objects.xdsl.eligibility;

import net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street;
/**
 * Represents a street
 */

public class StreetImpl implements Street { 

	private java.lang.String name;
	private java.lang.String rivoliCode;

	public StreetImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public StreetImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRivoliCode() { 
		return this.rivoliCode;
	} 

	public void setRivoliCode(java.lang.String rivoliCode) { 
		this.rivoliCode = rivoliCode;
	} 

	public StreetImpl rivoliCode(java.lang.String rivoliCode) { 
		this.rivoliCode = rivoliCode;
		return this;
	} 

}
