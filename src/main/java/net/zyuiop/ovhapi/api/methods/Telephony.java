package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /telephony APIs
 */

public interface Telephony { 


	/**
	 * Delete the given agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;


	/**
	 * Generates a new password for your fax account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountFaxServiceNameSettingsNewPassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given skill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

	/**
	 * Delete the customized greeting
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;





	/**
	 * Operations on a telephony service
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param status Filter the value of status property (=)
	*/
	long[] getBillingAccountServiceServiceNameTask(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String status) throws java.io.IOException;

	/**
	 * Operations on a telephony service
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountServiceServiceNameTask(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Make an automatic phone call. Return generated call identifier
	 * Facultative parameters ? true
	 * @param calledNumber Number to call
	 * @param isAnonymous For anonymous call
	 * @param dialplan Dialplan used for the call
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param playbackAudioFileDialplan Name of the audioFile (if needed) with extention. This audio file must have been upload previously
	 * @param callingNumber Optional, number where the call come from
	 * @param bridgeNumberDialplan Number to call if transfer in dialplan selected
	 * @param ttsTextDialplan Text to read if TTS on dialplan selected
	 * @param timeout Timeout (in seconds). Default is 20 seconds
	*/
	java.lang.String postBillingAccountLineServiceNameAutomaticCall(java.lang.String calledNumber, boolean isAnonymous, java.lang.String dialplan, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String playbackAudioFileDialplan, java.lang.String callingNumber, java.lang.String bridgeNumberDialplan, java.lang.String ttsTextDialplan, long timeout) throws java.io.IOException;

	/**
	 * Make an automatic phone call. Return generated call identifier
	 * Facultative parameters ? false
	 * @param calledNumber Number to call
	 * @param isAnonymous For anonymous call
	 * @param dialplan Dialplan used for the call
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountLineServiceNameAutomaticCall(java.lang.String calledNumber, boolean isAnonymous, java.lang.String dialplan, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Records associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Upload a new sound for a specific greeting. Return a task id.
	 * Facultative parameters ? false
	 * @param documentId Get the /me/document uuid generated
	 * @param dir Greeting voicemail directory
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long postBillingAccountVoicemailServiceNameGreetings(java.lang.String documentId, java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Fax campaigns of the associate fax
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountFaxServiceNameCampaigns(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Services associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountService(java.lang.String billingAccount) throws java.io.IOException;





	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpare() throws java.io.IOException;









	/**
	 * Previous billed consumptions
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.util.Date[] getBillingAccountHistoryConsumption(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Cancel the billing account termination
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	void postBillingAccountCancelTermination(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get all available special range from a country
	 * Facultative parameters ? false
	 * @param country The country
	*/
	java.lang.String[] getNumberRanges(java.lang.String country) throws java.io.IOException;



	/**
	 * Delete the given abbreviated number
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param abbreviatedNumber The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	*/
	void deleteBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException;


	/**
	 * Delete the given extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

	/**
	 * Create a new screen list rule
	 * Facultative parameters ? false
	 * @param callNumber The callNumber of the generic screen list
	 * @param type The type of the generic screen list
	 * @param nature The nature of the generic screen list
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountScreenServiceNameScreenLists(java.lang.String callNumber, java.lang.String type, java.lang.String nature, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Dialplans associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplan(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Make a phone call from the current line
	 * Facultative parameters ? true
	 * @param calledNumber null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param callingNumber null
	 * @param intercom Activate the calling number in intercom mode automatically (pick up and speaker automatic activation).
	*/
	void postBillingAccountLineServiceNameClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String callingNumber, boolean intercom) throws java.io.IOException;

	/**
	 * Make a phone call from the current line
	 * Facultative parameters ? false
	 * @param calledNumber null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountLineServiceNameClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Calls queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return phonebooks associated
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhonePhonebook(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Delete a phonebook contact
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	void deleteBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException;



	/**
	 * Delete the spare as if it was not belonging to OVH anymore
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	void deleteSpareSpare(java.lang.String spare) throws java.io.IOException;


	/**
	 * Delete the given sound
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param soundId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException;

	/**
	 * Change the voicemail password. It must be 4 digit
	 * Facultative parameters ? false
	 * @param password The password
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountVoicemailServiceNameSettingsChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a scheduler event
	 * Facultative parameters ? true
	 * @param dateStart The beginning date of the event
	 * @param category The category of the event
	 * @param dateEnd The ending date of the event
	 * @param title The title of the event
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param uid The unique ICS event identifier
	 * @param description The descritpion of the event
	*/
	void postBillingAccountSchedulerServiceNameEvents(java.util.Date dateStart, java.lang.String category, java.util.Date dateEnd, java.lang.String title, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid, java.lang.String description) throws java.io.IOException;

	/**
	 * Add a scheduler event
	 * Facultative parameters ? false
	 * @param dateStart The beginning date of the event
	 * @param category The category of the event
	 * @param dateEnd The ending date of the event
	 * @param title The title of the event
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountSchedulerServiceNameEvents(java.util.Date dateStart, java.lang.String category, java.util.Date dateEnd, java.lang.String title, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Move a service of billing account. Source and destination nics should be the same.
	 * Facultative parameters ? false
	 * @param billingAccountDestination Billing account destination target
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountServiceServiceNameChangeOfBillingAccount(java.lang.String billingAccountDestination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Conferences associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountConference(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * List of codecs combinaisons available for this line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNameOptionsAvailableCodecs(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Move the message to another directory
	 * Facultative parameters ? false
	 * @param dir Greeting voicemail directory
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountVoicemailServiceNameGreetingsIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete the given condition
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param conditionId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException;



	/**
	 * Current number portabilities for this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	double[] getBillingAccountPortabilities(java.lang.String billingAccount) throws java.io.IOException;


	/**
	 * Sounds associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Live calls of the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;



	/**
	 * Agent assigned to the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;







	/**
	 * List of available exchange merchandise brand
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhoneMerchandiseAvailable(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Voicemails associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountVoicemail(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Delete the given skill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;



	/**
	 * Delete the given dialplan
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	void deleteBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;

	/**
	 * Get the status of the voicemail. Available only if the line has fax capabilities
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String getBillingAccountVoicemailServiceNameSettingsRouting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Screenlist compatible numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountScreen(java.lang.String billingAccount) throws java.io.IOException;


	/**
	 * Time conditions compatible numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountTimeCondition(java.lang.String billingAccount) throws java.io.IOException;



	/**
	 * Rules for call filtering for this service
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountScreenServiceNameScreenLists(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Hunting agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Stop a fax campaign
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountFaxServiceNameCampaignsIdStop(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Calls agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Delete a fax campaign
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;




	/**
	 * Delete the given menu entry
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	 * @param entryId null
	*/
	void deleteBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException;


	/**
	 * List the available functions for the key
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param keyNum The number of the function key
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhoneFunctionKeyKeyNumAvailableFunction(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException;




	/**
	 * Delete a phonebook contact
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	void deleteBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException;


	/**
	 * Make a phone call from the current line
	 * Facultative parameters ? true
	 * @param calledNumber null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	 * @param callingNumber null
	*/
	void postBillingAccountLineServiceNameClick2CallUserIdClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, long id, java.lang.String callingNumber) throws java.io.IOException;

	/**
	 * Make a phone call from the current line
	 * Facultative parameters ? false
	 * @param calledNumber null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountLineServiceNameClick2CallUserIdClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Change the password of the click2call user
	 * Facultative parameters ? false
	 * @param password The password
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountLineServiceNameClick2CallUserIdChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete the given token
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void deleteBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Vxml numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountVxml(java.lang.String billingAccount) throws java.io.IOException;









	/**
	 * Agent assigned to the queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;





	/**
	 * Extensions contained in the dialplan
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;


	/**
	 * Calls queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;







	/**
	 * Agent assigned to the queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;


	/**
	 * Delete a click 2 call user
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Abbreviated numbers for the line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Records associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Time conditions checked when executing the extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTime(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;


	/**
	 * EasyPabx associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountEasyPabx(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Rules for time conditions for this service
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountTimeConditionServiceNameCondition(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Delete the given skill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;


	/**
	 * Get all available spare brands
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpareBrands() throws java.io.IOException;








	/**
	 * Abbreviated numbers for the billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	long[] getBillingAccountAbbreviatedNumber(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Current participants of the associate conference
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountConferenceServiceNameParticipants(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Hunting agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;







	/**
	 * Get all available geographic zone from a country
	 * Facultative parameters ? false
	 * @param country The country
	*/
	java.lang.String[] getNumberZones(java.lang.String country) throws java.io.IOException;


	/**
	 * Delete the given condition
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param conditionId null
	*/
	void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTimeConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException;

	/**
	 * Sounds associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Phonebook contacts
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	long[] getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;




	/**
	 * Scheduled events
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountScheduler(java.lang.String billingAccount) throws java.io.IOException;


	/**
	 * Replace the phone by its spare. The broken phone became a spare if it was bought. An RMA is created if the broken phone is under securitydeposit.
	 * Facultative parameters ? false
	 * @param domain The phone to replace by the spare
	 * @param ip Public ip of the phone
	 * @param spare The internal name of your spare
	*/
	void postSpareSpareReplace(java.lang.String domain, java.lang.String ip, java.lang.String spare) throws java.io.IOException;




	/**
	 * Rules contained in the extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

	/**
	 * Delete the given screen list
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete the given menu
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	void deleteBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * Live calls of the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;



	/**
	 * Add a phonebook. Return the bookKey.
	 * Facultative parameters ? false
	 * @param name Name of the wanted phonebook
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountLineServiceNamePhonePhonebook(java.lang.String name, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given screen list
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Phonebook contacts
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	long[] getBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;



	/**
	 * Delete the given scheduler event
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param uid The unique ICS event identifier
	*/
	void deleteBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException;

	/**
	 * Menu entry
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	long[] getBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * OVH calls queues and OVH IVRs (Interactive Voice Response) associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountOvhPabx(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Voicemail directory messages
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dir Filter the value of dir property (=)
	*/
	long[] getBillingAccountVoicemailServiceNameDirectories(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String dir) throws java.io.IOException;

	/**
	 * Voicemail directory messages
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountVoicemailServiceNameDirectories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Calls agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Previous tollfree bill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.util.Date[] getBillingAccountHistoryTollfreeConsumption(java.lang.String billingAccount) throws java.io.IOException;



	/**
	 * Fax delivery records.
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	 * @param wayType Filter the value of wayType property (=)
	*/
	long[] getBillingAccountServiceServiceNameFaxConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException;

	/**
	 * Fax delivery records.
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountServiceServiceNameFaxConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Ask for a billing account termination.
	 * Facultative parameters ? true
	 * @param reason Termination reason
	 * @param billingAccount The name of your billingAccount
	 * @param details Termination reason details
	*/
	void deleteBillingAccount(java.lang.String reason, java.lang.String billingAccount, java.lang.String details) throws java.io.IOException;

	/**
	 * Ask for a billing account termination.
	 * Facultative parameters ? false
	 * @param reason Termination reason
	 * @param billingAccount The name of your billingAccount
	*/
	void deleteBillingAccount(java.lang.String reason, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Miniabx associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountMiniPabx(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create a new time condition rule
	 * Facultative parameters ? false
	 * @param hourEnd The hour where the time condition ends (format : hhmm)
	 * @param policy The policy
	 * @param day The day of the time condition
	 * @param hourBegin The hour where the time condition begins (format : hhmm)
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountTimeConditionServiceNameCondition(java.lang.String hourEnd, java.lang.String policy, java.lang.String day, java.lang.String hourBegin, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Screenlist conditions checked when executing the extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;




	/**
	 * Plug & Phone function keys
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountLineServiceNamePhoneFunctionKey(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given skill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	void deleteBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;


	/**
	 * Lines associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountLine(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Automatic Calls made by Calls Generator on this line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNameAutomaticCall(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;










	/**
	 * Ask for a service termination.
	 * Facultative parameters ? true
	 * @param reason Termination reason
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param details Termination reason details
	*/
	void deleteBillingAccountServiceServiceName(java.lang.String reason, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String details) throws java.io.IOException;

	/**
	 * Ask for a service termination.
	 * Facultative parameters ? false
	 * @param reason Termination reason
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void deleteBillingAccountServiceServiceName(java.lang.String reason, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;








	/**
	 * Delete the given record
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id null
	*/
	void deleteBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;






	/**
	 * Return phonebooks associated to this group
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountPhonebook(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create a new token
	 * Facultative parameters ? false
	 * @param expiration Time to live in seconds for the token
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountServiceServiceNameEventToken(java.lang.String expiration, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Agent assigned to the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;





	/**
	 * OVH easy calls queues associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountEasyHunting(java.lang.String billingAccount) throws java.io.IOException;





	/**
	 * Disable/Enable voicemail. Available only if the line has fax capabilities
	 * Facultative parameters ? false
	 * @param routing Activate or Desactivate voicemail on the line
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountVoicemailServiceNameSettingsChangeRouting(java.lang.String routing, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Generates a new password for your fax account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountFaxServiceNameSettingsChangePassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Delete the given record
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id null
	*/
	void deleteBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Custom events scheduled
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dateEnd.from Filter the value of dateEnd property (>=)
	 * @param dateStart.to Filter the value of dateStart property (<=)
	 * @param dateEnd.to Filter the value of dateEnd property (<=)
	 * @param dateStart.from Filter the value of dateStart property (>=)
	 * @param categories Filter the value of categories property (=)
	*/
	java.lang.String[] getBillingAccountSchedulerServiceNameEvents(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date dateEndFrom, java.util.Date dateStartTo, java.util.Date dateEndTo, java.util.Date dateStartFrom, java.lang.String categories) throws java.io.IOException;

	/**
	 * Custom events scheduled
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountSchedulerServiceNameEvents(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given rule
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param ruleId null
	*/
	void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException;




	/**
	 * Screen lists conditions checked when a call is received
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param screenListType Filter the value of screenListType property (=)
	*/
	long[] getBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String screenListType) throws java.io.IOException;

	/**
	 * Screen lists conditions checked when a call is received
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Menus associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameMenu(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return the list of phone domains compatible to be replaced
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException;



	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getTelephony() throws java.io.IOException;




	/**
	 * Start a fax campaign
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountFaxServiceNameCampaignsIdStart(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;




	/**
	 * List your past conferences for this number
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountConferenceServiceNameHistories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the allowed creditThreshold for this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	double[] getBillingAccountAllowedCreditThreshold(java.lang.String billingAccount) throws java.io.IOException;


	/**
	 * Move the message to another directory
	 * Facultative parameters ? false
	 * @param dir Greeting voicemail directory
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountVoicemailServiceNameDirectoriesIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 * Facultative parameters ? true
	 * @param group Group name of the phonebook
	 * @param name Name of the contact
	 * @param surname Contact surname
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	 * @param homeMobile Home mobile phone number of the contact
	 * @param workMobile Mobile phone office number of the contact
	 * @param homePhone Home landline phone number of the contact
	 * @param workPhone Landline phone office number of the contact
	*/
	long postBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String bookKey, java.lang.String homeMobile, java.lang.String workMobile, java.lang.String homePhone, java.lang.String workPhone) throws java.io.IOException;

	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 * Facultative parameters ? false
	 * @param group Group name of the phonebook
	 * @param name Name of the contact
	 * @param surname Contact surname
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	long postBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;







	/**
	 * Delete the given condition
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param conditionId null
	*/
	void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException;

	/**
	 * Time conditions checked when a call is received
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param policy Filter the value of policy property (=)
	*/
	long[] getBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String policy) throws java.io.IOException;

	/**
	 * Time conditions checked when a call is received
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a phonebook
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	void deleteBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Delete the given sound
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param soundId null
	*/
	void deleteBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException;

	/**
	 * Service concerned by the french RSVA reform
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountRsva(java.lang.String billingAccount) throws java.io.IOException;



	/**
	 * Cancel the service termination
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountServiceServiceNameCancelTermination(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given voicemail message
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get all available accessories
	 * Facultative parameters ? false
	 * @param country The country
	*/
	java.lang.String[] getAccessories(java.lang.String country) throws java.io.IOException;

	/**
	 * Create a new token
	 * Facultative parameters ? false
	 * @param expiration Time to live in seconds for the token
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String postBillingAccountEventToken(java.lang.String expiration, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Delete the given condition
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param conditionId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException;






	/**
	 * Cancel a scheduled rate code update
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountRsvaServiceNameCancelScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;






	/**
	 * Call delivery records.
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param planType Filter the value of planType property (=)
	 * @param destinationType Filter the value of destinationType property (=)
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	 * @param wayType Filter the value of wayType property (=)
	*/
	long[] getBillingAccountServiceServiceNameVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String planType, java.lang.String destinationType, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException;

	/**
	 * Call delivery records.
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountServiceServiceNameVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Delete a phonebook
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	void deleteBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;




	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 * Facultative parameters ? true
	 * @param group Group name of the phonebook
	 * @param name Name of the contact
	 * @param surname Contact surname
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	 * @param homeMobile Home mobile phone number of the contact
	 * @param workMobile Mobile phone office number of the contact
	 * @param homePhone Home landline phone number of the contact
	 * @param workPhone Landline phone office number of the contact
	*/
	long postBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, java.lang.String homeMobile, java.lang.String workMobile, java.lang.String homePhone, java.lang.String workPhone) throws java.io.IOException;

	/**
	 * Create a phonebook contact. Return identifier of the phonebook contact.
	 * Facultative parameters ? false
	 * @param group Group name of the phonebook
	 * @param name Name of the contact
	 * @param surname Contact surname
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	long postBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Delete the given token
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	void deleteBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException;




	/**
	 * Previous repayment bill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.util.Date[] getBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Faxes associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountFax(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Delete the agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	void deleteBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * Listing of domains Sip availables
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNameAvailableSipDomains(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * DDIs (direct dial-in) associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountDdi(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Change the voicemail on a new version to manager greetings, directories and extra settings.
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountVoicemailServiceNameMigrateOnNewVersion(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return Merchandise Authorisation associated
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhoneRma(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * User which can use click 2 call on the line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountLineServiceNameClick2CallUser(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Delete the agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	void deleteBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;


	/**
	 * Delete the given abbreviated number
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param abbreviatedNumber The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	*/
	void deleteBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException;




	/**
	 * Call which could be repayable
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	*/
	long[] getBillingAccountServiceServiceNameRepaymentConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException;

	/**
	 * Call which could be repayable
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountServiceServiceNameRepaymentConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;







	/**
	 * Voicemail greeting message properties
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dir Filter the value of dir property (=)
	*/
	long[] getBillingAccountVoicemailServiceNameGreetings(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String dir) throws java.io.IOException;

	/**
	 * Voicemail greeting message properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountVoicemailServiceNameGreetings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Redirects associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountRedirect(java.lang.String billingAccount) throws java.io.IOException;


	/**
	 * Create a new user for click 2 call
	 * Facultative parameters ? false
	 * @param password The user password
	 * @param login Name of the contact
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long postBillingAccountLineServiceNameClick2CallUser(java.lang.String password, java.lang.String login, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Call delivery records of the previous month.
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param planType Filter the value of planType property (=)
	 * @param destinationType Filter the value of destinationType property (=)
	 * @param creationDatetime.to Filter the value of creationDatetime property (<=)
	 * @param creationDatetime.from Filter the value of creationDatetime property (>=)
	 * @param wayType Filter the value of wayType property (=)
	*/
	long[] getBillingAccountServiceServiceNamePreviousVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String planType, java.lang.String destinationType, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException;

	/**
	 * Call delivery records of the previous month.
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountServiceServiceNamePreviousVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Add a phonebook on group. Return the bookKey.
	 * Facultative parameters ? false
	 * @param name Name of the wanted phonebook
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String postBillingAccountPhonebook(java.lang.String name, java.lang.String billingAccount) throws java.io.IOException;


	/**
	 * Additional numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountNumber(java.lang.String billingAccount) throws java.io.IOException;

}
