package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.Line;
/**
 * Information about the physical copper line
 */

public class LineImpl implements Line { 

	private java.lang.String deconsolidation;
	private net.zyuiop.ovhapi.impl.objects.xdsl.LandlineConcentrationPointImpl concentrationPoint;
	private java.lang.String number;
	private long distance;
	private java.lang.String faultRepairTime;
	private boolean directDistribution;
	private boolean portability;
	private double mitigation;
	private net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] lineSectionsLength;
	private double syncUp;
	private double syncDown;
	private java.lang.String originalNumber;

	public LineImpl() {
	}

	public java.lang.String getDeconsolidation() { 
		return this.deconsolidation;
	} 

	public void setDeconsolidation(java.lang.String deconsolidation) { 
		this.deconsolidation = deconsolidation;
	} 

	public LineImpl deconsolidation(java.lang.String deconsolidation) { 
		this.deconsolidation = deconsolidation;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.LandlineConcentrationPointImpl getConcentrationPoint() { 
		return this.concentrationPoint;
	} 

	public void setConcentrationPoint(net.zyuiop.ovhapi.impl.objects.xdsl.LandlineConcentrationPointImpl concentrationPoint) { 
		this.concentrationPoint = concentrationPoint;
	} 

	public LineImpl concentrationPoint(net.zyuiop.ovhapi.impl.objects.xdsl.LandlineConcentrationPointImpl concentrationPoint) { 
		this.concentrationPoint = concentrationPoint;
		return this;
	} 

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public LineImpl number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public long getDistance() { 
		return this.distance;
	} 

	public void setDistance(long distance) { 
		this.distance = distance;
	} 

	public LineImpl distance(long distance) { 
		this.distance = distance;
		return this;
	} 

	public java.lang.String getFaultRepairTime() { 
		return this.faultRepairTime;
	} 

	public void setFaultRepairTime(java.lang.String faultRepairTime) { 
		this.faultRepairTime = faultRepairTime;
	} 

	public LineImpl faultRepairTime(java.lang.String faultRepairTime) { 
		this.faultRepairTime = faultRepairTime;
		return this;
	} 

	public boolean getDirectDistribution() { 
		return this.directDistribution;
	} 

	public void setDirectDistribution(boolean directDistribution) { 
		this.directDistribution = directDistribution;
	} 

	public LineImpl directDistribution(boolean directDistribution) { 
		this.directDistribution = directDistribution;
		return this;
	} 

	public boolean getPortability() { 
		return this.portability;
	} 

	public void setPortability(boolean portability) { 
		this.portability = portability;
	} 

	public LineImpl portability(boolean portability) { 
		this.portability = portability;
		return this;
	} 

	public double getMitigation() { 
		return this.mitigation;
	} 

	public void setMitigation(double mitigation) { 
		this.mitigation = mitigation;
	} 

	public LineImpl mitigation(double mitigation) { 
		this.mitigation = mitigation;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] getLineSectionsLength() { 
		return this.lineSectionsLength;
	} 

	public void setLineSectionsLength(net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] lineSectionsLength) { 
		this.lineSectionsLength = lineSectionsLength;
	} 

	public LineImpl lineSectionsLength(net.zyuiop.ovhapi.impl.objects.xdsl.LineSectionLengthImpl[] lineSectionsLength) { 
		this.lineSectionsLength = lineSectionsLength;
		return this;
	} 

	public double getSyncUp() { 
		return this.syncUp;
	} 

	public void setSyncUp(double syncUp) { 
		this.syncUp = syncUp;
	} 

	public LineImpl syncUp(double syncUp) { 
		this.syncUp = syncUp;
		return this;
	} 

	public double getSyncDown() { 
		return this.syncDown;
	} 

	public void setSyncDown(double syncDown) { 
		this.syncDown = syncDown;
	} 

	public LineImpl syncDown(double syncDown) { 
		this.syncDown = syncDown;
		return this;
	} 

	public java.lang.String getOriginalNumber() { 
		return this.originalNumber;
	} 

	public void setOriginalNumber(java.lang.String originalNumber) { 
		this.originalNumber = originalNumber;
	} 

	public LineImpl originalNumber(java.lang.String originalNumber) { 
		this.originalNumber = originalNumber;
		return this;
	} 

}
