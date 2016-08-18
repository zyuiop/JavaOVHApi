package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * MiniPabx Hunting
 */

public class MiniPabxHunting { 

	private java.lang.String strategy;
	private boolean toneOnHold;
	private java.lang.String name;
	private long numberOfCalls;
	private java.lang.String pattern;
	private boolean anonymousCallRejection;
	private long onHoldTimer;
	private boolean toneOnClosure;
	private boolean toneRingback;

	public MiniPabxHunting() {
	}

	public java.lang.String getStrategy() { 
		return this.strategy;
	} 

	public void setStrategy(java.lang.String strategy) { 
		this.strategy = strategy;
	} 

	public MiniPabxHunting strategy(java.lang.String strategy) { 
		this.strategy = strategy;
		return this;
	} 

	public boolean getToneOnHold() { 
		return this.toneOnHold;
	} 

	public void setToneOnHold(boolean toneOnHold) { 
		this.toneOnHold = toneOnHold;
	} 

	public MiniPabxHunting toneOnHold(boolean toneOnHold) { 
		this.toneOnHold = toneOnHold;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public MiniPabxHunting name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getNumberOfCalls() { 
		return this.numberOfCalls;
	} 

	public void setNumberOfCalls(long numberOfCalls) { 
		this.numberOfCalls = numberOfCalls;
	} 

	public MiniPabxHunting numberOfCalls(long numberOfCalls) { 
		this.numberOfCalls = numberOfCalls;
		return this;
	} 

	public java.lang.String getPattern() { 
		return this.pattern;
	} 

	public void setPattern(java.lang.String pattern) { 
		this.pattern = pattern;
	} 

	public MiniPabxHunting pattern(java.lang.String pattern) { 
		this.pattern = pattern;
		return this;
	} 

	public boolean getAnonymousCallRejection() { 
		return this.anonymousCallRejection;
	} 

	public void setAnonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
	} 

	public MiniPabxHunting anonymousCallRejection(boolean anonymousCallRejection) { 
		this.anonymousCallRejection = anonymousCallRejection;
		return this;
	} 

	public long getOnHoldTimer() { 
		return this.onHoldTimer;
	} 

	public void setOnHoldTimer(long onHoldTimer) { 
		this.onHoldTimer = onHoldTimer;
	} 

	public MiniPabxHunting onHoldTimer(long onHoldTimer) { 
		this.onHoldTimer = onHoldTimer;
		return this;
	} 

	public boolean getToneOnClosure() { 
		return this.toneOnClosure;
	} 

	public void setToneOnClosure(boolean toneOnClosure) { 
		this.toneOnClosure = toneOnClosure;
	} 

	public MiniPabxHunting toneOnClosure(boolean toneOnClosure) { 
		this.toneOnClosure = toneOnClosure;
		return this;
	} 

	public boolean getToneRingback() { 
		return this.toneRingback;
	} 

	public void setToneRingback(boolean toneRingback) { 
		this.toneRingback = toneRingback;
	} 

	public MiniPabxHunting toneRingback(boolean toneRingback) { 
		this.toneRingback = toneRingback;
		return this;
	} 

}
