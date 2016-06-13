package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound;
/**
 * The PABX sounds
 */

public class OvhPabxSoundImpl implements OvhPabxSound { 

	private java.lang.String name;
	private long soundId;

	public OvhPabxSoundImpl() {
	}

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public OvhPabxSoundImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public long getSoundId() { 
		return this.soundId;
	} 

	public void setSoundId(long soundId) { 
		this.soundId = soundId;
	} 

	public OvhPabxSoundImpl soundId(long soundId) { 
		this.soundId = soundId;
		return this;
	} 

}
