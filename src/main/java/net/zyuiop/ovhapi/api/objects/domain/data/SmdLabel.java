package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of a protected label
 */

public class SmdLabel { 

	private java.lang.String label;
	private java.lang.String trademark;

	public SmdLabel() {
	}

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public SmdLabel label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getTrademark() { 
		return this.trademark;
	} 

	public void setTrademark(java.lang.String trademark) { 
		this.trademark = trademark;
	} 

	public SmdLabel trademark(java.lang.String trademark) { 
		this.trademark = trademark;
		return this;
	} 

}
