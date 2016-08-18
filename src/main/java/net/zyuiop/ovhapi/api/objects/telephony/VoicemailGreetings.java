package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail greeting
 */

public class VoicemailGreetings { 

	private java.lang.String callee;
	private long id;
	private java.lang.String dir;

	public VoicemailGreetings() {
	}

	public java.lang.String getCallee() { 
		return this.callee;
	} 

	public void setCallee(java.lang.String callee) { 
		this.callee = callee;
	} 

	public VoicemailGreetings callee(java.lang.String callee) { 
		this.callee = callee;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public VoicemailGreetings id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getDir() { 
		return this.dir;
	} 

	public void setDir(java.lang.String dir) { 
		this.dir = dir;
	} 

	public VoicemailGreetings dir(java.lang.String dir) { 
		this.dir = dir;
		return this;
	} 

}
