package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A value set tagged with its unit and serie name
 */

public class ChartSerie<T> { 

	private java.lang.String serieName;
	private java.lang.String unit;
	private T[] values;

	public ChartSerie() {
	}

	public java.lang.String getSerieName() { 
		return this.serieName;
	} 

	public void setSerieName(java.lang.String serieName) { 
		this.serieName = serieName;
	} 

	public ChartSerie serieName(java.lang.String serieName) { 
		this.serieName = serieName;
		return this;
	} 

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public ChartSerie unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public T[] getValues() { 
		return this.values;
	} 

	public void setValues(T[] values) { 
		this.values = values;
	} 

	public ChartSerie values(T[] values) { 
		this.values = values;
		return this;
	} 

}
