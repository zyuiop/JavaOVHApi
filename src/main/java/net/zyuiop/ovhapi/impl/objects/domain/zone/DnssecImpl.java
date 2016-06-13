package net.zyuiop.ovhapi.impl.objects.domain.zone;

import net.zyuiop.ovhapi.api.objects.domain.zone.Dnssec;
/**
 * Manage Dnssec for this zone
 */

public class DnssecImpl implements Dnssec { 

	private java.lang.String status;

	public DnssecImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public DnssecImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

}
