package net.zyuiop.ovhapi.api.objects.xdsl.eligibility;

/**
 * Represents a street
 */

public class Street { 

	private java.lang.String name;
	private java.lang.String rivoliCode;

	public Street() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Street name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getRivoliCode() { 
		return this.rivoliCode;
	} 

	public void setRivoliCode(java.lang.String rivoliCode) { 
		this.rivoliCode = rivoliCode;
	} 

	public Street rivoliCode(java.lang.String rivoliCode) { 
		this.rivoliCode = rivoliCode;
		return this;
	} 

}
