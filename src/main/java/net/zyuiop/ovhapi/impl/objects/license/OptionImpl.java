package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.Option;
/**
 * Your License options
 */

public class OptionImpl implements Option { 

	private java.lang.String amount;
	private java.lang.String version;
	private java.lang.String label;
	private boolean canBeDeleted;
	private java.util.Date expirationDate;

	public OptionImpl() {
	}

	public java.lang.String getAmount() { 
		return this.amount;
	} 

	public void setAmount(java.lang.String amount) { 
		this.amount = amount;
	} 

	public OptionImpl amount(java.lang.String amount) { 
		this.amount = amount;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OptionImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

	public java.lang.String getLabel() { 
		return this.label;
	} 

	public void setLabel(java.lang.String label) { 
		this.label = label;
	} 

	public OptionImpl label(java.lang.String label) { 
		this.label = label;
		return this;
	} 

	public boolean getCanBeDeleted() { 
		return this.canBeDeleted;
	} 

	public void setCanBeDeleted(boolean canBeDeleted) { 
		this.canBeDeleted = canBeDeleted;
	} 

	public OptionImpl canBeDeleted(boolean canBeDeleted) { 
		this.canBeDeleted = canBeDeleted;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public OptionImpl expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

}
