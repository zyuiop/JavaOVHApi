package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail message
 */

public class VoicemailMessages { 

	private java.lang.String callee;
	private java.util.Date creationDatetime;
	private long id;
	private java.lang.String caller;
	private long duration;
	private java.lang.String dir;

	public VoicemailMessages() {
	}

	public java.lang.String getCallee() { 
		return this.callee;
	} 

	public void setCallee(java.lang.String callee) { 
		this.callee = callee;
	} 

	public VoicemailMessages callee(java.lang.String callee) { 
		this.callee = callee;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public VoicemailMessages creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public VoicemailMessages id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getCaller() { 
		return this.caller;
	} 

	public void setCaller(java.lang.String caller) { 
		this.caller = caller;
	} 

	public VoicemailMessages caller(java.lang.String caller) { 
		this.caller = caller;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public VoicemailMessages duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDir() { 
		return this.dir;
	} 

	public void setDir(java.lang.String dir) { 
		this.dir = dir;
	} 

	public VoicemailMessages dir(java.lang.String dir) { 
		this.dir = dir;
		return this;
	} 

}
