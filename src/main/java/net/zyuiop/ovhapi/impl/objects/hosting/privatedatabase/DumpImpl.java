package net.zyuiop.ovhapi.impl.objects.hosting.privatedatabase;

import net.zyuiop.ovhapi.api.objects.hosting.privatedatabase.Dump;
/**
 * Dump
 */

public class DumpImpl implements Dump { 

	private java.lang.String databaseName;
	private java.util.Date creationDate;
	private java.lang.String url;
	private long id;
	private java.util.Date deletionDate;

	public DumpImpl() {
	}

	public java.lang.String getDatabaseName() { 
		return this.databaseName;
	} 

	public void setDatabaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
	} 

	public DumpImpl databaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public DumpImpl creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public DumpImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public DumpImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.util.Date getDeletionDate() { 
		return this.deletionDate;
	} 

	public void setDeletionDate(java.util.Date deletionDate) { 
		this.deletionDate = deletionDate;
	} 

	public DumpImpl deletionDate(java.util.Date deletionDate) { 
		this.deletionDate = deletionDate;
		return this;
	} 

}
