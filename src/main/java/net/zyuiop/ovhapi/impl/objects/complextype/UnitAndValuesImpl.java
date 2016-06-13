package net.zyuiop.ovhapi.impl.objects.complextype;

import net.zyuiop.ovhapi.api.objects.complextype.UnitAndValues;
/**
 * A value set tagged with its unit
 */

public class UnitAndValuesImpl<T> implements UnitAndValues<T> { 

	private java.lang.String unit;
	private T[] values;

	public UnitAndValuesImpl() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public UnitAndValuesImpl unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public T[] getValues() { 
		return this.values;
	} 

	public void setValues(T[] values) { 
		this.values = values;
	} 

	public UnitAndValuesImpl values(T[] values) { 
		this.values = values;
		return this;
	} 

}
