package net.zyuiop.ovhapi.impl.objects.xdsl;

import net.zyuiop.ovhapi.api.objects.xdsl.LineDiagnostic;
/**
 * Detailed line tests
 */

public class LineDiagnosticImpl implements LineDiagnostic { 

	private java.lang.String number;
	private java.util.Date lineTestTime;
	private boolean sync;
	private long proposedProfileId;
	private java.lang.String lineTest;

	public LineDiagnosticImpl() {
	}

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public LineDiagnosticImpl number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

	public java.util.Date getLineTestTime() { 
		return this.lineTestTime;
	} 

	public void setLineTestTime(java.util.Date lineTestTime) { 
		this.lineTestTime = lineTestTime;
	} 

	public LineDiagnosticImpl lineTestTime(java.util.Date lineTestTime) { 
		this.lineTestTime = lineTestTime;
		return this;
	} 

	public boolean getSync() { 
		return this.sync;
	} 

	public void setSync(boolean sync) { 
		this.sync = sync;
	} 

	public LineDiagnosticImpl sync(boolean sync) { 
		this.sync = sync;
		return this;
	} 

	public long getProposedProfileId() { 
		return this.proposedProfileId;
	} 

	public void setProposedProfileId(long proposedProfileId) { 
		this.proposedProfileId = proposedProfileId;
	} 

	public LineDiagnosticImpl proposedProfileId(long proposedProfileId) { 
		this.proposedProfileId = proposedProfileId;
		return this;
	} 

	public java.lang.String getLineTest() { 
		return this.lineTest;
	} 

	public void setLineTest(java.lang.String lineTest) { 
		this.lineTest = lineTest;
	} 

	public LineDiagnosticImpl lineTest(java.lang.String lineTest) { 
		this.lineTest = lineTest;
		return this;
	} 

}
