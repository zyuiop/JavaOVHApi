package net.zyuiop.ovhapi.impl.objects.hosting.web;

import net.zyuiop.ovhapi.api.objects.hosting.web.CountriesIp;
/**
 * Available clusterIp by country
 */

public class CountriesIpImpl implements CountriesIp { 

	private java.lang.String country;
	private java.lang.String ipv6;
	private java.lang.String ip;

	public CountriesIpImpl() {
	}

	public java.lang.String getCountry() { 
		return this.country;
	} 

	public void setCountry(java.lang.String country) { 
		this.country = country;
	} 

	public CountriesIpImpl country(java.lang.String country) { 
		this.country = country;
		return this;
	} 

	public java.lang.String getIpv6() { 
		return this.ipv6;
	} 

	public void setIpv6(java.lang.String ipv6) { 
		this.ipv6 = ipv6;
	} 

	public CountriesIpImpl ipv6(java.lang.String ipv6) { 
		this.ipv6 = ipv6;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public CountriesIpImpl ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

}
