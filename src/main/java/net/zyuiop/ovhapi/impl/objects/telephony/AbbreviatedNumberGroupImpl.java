package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup;
/**
 * Abbreviated number
 */

public class AbbreviatedNumberGroupImpl implements AbbreviatedNumberGroup { 

	private java.lang.String destinationNumber;
	private long abbreviatedNumber;
	private java.lang.String name;
	private java.lang.String surname;

	public AbbreviatedNumberGroupImpl() {
	}

	public java.lang.String getDestinationNumber() { 
		return this.destinationNumber;
	} 

	public void setDestinationNumber(java.lang.String destinationNumber) { 
		this.destinationNumber = destinationNumber;
	} 

	public AbbreviatedNumberGroupImpl destinationNumber(java.lang.String destinationNumber) { 
		this.destinationNumber = destinationNumber;
		return this;
	} 

	public long getAbbreviatedNumber() { 
		return this.abbreviatedNumber;
	} 

	public void setAbbreviatedNumber(long abbreviatedNumber) { 
		this.abbreviatedNumber = abbreviatedNumber;
	} 

	public AbbreviatedNumberGroupImpl abbreviatedNumber(long abbreviatedNumber) { 
		this.abbreviatedNumber = abbreviatedNumber;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AbbreviatedNumberGroupImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getSurname() { 
		return this.surname;
	} 

	public void setSurname(java.lang.String surname) { 
		this.surname = surname;
	} 

	public AbbreviatedNumberGroupImpl surname(java.lang.String surname) { 
		this.surname = surname;
		return this;
	} 

}
