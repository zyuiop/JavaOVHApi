package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Line options
 */

public class LineOptions { 

	private boolean doNotDisturb;
	private java.lang.String forwardBackupNature;
	private java.lang.String forwardNoReplyNumber;
	private java.lang.String forwardBusyNature;
	private boolean absentSubscriber;
	private java.lang.String forwardBusyNumber;
	private java.lang.String codecs;
	private java.lang.String[] ipRestrictions;
	private java.lang.String domain;
	private java.lang.String lockOutCallPassword;
	private boolean identificationRestriction;
	private java.lang.String forwardNoReplyNature;
	private java.lang.String intercom;
	private boolean forwardBackup;
	private java.lang.String forwardBackupNumber;
	private java.lang.String displayNumber;
	private boolean forwardBusy;
	private java.lang.String forwardUnconditionalNumber;
	private boolean anonymousCallRejection;
	private boolean forwardUnconditional;
	private boolean forwardNoReply;
	private boolean callWaiting;
	private java.lang.String forwardUnconditionalNature;
	private long forwardNoReplyDelay;
	private boolean lockOutCall;

	public LineOptions() {
	}

	public boolean getDoNotDisturb() { 
		return this.doNotDisturb;
	} 

	public void setDoNotDisturb(boolean doNotDisturb) { 
		this.doNotDisturb = doNotDisturb;
	} 

	public LineOptions doNotDisturb(boolean doNotDisturb) { 
		this.doNotDisturb = doNotDisturb;
		return this;
	} 

	public java.lang.String getForwardBackupNature() { 
		return this.forwardBackupNature;
	} 

	public void setForwardBackupNature(java.lang.String forwardBackupNature) { 
		this.forwardBackupNature = forwardBackupNature;
	} 

	public LineOptions forwardBackupNature(java.lang.String forwardBackupNature) { 
		this.forwardBackupNature = forwardBackupNature;
		return this;
	} 

	public java.lang.String getForwardNoReplyNumber() { 
		return this.forwardNoReplyNumber;
	} 

	public void setForwardNoReplyNumber(java.lang.String forwardNoReplyNumber) { 
		this.forwardNoReplyNumber = forwardNoReplyNumber;
	} 

	public LineOptions forwardNoReplyNumber(java.lang.String forwardNoReplyNumber) { 
		this.forwardNoReplyNumber = forwardNoReplyNumber;
		return this;
	} 

	public java.lang.String getForwardBusyNature() { 
		return this.forwardBusyNature;
	} 

	public void setForwardBusyNature(java.lang.String forwardBusyNature) { 
		this.forwardBusyNature = forwardBusyNature;
	} 

	public LineOptions forwardBusyNature(java.lang.String forwardBusyNature) { 
		this.forwardBusyNature = forwardBusyNature;
		return this;
	} 

	public boolean getAbsentSubscriber() { 
		return this.absentSubscriber;
	} 

	public void setAbsentSubscriber(boolean absentSubscriber) { 
		this.absentSubscriber = absentSubscriber;
	} 

	public LineOptions absentSubscriber(boolean absentSubscriber) { 
		this.absentSubscriber = absentSubscriber;
		return this;
	} 

	public java.lang.String getForwardBusyNumber() { 
		return this.forwardBusyNumber;
	} 

	public void setForwardBusyNumber(java.lang.String forwardBusyNumber) { 
		this.forwardBusyNumber = forwardBusyNumber;
	} 

	public LineOptions forwardBusyNumber(java.lang.String forwardBusyNumber) { 
		this.forwardBusyNumber = forwardBusyNumber;
		return this;
	} 

	public java.lang.String getCodecs() { 
		return this.codecs;
	} 

	public void setCodecs(java.lang.String codecs) { 
		this.codecs = codecs;
	} 

	public LineOptions codecs(java.lang.String codecs) { 
		this.codecs = codecs;
		return this;
	} 

	public java.lang.String[] getIpRestrictions() { 
		return this.ipRestrictions;
	} 

	public void setIpRestrictions(java.lang.String[] ipRestrictions) { 
		this.ipRestrictions = ipRestrictions;
	} 

	public LineOptions ipRestrictions(java.lang.String[] ipRestrictions) { 
		this.ipRestrictions = ipRestrictions;
		return this;
	} 

	public java.lang.String getDomain() { 
		return this.domain;
	} 

	public void setDomain(java.lang.String domain) { 
		this.domain = domain;
	} 

	public LineOptions domain(java.lang.String domain) { 
		this.domain = domain;
		return this;
	} 

	public java.lang.String getLockOutCallPassword() { 
		return this.lockOutCallPassword;
	} 

	public void setLockOutCallPassword(java.lang.String lockOutCallPassword) { 
		this.lockOutCallPassword = lockOutCallPassword;
	} 

	public LineOptions lockOutCallPassword(java.lang.String lockOutCallPassword) { 
		this.lockOutCallPassword = lockOutCallPassword;
		return this;
	} 

	public boolean getIdentificationRestriction() { 
		return this.identificationRestriction;
	} 

	public void setIdentificationRestriction(boolean identificationRestriction) { 
		this.identificationRestriction = identificationRestriction;
	} 

	public LineOptions identificationRestriction(boolean identificationRestriction) { 
		this.identificationRestriction = identificationRestriction;
		return this;
	} 

	public java.lang.String getForwardNoReplyNature() { 
		return this.forwardNoReplyNature;
	} 

	public void setForwardNoReplyNature(java.lang.String forwardNoReplyNature) { 
		this.forwardNoReplyNature = forwardNoReplyNature;
	} 

	public LineOptions forwardNoReplyNature(java.lang.String forwardNoReplyNature) { 
		this.forwardNoReplyNature = forwardNoReplyNature;
		return this;
	} 

	public java.lang.String getIntercom() { 
		return this.intercom;
	} 

	public void setIntercom(java.lang.String intercom) { 
		this.intercom = intercom;
	} 

	public LineOptions intercom(java.lang.String intercom) { 
		this.intercom = intercom;
		return this;
	} 

	public boolean getForwardBackup() { 
		return this.forwardBackup;
	} 

	public void setForwardBackup(boolean forwardBackup) { 
		this.forwardBackup = forwardBackup;
	} 

	public LineOptions forwardBackup(boolean forwardBackup) { 
		this.forwardBackup = forwardBackup;
		return this;
	} 

	public java.lang.String getForwardBackupNumber() { 
		return this.forwardBackupNumber;
	} 

	public void setForwardBackupNumber(java.lang.String forwardBackupNumber) { 
		this.forwardBackupNumber = forwardBackupNumber;
	} 

	public LineOptions forwardBackupNumber(java.lang.String forwardBackupNumber) { 
		this.forwardBackupNumber = forwardBackupNumber;
		return this;
	} 

	public java.lang.String getDisplayNumber() { 
		return this.displayNumber;
	} 

	public void setDisplayNumber(java.lang.String displayNumber) { 
		this.displayNumber = displayNumber;
	} 

	public LineOptions displayNumber(java.lang.String displayNumber) { 
		this.displayNumber = displayNumber;
		return this;
	} 

	public boolean getForwardBusy() { 
		return this.forwardBusy;
	} 

	public void setForwardBusy(boolean forwardBusy) { 
		this.forwardBusy = forwardBusy;
	} 

	public LineOptions forwardBusy(boolean forwardBusy) { 
		this.forwardBusy = forwardBusy;
		return this;
	} 

	public java.lang.String getForwardUnconditionalNumber() { 
		return this.forwardUnconditionalNumber;
	} 

	public void setForwardUnconditionalNumber(java.lang.String forwardUnconditionalNumber) { 
		this.forwardUnconditionalNumber = forwardUnconditionalNumber;
	} 

	public LineOptions forwardUnconditionalNumber(java.lang.String forwardUnconditionalNumber) { 
		this.forwardUnconditionalNumber = forwardUnconditionalNumber;
		return this;
	} 

	public boolean getAnonymousCallRejection() { 
		return this.anonymousCallRejection;
	} 

	public void setAnonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
	} 

	public LineOptions anonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
		return this;
	} 

	public boolean getForwardUnconditional() { 
		return this.forwardUnconditional;
	} 

	public void setForwardUnconditional(boolean forwardUnconditional) { 
		this.forwardUnconditional = forwardUnconditional;
	} 

	public LineOptions forwardUnconditional(boolean forwardUnconditional) { 
		this.forwardUnconditional = forwardUnconditional;
		return this;
	} 

	public boolean getForwardNoReply() { 
		return this.forwardNoReply;
	} 

	public void setForwardNoReply(boolean forwardNoReply) { 
		this.forwardNoReply = forwardNoReply;
	} 

	public LineOptions forwardNoReply(boolean forwardNoReply) { 
		this.forwardNoReply = forwardNoReply;
		return this;
	} 

	public boolean getCallWaiting() { 
		return this.callWaiting;
	} 

	public void setCallWaiting(boolean callWaiting) { 
		this.callWaiting = callWaiting;
	} 

	public LineOptions callWaiting(boolean callWaiting) { 
		this.callWaiting = callWaiting;
		return this;
	} 

	public java.lang.String getForwardUnconditionalNature() { 
		return this.forwardUnconditionalNature;
	} 

	public void setForwardUnconditionalNature(java.lang.String forwardUnconditionalNature) { 
		this.forwardUnconditionalNature = forwardUnconditionalNature;
	} 

	public LineOptions forwardUnconditionalNature(java.lang.String forwardUnconditionalNature) { 
		this.forwardUnconditionalNature = forwardUnconditionalNature;
		return this;
	} 

	public long getForwardNoReplyDelay() { 
		return this.forwardNoReplyDelay;
	} 

	public void setForwardNoReplyDelay(long forwardNoReplyDelay) { 
		this.forwardNoReplyDelay = forwardNoReplyDelay;
	} 

	public LineOptions forwardNoReplyDelay(long forwardNoReplyDelay) { 
		this.forwardNoReplyDelay = forwardNoReplyDelay;
		return this;
	} 

	public boolean getLockOutCall() { 
		return this.lockOutCall;
	} 

	public void setLockOutCall(boolean lockOutCall) { 
		this.lockOutCall = lockOutCall;
	} 

	public LineOptions lockOutCall(boolean lockOutCall) { 
		this.lockOutCall = lockOutCall;
		return this;
	} 

}
