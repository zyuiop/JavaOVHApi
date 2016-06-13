package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of a Association additional information
 */

public interface AssociationContact { 

	/**
	 * @return Contact ID related to the association contact information
	 */
	long getContactId(); 

	/**
	 * @return Date of the declaration of the association
	 */
	java.util.Date getDeclarationDate(); 

	/**
	 * @return Date of the publication of the declaration of the association
	 */
	java.util.Date getPublicationDate(); 

	/**
	 * @return Page number of the publication of the declaration of the association
	 */
	java.lang.String getPublicationPageNumber(); 

	/**
	 * @return Association additional information ID
	 */
	long getId(); 

	/**
	 * @return Number of the publication of the declaration of the association
	 */
	java.lang.String getPublicationNumber(); 

}
