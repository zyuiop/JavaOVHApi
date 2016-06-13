package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.VoicemailGreetings;
/**
 * Voicemail greeting
 */

public class VoicemailGreetingsImpl implements VoicemailGreetings { 

	private java.lang.String callee;
	private long id;
	private java.lang.String dir;

	public VoicemailGreetingsImpl() {
	}

	public java.lang.String getCallee() { 
		return this.callee;
	} 

	public void setCallee(java.lang.String callee) { 
		this.callee = callee;
	} 

	public VoicemailGreetingsImpl callee(java.lang.String callee) { 
		this.callee = callee;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public VoicemailGreetingsImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDir() { 
		return this.dir;
	} 

	public void setDir(java.lang.String dir) { 
		this.dir = dir;
	} 

	public VoicemailGreetingsImpl dir(java.lang.String dir) { 
		this.dir = dir;
		return this;
	} 

}
