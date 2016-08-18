package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Installation template for a VPS Virtual Machine
 */

public class Template { 

	private long bitFormat;
	private java.lang.String name;
	private long id;
	private java.lang.String locale;
	private java.lang.String[] availableLanguage;
	private java.lang.String distribution;

	public Template() {
	}

	public long getBitFormat() { 
		return this.bitFormat;
	} 

	public void setBitFormat(long bitFormat) { 
		this.bitFormat = bitFormat;
	} 

	public Template bitFormat(long bitFormat) { 
		this.bitFormat = bitFormat;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Template name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public Template id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getLocale() { 
		return this.locale;
	} 

	public void setLocale(java.lang.String locale) { 
		this.locale = locale;
	} 

	public Template locale(java.lang.String locale) { 
		this.locale = locale;
		return this;
	} 

	public java.lang.String[] getAvailableLanguage() { 
		return this.availableLanguage;
	} 

	public void setAvailableLanguage(java.lang.String[] availableLanguage) { 
		this.availableLanguage = availableLanguage;
	} 

	public Template availableLanguage(java.lang.String[] availableLanguage) { 
		this.availableLanguage = availableLanguage;
		return this;
	} 

	public java.lang.String getDistribution() { 
		return this.distribution;
	} 

	public void setDistribution(java.lang.String distribution) { 
		this.distribution = distribution;
	} 

	public Template distribution(java.lang.String distribution) { 
		this.distribution = distribution;
		return this;
	} 

}
