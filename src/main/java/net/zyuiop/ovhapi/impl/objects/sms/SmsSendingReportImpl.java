package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport;
/**
 * A structure describing all information about quota informations
 */

public class SmsSendingReportImpl implements SmsSendingReport { 

	private double totalCreditsRemoved;
	private java.lang.String invalidReceivers;
	private long[] ids;
	private java.lang.String validReceivers;

	public SmsSendingReportImpl() {
	}

	public double getTotalCreditsRemoved() { 
		return this.totalCreditsRemoved;
	} 

	public void setTotalCreditsRemoved(double totalCreditsRemoved) { 
		this.totalCreditsRemoved = totalCreditsRemoved;
	} 

	public SmsSendingReportImpl totalCreditsRemoved(double totalCreditsRemoved) { 
		this.totalCreditsRemoved = totalCreditsRemoved;
		return this;
	} 

	public java.lang.String getInvalidReceivers() { 
		return this.invalidReceivers;
	} 

	public void setInvalidReceivers(java.lang.String invalidReceivers) { 
		this.invalidReceivers = invalidReceivers;
	} 

	public SmsSendingReportImpl invalidReceivers(java.lang.String invalidReceivers) { 
		this.invalidReceivers = invalidReceivers;
		return this;
	} 

	public long[] getIds() { 
		return this.ids;
	} 

	public void setIds(long[] ids) { 
		this.ids = ids;
	} 

	public SmsSendingReportImpl ids(long[] ids) { 
		this.ids = ids;
		return this;
	} 

	public java.lang.String getValidReceivers() { 
		return this.validReceivers;
	} 

	public void setValidReceivers(java.lang.String validReceivers) { 
		this.validReceivers = validReceivers;
	} 

	public SmsSendingReportImpl validReceivers(java.lang.String validReceivers) { 
		this.validReceivers = validReceivers;
		return this;
	} 

}
