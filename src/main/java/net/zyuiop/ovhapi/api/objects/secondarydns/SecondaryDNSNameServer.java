package net.zyuiop.ovhapi.api.objects.secondarydns;

/**
 * A structure describing informations about available nameserver for secondary dns 
 */

public class SecondaryDNSNameServer { 

	private java.lang.String ipv6;
	private java.lang.String ip;
	private java.lang.String hostname;

	public SecondaryDNSNameServer() {
	}

	public java.lang.String getIpv6() { 
		return this.ipv6;
	} 

	public void setIpv6(java.lang.String ipv6) { 
		this.ipv6 = ipv6;
	} 

	public SecondaryDNSNameServer ipv6(java.lang.String ipv6) { 
		this.ipv6 = ipv6;
		return this;
	} 

	public java.lang.String getIp() { 
		return this.ip;
	} 

	public void setIp(java.lang.String ip) { 
		this.ip = ip;
	} 

	public SecondaryDNSNameServer ip(java.lang.String ip) { 
		this.ip = ip;
		return this;
	} 

	public java.lang.String getHostname() { 
		return this.hostname;
	} 

	public void setHostname(java.lang.String hostname) { 
		this.hostname = hostname;
	} 

	public SecondaryDNSNameServer hostname(java.lang.String hostname) { 
		this.hostname = hostname;
		return this;
	} 

}
