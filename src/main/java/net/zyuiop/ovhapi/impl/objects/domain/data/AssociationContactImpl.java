package net.zyuiop.ovhapi.impl.objects.domain.data;

import net.zyuiop.ovhapi.api.objects.domain.data.AssociationContact;
/**
 * Representation of a Association additional information
 */

public class AssociationContactImpl implements AssociationContact { 

	private long contactId;
	private java.util.Date declarationDate;
	private java.util.Date publicationDate;
	private java.lang.String publicationPageNumber;
	private long id;
	private java.lang.String publicationNumber;

	public AssociationContactImpl() {
	}

	public long getContactId() { 
		return this.contactId;
	} 

	public void setContactId(long contactId) { 
		this.contactId = contactId;
	} 

	public AssociationContactImpl contactId(long contactId) { 
		this.contactId = contactId;
		return this;
	} 

	public java.util.Date getDeclarationDate() { 
		return this.declarationDate;
	} 

	public void setDeclarationDate(java.util.Date declarationDate) { 
		this.declarationDate = declarationDate;
	} 

	public AssociationContactImpl declarationDate(java.util.Date declarationDate) { 
		this.declarationDate = declarationDate;
		return this;
	} 

	public java.util.Date getPublicationDate() { 
		return this.publicationDate;
	} 

	public void setPublicationDate(java.util.Date publicationDate) { 
		this.publicationDate = publicationDate;
	} 

	public AssociationContactImpl publicationDate(java.util.Date publicationDate) { 
		this.publicationDate = publicationDate;
		return this;
	} 

	public java.lang.String getPublicationPageNumber() { 
		return this.publicationPageNumber;
	} 

	public void setPublicationPageNumber(java.lang.String publicationPageNumber) { 
		this.publicationPageNumber = publicationPageNumber;
	} 

	public AssociationContactImpl publicationPageNumber(java.lang.String publicationPageNumber) { 
		this.publicationPageNumber = publicationPageNumber;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public AssociationContactImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPublicationNumber() { 
		return this.publicationNumber;
	} 

	public void setPublicationNumber(java.lang.String publicationNumber) { 
		this.publicationNumber = publicationNumber;
	} 

	public AssociationContactImpl publicationNumber(java.lang.String publicationNumber) { 
		this.publicationNumber = publicationNumber;
		return this;
	} 

}
