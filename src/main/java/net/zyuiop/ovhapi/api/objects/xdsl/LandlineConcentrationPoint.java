package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Infos about a Landline at the concentration point
 */

public class LandlineConcentrationPoint { 

	private java.lang.String lineHead;
	private long lineInitialSectionPair;
	private long lineInitialSection;

	public LandlineConcentrationPoint() {
	}

	public java.lang.String getLineHead() { 
		return this.lineHead;
	} 

	public void setLineHead(java.lang.String lineHead) { 
		this.lineHead = lineHead;
	} 

	public LandlineConcentrationPoint lineHead(java.lang.String lineHead) { 
		this.lineHead = lineHead;
		return this;
	} 

	public long getLineInitialSectionPair() { 
		return this.lineInitialSectionPair;
	} 

	public void setLineInitialSectionPair(long lineInitialSectionPair) { 
		this.lineInitialSectionPair = lineInitialSectionPair;
	} 

	public LandlineConcentrationPoint lineInitialSectionPair(long lineInitialSectionPair) { 
		this.lineInitialSectionPair = lineInitialSectionPair;
		return this;
	} 

	public long getLineInitialSection() { 
		return this.lineInitialSection;
	} 

	public void setLineInitialSection(long lineInitialSection) { 
		this.lineInitialSection = lineInitialSection;
	} 

	public LandlineConcentrationPoint lineInitialSection(long lineInitialSection) { 
		this.lineInitialSection = lineInitialSection;
		return this;
	} 

}
