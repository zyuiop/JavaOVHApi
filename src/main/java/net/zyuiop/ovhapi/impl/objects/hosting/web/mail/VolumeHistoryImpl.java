package net.zyuiop.ovhapi.impl.objects.hosting.web.mail;

import net.zyuiop.ovhapi.api.objects.hosting.web.mail.VolumeHistory;
/**
 * The volume history type
 */

public class VolumeHistoryImpl implements VolumeHistory { 

	private long volume;
	private java.util.Date date;

	public VolumeHistoryImpl() {
	}

	public long getVolume() { 
		return this.volume;
	} 

	public void setVolume(long volume) { 
		this.volume = volume;
	} 

	public VolumeHistoryImpl volume(long volume) { 
		this.volume = volume;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public VolumeHistoryImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

}
