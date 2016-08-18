package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Databases
 */

public class Database { 

	private java.lang.String databaseName;
	private net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed;
	private java.util.Date creationDate;

	public Database() {
	}

	public java.lang.String getDatabaseName() { 
		return this.databaseName;
	} 

	public void setDatabaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
	} 

	public Database databaseName(java.lang.String databaseName) { 
		this.databaseName = databaseName;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue getQuotaUsed() { 
		return this.quotaUsed;
	} 

	public void setQuotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
	} 

	public Database quotaUsed(net.zyuiop.ovhapi.api.objects.complextype.UnitAndValue quotaUsed) { 
		this.quotaUsed = quotaUsed;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Database creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

}
