package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.ConferenceInformations;
/**
 * Conference realtime informations structure
 */

public class ConferenceInformationsImpl implements ConferenceInformations { 

	private boolean locked;
	private long membersCount;
	private java.util.Date dateStart;

	public ConferenceInformationsImpl() {
	}

	public boolean getLocked() { 
		return this.locked;
	} 

	public void setLocked(boolean locked) { 
		this.locked = locked;
	} 

	public ConferenceInformationsImpl locked(boolean locked) { 
		this.locked = locked;
		return this;
	} 

	public long getMembersCount() { 
		return this.membersCount;
	} 

	public void setMembersCount(long membersCount) { 
		this.membersCount = membersCount;
	} 

	public ConferenceInformationsImpl membersCount(long membersCount) { 
		this.membersCount = membersCount;
		return this;
	} 

	public java.util.Date getDateStart() { 
		return this.dateStart;
	} 

	public void setDateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
	} 

	public ConferenceInformationsImpl dateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
		return this;
	} 

}
