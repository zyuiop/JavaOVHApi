package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.EasyHunting;
/**
 * OVH easy calls queues
 */

public class EasyHuntingImpl implements EasyHunting { 

	private long maxWaitTime;
	private java.lang.String featureType;
	private java.lang.String strategy;
	private long queueSize;
	private long toneOnHold;
	private java.lang.String serviceName;
	private java.lang.String showCallerNumber;
	private java.lang.String description;
	private boolean anonymousRejection;
	private long toneOnOpening;
	private java.lang.String serviceType;
	private java.lang.String voicemail;
	private long toneOnClosing;

	public EasyHuntingImpl() {
	}

	public long getMaxWaitTime() { 
		return this.maxWaitTime;
	} 

	public void setMaxWaitTime(long maxWaitTime) { 
		this.maxWaitTime = maxWaitTime;
	} 

	public EasyHuntingImpl maxWaitTime(long maxWaitTime) { 
		this.maxWaitTime = maxWaitTime;
		return this;
	} 

	public java.lang.String getFeatureType() { 
		return this.featureType;
	} 

	public void setFeatureType(java.lang.String featureType) { 
		this.featureType = featureType;
	} 

	public EasyHuntingImpl featureType(java.lang.String featureType) { 
		this.featureType = featureType;
		return this;
	} 

	public java.lang.String getStrategy() { 
		return this.strategy;
	} 

	public void setStrategy(java.lang.String strategy) { 
		this.strategy = strategy;
	} 

	public EasyHuntingImpl strategy(java.lang.String strategy) { 
		this.strategy = strategy;
		return this;
	} 

	public long getQueueSize() { 
		return this.queueSize;
	} 

	public void setQueueSize(long queueSize) { 
		this.queueSize = queueSize;
	} 

	public EasyHuntingImpl queueSize(long queueSize) { 
		this.queueSize = queueSize;
		return this;
	} 

	public long getToneOnHold() { 
		return this.toneOnHold;
	} 

	public void setToneOnHold(long toneOnHold) { 
		this.toneOnHold = toneOnHold;
	} 

	public EasyHuntingImpl toneOnHold(long toneOnHold) { 
		this.toneOnHold = toneOnHold;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public EasyHuntingImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getShowCallerNumber() { 
		return this.showCallerNumber;
	} 

	public void setShowCallerNumber(java.lang.String showCallerNumber) { 
		this.showCallerNumber = showCallerNumber;
	} 

	public EasyHuntingImpl showCallerNumber(java.lang.String showCallerNumber) { 
		this.showCallerNumber = showCallerNumber;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public EasyHuntingImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public boolean getAnonymousRejection() { 
		return this.anonymousRejection;
	} 

	public void setAnonymousRejection(boolean anonymousRejection) { 
		this.anonymousRejection = anonymousRejection;
	} 

	public EasyHuntingImpl anonymousRejection(boolean anonymousRejection) { 
		this.anonymousRejection = anonymousRejection;
		return this;
	} 

	public long getToneOnOpening() { 
		return this.toneOnOpening;
	} 

	public void setToneOnOpening(long toneOnOpening) { 
		this.toneOnOpening = toneOnOpening;
	} 

	public EasyHuntingImpl toneOnOpening(long toneOnOpening) { 
		this.toneOnOpening = toneOnOpening;
		return this;
	} 

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public EasyHuntingImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String getVoicemail() { 
		return this.voicemail;
	} 

	public void setVoicemail(java.lang.String voicemail) { 
		this.voicemail = voicemail;
	} 

	public EasyHuntingImpl voicemail(java.lang.String voicemail) { 
		this.voicemail = voicemail;
		return this;
	} 

	public long getToneOnClosing() { 
		return this.toneOnClosing;
	} 

	public void setToneOnClosing(long toneOnClosing) { 
		this.toneOnClosing = toneOnClosing;
	} 

	public EasyHuntingImpl toneOnClosing(long toneOnClosing) { 
		this.toneOnClosing = toneOnClosing;
		return this;
	} 

}
