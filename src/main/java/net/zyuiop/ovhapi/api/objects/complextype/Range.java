package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * Start and end points (inclusive) of a range
 */

public class Range<T> { 

	private T to;
	private T from;

	public Range() {
	}

	public T getTo() { 
		return this.to;
	} 

	public void setTo(T to) { 
		this.to = to;
	} 

	public Range to(T to) { 
		this.to = to;
		return this;
	} 

	public T getFrom() { 
		return this.from;
	} 

	public void setFrom(T from) { 
		this.from = from;
	} 

	public Range from(T from) { 
		this.from = from;
		return this;
	} 

}
