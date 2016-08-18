package net.zyuiop.ovhapi.api.objects.hosting.web.mail;

/**
 * The volume history type
 */

public class VolumeHistory { 

	private long volume;
	private java.util.Date date;

	public VolumeHistory() {
	}

	public long getVolume() { 
		return this.volume;
	} 

	public void setVolume(long volume) { 
		this.volume = volume;
	} 

	public VolumeHistory volume(long volume) { 
		this.volume = volume;
		return this;
	} 

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public VolumeHistory date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

}
