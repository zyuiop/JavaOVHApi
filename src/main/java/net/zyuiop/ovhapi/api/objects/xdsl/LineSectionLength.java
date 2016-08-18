package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * 
 */

public class LineSectionLength { 

	private long length;
	private long diameter;

	public LineSectionLength() {
	}

	public long getLength() { 
		return this.length;
	} 

	public void setLength(long length) { 
		this.length = length;
	} 

	public LineSectionLength length(long length) { 
		this.length = length;
		return this;
	} 

	public long getDiameter() { 
		return this.diameter;
	} 

	public void setDiameter(long diameter) { 
		this.diameter = diameter;
	} 

	public LineSectionLength diameter(long diameter) { 
		this.diameter = diameter;
		return this;
	} 

}
