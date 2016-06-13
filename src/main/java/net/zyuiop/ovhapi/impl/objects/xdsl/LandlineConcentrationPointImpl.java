package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.LandlineConcentrationPoint;
/**
 * Infos about a Landline at the concentration point
 */

public class LandlineConcentrationPointImpl implements LandlineConcentrationPoint { 

	private java.lang.String lineHead;
	private long lineInitialSectionPair;
	private long lineInitialSection;

	public LandlineConcentrationPointImpl() {
	}

	public java.lang.String getLineHead() { 
		return this.lineHead;
	} 

	public void setLineHead(java.lang.String lineHead) { 
		this.lineHead = lineHead;
	} 

	public LandlineConcentrationPointImpl lineHead(java.lang.String lineHead) { 
		this.lineHead = lineHead;
		return this;
	} 

	public long getLineInitialSectionPair() { 
		return this.lineInitialSectionPair;
	} 

	public void setLineInitialSectionPair(long lineInitialSectionPair) { 
		this.lineInitialSectionPair = lineInitialSectionPair;
	} 

	public LandlineConcentrationPointImpl lineInitialSectionPair(long lineInitialSectionPair) { 
		this.lineInitialSectionPair = lineInitialSectionPair;
		return this;
	} 

	public long getLineInitialSection() { 
		return this.lineInitialSection;
	} 

	public void setLineInitialSection(long lineInitialSection) { 
		this.lineInitialSection = lineInitialSection;
	} 

	public LandlineConcentrationPointImpl lineInitialSection(long lineInitialSection) { 
		this.lineInitialSection = lineInitialSection;
		return this;
	} 

}
