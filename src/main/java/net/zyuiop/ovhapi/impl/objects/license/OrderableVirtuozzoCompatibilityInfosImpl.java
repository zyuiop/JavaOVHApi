package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos;
/**
 * All versions available for Virtuozzo products
 */

public class OrderableVirtuozzoCompatibilityInfosImpl implements OrderableVirtuozzoCompatibilityInfos { 

	private java.lang.String version;
	private java.lang.String[] compliantContainers;
	private java.lang.String[] potentialProblems;

	public OrderableVirtuozzoCompatibilityInfosImpl() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableVirtuozzoCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String[] getCompliantContainers() { 
		return this.compliantContainers;
	} 

	public void setCompliantContainers(java.lang.String[] compliantContainers) { 
		this.compliantContainers = compliantContainers;
	} 

	public OrderableVirtuozzoCompatibilityInfosImpl compliantContainers(java.lang.String[] compliantContainers) { 
		this.compliantContainers = compliantContainers;
		return this;
	} 

	public java.lang.String[] getPotentialProblems() { 
		return this.potentialProblems;
	} 

	public void setPotentialProblems(java.lang.String[] potentialProblems) { 
		this.potentialProblems = potentialProblems;
	} 

	public OrderableVirtuozzoCompatibilityInfosImpl potentialProblems(java.lang.String[] potentialProblems) { 
		this.potentialProblems = potentialProblems;
		return this;
	} 

}
