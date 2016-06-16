package net.zyuiop.ovhapi.impl.objects.license.office;

import net.zyuiop.ovhapi.api.objects.license.office.Statistics;
/**
 * License usage statistics.
 */

public class StatisticsImpl implements Statistics { 

	private java.util.Date date;
	private net.zyuiop.ovhapi.impl.objects.license.office.StatisticsLineImpl lines;

	public StatisticsImpl() {
	}

	public java.util.Date getDate() { 
		return this.date;
	} 

	public void setDate(java.util.Date date) { 
		this.date = date;
	} 

	public StatisticsImpl date(java.util.Date date) { 
		this.date = date;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.license.office.StatisticsLineImpl getLines() { 
		return this.lines;
	} 

	public void setLines(net.zyuiop.ovhapi.impl.objects.license.office.StatisticsLineImpl lines) { 
		this.lines = lines;
	} 

	public StatisticsImpl lines(net.zyuiop.ovhapi.impl.objects.license.office.StatisticsLineImpl lines) { 
		this.lines = lines;
		return this;
	} 

}
