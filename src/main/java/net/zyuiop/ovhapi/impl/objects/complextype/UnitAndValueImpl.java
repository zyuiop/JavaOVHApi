package net.zyuiop.ovhapi.impl.objects.complextype;

import net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue;
/**
 * A numeric value tagged with its unit
 */

public class UnitAndValueImpl<T> implements UnitAndValue<T> { 

	private java.lang.String unit;
	private T value;

	public UnitAndValueImpl() {
	}

	public java.lang.String getUnit() { 
		return this.unit;
	} 

	public void setUnit(java.lang.String unit) { 
		this.unit = unit;
	} 

	public UnitAndValueImpl unit(java.lang.String unit) { 
		this.unit = unit;
		return this;
	} 

	public T getValue() { 
		return this.value;
	} 

	public void setValue(T value) { 
		this.value = value;
	} 

	public UnitAndValueImpl value(T value) { 
		this.value = value;
		return this;
	} 

}
