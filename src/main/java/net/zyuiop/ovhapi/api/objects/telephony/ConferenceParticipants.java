package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Conference service
 */

public class ConferenceParticipants { 

	private long energy;
	private boolean talking;
	private boolean speak;
	private java.lang.String callerNumber;
	private boolean floor;
	private boolean hear;
	private java.lang.String callerName;
	private long id;

	public ConferenceParticipants() {
	}

	public long getEnergy() { 
		return this.energy;
	} 

	public void setEnergy(long energy) { 
		this.energy = energy;
	} 

	public ConferenceParticipants energy(long energy) { 
		this.energy = energy;
		return this;
	} 

	public boolean getTalking() { 
		return this.talking;
	} 

	public void setTalking(boolean talking) { 
		this.talking = talking;
	} 

	public ConferenceParticipants talking(boolean talking) { 
		this.talking = talking;
		return this;
	} 

	public boolean getSpeak() { 
		return this.speak;
	} 

	public void setSpeak(boolean speak) { 
		this.speak = speak;
	} 

	public ConferenceParticipants speak(boolean speak) { 
		this.speak = speak;
		return this;
	} 

	public java.lang.String getCallerNumber() { 
		return this.callerNumber;
	} 

	public void setCallerNumber(java.lang.String callerNumber) { 
		this.callerNumber = callerNumber;
	} 

	public ConferenceParticipants callerNumber(java.lang.String callerNumber) { 
		this.callerNumber = callerNumber;
		return this;
	} 

	public boolean getFloor() { 
		return this.floor;
	} 

	public void setFloor(boolean floor) { 
		this.floor = floor;
	} 

	public ConferenceParticipants floor(boolean floor) { 
		this.floor = floor;
		return this;
	} 

	public boolean getHear() { 
		return this.hear;
	} 

	public void setHear(boolean hear) { 
		this.hear = hear;
	} 

	public ConferenceParticipants hear(boolean hear) { 
		this.hear = hear;
		return this;
	} 

	public java.lang.String getCallerName() { 
		return this.callerName;
	} 

	public void setCallerName(java.lang.String callerName) { 
		this.callerName = callerName;
	} 

	public ConferenceParticipants callerName(java.lang.String callerName) { 
		this.callerName = callerName;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public ConferenceParticipants id(long id) { 
		this.id = id;
		return this;
	} 

}
