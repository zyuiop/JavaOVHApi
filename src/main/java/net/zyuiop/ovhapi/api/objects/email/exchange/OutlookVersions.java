package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Availability of outlook version
 */

public class OutlookVersions { 

	private java.lang.String outlookVersion;
	private java.lang.String outlookLanguage;
	private boolean status;

	public OutlookVersions() {
	}

	public java.lang.String getOutlookVersion() { 
		return this.outlookVersion;
	} 

	public void setOutlookVersion(java.lang.String outlookVersion) { 
		this.outlookVersion = outlookVersion;
	} 

	public OutlookVersions outlookVersion(java.lang.String outlookVersion) { 
		this.outlookVersion = outlookVersion;
		return this;
	} 

	public java.lang.String getOutlookLanguage() { 
		return this.outlookLanguage;
	} 

	public void setOutlookLanguage(java.lang.String outlookLanguage) { 
		this.outlookLanguage = outlookLanguage;
	} 

	public OutlookVersions outlookLanguage(java.lang.String outlookLanguage) { 
		this.outlookLanguage = outlookLanguage;
		return this;
	} 

	public boolean getStatus() { 
		return this.status;
	} 

	public void setStatus(boolean status) { 
		this.status = status;
	} 

	public OutlookVersions status(boolean status) { 
		this.status = status;
		return this;
	} 

}
