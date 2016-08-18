package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of a Association additional information
 */

public class AssociationContact { 

	private long contactId;
	private java.util.Date declarationDate;
	private java.util.Date publicationDate;
	private java.lang.String publicationPageNumber;
	private long id;
	private java.lang.String publicationNumber;

	public AssociationContact() {
	}

	public long getContactId() { 
		return this.contactId;
	} 

	public void setContactId(long contactId) { 
		this.contactId = contactId;
	} 

	public AssociationContact contactId(long contactId) { 
		this.contactId = contactId;
		return this;
	} 

	public java.util.Date getDeclarationDate() { 
		return this.declarationDate;
	} 

	public void setDeclarationDate(java.util.Date declarationDate) { 
		this.declarationDate = declarationDate;
	} 

	public AssociationContact declarationDate(java.util.Date declarationDate) { 
		this.declarationDate = declarationDate;
		return this;
	} 

	public java.util.Date getPublicationDate() { 
		return this.publicationDate;
	} 

	public void setPublicationDate(java.util.Date publicationDate) { 
		this.publicationDate = publicationDate;
	} 

	public AssociationContact publicationDate(java.util.Date publicationDate) { 
		this.publicationDate = publicationDate;
		return this;
	} 

	public java.lang.String getPublicationPageNumber() { 
		return this.publicationPageNumber;
	} 

	public void setPublicationPageNumber(java.lang.String publicationPageNumber) { 
		this.publicationPageNumber = publicationPageNumber;
	} 

	public AssociationContact publicationPageNumber(java.lang.String publicationPageNumber) { 
		this.publicationPageNumber = publicationPageNumber;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public AssociationContact id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPublicationNumber() { 
		return this.publicationNumber;
	} 

	public void setPublicationNumber(java.lang.String publicationNumber) { 
		this.publicationNumber = publicationNumber;
	} 

	public AssociationContact publicationNumber(java.lang.String publicationNumber) { 
		this.publicationNumber = publicationNumber;
		return this;
	} 

}
