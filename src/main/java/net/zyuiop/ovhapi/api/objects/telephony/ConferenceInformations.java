package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Conference realtime informations structure
 */

public class ConferenceInformations { 

	private boolean locked;
	private long membersCount;
	private java.util.Date dateStart;

	public ConferenceInformations() {
	}

	public boolean getLocked() { 
		return this.locked;
	} 

	public void setLocked(boolean locked) { 
		this.locked = locked;
	} 

	public ConferenceInformations locked(boolean locked) { 
		this.locked = locked;
		return this;
	} 

	public long getMembersCount() { 
		return this.membersCount;
	} 

	public void setMembersCount(long membersCount) { 
		this.membersCount = membersCount;
	} 

	public ConferenceInformations membersCount(long membersCount) { 
		this.membersCount = membersCount;
		return this;
	} 

	public java.util.Date getDateStart() { 
		return this.dateStart;
	} 

	public void setDateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
	} 

	public ConferenceInformations dateStart(java.util.Date dateStart) { 
		this.dateStart = dateStart;
		return this;
	} 

}
