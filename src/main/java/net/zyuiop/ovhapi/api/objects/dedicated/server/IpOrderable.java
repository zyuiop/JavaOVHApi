package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about orderable IP address
 */

public class IpOrderable { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] ipv6;
	private net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] ipv4;

	public IpOrderable() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] getIpv6() { 
		return this.ipv6;
	} 

	public void setIpv6(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] ipv6) { 
		this.ipv6 = ipv6;
	} 

	public IpOrderable ipv6(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] ipv6) { 
		this.ipv6 = ipv6;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] getIpv4() { 
		return this.ipv4;
	} 

	public void setIpv4(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] ipv4) { 
		this.ipv4 = ipv4;
	} 

	public IpOrderable ipv4(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails[] ipv4) { 
		this.ipv4 = ipv4;
		return this;
	} 

}
