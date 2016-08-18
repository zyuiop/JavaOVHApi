package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * A numeric value tagged with its unit
 */

public class UnitAndValue<T> { 

	private java.lang.String unit;
	private T value;

	public UnitAndValue() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public UnitAndValue unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public T getValue() { 
		return this.value;
	} 

	public void setValue(T value) { 
		this.value = value;
	} 

	public UnitAndValue value(T value) { 
		this.value = value;
		return this;
	} 

}
