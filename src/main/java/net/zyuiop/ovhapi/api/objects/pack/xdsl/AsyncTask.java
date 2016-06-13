package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Async task
 */

public interface AsyncTask<T> { 

	/**
	 * @return Status of the call
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Error
	 */
	java.lang.String getError(); 

	/**
	 * @return Result of the call
	 */
	T getResult(); 

}
