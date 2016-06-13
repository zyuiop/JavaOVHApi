package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderable;
/**
 * A structure describing informations about orderable IP address
 */

public class IpOrderableImpl implements IpOrderable { 

	private net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails ipv6;
	private net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails ipv4;

	public IpOrderableImpl() {
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails getIpv6() { 
		return this.ipv6;
	} 

	public void setIpv6(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails ipv6) { 
		this.ipv6 = ipv6;
	} 

	public IpOrderableImpl ipv6(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails ipv6) { 
		this.ipv6 = ipv6;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails getIpv4() { 
		return this.ipv4;
	} 

	public void setIpv4(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails ipv4) { 
		this.ipv4 = ipv4;
	} 

	public IpOrderableImpl ipv4(net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails ipv4) { 
		this.ipv4 = ipv4;
		return this;
	} 

}
