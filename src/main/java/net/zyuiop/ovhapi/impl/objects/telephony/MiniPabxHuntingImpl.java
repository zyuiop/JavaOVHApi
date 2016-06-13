package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting;
/**
 * MiniPabx Hunting
 */

public class MiniPabxHuntingImpl implements MiniPabxHunting { 

	private java.lang.String strategy;
	private boolean toneOnHold;
	private java.lang.String name;
	private long numberOfCalls;
	private java.lang.String pattern;
	private boolean anonymousCallRejection;
	private long onHoldTimer;
	private boolean toneOnClosure;
	private boolean toneRingback;

	public MiniPabxHuntingImpl() {
	}

	public java.lang.String getStrategy() { 
		return this.strategy;
	} 

	public void setStrategy(java.lang.String strategy) { 
		this.strategy = strategy;
	} 

	public MiniPabxHuntingImpl strategy(java.lang.String strategy) { 
		this.strategy = strategy;
		return this;
	} 

	public boolean getToneOnHold() { 
		return this.toneOnHold;
	} 

	public void setToneOnHold(boolean toneOnHold) { 
		this.toneOnHold = toneOnHold;
	} 

	public MiniPabxHuntingImpl toneOnHold(boolean toneOnHold) { 
		this.toneOnHold = toneOnHold;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public MiniPabxHuntingImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getNumberOfCalls() { 
		return this.numberOfCalls;
	} 

	public void setNumberOfCalls(long numberOfCalls) { 
		this.numberOfCalls = numberOfCalls;
	} 

	public MiniPabxHuntingImpl numberOfCalls(long numberOfCalls) { 
		this.numberOfCalls = numberOfCalls;
		return this;
	} 

	public java.lang.String getPattern() { 
		return this.pattern;
	} 

	public void setPattern(java.lang.String pattern) { 
		this.pattern = pattern;
	} 

	public MiniPabxHuntingImpl pattern(java.lang.String pattern) { 
		this.pattern = pattern;
		return this;
	} 

	public boolean getAnonymousCallRejection() { 
		return this.anonymousCallRejection;
	} 

	public void setAnonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
	} 

	public MiniPabxHuntingImpl anonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
		return this;
	} 

	public long getOnHoldTimer() { 
		return this.onHoldTimer;
	} 

	public void setOnHoldTimer(long onHoldTimer) { 
		this.onHoldTimer = onHoldTimer;
	} 

	public MiniPabxHuntingImpl onHoldTimer(long onHoldTimer) { 
		this.onHoldTimer = onHoldTimer;
		return this;
	} 

	public boolean getToneOnClosure() { 
		return this.toneOnClosure;
	} 

	public void setToneOnClosure(boolean toneOnClosure) { 
		this.toneOnClosure = toneOnClosure;
	} 

	public MiniPabxHuntingImpl toneOnClosure(boolean toneOnClosure) { 
		this.toneOnClosure = toneOnClosure;
		return this;
	} 

	public boolean getToneRingback() { 
		return this.toneRingback;
	} 

	public void setToneRingback(boolean toneRingback) { 
		this.toneRingback = toneRingback;
	} 

	public MiniPabxHuntingImpl toneRingback(boolean toneRingback) { 
		this.toneRingback = toneRingback;
		return this;
	} 

}
