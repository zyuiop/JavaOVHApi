package net.zyuiop.ovhapi.impl.objects.imapcopy;

import net.zyuiop.ovhapi.api.objects.imapcopy.TaskIds;
/**
 * Ids of ImapCopy Task
 */

public class TaskIdsImpl implements TaskIds { 

	private long id;
	private java.lang.String secretKey;

	public TaskIdsImpl() {
	}

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public TaskIdsImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getSecretKey() { 
		return this.secretKey;
	} 

	public void setSecretKey(java.lang.String secretKey) { 
		this.secretKey = secretKey;
	} 

	public TaskIdsImpl secretKey(java.lang.String secretKey) { 
		this.secretKey = secretKey;
		return this;
	} 

}
