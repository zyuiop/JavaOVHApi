package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.IpmiTestResult;
/**
 * A structure describing IPMI test result
 */

public class IpmiTestResultImpl implements IpmiTestResult { 

	private java.lang.String status;
	private java.util.Date date;

	public IpmiTestResultImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IpmiTestResultImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public IpmiTestResultImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

}
