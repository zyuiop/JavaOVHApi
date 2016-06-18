package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /telephony APIs
 */

public interface Telephony { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	void putBillingAccountOvhPabxServiceNameDialplanDialplanId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param abbreviatedNumber The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	*/
	net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber getBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	void putBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

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
	 * Get all available special range from a country
	 * Facultative parameters ? false
	 * @param country The country
	*/
	java.lang.String[] getNumberRanges(java.lang.String country) throws java.io.IOException;

	/**
	 * Get a url to download the sound file
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountVoicemailServiceNameGreetingsIdDownload(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * EasyPabx associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountEasyPabx(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Phone getBillingAccountLineServiceNamePhone(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent getBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * Delete the given condition
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param conditionId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException;

	/**
	 * Delete the agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	void deleteBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * Delete the given sound
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param soundId null
	*/
	void deleteBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException;

	/**
	 * Return Merchandise Authorisation associated
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhoneRma(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpare() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param consumptionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.VoiceConsumption getBillingAccountServiceServiceNameVoiceConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException;

	/**
	 * Cancel the service termination
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountServiceServiceNameCancelTermination(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Voicemail getBillingAccountVoicemailServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given condition
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param conditionId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException;

	/**
	 * Cancel the billing account termination
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	void postBillingAccountCancelTermination(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountMiniPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.MiniPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Live calls of the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 * Facultative parameters ? false
	 * @param queueId The queue where you want to add the agent
	 * @param position The position of the agent in the queue
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EventToken getBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new menu
	 * Facultative parameters ? false
	 * @param name The name of the menu
	 * @param invalidSound The sound played when the caller uses an invalid DTMF
	 * @param greetSound The sound played to greet
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu postBillingAccountOvhPabxServiceNameMenu(java.lang.String name, long invalidSound, long greetSound, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Phonebook contacts
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	long[] getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	void putBillingAccountOvhPabxServiceNameHuntingAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Upload new sound file
	 * Facultative parameters ? true
	 * @param url null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param name null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Upload new sound file
	 * Facultative parameters ? false
	 * @param url null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	void putBillingAccountEasyHuntingServiceNameHuntingQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Fax getBillingAccountFaxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountEasyPabxServiceNameHunting(net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountLineServiceNameTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Current participants of the associate conference
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountConferenceServiceNameParticipants(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.LineOptions getBillingAccountLineServiceNameOptions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Lock the conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameUnlock(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all available accessories
	 * Facultative parameters ? false
	 * @param country The country
	*/
	java.lang.String[] getAccessories(java.lang.String country) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.MiniPabx getBillingAccountMiniPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Menus associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameMenu(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EventToken getBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Change the destination of the DDI
	 * Facultative parameters ? false
	 * @param destination The destination
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountDdiServiceNameChangeDestination(java.lang.String destination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	 * @param entryId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry getBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent getBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Get directory service code from an APE code ( principal activity of the firm code )
	 * Facultative parameters ? false
	 * @param apeCode null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DirectoryHeadingPJ[] getBillingAccountServiceServiceNameDirectoryGetDirectoryServiceCode(java.lang.String apeCode, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting getBillingAccountMiniPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.ConferenceParticipants getBillingAccountConferenceServiceNameParticipantsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting getBillingAccountEasyHuntingServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Ask for a new repayment
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param billingNumber The number of the bill
	*/
	net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption postBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount, java.lang.String billingNumber) throws java.io.IOException;

	/**
	 * Ask for a new repayment
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption postBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	void putBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountServiceServiceName(net.zyuiop.ovhapi.api.objects.telephony.TelephonyService param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountMiniPabxServiceNameHunting(net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Plug & Phone function keys
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountLineServiceNamePhoneFunctionKey(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the customized greeting
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Records associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	void putBillingAccountOvhPabxServiceNameMenuMenuId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu param0, java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getSpareSpareServiceInfos(java.lang.String spare) throws java.io.IOException;

	/**
	 * Create a new screenlist condition for an extension
	 * Facultative parameters ? true
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param callerIdNumber Add a screenlist based on the presented caller number
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, java.lang.String callerIdNumber) throws java.io.IOException;

	/**
	 * Create a new screenlist condition for an extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountLineServiceName(net.zyuiop.ovhapi.api.objects.telephony.Line param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param consumptionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PreviousVoiceConsumption getBillingAccountServiceServiceNamePreviousVoiceConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException;

	/**
	 * Miniabx associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountMiniPabx(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param keyNum The number of the function key
	*/
	void putBillingAccountLineServiceNamePhoneFunctionKeyKeyNum(net.zyuiop.ovhapi.api.objects.telephony.FunctionKey param0, java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException;

	/**
	 * Get the csv document
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param date date of the bill
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryRepaymentConsumptionDateDocument(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param conditionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions getBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException;

	/**
	 * Make a participant deaf in your conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdDeaf(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete the given agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Delete the given voicemail message
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Upload new tone file
	 * Facultative parameters ? false
	 * @param url null
	 * @param type null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNameTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Upload new sound file
	 * Facultative parameters ? true
	 * @param url null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param name null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Upload new sound file
	 * Facultative parameters ? false
	 * @param url null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties getBillingAccountConferenceServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	void putBillingAccountLineServiceNamePhonePhonebookBookKey(net.zyuiop.ovhapi.api.objects.telephony.Phonebook param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings getBillingAccountEasyHuntingServiceNameScreenListConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Service concerned by the french RSVA reform
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountRsva(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Calls queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Fax campaigns of the associate fax
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountFaxServiceNameCampaigns(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param uid The unique ICS event identifier
	*/
	net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent getBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException;

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 * Facultative parameters ? false
	 * @param queueId The queue where you want to add the agent
	 * @param position The position of the agent in the queue
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Abbreviated numbers for the line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountSchedulerServiceName(net.zyuiop.ovhapi.api.objects.telephony.Scheduler param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new menu entry
	 * Facultative parameters ? true
	 * @param action The action triggered by the DTMF
	 * @param position The position of the entry in the menu
	 * @param dtmf The DTMF that triggers the action
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	 * @param actionParam The additionnal parameter of the action
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry postBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String action, long position, java.lang.String dtmf, java.lang.String billingAccount, java.lang.String serviceName, long menuId, java.lang.String actionParam) throws java.io.IOException;

	/**
	 * Create a new menu entry
	 * Facultative parameters ? false
	 * @param action The action triggered by the DTMF
	 * @param position The position of the entry in the menu
	 * @param dtmf The DTMF that triggers the action
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry postBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String action, long position, java.lang.String dtmf, java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveStatistics(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Delete the given record
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id null
	*/
	void deleteBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete the given scheduler event
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param uid The unique ICS event identifier
	*/
	void deleteBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException;

	/**
	 * Get all the way types availables
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DirectoryWayType[] getBillingAccountServiceServiceNameDirectoryGetWayTypes(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Compatible rate codes related to this value added service
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.RateCodeInformation[] getBillingAccountRsvaServiceNameAllowedRateCodes(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountOvhPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.OvhPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Whisper on a call
	 * Facultative parameters ? false
	 * @param whisperingMode Whispering mode
	 * @param number Phone number that will be called and bridged in the communication
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdWhisper(java.lang.String whisperingMode, java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties getBillingAccountVxmlServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given abbreviated number
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param abbreviatedNumber The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	*/
	void deleteBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException;

	/**
	 * Generates a new password for your fax account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountFaxServiceNameSettingsChangePassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Transfer an answered call
	 * Facultative parameters ? false
	 * @param number Phone number to whom the communication will be transfered
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdTransfer(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabx getBillingAccountOvhPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountEasyHuntingServiceNameTimeConditions(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Disable/Enable voicemail. Available only if the line has fax capabilities
	 * Facultative parameters ? false
	 * @param routing Activate or Desactivate voicemail on the line
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountVoicemailServiceNameSettingsChangeRouting(java.lang.String routing, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountFaxServiceName(net.zyuiop.ovhapi.api.objects.telephony.Fax param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Records associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Scheduler getBillingAccountSchedulerServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change the voicemail on a new version to manager greetings, directories and extra settings.
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountVoicemailServiceNameMigrateOnNewVersion(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Lock the conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameLock(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Intercept a non answered call
	 * Facultative parameters ? false
	 * @param number Phone number that will be called and that will intercept the communication
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdIntercept(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Agent assigned to the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Start a fax campaign
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountFaxServiceNameCampaignsIdStart(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete a phonebook
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	void deleteBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Voicemails associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountVoicemail(java.lang.String billingAccount) throws java.io.IOException;

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
	 * Delete a phonebook
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	void deleteBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Get all available phone brands compatible with lines
	 * Facultative parameters ? false
	 * @param country The country
	 * @param offer The selected offer
	*/
	net.zyuiop.ovhapi.api.objects.telephony.LinePhone[] getLineOfferPhones(java.lang.String country, java.lang.String offer) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent getBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Generates a new password for your fax account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountFaxServiceNameSettingsNewPassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new token
	 * Facultative parameters ? false
	 * @param expiration Time to live in seconds for the token
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String postBillingAccountEventToken(java.lang.String expiration, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Rules for call filtering for this service
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountScreenServiceNameScreenLists(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountTimeConditionServiceNameOptions(net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FaxProperties getBillingAccountFaxServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Live calls of the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Delete the given sound
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param soundId null
	*/
	void deleteBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param uid The unique ICS event identifier
	*/
	void putBillingAccountSchedulerServiceNameEventsUid(net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountLineServiceNameOptions(net.zyuiop.ovhapi.api.objects.telephony.LineOptions param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return phonebooks associated to this group
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountPhonebook(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountEasyPabxServiceNameHuntingTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param ruleId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getTelephony() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.telephony.BillingAccount getBillingAccount(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create a new abbreviated number for the billing account
	 * Facultative parameters ? false
	 * @param destinationNumber The destination of the abbreviated number
	 * @param abbreviatedNumber The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	 * @param name null
	 * @param surname null
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup postBillingAccountAbbreviatedNumber(java.lang.String destinationNumber, long abbreviatedNumber, java.lang.String name, java.lang.String surname, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountMiniPabxServiceNameTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new abbreviated number for the line
	 * Facultative parameters ? false
	 * @param destinationNumber The destination of the abbreviated number
	 * @param abbreviatedNumber The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	 * @param name null
	 * @param surname null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber postBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String destinationNumber, long abbreviatedNumber, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.TimeCondition getBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo getBillingAccountServiceServiceNameDirectory(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.VoicemailMessages getBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Listing of domains Sip availables
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNameAvailableSipDomains(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Eavesdrop on a call
	 * Facultative parameters ? false
	 * @param number Phone number that will be called and bridged in the communication
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdEavesdrop(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Phonebook getBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Hunting agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Whisper on a call
	 * Facultative parameters ? false
	 * @param whisperingMode Whispering mode
	 * @param number Phone number that will be called and bridged in the communication
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdWhisper(java.lang.String whisperingMode, java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 * Facultative parameters ? false
	 * @param queueId The queue where you want to add the agent
	 * @param position The position of the agent in the queue
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * DDIs (direct dial-in) associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountDdi(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountVxmlServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Move a service of billing account. Source and destination nics should be the same.
	 * Facultative parameters ? false
	 * @param billingAccountDestination Billing account destination target
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountServiceServiceNameChangeOfBillingAccount(java.lang.String billingAccountDestination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyHunting getBillingAccountEasyHuntingServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Services associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountService(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param abbreviatedNumber The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	*/
	net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup getBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	void putBillingAccountPhonebookBookKeyPhonebookContactId(net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact param0, java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException;


	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Return merchandise authorisation identifier
	*/
	void putBillingAccountLineServiceNamePhoneRmaId(net.zyuiop.ovhapi.api.objects.telephony.Rma param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountEasyPabxServiceNameHuntingTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	void putBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param conditionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException;

	/**
	 * Delete the given screen list
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Add a phonebook on group. Return the bookKey.
	 * Facultative parameters ? false
	 * @param name Name of the wanted phonebook
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String postBillingAccountPhonebook(java.lang.String name, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param date date of the bill
	*/
	net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption getBillingAccountHistoryRepaymentConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountServiceServiceNameDirectory(net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Number getBillingAccountNumberServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Time conditions compatible numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountTimeCondition(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Schedule a new rate code for this sva
	 * Facultative parameters ? false
	 * @param rateCode The specified rate code
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation postBillingAccountRsvaServiceNameScheduleRateCode(java.lang.String rateCode, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Lines associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountLine(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Add a phonebook. Return the bookKey.
	 * Facultative parameters ? false
	 * @param name Name of the wanted phonebook
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountLineServiceNamePhonePhonebook(java.lang.String name, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Upload new tone file
	 * Facultative parameters ? false
	 * @param url null
	 * @param type null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountMiniPabxServiceNameTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountLineServiceNameTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Vxml getBillingAccountVxmlServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;

	/**
	 * Get all available specific number from a country
	 * Facultative parameters ? true
	 * @param country The country
	 * @param type The type of number
	 * @param zone The zone (geographic number)
	 * @param range The range (special number)
	*/
	net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber[] getNumberSpecificNumbers(java.lang.String country, java.lang.String type, java.lang.String zone, java.lang.String range) throws java.io.IOException;

	/**
	 * Get all available specific number from a country
	 * Facultative parameters ? false
	 * @param country The country
	 * @param type The type of number
	*/
	net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber[] getNumberSpecificNumbers(java.lang.String country, java.lang.String type) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	net.zyuiop.ovhapi.api.objects.spare.telephony.TelephonySpare getSpareSpare(java.lang.String spare) throws java.io.IOException;

	/**
	 * Change the voicemail password. It must be 4 digit
	 * Facultative parameters ? false
	 * @param password The password
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountVoicemailServiceNameSettingsChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	void putBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException;

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
	 * Delete the spare as if it was not belonging to OVH anymore
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	void deleteSpareSpare(java.lang.String spare) throws java.io.IOException;

	/**
	 * Calls agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

	/**
	 * Return phonebooks associated
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhonePhonebook(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord getBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	 * @param entryId null
	*/
	void putBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry param0, java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Ddi getBillingAccountDdiServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Stop a fax campaign
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void postBillingAccountFaxServiceNameCampaignsIdStop(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * User which can use click 2 call on the line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountLineServiceNameClick2CallUser(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Automatic Calls made by Calls Generator on this line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNameAutomaticCall(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change a participant level of audio transmission
	 * Facultative parameters ? false
	 * @param value The value of energy level
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdEnergy(long value, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Conference getBillingAccountConferenceServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Detail of the fax recipients by status
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FaxCampaignDetail getBillingAccountFaxServiceNameCampaignsIdDetail(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Create a task to refresh the screen of the MGCP phone
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNamePhoneRefreshScreen(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param soundId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound getBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException;

	/**
	 * Cancel a scheduled rate code update
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void postBillingAccountRsvaServiceNameCancelScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Listing of last ips registry
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DatetimeAndIpvalue[] getBillingAccountLineServiceNameIps(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all available fax offer compatible
	 * Facultative parameters ? false
	 * @param country The country
	*/
	net.zyuiop.ovhapi.api.objects.telephony.LineOffer[] getFaxOffers(java.lang.String country) throws java.io.IOException;

	/**
	 * Get Relevant informations of the service detected from the MOS or the signal leg in SIP/MGCP protocol.
	 * Facultative parameters ? false
	 * @param dayInterval The date index interval
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DiagnosticReport[] getBillingAccountServiceServiceNameDiagnosticReports(java.lang.String dayInterval, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Return merchandise authorisation identifier
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Rma getBillingAccountLineServiceNamePhoneRmaId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster getBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param consumptionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics getBillingAccountServiceServiceNameVoiceConsumptionConsumptionIdCallDiagnostics(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException;

	/**
	 * Phonebook contacts
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	long[] getBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;

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
	 * List of available exchange merchandise brand
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhoneMerchandiseAvailable(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountEasyHuntingServiceName(net.zyuiop.ovhapi.api.objects.telephony.EasyHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task getBillingAccountServiceServiceNameTaskTaskId(java.lang.String billingAccount, java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountScreenServiceName(net.zyuiop.ovhapi.api.objects.telephony.Screen param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	void putBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param date null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.HistoryConsumption getBillingAccountHistoryConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param soundId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound getBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException;

	/**
	 * Delete the given token
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	void deleteBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	 * @param queueId null
	*/
	void putBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountFaxServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.FaxProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new extension for a dialplan
	 * Facultative parameters ? true
	 * @param enable True to enable the extension
	 * @param position The position of the extension in the dialplan (the extensions are executed following this order)
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param screenListType The type of the screenlist
	 * @param schedulerCategory Additionnal conditions will be used from this chosen scheduler category
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(boolean enable, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, java.lang.String screenListType, java.lang.String schedulerCategory) throws java.io.IOException;

	/**
	 * Create a new extension for a dialplan
	 * Facultative parameters ? false
	 * @param enable True to enable the extension
	 * @param position The position of the extension in the dialplan (the extensions are executed following this order)
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(boolean enable, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;

	/**
	 * Create a new agent
	 * Facultative parameters ? false
	 * @param agentNumber The phone number of the agent
	 * @param position The position in the hunting
	 * @param logged True if the agent is logged
	 * @param noReplyTimer The maxium ringing time
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent postBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String agentNumber, long position, boolean logged, long noReplyTimer, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Redirects associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountRedirect(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Current number portabilities for this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	double[] getBillingAccountPortabilities(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Delete the given token
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void deleteBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * @param queueId null
	 * @param agentId null
	*/
	void deleteBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

	/**
	 * Create a new agent
	 * Facultative parameters ? false
	 * @param wrapUpTime The wrap up time (in seconds) after the calls
	 * @param number The number of the agent
	 * @param simultaneousLines The maximum of simultaneous calls that the agent will receive from the hunting
	 * @param status The current status of the agent
	 * @param timeout The waiting timeout (in seconds) before hangup for an assigned called
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent postBillingAccountOvhPabxServiceNameHuntingAgent(long wrapUpTime, java.lang.String number, long simultaneousLines, java.lang.String status, long timeout, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get a url to download the sound file
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountVoicemailServiceNameDirectoriesIdDownload(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountVoicemailServiceName(net.zyuiop.ovhapi.api.objects.telephony.Voicemail param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a click 2 call user
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * List the available functions for the key
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param keyNum The number of the function key
	*/
	java.lang.String[] getBillingAccountLineServiceNamePhoneFunctionKeyKeyNumAvailableFunction(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param date date of the bill
	*/
	net.zyuiop.ovhapi.api.objects.telephony.HistoryTollfreeConsumption getBillingAccountHistoryTollfreeConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	void putBillingAccountOvhPabxServiceNameHuntingQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Add scheduler events in ICS format
	 * Facultative parameters ? false
	 * @param url The URL of your ICS formated calendar
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountSchedulerServiceNameImportIcsCalendar(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Redirect getBillingAccountRedirectServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu getBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * Return the list of phone domains compatible to be replaced
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException;

	/**
	 * Create a new skill for an agent (it adds the agent in a queue)
	 * Facultative parameters ? false
	 * @param queueId The queue where you want to add the agent
	 * @param position The position of the agent in the queue
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountNumberServiceName(net.zyuiop.ovhapi.api.objects.telephony.Number param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given screen list
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Abbreviated numbers for the billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	long[] getBillingAccountAbbreviatedNumber(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Transfer an answered call
	 * Facultative parameters ? false
	 * @param number Phone number to whom the communication will be transfered
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdTransfer(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan getBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;

	/**
	 * List of codecs combinaisons available for this line
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountLineServiceNameOptionsAvailableCodecs(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change the destination of the redirect
	 * Facultative parameters ? false
	 * @param destination The destination
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountRedirectServiceNameChangeDestination(java.lang.String destination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a fax campaign
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	void deleteBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Sounds associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord getBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.TelephonyService getBillingAccountServiceServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Click2CallUser getBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Current rate code related to this sva
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation getBillingAccountRsvaServiceNameCurrentRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

	/**
	 * Create a new token
	 * Facultative parameters ? false
	 * @param expiration Time to live in seconds for the token
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String postBillingAccountServiceServiceNameEventToken(java.lang.String expiration, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountConferenceServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param spare The internal name of your spare
	*/
	void putSpareSpareServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String spare) throws java.io.IOException;

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
	 * Upload new tone file
	 * Facultative parameters ? false
	 * @param url null
	 * @param type null
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyPabxServiceNameHuntingTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Additional numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountNumber(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Create a new fax campaign
	 * Facultative parameters ? true
	 * @param recipientsType Method to set the campaign recipient
	 * @param documentId The id of the /me/document pdf you want to send
	 * @param name The name of the fax campaign
	 * @param sendType Sending type of the campaign
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param recipientsDocId If recipientsType is set to document, the id of the document containing the recipients phone numbers
	 * @param recipientsList If recipientsType is set to list, the list of recipients phone numbers
	 * @param sendDate Sending date of the campaign (when sendType is scheduled)
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign postBillingAccountFaxServiceNameCampaigns(java.lang.String recipientsType, java.lang.String documentId, java.lang.String name, java.lang.String sendType, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String recipientsDocId, java.lang.String recipientsList, java.util.Date sendDate) throws java.io.IOException;

	/**
	 * Create a new fax campaign
	 * Facultative parameters ? false
	 * @param recipientsType Method to set the campaign recipient
	 * @param documentId The id of the /me/document pdf you want to send
	 * @param name The name of the fax campaign
	 * @param sendType Sending type of the campaign
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign postBillingAccountFaxServiceNameCampaigns(java.lang.String recipientsType, java.lang.String documentId, java.lang.String name, java.lang.String sendType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Replace the phone by its spare. The broken phone became a spare if it was bought. An RMA is created if the broken phone is under securitydeposit.
	 * Facultative parameters ? false
	 * @param domain The phone to replace by the spare
	 * @param ip Public ip of the phone
	 * @param spare The internal name of your spare
	*/
	void postSpareSpareReplace(java.lang.String domain, java.lang.String ip, java.lang.String spare) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign getBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Screenlist conditions checked when executing the extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

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
	 * Change the feature type of the phone number
	 * Facultative parameters ? false
	 * @param featureType The new feature of the number
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountNumberServiceNameChangeFeatureType(java.lang.String featureType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Make a participant undeaf your conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdUndeaf(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param identifier Generated call identifier
	*/
	net.zyuiop.ovhapi.api.objects.telephony.CallsGenerated getBillingAccountLineServiceNameAutomaticCallIdentifier(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String identifier) throws java.io.IOException;

	/**
	 * Intercept a non answered call
	 * Facultative parameters ? false
	 * @param number Phone number that will be called and that will intercept the communication
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdIntercept(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get the status of the voicemail. Available only if the line has fax capabilities
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String getBillingAccountVoicemailServiceNameSettingsRouting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	*/
	void putBillingAccount(net.zyuiop.ovhapi.api.objects.telephony.BillingAccount param0, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Rsva getBillingAccountRsvaServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param abbreviatedNumber The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	*/
	void putBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber param0, java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param keyNum The number of the function key
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FunctionKey getBillingAccountLineServiceNamePhoneFunctionKeyKeyNum(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException;

	/**
	 * Mute a participant in your conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdMute(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.ScreenList getBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Menu entry
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	long[] getBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * Previous billed consumptions
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.util.Date[] getBillingAccountHistoryConsumption(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountDdiServiceName(net.zyuiop.ovhapi.api.objects.telephony.Ddi param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a task to reboot the phone
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNamePhoneReboot(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	*/
	void putBillingAccountServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	void putBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * Create a new rule for an extension
	 * Facultative parameters ? true
	 * @param negativeAction If true, the rule will be executed only when the result of the conditions is false
	 * @param action The action made by the rule
	 * @param position The position of the rule in the extension (the rules are executed following this order)
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param actionParam The parameter of the chosen action
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(boolean negativeAction, java.lang.String action, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, java.lang.String actionParam) throws java.io.IOException;

	/**
	 * Create a new rule for an extension
	 * Facultative parameters ? false
	 * @param negativeAction If true, the rule will be executed only when the result of the conditions is false
	 * @param action The action made by the rule
	 * @param position The position of the rule in the extension (the rules are executed following this order)
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(boolean negativeAction, java.lang.String action, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.GenericScreen getBillingAccountTimeConditionServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	*/
	void putBillingAccountPhonebookBookKey(net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster param0, java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException;

	/**
	 * Create a new agent
	 * Facultative parameters ? false
	 * @param wrapUpTime The wrap up time (in seconds) after the calls
	 * @param number The number of the agent
	 * @param simultaneousLines The maximum of simultaneous calls that the agent will receive from the hunting
	 * @param status The current status of the agent
	 * @param timeout The waiting timeout (in seconds) before hangup for an assigned called
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent postBillingAccountEasyHuntingServiceNameHuntingAgent(long wrapUpTime, java.lang.String number, long simultaneousLines, java.lang.String status, long timeout, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given abbreviated number
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param abbreviatedNumber The abbreviated number which must start with "2" and must have a length of 3 or 4 digits
	*/
	void deleteBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent getBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * New scheduled rate code related to this sva
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation getBillingAccountRsvaServiceNameScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.VoicemailGreetings getBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get all available geographic zone from a country
	 * Facultative parameters ? false
	 * @param country The country
	*/
	java.lang.String[] getNumberZones(java.lang.String country) throws java.io.IOException;

	/**
	 * Unmute a participant in your conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdUnmute(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Conferences associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountConference(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountVoicemailServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountEasyPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.EasyPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Scheduled events
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountScheduler(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * OVH easy calls queues associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountEasyHunting(java.lang.String billingAccount) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountEasyHuntingServiceNameScreenListConditions(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all available line offer compatible
	 * Facultative parameters ? false
	 * @param country The country
	*/
	net.zyuiop.ovhapi.api.objects.telephony.LineOffer[] getLineOffers(java.lang.String country) throws java.io.IOException;

	/**
	 * Hangup a call
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdHangup(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get realtime conference informations
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.ConferenceInformations getBillingAccountConferenceServiceNameInformations(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Vxml numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountVxml(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact getBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException;


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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue getBillingAccountEasyHuntingServiceNameHuntingQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Previous billed consumption files
	 * Facultative parameters ? false
	 * @param extension Document suffix
	 * @param billingAccount The name of your billingAccount
	 * @param date null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryConsumptionDateFile(java.lang.String extension, java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

	/**
	 * Faxes associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountFax(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * OVH calls queues and OVH IVRs (Interactive Voice Response) associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountOvhPabx(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Delete the given dialplan
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	void deleteBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;

	/**
	 * Agent assigned to the queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	long[] getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Agent assigned to the queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentId null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException;

	/**
	 * Previous repayment bill
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.util.Date[] getBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Dialplans associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplan(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given menu
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param menuId null
	*/
	void deleteBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting getBillingAccountOvhPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

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
	 * Get the csv document
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param date date of the bill
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryTollfreeConsumptionDateDocument(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

	/**
	 * Create a specific rma
	 * Facultative parameters ? true
	 * @param type Typology process of merchandise return
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param newMerchandise New merchandise brand in case of exchange
	 * @param shippingContact Specific contact shipping in case of exchange
	*/
	net.zyuiop.ovhapi.api.objects.telephony.RmaReturn postBillingAccountLineServiceNamePhoneRma(java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String newMerchandise, net.zyuiop.ovhapi.api.objects.telephony.Contact shippingContact) throws java.io.IOException;

	/**
	 * Create a specific rma
	 * Facultative parameters ? false
	 * @param type Typology process of merchandise return
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.RmaReturn postBillingAccountLineServiceNamePhoneRma(java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new agent
	 * Facultative parameters ? false
	 * @param agentNumber The phone number of the agent
	 * @param position The position in the hunting
	 * @param logged True if the agent is logged
	 * @param noReplyTimer The maxium ringing time
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent postBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String agentNumber, long position, boolean logged, long noReplyTimer, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Portability getBillingAccountPortabilitiesId(java.lang.String billingAccount, double id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getBillingAccountServiceInfos(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Delete the agent
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param agentNumber The phone number of the agent
	*/
	void deleteBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException;

	/**
	 * Create a new screenlist condition for an extension
	 * Facultative parameters ? true
	 * @param screenListType Type of screenlist
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param callerIdNumber Add a screenlist based on the presented caller number
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions postBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String screenListType, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String callerIdNumber) throws java.io.IOException;

	/**
	 * Create a new screenlist condition for an extension
	 * Facultative parameters ? false
	 * @param screenListType Type of screenlist
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions postBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String screenListType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

	/**
	 * Extensions contained in the dialplan
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException;

	/**
	 * Sounds associated with this PABX
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountOvhPabxServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Send a fax
	 * Facultative parameters ? true
	 * @param pdfUrl Url of the pdf document you want to send
	 * @param recipients List of recipients of your fax
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dateSchedule If you want to schedule your fax later, you can specify a date
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountFaxServiceNameSettingsSendFax(java.lang.String pdfUrl, java.lang.String recipients, java.lang.String billingAccount, java.lang.String serviceName, java.util.Date dateSchedule) throws java.io.IOException;

	/**
	 * Send a fax
	 * Facultative parameters ? false
	 * @param pdfUrl Url of the pdf document you want to send
	 * @param recipients List of recipients of your fax
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountFaxServiceNameSettingsSendFax(java.lang.String pdfUrl, java.lang.String recipients, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting getBillingAccountEasyPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Previous billed consumptions document
	 * Facultative parameters ? false
	 * @param extension Document extension
	 * @param billingAccount The name of your billingAccount
	 * @param date null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryConsumptionDateDocument(java.lang.String extension, java.lang.String billingAccount, java.util.Date date) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param abbreviatedNumber The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	*/
	void putBillingAccountAbbreviatedNumberAbbreviatedNumber(net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup param0, java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue getBillingAccountOvhPabxServiceNameHuntingQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	void putBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistory getBillingAccountConferenceServiceNameHistoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountRedirectServiceName(net.zyuiop.ovhapi.api.objects.telephony.Redirect param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Hangup a call
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdHangup(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get the allowed creditThreshold for this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	double[] getBillingAccountAllowedCreditThreshold(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param consumptionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.FaxConsumption getBillingAccountServiceServiceNameFaxConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException;

	/**
	 * Eject a participant from your conference room
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdKick(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Agent assigned to the queue
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * List your past conferences for this number
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountConferenceServiceNameHistories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param agentId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException;

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
	 * Time conditions checked when executing the extension
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	*/
	long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTime(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException;

	/**
	 * Get all available spare brands
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpareBrands() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyPabx getBillingAccountEasyPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Line getBillingAccountLineServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings getBillingAccountEasyHuntingServiceNameTimeConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create a new dialplan
	 * Facultative parameters ? false
	 * @param showCallerNumber The presented number when bridging calls
	 * @param name The dialplan name
	 * @param transferTimeout The timeout (in seconds) when bridging calls
	 * @param anonymousRejection Reject (hangup) anonymous calls
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan postBillingAccountOvhPabxServiceNameDialplan(java.lang.String showCallerNumber, java.lang.String name, long transferTimeout, boolean anonymousRejection, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param consumptionId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.RepaymentConsumption getBillingAccountServiceServiceNameRepaymentConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException;

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
	 * Hunting agents
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	java.lang.String[] getBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the given record
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param id null
	*/
	void deleteBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param conditionId null
	*/
	void putBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions param0, java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException;

	/**
	 * Calls queues
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	long[] getBillingAccountEasyHuntingServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param dialplanId null
	 * @param extensionId null
	 * @param ruleId null
	*/
	void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException;

	/**
	 * Eavesdrop on a call
	 * Facultative parameters ? false
	 * @param number Phone number that will be called and bridged in the communication
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdEavesdrop(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties getBillingAccountVoicemailServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	 * @param queueId null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveStatistics(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException;

	/**
	 * Screenlist compatible numbers associated with this billing account
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	*/
	java.lang.String[] getBillingAccountScreen(java.lang.String billingAccount) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions getBillingAccountTimeConditionServiceNameOptions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Screen getBillingAccountScreenServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a phonebook contact
	 * Facultative parameters ? false
	 * @param billingAccount The name of your billingAccount
	 * @param bookKey Identifier of the phonebook
	 * @param id Contact identifier
	*/
	void deleteBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param billingAccount The name of your billingAccount
	 * @param serviceName null
	*/
	void putBillingAccountMiniPabxServiceNameTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException;

}
