package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail Properties
 */

public class VoicemailProperties { 

	private java.lang.String fromName;
	private boolean doNotRecord;
	private java.lang.String fromEmail;
	private long unreadMessages;
	private boolean keepMessage;
	private java.lang.String audioFormat;
	private net.zyuiop.ovhapi.api.objects.telephony.ServiceVoicemailNotifications[] redirectionEmails;
	private boolean forcePassword;
	private java.lang.String annouceMessage;
	private boolean isNewVersion;

	public VoicemailProperties() {
	}

	public java.lang.String getFromName() { 
		return this.fromName;
	} 

	public void setFromName(java.lang.String fromName) { 
		this.fromName = fromName;
	} 

	public VoicemailProperties fromName(java.lang.String fromName) { 
		this.fromName = fromName;
		return this;
	} 

	public boolean getDoNotRecord() { 
		return this.doNotRecord;
	} 

	public void setDoNotRecord(boolean doNotRecord) { 
		this.doNotRecord = doNotRecord;
	} 

	public VoicemailProperties doNotRecord(boolean doNotRecord) { 
		this.doNotRecord = doNotRecord;
		return this;
	} 

	public java.lang.String getFromEmail() { 
		return this.fromEmail;
	} 

	public void setFromEmail(java.lang.String fromEmail) { 
		this.fromEmail = fromEmail;
	} 

	public VoicemailProperties fromEmail(java.lang.String fromEmail) { 
		this.fromEmail = fromEmail;
		return this;
	} 

	public long getUnreadMessages() { 
		return this.unreadMessages;
	} 

	public void setUnreadMessages(long unreadMessages) { 
		this.unreadMessages = unreadMessages;
	} 

	public VoicemailProperties unreadMessages(long unreadMessages) { 
		this.unreadMessages = unreadMessages;
		return this;
	} 

	public boolean getKeepMessage() { 
		return this.keepMessage;
	} 

	public void setKeepMessage(boolean keepMessage) { 
		this.keepMessage = keepMessage;
	} 

	public VoicemailProperties keepMessage(boolean keepMessage) { 
		this.keepMessage = keepMessage;
		return this;
	} 

	public java.lang.String getAudioFormat() { 
		return this.audioFormat;
	} 

	public void setAudioFormat(java.lang.String audioFormat) { 
		this.audioFormat = audioFormat;
	} 

	public VoicemailProperties audioFormat(java.lang.String audioFormat) { 
		this.audioFormat = audioFormat;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.telephony.ServiceVoicemailNotifications[] getRedirectionEmails() { 
		return this.redirectionEmails;
	} 

	public void setRedirectionEmails(net.zyuiop.ovhapi.api.objects.telephony.ServiceVoicemailNotifications[] redirectionEmails) { 
		this.redirectionEmails = redirectionEmails;
	} 

	public VoicemailProperties redirectionEmails(net.zyuiop.ovhapi.api.objects.telephony.ServiceVoicemailNotifications[] redirectionEmails) { 
		this.redirectionEmails = redirectionEmails;
		return this;
	} 

	public boolean getForcePassword() { 
		return this.forcePassword;
	} 

	public void setForcePassword(boolean forcePassword) { 
		this.forcePassword = forcePassword;
	} 

	public VoicemailProperties forcePassword(boolean forcePassword) { 
		this.forcePassword = forcePassword;
		return this;
	} 

	public java.lang.String getAnnouceMessage() { 
		return this.annouceMessage;
	} 

	public void setAnnouceMessage(java.lang.String annouceMessage) { 
		this.annouceMessage = annouceMessage;
	} 

	public VoicemailProperties annouceMessage(java.lang.String annouceMessage) { 
		this.annouceMessage = annouceMessage;
		return this;
	} 

	public boolean getIsNewVersion() { 
		return this.isNewVersion;
	} 

	public void setIsNewVersion(boolean isNewVersion) { 
		this.isNewVersion = isNewVersion;
	} 

	public VoicemailProperties isNewVersion(boolean isNewVersion) { 
		this.isNewVersion = isNewVersion;
		return this;
	} 

}
