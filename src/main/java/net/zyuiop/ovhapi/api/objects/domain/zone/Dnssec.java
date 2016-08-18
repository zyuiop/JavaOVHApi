package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Manage Dnssec for this zone
 */

public class Dnssec { 

	private java.lang.String status;

	public Dnssec() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Dnssec status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
