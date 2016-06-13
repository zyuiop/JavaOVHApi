package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord;
/**
 * The PABX records
 */

public class OvhPabxRecordImpl implements OvhPabxRecord { 

	private java.util.Date callStart;
	private java.lang.String fileUrl;
	private java.lang.String callerIdNumber;
	private java.util.Date callEnd;
	private long id;
	private long duration;
	private java.lang.String callerIdName;

	public OvhPabxRecordImpl() {
	}

	public java.util.Date getCallStart() { 
		return this.callStart;
	} 

	public void setCallStart(java.util.Date callStart) { 
		this.callStart = callStart;
	} 

	public OvhPabxRecordImpl callStart(java.util.Date callStart) { 
		this.callStart = callStart;
		return this;
	} 

	public java.lang.String getFileUrl() { 
		return this.fileUrl;
	} 

	public void setFileUrl(java.lang.String fileUrl) { 
		this.fileUrl = fileUrl;
	} 

	public OvhPabxRecordImpl fileUrl(java.lang.String fileUrl) { 
		this.fileUrl = fileUrl;
		return this;
	} 

	public java.lang.String getCallerIdNumber() { 
		return this.callerIdNumber;
	} 

	public void setCallerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
	} 

	public OvhPabxRecordImpl callerIdNumber(java.lang.String callerIdNumber) { 
		this.callerIdNumber = callerIdNumber;
		return this;
	} 

	public java.util.Date getCallEnd() { 
		return this.callEnd;
	} 

	public void setCallEnd(java.util.Date callEnd) { 
		this.callEnd = callEnd;
	} 

	public OvhPabxRecordImpl callEnd(java.util.Date callEnd) { 
		this.callEnd = callEnd;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public OvhPabxRecordImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public long getDuration() { 
		return this.duration;
	} 

	public void setDuration(long duration) { 
		this.duration = duration;
	} 

	public OvhPabxRecordImpl duration(long duration) { 
		this.duration = duration;
		return this;
	} 

	public java.lang.String getCallerIdName() { 
		return this.callerIdName;
	} 

	public void setCallerIdName(java.lang.String callerIdName) { 
		this.callerIdName = callerIdName;
	} 

	public OvhPabxRecordImpl callerIdName(java.lang.String callerIdName) { 
		this.callerIdName = callerIdName;
		return this;
	} 

}
