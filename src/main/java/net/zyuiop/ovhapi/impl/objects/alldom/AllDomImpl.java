package net.zyuiop.ovhapi.impl.objects.alldom;

import net.zyuiop.ovhapi.api.objects.alldom.AllDom;
/**
 * AllDom administration
 */

public class AllDomImpl implements AllDom { 

	private java.lang.String offer;
	private java.lang.String name;
	private java.lang.String type;

	public AllDomImpl() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public AllDomImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AllDomImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public AllDomImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
