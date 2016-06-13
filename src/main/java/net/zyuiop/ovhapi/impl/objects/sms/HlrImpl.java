package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Hlr;
/**
 * Sms operator informations
 */

public class HlrImpl implements Hlr { 

	private java.lang.String country;
	private java.lang.String operator;
	private java.lang.String network;
	private java.lang.String region;
	private java.lang.String countryCode;

	public HlrImpl() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public HlrImpl country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getOperator() { 
		return this.operator;
	} 

	public void setOperator(java.lang.String operator) { 
		this.operator = operator;
	} 

	public HlrImpl operator(java.lang.String operator) { 
		this.operator = operator;
		return this;
	} 

	public java.lang.String getNetwork() { 
		return this.network;
	} 

	public void setNetwork(java.lang.String network) { 
		this.network = network;
	} 

	public HlrImpl network(java.lang.String network) { 
		this.network = network;
		return this;
	} 

	public java.lang.String getRegion() { 
		return this.region;
	} 

	public void setRegion(java.lang.String region) { 
		this.region = region;
	} 

	public HlrImpl region(java.lang.String region) { 
		this.region = region;
		return this;
	} 

	public java.lang.String getCountryCode() { 
		return this.countryCode;
	} 

	public void setCountryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
	} 

	public HlrImpl countryCode(java.lang.String countryCode) { 
		this.countryCode = countryCode;
		return this;
	} 

}
