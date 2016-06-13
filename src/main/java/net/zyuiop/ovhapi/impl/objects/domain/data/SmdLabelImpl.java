package net.zyuiop.ovhapi.impl.objects.domain.data;

import net.zyuiop.ovhapi.api.objects.domain.data.SmdLabel;
/**
 * Representation of a protected label
 */

public class SmdLabelImpl implements SmdLabel { 

	private java.lang.String label;
	private java.lang.String trademark;

	public SmdLabelImpl() {
	}

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public SmdLabelImpl label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public java.lang.String getTrademark() { 
		return this.trademark;
	} 

	public void setTrademark(java.lang.String trademark) { 
		this.trademark = trademark;
	} 

	public SmdLabelImpl trademark(java.lang.String trademark) { 
		this.trademark = trademark;
		return this;
	} 

}
