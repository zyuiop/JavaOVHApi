package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.DiagnosticReport;
/**
 * Relevant informations of the service detected from the MOS or the signal leg in SIP/MGCP protocol.
 */

public class DiagnosticReportImpl implements DiagnosticReport { 

	private java.lang.String level;
	private java.lang.String report;
	private java.lang.String callId;
	private java.lang.String name;
	private java.lang.String category;
	private java.lang.String description;
	private java.util.Date datetime;

	public DiagnosticReportImpl() {
	}

	public java.lang.String getLevel() { 
		return this.level;
	} 

	public void setLevel(java.lang.String level) { 
		this.level = level;
	} 

	public DiagnosticReportImpl level(java.lang.String level) { 
		this.level = level;
		return this;
	} 

	public java.lang.String getReport() { 
		return this.report;
	} 

	public void setReport(java.lang.String report) { 
		this.report = report;
	} 

	public DiagnosticReportImpl report(java.lang.String report) { 
		this.report = report;
		return this;
	} 

	public java.lang.String getCallId() { 
		return this.callId;
	} 

	public void setCallId(java.lang.String callId) { 
		this.callId = callId;
	} 

	public DiagnosticReportImpl callId(java.lang.String callId) { 
		this.callId = callId;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public DiagnosticReportImpl name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.lang.String getCategory() { 
		return this.category;
	} 

	public void setCategory(java.lang.String category) { 
		this.category = category;
	} 

	public DiagnosticReportImpl category(java.lang.String category) { 
		this.category = category;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public DiagnosticReportImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

	public java.util.Date getDatetime() { 
		return this.datetime;
	} 

	public void setDatetime(java.util.Date datetime) { 
		this.datetime = datetime;
	} 

	public DiagnosticReportImpl datetime(java.util.Date datetime) { 
		this.datetime = datetime;
		return this;
	} 

}
