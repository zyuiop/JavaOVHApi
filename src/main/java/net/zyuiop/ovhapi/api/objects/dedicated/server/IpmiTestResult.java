package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing IPMI test result
 */

public class IpmiTestResult { 

	private java.lang.String status;
	private java.util.Date date;

	public IpmiTestResult() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public IpmiTestResult status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public IpmiTestResult date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

}
