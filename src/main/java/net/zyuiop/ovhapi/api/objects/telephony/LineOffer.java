package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Informations related to a line offer
 */

public class LineOffer { 

	private java.lang.String name;
	private java.lang.String description;

	public LineOffer() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public LineOffer name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public LineOffer description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
