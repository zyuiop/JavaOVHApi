package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call diagnostic analyze structure call cdrs
 */

public class CallDiagnosticCdrsBasic { 

	private java.lang.String causeDescription;
	private java.lang.String releaseLocation;
	private java.lang.String cause;

	public CallDiagnosticCdrsBasic() {
	}

	public java.lang.String getCauseDescription() { 
		return this.causeDescription;
	} 

	public void setCauseDescription(java.lang.String causeDescription) { 
		this.causeDescription = causeDescription;
	} 

	public CallDiagnosticCdrsBasic causeDescription(java.lang.String causeDescription) { 
		this.causeDescription = causeDescription;
		return this;
	} 

	public java.lang.String getReleaseLocation() { 
		return this.releaseLocation;
	} 

	public void setReleaseLocation(java.lang.String releaseLocation) { 
		this.releaseLocation = releaseLocation;
	} 

	public CallDiagnosticCdrsBasic releaseLocation(java.lang.String releaseLocation) { 
		this.releaseLocation = releaseLocation;
		return this;
	} 

	public java.lang.String getCause() { 
		return this.cause;
	} 

	public void setCause(java.lang.String cause) { 
		this.cause = cause;
	} 

	public CallDiagnosticCdrsBasic cause(java.lang.String cause) { 
		this.cause = cause;
		return this;
	} 

}
