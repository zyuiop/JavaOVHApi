package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * Chart
 */

public class ChartReturn { 

	private java.lang.String unit;
	private net.zyuiop.ovhapi.api.objects.complextype.ChartTimestampValue[] values;

	public ChartReturn() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public ChartReturn unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.ChartTimestampValue[] getValues() { 
		return this.values;
	} 

	public void setValues(net.zyuiop.ovhapi.api.objects.complextype.ChartTimestampValue[] values) { 
		this.values = values;
	} 

	public ChartReturn values(net.zyuiop.ovhapi.api.objects.complextype.ChartTimestampValue[] values) { 
		this.values = values;
		return this;
	} 

}
