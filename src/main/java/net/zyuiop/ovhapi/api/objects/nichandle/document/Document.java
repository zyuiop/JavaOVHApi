package net.zyuiop.ovhapi.api.objects.nichandle.document;

/**
 * List of documents added on your account
 */

public class Document { 

	private java.lang.String putUrl;
	private java.util.Date validationDate;
	private java.lang.String name;
	private java.util.Date expirationDate;
	private long size;
	private net.zyuiop.ovhapi.api.objects.complextype.SafeKeyValue[] tags;
	private java.util.Date creationDate;
	private java.lang.String getUrl;
	private java.lang.String id;

	public Document() {
	}

	public java.lang.String getPutUrl() { 
		return this.putUrl;
	} 

	public void setPutUrl(java.lang.String putUrl) { 
		this.putUrl = putUrl;
	} 

	public Document putUrl(java.lang.String putUrl) { 
		this.putUrl = putUrl;
		return this;
	} 

	public java.util.Date getValidationDate() { 
		return this.validationDate;
	} 

	public void setValidationDate(java.util.Date validationDate) { 
		this.validationDate = validationDate;
	} 

	public Document validationDate(java.util.Date validationDate) { 
		this.validationDate = validationDate;
		return this;
	} 

	public java.lang.String getName() { 
		return this.name;
	} 

	public void setName(java.lang.String name) { 
		this.name = name;
	} 

	public Document name(java.lang.String name) { 
		this.name = name;
		return this;
	} 

	public java.util.Date getExpirationDate() { 
		return this.expirationDate;
	} 

	public void setExpirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
	} 

	public Document expirationDate(java.util.Date expirationDate) { 
		this.expirationDate = expirationDate;
		return this;
	} 

	public long getSize() { 
		return this.size;
	} 

	public void setSize(long size) { 
		this.size = size;
	} 

	public Document size(long size) { 
		this.size = size;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.complextype.SafeKeyValue[] getTags() { 
		return this.tags;
	} 

	public void setTags(net.zyuiop.ovhapi.api.objects.complextype.SafeKeyValue[] tags) { 
		this.tags = tags;
	} 

	public Document tags(net.zyuiop.ovhapi.api.objects.complextype.SafeKeyValue[] tags) { 
		this.tags = tags;
		return this;
	} 

	public java.util.Date getCreationDate() { 
		return this.creationDate;
	} 

	public void setCreationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
	} 

	public Document creationDate(java.util.Date creationDate) { 
		this.creationDate = creationDate;
		return this;
	} 

	public java.lang.String getGetUrl() { 
		return this.getUrl;
	} 

	public void setGetUrl(java.lang.String getUrl) { 
		this.getUrl = getUrl;
	} 

	public Document getUrl(java.lang.String getUrl) { 
		this.getUrl = getUrl;
		return this;
	} 

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public Document id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
