package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms operator informations
 */

public class Hlr { 

	private java.lang.String country;
	private java.lang.String operator;
	private java.lang.String network;
	private java.lang.String region;
	private java.lang.String countryCode;

	public Hlr() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public Hlr country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getOperator() { 
		return this.operator;
	} 

	public void setOperator(java.lang.String operator) { 
		this.operator = operator;
	} 

	public Hlr operator(java.lang.String operator) { 
		this.operator = operator;
		return this;
	} 

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public Hlr network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public Hlr region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getCountryCode() { 
		return this.countryCode;
	} 

	public void setCountryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
	} 

	public Hlr countryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
		return this;
	} 

}
