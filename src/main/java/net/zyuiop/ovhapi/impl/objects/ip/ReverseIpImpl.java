package net.zyuiop.ovhapi.impl.objects.ip;

import net.zyuiop.ovhapi.api.objects.ip.ReverseIp;
/**
 * Your reverse records on IP
 */

public class ReverseIpImpl implements ReverseIp { 

	private java.lang.String ipReverse;
	private java.lang.String reverse;

	public ReverseIpImpl() {
	}

	public java.lang.String getIpReverse() { 
		return this.ipReverse;
	} 

	public void setIpReverse(java.lang.String ipReverse) { 
		this.ipReverse = ipReverse;
	} 

	public ReverseIpImpl ipReverse(java.lang.String ipReverse) { 
		this.ipReverse = ipReverse;
		return this;
	} 

	public java.lang.String getReverse() { 
		return this.reverse;
	} 

	public void setReverse(java.lang.String reverse) { 
		this.reverse = reverse;
	} 

	public ReverseIpImpl reverse(java.lang.String reverse) { 
		this.reverse = reverse;
		return this;
	} 

}
