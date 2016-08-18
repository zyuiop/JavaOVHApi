package net.zyuiop.ovhapi.api.objects;

/**
 * @author zyuiop
 */
public class ComplexType<T> {
	private String unit;
	private T value;

	public ComplexType(String unit) {
		this.unit = unit;
	}

	public ComplexType(String unit, T value) {
		this.unit = unit;
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}