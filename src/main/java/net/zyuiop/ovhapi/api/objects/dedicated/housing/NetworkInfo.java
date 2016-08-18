package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing the Bay`s network configuration
 */

public class NetworkInfo { 

	private net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo link;
	private net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv6;
	private net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv4;

	public NetworkInfo() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo getLink() { 
		return this.link;
	} 

	public void setLink(net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo link) { 
		this.link = link;
	} 

	public NetworkInfo link(net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo link) { 
		this.link = link;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo getIpv6() { 
		return this.ipv6;
	} 

	public void setIpv6(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv6) { 
		this.ipv6 = ipv6;
	} 

	public NetworkInfo ipv6(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv6) { 
		this.ipv6 = ipv6;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo getIpv4() { 
		return this.ipv4;
	} 

	public void setIpv4(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv4) { 
		this.ipv4 = ipv4;
	} 

	public NetworkInfo ipv4(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv4) { 
		this.ipv4 = ipv4;
		return this;
	} 

}
