package net.zyuiop.ovhapi.impl.objects.cloud;

import net.zyuiop.ovhapi.api.objects.cloud.AlertingAlert;
/**
 * Cloud alert on your consumption
 */

public class AlertingAlertImpl implements AlertingAlert { 

	private java.util.Date alertDate;
	private java.lang.String[] emails;
	private long alertId;

	public AlertingAlertImpl() {
	}

	public java.util.Date getAlertDate() { 
		return this.alertDate;
	} 

	public void setAlertDate(java.util.Date alertDate) { 
		this.alertDate = alertDate;
	} 

	public AlertingAlertImpl alertDate(java.util.Date alertDate) { 
		this.alertDate = alertDate;
		return this;
	} 

	public java.lang.String[] getEmails() { 
		return this.emails;
	} 

	public void setEmails(java.lang.String[] emails) { 
		this.emails = emails;
	} 

	public AlertingAlertImpl emails(java.lang.String[] emails) { 
		this.emails = emails;
		return this;
	} 

	public long getAlertId() { 
		return this.alertId;
	} 

	public void setAlertId(long alertId) { 
		this.alertId = alertId;
	} 

	public AlertingAlertImpl alertId(long alertId) { 
		this.alertId = alertId;
		return this;
	} 

}
