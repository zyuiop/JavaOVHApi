package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * The PABX sounds
 */

public class OvhPabxSound { 

	private java.lang.String name;
	private long soundId;

	public OvhPabxSound() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OvhPabxSound name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getSoundId() { 
		return this.soundId;
	} 

	public void setSoundId(long soundId) { 
		this.soundId = soundId;
	} 

	public OvhPabxSound soundId(long soundId) { 
		this.soundId = soundId;
		return this;
	} 

}
