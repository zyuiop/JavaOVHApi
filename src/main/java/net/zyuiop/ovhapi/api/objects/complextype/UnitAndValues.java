package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A value set tagged with its unit
 */

public class UnitAndValues<T> { 

	private java.lang.String unit;
	private T[] values;

	public UnitAndValues() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public UnitAndValues unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public T[] getValues() { 
		return this.values;
	} 

	public void setValues(T[] values) { 
		this.values = values;
	} 

	public UnitAndValues values(T[] values) { 
		this.values = values;
		return this;
	} 

}
