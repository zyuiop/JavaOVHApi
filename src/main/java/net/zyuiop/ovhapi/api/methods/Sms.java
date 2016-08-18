package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /sms APIs
 */

public interface Sms { 

	/**
	 * Validate a given sender with an activation code.
	 * Facultative parameters ? false
	 * @param code The validation code
	 * @param serviceName The internal name of your SMS offer
	 * @param sender The sms sender
	*/
	void postServiceNameSendersSenderValidate(java.lang.String code, java.lang.String serviceName, java.lang.String sender) throws java.io.IOException;

	/**
	 * Delete the document from the slot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param slotId Slot number id
	*/
	void deleteServiceNameUsersLoginReceiversSlotId(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException;

	/**
	 * Delete the sms outgoing history given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param id Id of the object
	*/
	void deleteServiceNameOutgoingId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Receivers preloaded from text or csv document file
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	long[] getServiceNameReceivers(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Delete the sms outgoing history given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param id Id of the object
	*/
	void deleteServiceNameUsersLoginOutgoingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException;



	/**
	 * Credit transfer between two sms accounts.
	 * Facultative parameters ? false
	 * @param credits Amount of credits to transfer.
	 * @param smsAccountTarget Sms account destination.
	 * @param serviceName The internal name of your SMS offer
	*/
	void postServiceNameTransferCredits(double credits, java.lang.String smsAccountTarget, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Sms sent associated to the sms user
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param receiver Filter the value of receiver property (=)
	 * @param differedDelivery Filter the value of differedDelivery property (=)
	 * @param deliveryReceipt Filter the value of deliveryReceipt property (=)
	 * @param ptt Filter the value of ptt property (=)
	 * @param sender Filter the value of sender property (=)
	 * @param tag Filter the value of tag property (=)
	*/
	long[] getServiceNameUsersLoginOutgoing(java.lang.String serviceName, java.lang.String login, java.lang.String receiver, long differedDelivery, long deliveryReceipt, long ptt, java.lang.String sender, java.lang.String tag) throws java.io.IOException;

	/**
	 * Sms sent associated to the sms user
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	*/
	long[] getServiceNameUsersLoginOutgoing(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;




	/**
	 * Delete the sms incoming history given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param id Id of the object
	*/
	void deleteServiceNameIncomingId(java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Delete the sms job given (stop sending)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param id Id of the object
	*/
	void deleteServiceNameJobsId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Users associated to the sms account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String[] getServiceNameUsers(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Senders allowed associated to the sms account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String[] getServiceNameSenders(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the sms sender given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param sender The sms sender
	*/
	void deleteServiceNameSendersSender(java.lang.String serviceName, java.lang.String sender) throws java.io.IOException;

	/**
	 * Get the /me/document id generated
	 * Facultative parameters ? true
	 * @param wayType specify outgoing or incoming sms
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param tag Select sms with a specific identifier group tag
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	*/
	java.lang.String getServiceNameUsersLoginDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String login, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException;

	/**
	 * Get the /me/document id generated
	 * Facultative parameters ? false
	 * @param wayType specify outgoing or incoming sms
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	*/
	java.lang.String getServiceNameUsersLoginDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * Delete the blacklisted sms number given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param number The sms number blacklisted
	*/
	void deleteServiceNameBlacklistsNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * Get the document data container
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param slotId Slot number id
	*/
	java.lang.String getServiceNameUsersLoginReceiversSlotIdCsv(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException;

	/**
	 * Delete the sms job given (stop sending)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param id Id of the object
	*/
	void deleteServiceNameUsersLoginJobsId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException;


	/**
	 * Numbers blacklisted associated to the sms account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String[] getServiceNameBlacklists(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Sms in pending associated to the sms user
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	*/
	long[] getServiceNameUsersLoginJobs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;


	/**
	 * Sms received associated to the sms user
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param sender Filter the value of sender property (=)
	 * @param tag Filter the value of tag property (=)
	*/
	long[] getServiceNameUsersLoginIncoming(java.lang.String serviceName, java.lang.String login, java.lang.String sender, java.lang.String tag) throws java.io.IOException;

	/**
	 * Sms received associated to the sms user
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	*/
	long[] getServiceNameUsersLoginIncoming(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;



	/**
	 * Create the sms sender given
	 * Facultative parameters ? true
	 * @param sender The sender (alpha or phone number)
	 * @param serviceName The internal name of your SMS offer
	 * @param reason Message seen by the moderator
	 * @param description Sender description
	*/
	java.lang.String postServiceNameSenders(java.lang.String sender, java.lang.String serviceName, java.lang.String reason, java.lang.String description) throws java.io.IOException;

	/**
	 * Create the sms sender given
	 * Facultative parameters ? false
	 * @param sender The sender (alpha or phone number)
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String postServiceNameSenders(java.lang.String sender, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the sms incoming history given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	 * @param id Id of the object
	*/
	void deleteServiceNameUsersLoginIncomingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException;

	/**
	 * Get the document data container
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param slotId Slot number id
	*/
	java.lang.String getServiceNameReceiversSlotIdCsv(java.lang.String serviceName, long slotId) throws java.io.IOException;

	/**
	 * Operations on a SMS service
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your SMS offer
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException;

	/**
	 * Operations on a SMS service
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Create a new user for an sms account
	 * Facultative parameters ? false
	 * @param password The sms password
	 * @param login The sms login
	 * @param serviceName The internal name of your SMS offer
	*/
	void postServiceNameUsers(java.lang.String password, java.lang.String login, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Receivers preloaded from text or csv document file
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	*/
	long[] getServiceNameUsersLoginReceivers(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;



	/**
	 * Create the sms template control given
	 * Facultative parameters ? true
	 * @param name Name of the template
	 * @param activity Specify the kind of template
	 * @param message Message pattern to be moderated. Use "#VALUE#" format for dynamic text area.
	 * @param serviceName The internal name of your SMS offer
	 * @param reason Message seen by the moderator
	 * @param description Template description
	*/
	void postServiceNameTemplatesControl(java.lang.String name, java.lang.String activity, java.lang.String message, java.lang.String serviceName, java.lang.String reason, java.lang.String description) throws java.io.IOException;

	/**
	 * Create the sms template control given
	 * Facultative parameters ? false
	 * @param name Name of the template
	 * @param activity Specify the kind of template
	 * @param message Message pattern to be moderated. Use "#VALUE#" format for dynamic text area.
	 * @param serviceName The internal name of your SMS offer
	*/
	void postServiceNameTemplatesControl(java.lang.String name, java.lang.String activity, java.lang.String message, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Delete the sms user given
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param login The sms user login
	*/
	void deleteServiceNameUsersLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSms() throws java.io.IOException;


	/**
	 * Sms in pending associated to the sms account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	long[] getServiceNameJobs(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Sms received associated to the sms account
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your SMS offer
	 * @param sender Filter the value of sender property (=)
	 * @param tag Filter the value of tag property (=)
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	*/
	long[] getServiceNameIncoming(java.lang.String serviceName, java.lang.String sender, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException;

	/**
	 * Sms received associated to the sms account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	long[] getServiceNameIncoming(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Get the /me/document id generated
	 * Facultative parameters ? true
	 * @param wayType specify outgoing or incoming sms
	 * @param serviceName The internal name of your SMS offer
	 * @param tag Select sms with a specific identifier group tag
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	*/
	java.lang.String getServiceNameDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException;

	/**
	 * Get the /me/document id generated
	 * Facultative parameters ? false
	 * @param wayType specify outgoing or incoming sms
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String getServiceNameDocument(java.lang.String wayType, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the document from the slot
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	 * @param slotId Slot number id
	*/
	void deleteServiceNameReceiversSlotId(java.lang.String serviceName, long slotId) throws java.io.IOException;

	/**
	 * Sms sent associated to the sms account
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your SMS offer
	 * @param receiver Filter the value of receiver property (=)
	 * @param differedDelivery Filter the value of differedDelivery property (=)
	 * @param deliveryReceipt Filter the value of deliveryReceipt property (=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	 * @param ptt Filter the value of ptt property (=)
	 * @param sender Filter the value of sender property (=)
	 * @param tag Filter the value of tag property (=)
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	*/
	long[] getServiceNameOutgoing(java.lang.String serviceName, java.lang.String receiver, long differedDelivery, long deliveryReceipt, java.util.Date creationDatetimeFrom, long ptt, java.lang.String sender, java.lang.String tag, java.util.Date creationDatetimeTo) throws java.io.IOException;

	/**
	 * Sms sent associated to the sms account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	long[] getServiceNameOutgoing(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Template pattern filled up for moderation (Needed to send in US country)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your SMS offer
	*/
	java.lang.String[] getServiceNameTemplatesControl(java.lang.String serviceName) throws java.io.IOException;

}
