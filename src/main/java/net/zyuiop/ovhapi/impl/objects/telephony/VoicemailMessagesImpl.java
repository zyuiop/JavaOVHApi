package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.VoicemailMessages;
/**
 * Voicemail message
 */

public class VoicemailMessagesImpl implements VoicemailMessages { 

	private java.lang.String callee;
	private java.util.Date creationDatetime;
	private long id;
	private java.lang.String caller;
	private long duration;
	private java.lang.String dir;

	public VoicemailMessagesImpl() {
	}

	public java.lang.String getCallee() { 
		return this.callee;
	} 

	public void setCallee(java.lang.String callee) { 
		this.callee = callee;
	} 

	public VoicemailMessagesImpl callee(java.lang.String callee) { 
		this.callee = callee;
		return this;
	} 

	public java.util.Date getCreationDatetime() { 
		return this.creationDatetime;
	} 

	public void setCreationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
	} 

	public VoicemailMessagesImpl creationDatetime(java.util.Date creationDatetime) { 
		this.creationDatetime = creationDatetime;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public VoicemailMessagesImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getCaller() { 
		return this.caller;
	} 

	public void setCaller(java.lang.String caller) { 
		this.caller = caller;
	} 

	public VoicemailMessagesImpl caller(java.lang.String caller) { 
		this.caller = caller;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public VoicemailMessagesImpl duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getDir() { 
		return this.dir;
	} 

	public void setDir(java.lang.String dir) { 
		this.dir = dir;
	} 

	public VoicemailMessagesImpl dir(java.lang.String dir) { 
		this.dir = dir;
		return this;
	} 

}
