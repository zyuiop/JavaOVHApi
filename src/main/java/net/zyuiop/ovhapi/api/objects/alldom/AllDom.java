package net.zyuiop.ovhapi.api.objects.alldom;

/**
 * AllDom administration
 */

public class AllDom { 

	private java.lang.String offer;
	private java.lang.String name;
	private java.lang.String type;

	public AllDom() {
	}

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public AllDom offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public AllDom name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public AllDom type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
