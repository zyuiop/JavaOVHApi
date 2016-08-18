package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Hubic service
 */

public class Hubic { 

	private java.lang.String domain;
	private long bytes;
	private java.lang.String voucher;
	private java.lang.String size;

	public Hubic() {
	}

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public Hubic domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public long getBytes() { 
		return this.bytes;
	} 

	public void setBytes(long bytes) { 
		this.bytes = bytes;
	} 

	public Hubic bytes(long bytes) { 
		this.bytes = bytes;
		return this;
	} 

	public java.lang.String getVoucher() { 
		return this.voucher;
	} 

	public void setVoucher(java.lang.String voucher) { 
		this.voucher = voucher;
	} 

	public Hubic voucher(java.lang.String voucher) { 
		this.voucher = voucher;
		return this;
	} 

	public java.lang.String getSize() { 
		return this.size;
	} 

	public void setSize(java.lang.String size) { 
		this.size = size;
	} 

	public Hubic size(java.lang.String size) { 
		this.size = size;
		return this;
	} 

}
