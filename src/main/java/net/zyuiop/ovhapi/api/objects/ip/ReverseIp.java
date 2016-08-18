package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your reverse records on IP
 */

public class ReverseIp { 

	private java.lang.String ipReverse;
	private java.lang.String reverse;

	public ReverseIp() {
	}

	public java.lang.String getIpReverse() { 
		return this.ipReverse;
	} 

	public void setIpReverse(java.lang.String ipReverse) { 
		this.ipReverse = ipReverse;
	} 

	public ReverseIp ipReverse(java.lang.String ipReverse) { 
		this.ipReverse = ipReverse;
		return this;
	} 

	public java.lang.String getReverse() { 
		return this.reverse;
	} 

	public void setReverse(java.lang.String reverse) { 
		this.reverse = reverse;
	} 

	public ReverseIp reverse(java.lang.String reverse) { 
		this.reverse = reverse;
		return this;
	} 

}
