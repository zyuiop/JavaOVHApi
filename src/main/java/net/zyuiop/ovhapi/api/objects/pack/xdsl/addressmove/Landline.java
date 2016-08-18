package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * The parameters needed to activate the access on a landline
 */

public class Landline { 

	private boolean portLineNumber;
	private java.lang.String rio;
	private java.lang.String status;
	private java.lang.String lineNumber;
	private java.lang.String unbundling;

	public Landline() {
	}

	public boolean getPortLineNumber() { 
		return this.portLineNumber;
	} 

	public void setPortLineNumber(boolean portLineNumber) { 
		this.portLineNumber = portLineNumber;
	} 

	public Landline portLineNumber(boolean portLineNumber) { 
		this.portLineNumber = portLineNumber;
		return this;
	} 

	public java.lang.String getRio() { 
		return this.rio;
	} 

	public void setRio(java.lang.String rio) { 
		this.rio = rio;
	} 

	public Landline rio(java.lang.String rio) { 
		this.rio = rio;
		return this;
	} 

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public Landline status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getLineNumber() { 
		return this.lineNumber;
	} 

	public void setLineNumber(java.lang.String lineNumber) { 
		this.lineNumber = lineNumber;
	} 

	public Landline lineNumber(java.lang.String lineNumber) { 
		this.lineNumber = lineNumber;
		return this;
	} 

	public java.lang.String getUnbundling() { 
		return this.unbundling;
	} 

	public void setUnbundling(java.lang.String unbundling) { 
		this.unbundling = unbundling;
	} 

	public Landline unbundling(java.lang.String unbundling) { 
		this.unbundling = unbundling;
		return this;
	} 

}
