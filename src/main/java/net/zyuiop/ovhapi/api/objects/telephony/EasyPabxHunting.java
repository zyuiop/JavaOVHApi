package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * EasyPabx Hunting
 */

public class EasyPabxHunting { 

	private java.lang.String strategy;
	private boolean toneOnHold;
	private java.lang.String name;
	private long numberOfCalls;
	private boolean anonymousCallRejection;
	private java.lang.String pattern;
	private boolean toneOnClosure;
	private long noReplyTimer;
	private java.lang.String voicemail;
	private boolean toneRingback;

	public EasyPabxHunting() {
	}

	public java.lang.String getStrategy() { 
		return this.strategy;
	} 

	public void setStrategy(java.lang.String strategy) { 
		this.strategy = strategy;
	} 

	public EasyPabxHunting strategy(java.lang.String strategy) { 
		this.strategy = strategy;
		return this;
	} 

	public boolean getToneOnHold() { 
		return this.toneOnHold;
	} 

	public void setToneOnHold(boolean toneOnHold) { 
		this.toneOnHold = toneOnHold;
	} 

	public EasyPabxHunting toneOnHold(boolean toneOnHold) { 
		this.toneOnHold = toneOnHold;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public EasyPabxHunting name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getNumberOfCalls() { 
		return this.numberOfCalls;
	} 

	public void setNumberOfCalls(long numberOfCalls) { 
		this.numberOfCalls = numberOfCalls;
	} 

	public EasyPabxHunting numberOfCalls(long numberOfCalls) { 
		this.numberOfCalls = numberOfCalls;
		return this;
	} 

	public boolean getAnonymousCallRejection() { 
		return this.anonymousCallRejection;
	} 

	public void setAnonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
	} 

	public EasyPabxHunting anonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
		return this;
	} 

	public java.lang.String getPattern() { 
		return this.pattern;
	} 

	public void setPattern(java.lang.String pattern) { 
		this.pattern = pattern;
	} 

	public EasyPabxHunting pattern(java.lang.String pattern) { 
		this.pattern = pattern;
		return this;
	} 

	public boolean getToneOnClosure() { 
		return this.toneOnClosure;
	} 

	public void setToneOnClosure(boolean toneOnClosure) { 
		this.toneOnClosure = toneOnClosure;
	} 

	public EasyPabxHunting toneOnClosure(boolean toneOnClosure) { 
		this.toneOnClosure = toneOnClosure;
		return this;
	} 

	public long getNoReplyTimer() { 
		return this.noReplyTimer;
	} 

	public void setNoReplyTimer(long noReplyTimer) { 
		this.noReplyTimer = noReplyTimer;
	} 

	public EasyPabxHunting noReplyTimer(long noReplyTimer) { 
		this.noReplyTimer = noReplyTimer;
		return this;
	} 

	public java.lang.String getVoicemail() { 
		return this.voicemail;
	} 

	public void setVoicemail(java.lang.String voicemail) { 
		this.voicemail = voicemail;
	} 

	public EasyPabxHunting voicemail(java.lang.String voicemail) { 
		this.voicemail = voicemail;
		return this;
	} 

	public boolean getToneRingback() { 
		return this.toneRingback;
	} 

	public void setToneRingback(boolean toneRingback) { 
		this.toneRingback = toneRingback;
	} 

	public EasyPabxHunting toneRingback(boolean toneRingback) { 
		this.toneRingback = toneRingback;
		return this;
	} 

}
