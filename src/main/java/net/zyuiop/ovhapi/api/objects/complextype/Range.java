package net.zyuiop.ovhapi.api.objects.complextype;

/**
 * Start and end points (inclusive) of a range
 */

public interface Range<T> { 

	/**
	 * @return End point of the range
	 */
	T getTo(); 

	/**
	 * @return Start point of the range
	 */
	T getFrom(); 

}
