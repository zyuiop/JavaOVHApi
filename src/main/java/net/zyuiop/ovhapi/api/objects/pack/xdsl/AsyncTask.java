package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Async task
 */

public class AsyncTask<T> { 

	private java.lang.String status;
	private java.lang.String error;
	private T result;

	public AsyncTask() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public AsyncTask status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public java.lang.String getError() { 
		return this.error;
	} 

	public void setError(java.lang.String error) { 
		this.error = error;
	} 

	public AsyncTask error(java.lang.String error) { 
		this.error = error;
		return this;
	} 

	public T getResult() { 
		return this.result;
	} 

	public void setResult(T result) { 
		this.result = result;
	} 

	public AsyncTask result(T result) { 
		this.result = result;
		return this;
	} 

}
