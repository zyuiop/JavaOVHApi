package net.zyuiop.ovhapi.impl.objects.dedicated.housing;

import net.zyuiop.ovhapi.api.objects.dedicated.housing.NetworkInfo;
/**
 * A structure describing the Bay`s network configuration
 */

public class NetworkInfoImpl implements NetworkInfo { 

	private net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo link;
	private net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv6;
	private net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv4;

	public NetworkInfoImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo getLink() { 
		return this.link;
	} 

	public void setLink(net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo link) { 
		this.link = link;
	} 

	public NetworkInfoImpl link(net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo link) { 
		this.link = link;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo getIpv6() { 
		return this.ipv6;
	} 

	public void setIpv6(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv6) { 
		this.ipv6 = ipv6;
	} 

	public NetworkInfoImpl ipv6(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv6) { 
		this.ipv6 = ipv6;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo getIpv4() { 
		return this.ipv4;
	} 

	public void setIpv4(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv4) { 
		this.ipv4 = ipv4;
	} 

	public NetworkInfoImpl ipv4(net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo ipv4) { 
		this.ipv4 = ipv4;
		return this;
	} 

}
