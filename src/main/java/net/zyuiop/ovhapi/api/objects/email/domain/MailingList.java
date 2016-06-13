package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Mailing List
 */

public interface MailingList { 

	/**
	 * @return Language of mailing list
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return Options of mailing list
	 */
	net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct getOptions(); 

	/**
	 * @return Name of mailing list
	 */
	java.lang.String getName(); 

	/**
	 * @return Owner email of mailing list
	 */
	java.lang.String getOwnerEmail(); 

	/**
	 * @return Email to reply of mailing list
	 */
	java.lang.String getReplyTo(); 

	/**
	 * @return Id of mailing list
	 */
	long getId(); 

	/**
	 * @return Last update subscribers
	 */
	java.util.Date getNbSubscribersUpdateDate(); 

	/**
	 * @return Subscribers number of mailing list
	 */
	long getNbSubscribers(); 

}
