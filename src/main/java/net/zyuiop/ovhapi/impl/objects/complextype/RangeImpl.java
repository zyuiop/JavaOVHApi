package net.zyuiop.ovhapi.impl.objects.complextype;

import net.zyuiop.ovhapi.api.objects.complextype.Range;
/**
 * Start and end points (inclusive) of a range
 */

public class RangeImpl<T> implements Range<T> { 

	private T to;
	private T from;

	public RangeImpl() {
	}

	public T getTo() { 
		return this.to;
	} 

	public void setTo(T to) { 
		this.to = to;
	} 

	public RangeImpl to(T to) { 
		this.to = to;
		return this;
	} 

	public T getFrom() { 
		return this.from;
	} 

	public void setFrom(T from) { 
		this.from = from;
	} 

	public RangeImpl from(T from) { 
		this.from = from;
		return this;
	} 

}
