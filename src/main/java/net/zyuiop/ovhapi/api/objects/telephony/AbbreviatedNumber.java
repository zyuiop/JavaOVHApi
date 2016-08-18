package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Abbreviated number
 */

public class AbbreviatedNumber { 

	private java.lang.String destinationNumber;
	private long abbreviatedNumber;
	private java.lang.String name;
	private java.lang.String surname;

	public AbbreviatedNumber() {
	}

	public java.lang.String getDestinationNumber() { 
		return this.destinationNumber;
	} 

	public void setDestinationNumber(java.lang.String destinationNumber) { 
		this.destinationNumber = destinationNumber;
	} 

	public AbbreviatedNumber destinationNumber(java.lang.String destinationNumber) { 
		this.destinationNumber = destinationNumber;
		return this;
	} 

	public long getAbbreviatedNumber() { 
		return this.abbreviatedNumber;
	} 

	public void setAbbreviatedNumber(long abbreviatedNumber) { 
		this.abbreviatedNumber = abbreviatedNumber;
	} 

	public AbbreviatedNumber abbreviatedNumber(long abbreviatedNumber) { 
		this.abbreviatedNumber = abbreviatedNumber;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AbbreviatedNumber name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getSurname() { 
		return this.surname;
	} 

	public void setSurname(java.lang.String surname) { 
		this.surname = surname;
	} 

	public AbbreviatedNumber surname(java.lang.String surname) { 
		this.surname = surname;
		return this;
	} 

}
