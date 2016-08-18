package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Grants
 */

public class Grant { 

	private java.lang.String databaseName;
	private java.util.Date creationDate;
	private java.lang.String grant;

	public Grant() {
	}

	public java.lang.String getDatabaseName() { 
		return this.databaseName;
	} 

	public void setDatabaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
	} 

	public Grant databaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Grant creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getGrant() { 
		return this.grant;
	} 

	public void setGrant(java.lang.String grant) { 
		this.grant = grant;
	} 

	public Grant grant(java.lang.String grant) { 
		this.grant = grant;
		return this;
	} 

}
