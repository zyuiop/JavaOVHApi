package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * License usage statistics.
 */

public class Statistics { 

	private java.util.Date date;
	private net.zyuiop.ovhapi.api.objects.license.office.StatisticsLine[] lines;

	public Statistics() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public Statistics date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.office.StatisticsLine[] getLines() { 
		return this.lines;
	} 

	public void setLines(net.zyuiop.ovhapi.api.objects.license.office.StatisticsLine[] lines) { 
		this.lines = lines;
	} 

	public Statistics lines(net.zyuiop.ovhapi.api.objects.license.office.StatisticsLine[] lines) { 
		this.lines = lines;
		return this;
	} 

}
