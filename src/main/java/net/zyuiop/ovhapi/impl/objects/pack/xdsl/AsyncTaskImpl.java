package net.zyuiop.ovhapi.impl.objects.pack.xdsl;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.AsyncTask;
/**
 * Async task
 */

public class AsyncTaskImpl<T> implements AsyncTask<T> { 

	private java.lang.String status;
	private java.lang.String error;
	private T result;

	public AsyncTaskImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public AsyncTaskImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getError() { 
		return this.error;
	} 

	public void setError(java.lang.String error) { 
		this.error = error;
	} 

	public AsyncTaskImpl error(java.lang.String error) { 
		this.error = error;
		return this;
	} 

	public T getResult() { 
		return this.result;
	} 

	public void setResult(T result) { 
		this.result = result;
	} 

	public AsyncTaskImpl result(T result) { 
		this.result = result;
		return this;
	} 

}
