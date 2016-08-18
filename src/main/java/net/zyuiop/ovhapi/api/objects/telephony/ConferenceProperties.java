package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Conference properties
 */

public class ConferenceProperties { 

	private java.lang.String pin;
	private boolean announceFile;
	private java.lang.String reportEmail;
	private java.lang.String reportStatus;
	private java.lang.String language;
	private boolean recordStatus;
	private java.lang.String eventsChannel;
	private boolean anonymousRejection;
	private boolean enterMuted;

	public ConferenceProperties() {
	}

	public java.lang.String getPin() { 
		return this.pin;
	} 

	public void setPin(java.lang.String pin) { 
		this.pin = pin;
	} 

	public ConferenceProperties pin(java.lang.String pin) { 
		this.pin = pin;
		return this;
	} 

	public boolean getAnnounceFile() { 
		return this.announceFile;
	} 

	public void setAnnounceFile(boolean announceFile) { 
		this.announceFile = announceFile;
	} 

	public ConferenceProperties announceFile(boolean announceFile) { 
		this.announceFile = announceFile;
		return this;
	} 

	public java.lang.String getReportEmail() { 
		return this.reportEmail;
	} 

	public void setReportEmail(java.lang.String reportEmail) { 
		this.reportEmail = reportEmail;
	} 

	public ConferenceProperties reportEmail(java.lang.String reportEmail) { 
		this.reportEmail = reportEmail;
		return this;
	} 

	public java.lang.String getReportStatus() { 
		return this.reportStatus;
	} 

	public void setReportStatus(java.lang.String reportStatus) { 
		this.reportStatus = reportStatus;
	} 

	public ConferenceProperties reportStatus(java.lang.String reportStatus) { 
		this.reportStatus = reportStatus;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public ConferenceProperties language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public boolean getRecordStatus() { 
		return this.recordStatus;
	} 

	public void setRecordStatus(boolean recordStatus) { 
		this.recordStatus = recordStatus;
	} 

	public ConferenceProperties recordStatus(boolean recordStatus) { 
		this.recordStatus = recordStatus;
		return this;
	} 

	public java.lang.String getEventsChannel() { 
		return this.eventsChannel;
	} 

	public void setEventsChannel(java.lang.String eventsChannel) { 
		this.eventsChannel = eventsChannel;
	} 

	public ConferenceProperties eventsChannel(java.lang.String eventsChannel) { 
		this.eventsChannel = eventsChannel;
		return this;
	} 

	public boolean getAnonymousRejection() { 
		return this.anonymousRejection;
	} 

	public void setAnonymousRejection(boolean anonymousRejection) { 
		this.anonymousRejection = anonymousRejection;
	} 

	public ConferenceProperties anonymousRejection(boolean anonymousRejection) { 
		this.anonymousRejection = anonymousRejection;
		return this;
	} 

	public boolean getEnterMuted() { 
		return this.enterMuted;
	} 

	public void setEnterMuted(boolean enterMuted) { 
		this.enterMuted = enterMuted;
	} 

	public ConferenceProperties enterMuted(boolean enterMuted) { 
		this.enterMuted = enterMuted;
		return this;
	} 

}
