package net.zyuiop.ovhapi.api.objects.imapcopy;

/**
 * Ids of ImapCopy Task
 */

public class TaskIds { 

	private long id;
	private java.lang.String secretKey;

	public TaskIds() {
	}

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskIds id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSecretKey() { 
		return this.secretKey;
	} 

	public void setSecretKey(java.lang.String secretKey) { 
		this.secretKey = secretKey;
	} 

	public TaskIds secretKey(java.lang.String secretKey) { 
		this.secretKey = secretKey;
		return this;
	} 

}
