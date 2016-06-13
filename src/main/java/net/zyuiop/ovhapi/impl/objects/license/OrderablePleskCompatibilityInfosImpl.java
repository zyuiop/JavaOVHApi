package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderablePleskCompatibilityInfos;
/**
 * All versions available for Plesk products
 */

public class OrderablePleskCompatibilityInfosImpl implements OrderablePleskCompatibilityInfos { 

	private java.lang.String compliantLanguagePack;
	private java.lang.String compliantAntivirus;
	private java.lang.String version;
	private java.lang.String compliantApplicationSets;
	private java.lang.String potentialProblems;
	private boolean canHavePowerPack;
	private java.lang.String compliantDomains;
	private boolean canHaveWordpressToolkit;

	public OrderablePleskCompatibilityInfosImpl() {
	}

	public java.lang.String getCompliantLanguagePack() { 
		return this.compliantLanguagePack;
	} 

	public void setCompliantLanguagePack(java.lang.String compliantLanguagePack) { 
		this.compliantLanguagePack = compliantLanguagePack;
	} 

	public OrderablePleskCompatibilityInfosImpl compliantLanguagePack(java.lang.String compliantLanguagePack) { 
		this.compliantLanguagePack = compliantLanguagePack;
		return this;
	} 

	public java.lang.String getCompliantAntivirus() { 
		return this.compliantAntivirus;
	} 

	public void setCompliantAntivirus(java.lang.String compliantAntivirus) { 
		this.compliantAntivirus = compliantAntivirus;
	} 

	public OrderablePleskCompatibilityInfosImpl compliantAntivirus(java.lang.String compliantAntivirus) { 
		this.compliantAntivirus = compliantAntivirus;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderablePleskCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getCompliantApplicationSets() { 
		return this.compliantApplicationSets;
	} 

	public void setCompliantApplicationSets(java.lang.String compliantApplicationSets) { 
		this.compliantApplicationSets = compliantApplicationSets;
	} 

	public OrderablePleskCompatibilityInfosImpl compliantApplicationSets(java.lang.String compliantApplicationSets) { 
		this.compliantApplicationSets = compliantApplicationSets;
		return this;
	} 

	public java.lang.String getPotentialProblems() { 
		return this.potentialProblems;
	} 

	public void setPotentialProblems(java.lang.String potentialProblems) { 
		this.potentialProblems = potentialProblems;
	} 

	public OrderablePleskCompatibilityInfosImpl potentialProblems(java.lang.String potentialProblems) { 
		this.potentialProblems = potentialProblems;
		return this;
	} 

	public boolean getCanHavePowerPack() { 
		return this.canHavePowerPack;
	} 

	public void setCanHavePowerPack(boolean canHavePowerPack) { 
		this.canHavePowerPack = canHavePowerPack;
	} 

	public OrderablePleskCompatibilityInfosImpl canHavePowerPack(boolean canHavePowerPack) { 
		this.canHavePowerPack = canHavePowerPack;
		return this;
	} 

	public java.lang.String getCompliantDomains() { 
		return this.compliantDomains;
	} 

	public void setCompliantDomains(java.lang.String compliantDomains) { 
		this.compliantDomains = compliantDomains;
	} 

	public OrderablePleskCompatibilityInfosImpl compliantDomains(java.lang.String compliantDomains) { 
		this.compliantDomains = compliantDomains;
		return this;
	} 

	public boolean getCanHaveWordpressToolkit() { 
		return this.canHaveWordpressToolkit;
	} 

	public void setCanHaveWordpressToolkit(boolean canHaveWordpressToolkit) { 
		this.canHaveWordpressToolkit = canHaveWordpressToolkit;
	} 

	public OrderablePleskCompatibilityInfosImpl canHaveWordpressToolkit(boolean canHaveWordpressToolkit) { 
		this.canHaveWordpressToolkit = canHaveWordpressToolkit;
		return this;
	} 

}
