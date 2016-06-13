package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.LineOffer;
/**
 * Informations related to a line offer
 */

public class LineOfferImpl implements LineOffer { 

	private java.lang.String name;
	private java.lang.String description;

	public LineOfferImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public LineOfferImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public LineOfferImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
