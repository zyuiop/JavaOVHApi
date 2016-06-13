package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.LineSectionLength;
/**
 * 
 */

public class LineSectionLengthImpl implements LineSectionLength { 

	private long length;
	private long diameter;

	public LineSectionLengthImpl() {
	}

	public long getLength() { 
		return this.length;
	} 

	public void setLength(long length) { 
		this.length = length;
	} 

	public LineSectionLengthImpl length(long length) { 
		this.length = length;
		return this;
	} 

	public long getDiameter() { 
		return this.diameter;
	} 

	public void setDiameter(long diameter) { 
		this.diameter = diameter;
	} 

	public LineSectionLengthImpl diameter(long diameter) { 
		this.diameter = diameter;
		return this;
	} 

}
