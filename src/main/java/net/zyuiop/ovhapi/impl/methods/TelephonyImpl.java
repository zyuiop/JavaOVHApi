package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Telephony;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class TelephonyImpl implements Telephony { 

	private final OVHRawCalls client;

	public TelephonyImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/miniPabx/$serviceName/hunting/agent/$agentNumber
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveCalls/$id/whisper
	* Message : Missing identifier.
	*/


	public java.lang.String postBillingAccountFaxServiceNameSettingsNewPassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings/newPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/spare/$spare/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/rule/$ruleId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/voicemail/$serviceName
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountServiceServiceNameTask(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/task";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameTask(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/task";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionTime/$conditionId
	* Message : Missing identifier.
	*/


	public java.lang.String postBillingAccountLineServiceNameAutomaticCall(java.lang.String calledNumber, boolean isAnonymous, java.lang.String dialplan, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String playbackAudioFileDialplan, java.lang.String callingNumber, java.lang.String bridgeNumberDialplan, java.lang.String ttsTextDialplan, long timeout) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/automaticCall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("calledNumber", calledNumber);
		__dataMap.put("isAnonymous", isAnonymous);
		__dataMap.put("dialplan", dialplan);
		__dataMap.put("playbackAudioFileDialplan", playbackAudioFileDialplan);
		__dataMap.put("callingNumber", callingNumber);
		__dataMap.put("bridgeNumberDialplan", bridgeNumberDialplan);
		__dataMap.put("ttsTextDialplan", ttsTextDialplan);
		__dataMap.put("timeout", timeout);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String postBillingAccountLineServiceNameAutomaticCall(java.lang.String calledNumber, boolean isAnonymous, java.lang.String dialplan, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/automaticCall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("calledNumber", calledNumber);
		__dataMap.put("isAnonymous", isAnonymous);
		__dataMap.put("dialplan", dialplan);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/records";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long postBillingAccountVoicemailServiceNameGreetings(java.lang.String documentId, java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("documentId", documentId);
		__dataMap.put("dir", dir);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/voicemail/$serviceName/greetings/$id/download
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyRepaymentConsumption/$date/document
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/voicemail/$serviceName/settings
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountFaxServiceNameCampaigns(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/line/$serviceName/abbreviatedNumber
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountService(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/scheduler/$serviceName/events/$uid
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionTime/$conditionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/agent/$agentId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/line/$serviceName/phone/refreshScreen
	* Message : Missing identifier.
	*/


	public java.lang.String[] getSpare() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyPabx/$serviceName/hunting/tones
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/options
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionScreenList/$conditionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/phone/phonebook/$bookKey
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/timeCondition/$serviceName/options
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/fax/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/voiceConsumption/$consumptionId/callDiagnostics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/agent/$agentId
	* Message : Missing identifier.
	*/


	public java.util.Date[] getBillingAccountHistoryConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public void postBillingAccountCancelTermination(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/cancelTermination";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getNumberRanges(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/number/ranges";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent/$agentId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveCalls/$id/intercept
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveCalls/$id/hangup
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountScreenServiceNameScreenLists(java.lang.String callNumber, java.lang.String type, java.lang.String nature, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "/screenLists";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("callNumber", callNumber);
		__dataMap.put("type", type);
		__dataMap.put("nature", nature);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/lock
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/screenListConditions/conditions/$conditionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/screen/$serviceName/screenLists/$id
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameDialplan(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postBillingAccountLineServiceNameClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String callingNumber, boolean intercom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2Call";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("calledNumber", calledNumber);
		__dataMap.put("callingNumber", callingNumber);
		__dataMap.put("intercom", intercom);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountLineServiceNameClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2Call";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("calledNumber", calledNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent/$agentId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/scheduler/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/phonebook/$bookKey/phonebookContact/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveStatistics
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getBillingAccountLineServiceNamePhonePhonebook(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/directory/getDirectoryServiceCode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent/$agentId/queue/$queueId/liveStatus
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyPabx/$serviceName/hunting/agent/$agentNumber
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/vxml/$serviceName
	* Message : Missing identifier.
	*/


	public void deleteSpareSpare(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/redirect/$serviceName
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/sound/" + soundId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountVoicemailServiceNameSettingsChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountSchedulerServiceNameEvents(java.util.Date dateStart, java.lang.String category, java.util.Date dateEnd, java.lang.String title, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dateStart", dateStart);
		__dataMap.put("category", category);
		__dataMap.put("dateEnd", dateEnd);
		__dataMap.put("title", title);
		__dataMap.put("uid", uid);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountSchedulerServiceNameEvents(java.util.Date dateStart, java.lang.String category, java.util.Date dateEnd, java.lang.String title, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dateStart", dateStart);
		__dataMap.put("category", category);
		__dataMap.put("dateEnd", dateEnd);
		__dataMap.put("title", title);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions/conditions/$conditionId
	* Message : Missing identifier.
	*/


	public void postBillingAccountServiceServiceNameChangeOfBillingAccount(java.lang.String billingAccountDestination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/changeOfBillingAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("billingAccountDestination", billingAccountDestination);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountConference(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountLineServiceNameOptionsAvailableCodecs(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/options/availableCodecs";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/records/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/unlock
	* Message : Missing identifier.
	*/


	public void postBillingAccountVoicemailServiceNameGreetingsIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "/move";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dir", dir);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyPabx/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ddi/$serviceName
	* Message : Missing identifier.
	*/


	public double[] getBillingAccountPortabilities(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portabilities";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), double[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/directory
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountEasyHuntingServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/sound";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/historyRepaymentConsumption
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/historyRepaymentConsumption
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent/$agentId/queue/$queueId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/abbreviatedNumber
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/fax/offers
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/vxml/$serviceName/settings
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions/conditions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/directory/getWayTypes
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/miniPabx/$serviceName/hunting
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/eventToken
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountLineServiceNamePhoneMerchandiseAvailable(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/merchandiseAvailable";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/sound/$soundId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/screen/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountVoicemail(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/portabilities/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/abbreviatedNumber/$abbreviatedNumber
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getBillingAccountVoicemailServiceNameSettingsRouting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings/routing";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/phonebook/$bookKey
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/line/$serviceName/phone/reboot
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/ips
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveCalls/$id/intercept
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountScreen(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/spare/$spare/serviceInfos
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountTimeCondition(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountScreenServiceNameScreenLists(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "/screenLists";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyPabx/$serviceName/hunting/agent
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent/$agentId/queue
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/scheduler/$serviceName/events/$uid
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/phone/phonebook/$bookKey
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postBillingAccountFaxServiceNameCampaignsIdStop(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/miniPabx/$serviceName/hunting
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveCalls/$id/transfer
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/rsva/$serviceName/scheduleRateCode
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveCalls/$id/eavesdrop
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountLineServiceNamePhoneFunctionKeyKeyNumAvailableFunction(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/functionKey/" + keyNum + "/availableFunction";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "keyNum=" + keyNum;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/timeCondition/$serviceName/condition/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/participants/$id/energy
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/menu/$menuId
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent/$agentId/queue
	* Message : Missing identifier.
	*/


	public void postBillingAccountLineServiceNameClick2CallUserIdClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, long id, java.lang.String callingNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "/click2Call";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("calledNumber", calledNumber);
		__dataMap.put("callingNumber", callingNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountLineServiceNameClick2CallUserIdClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "/click2Call";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("calledNumber", calledNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountLineServiceNameClick2CallUserIdChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/eventToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/menu/$menuId/entry
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/menu/$menuId/entry
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyTollfreeConsumption/$date/document
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountVxml(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/vxml";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/fax/$serviceName/campaigns
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/fax/$serviceName/campaigns
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/line/$serviceName/tones/toneUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/phone/rma/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/voicemail/$serviceName/directories/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/soundUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/soundUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/participants/$id/mute
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/menu/$menuId/entry/$entryId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/phone/rma/$id
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyConsumption/$date/file
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyPabx/$serviceName/hunting
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/fax/$serviceName/campaigns/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/line/offer/phones
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/conference/$serviceName/participants/$id
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveCalls/$id/transfer
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/rule/$ruleId
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/phonebook/$bookKey/phonebookContact/$id
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/records";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTime(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/conference/$serviceName/histories/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountEasyPabx(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getBillingAccountTimeConditionServiceNameCondition(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/condition";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/miniPabx/$serviceName
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions/conditions/$conditionId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getSpareBrands() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/brands";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveStatistics
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/number/$serviceName/changeFeatureType
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/rsva/$serviceName/currentRateCode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/menu
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/rule
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/rule
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/conference/$serviceName/informations
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountAbbreviatedNumber(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountConferenceServiceNameParticipants(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/scheduler/$serviceName/importIcsCalendar
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/rsva/$serviceName/allowedRateCodes
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/agent/$agentId/liveStatus
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/line/offers
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/repaymentConsumption/$consumptionId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getNumberZones(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/number/zones";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/diagnosticReports
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTimeConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/sound";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/redirect/$serviceName/changeDestination
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/screenListConditions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/spare/$spare
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "bookKey=" + bookKey;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/screenListConditions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountScheduler(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/phone/phonebook/$bookKey/phonebookContact/$id
	* Message : Missing identifier.
	*/


	public void postSpareSpareReplace(java.lang.String domain, java.lang.String ip, java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "/replace";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("domain", domain);
		__dataMap.put("ip", ip);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/miniPabx/$serviceName/tones/toneUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionScreenList
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionScreenList
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/condition/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/agent/$agentId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ddi/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String postBillingAccountLineServiceNamePhonePhonebook(java.lang.String name, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "/screenLists/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "bookKey=" + bookKey;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/agent
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/previousVoiceConsumption/$consumptionId
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "menuId=" + menuId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getBillingAccountOvhPabx(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getBillingAccountVoicemailServiceNameDirectories(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String dir) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dir=" + dir;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountVoicemailServiceNameDirectories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/miniPabx/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountEasyHuntingServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent/$agentId
	* Message : Missing identifier.
	*/


	public java.util.Date[] getBillingAccountHistoryTollfreeConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyTollfreeConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/voicemail/$serviceName/greetings/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyConsumption/$date
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountServiceServiceNameFaxConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/faxConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		__data += "wayType=" + wayType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameFaxConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/faxConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId
	* Message : Missing identifier.
	*/


	public void deleteBillingAccount(java.lang.String reason, java.lang.String billingAccount, java.lang.String details) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccount(java.lang.String reason, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountMiniPabx(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postBillingAccountTimeConditionServiceNameCondition(java.lang.String hourEnd, java.lang.String policy, java.lang.String day, java.lang.String hourBegin, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/condition";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("hourEnd", hourEnd);
		__dataMap.put("policy", policy);
		__dataMap.put("day", day);
		__dataMap.put("hourBegin", hourBegin);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/miniPabx/$serviceName/tones
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/sound/$soundId
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyPabx/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/tones
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountLineServiceNamePhoneFunctionKey(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/functionKey";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/voicemail/$serviceName/directories/$id/download
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountLine(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountLineServiceNameAutomaticCall(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/automaticCall";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveCalls/$id/eavesdrop
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/phone/functionKey/$keyNum
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/miniPabx/$serviceName/tones
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/soundUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/soundUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/timeCondition/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyPabx/$serviceName/hunting/tones/toneUpload
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/voiceConsumption/$consumptionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/abbreviatedNumber/$abbreviatedNumber
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountServiceServiceName(java.lang.String reason, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String details) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountServiceServiceName(java.lang.String reason, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/phone/phonebook/$bookKey/phonebookContact/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/redirect/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/agent/$agentId/liveStatus
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/line/$serviceName/phone/rma
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/line/$serviceName/phone/rma
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/phonebook/$bookKey
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/options
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/records/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/screenListConditions/conditions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/screenListConditions/conditions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/menu/$menuId/entry/$entryId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/fax/$serviceName/settings
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/service/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountPhonebook(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String postBillingAccountServiceServiceNameEventToken(java.lang.String expiration, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/eventToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("expiration", expiration);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/click2CallUser/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/miniPabx/$serviceName/hunting/agent
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/faxConsumption/$consumptionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/agent/$agentId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountEasyHunting(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/voicemail/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/number/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent/$agentId
	* Message : Missing identifier.
	*/


	public void postBillingAccountVoicemailServiceNameSettingsChangeRouting(java.lang.String routing, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings/changeRouting";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("routing", routing);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveCalls/$id/hangup
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName/phone/functionKey/$keyNum
	* Message : Missing identifier.
	*/


	public java.lang.String postBillingAccountFaxServiceNameSettingsChangePassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyPabx/$serviceName/hunting/tones
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/service/$serviceName/directory
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/records/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountSchedulerServiceNameEvents(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date dateEndFrom, java.util.Date dateStartTo, java.util.Date dateEndTo, java.util.Date dateStartFrom, java.lang.String categories) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dateEnd.from=" + dateEndFrom;
		__data += "dateStart.to=" + dateStartTo;
		__data += "dateEnd.to=" + dateEndTo;
		__data += "dateStart.from=" + dateStartFrom;
		__data += "categories=" + categories;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountSchedulerServiceNameEvents(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ddi/$serviceName/changeDestination
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/records/$id
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String screenListType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "screenListType=" + screenListType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameMenu(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "/compatibleReplacement";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyPabx/$serviceName/hunting/agent/$agentNumber
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/conference/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String[] getTelephony() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/telephony";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionTime
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/number/specificNumbers
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/number/specificNumbers
	* Message : Missing identifier.
	*/


	public void postBillingAccountFaxServiceNameCampaignsIdStart(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/agent
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/menu/$menuId
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountConferenceServiceNameHistories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/histories";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public double[] getBillingAccountAllowedCreditThreshold(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/allowedCreditThreshold";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), double[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/phone
	* Message : Missing identifier.
	*/


	public void postBillingAccountVoicemailServiceNameDirectoriesIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "/move";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dir", dir);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long postBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String bookKey, java.lang.String homeMobile, java.lang.String workMobile, java.lang.String homePhone, java.lang.String workPhone) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("group", group);
		__dataMap.put("name", name);
		__dataMap.put("surname", surname);
		__dataMap.put("homeMobile", homeMobile);
		__dataMap.put("workMobile", workMobile);
		__dataMap.put("homePhone", homePhone);
		__dataMap.put("workPhone", workPhone);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}

	public long postBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("group", group);
		__dataMap.put("name", name);
		__dataMap.put("surname", surname);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/service/$serviceName/eventToken
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/participants/$id/unmute
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/participants/$id/deaf
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyTollfreeConsumption/$date
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/vxml/$serviceName/settings
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String policy) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "policy=" + policy;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/sound/" + soundId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountRsva(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent/$agentId/queue/$queueId/liveStatus
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName
	* Message : Missing identifier.
	*/


	public void postBillingAccountServiceServiceNameCancelTermination(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/cancelTermination";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getAccessories(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/accessories";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String postBillingAccountEventToken(java.lang.String expiration, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/eventToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("expiration", expiration);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/fax/$serviceName/campaigns/$id/detail
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveCalls/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/queue/$queueId/liveCalls/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/scheduler/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/number/$serviceName
	* Message : Missing identifier.
	*/


	public void postBillingAccountRsvaServiceNameCancelScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "/cancelScheduledRateCode";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent/$agentId/queue/$queueId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/fax/$serviceName/settings/sendFax
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/fax/$serviceName/settings/sendFax
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/fax/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/voicemail/$serviceName/settings
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountServiceServiceNameVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String planType, java.lang.String destinationType, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/voiceConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "planType=" + planType;
		__data += "destinationType=" + destinationType;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		__data += "wayType=" + wayType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/voiceConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/automaticCall/$identifier
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/miniPabx/$serviceName/hunting/agent/$agentNumber
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/abbreviatedNumber/$abbreviatedNumber
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/conference/$serviceName/settings
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/statistics
	* Message : Missing identifier.
	*/


	public long postBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, java.lang.String homeMobile, java.lang.String workMobile, java.lang.String homePhone, java.lang.String workPhone) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("group", group);
		__dataMap.put("name", name);
		__dataMap.put("surname", surname);
		__dataMap.put("homeMobile", homeMobile);
		__dataMap.put("workMobile", workMobile);
		__dataMap.put("homePhone", homePhone);
		__dataMap.put("workPhone", workPhone);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}

	public long postBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("group", group);
		__dataMap.put("name", name);
		__dataMap.put("surname", surname);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}

	public void deleteBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/eventToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/timeCondition/$serviceName/options
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/queue/$queueId/liveCalls/$id/whisper
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan
	* Message : Missing identifier.
	*/


	public java.util.Date[] getBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyRepaymentConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public java.lang.String[] getBillingAccountFax(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountLineServiceNameAvailableSipDomains(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/availableSipDomains";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountDdi(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ddi";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postBillingAccountVoicemailServiceNameMigrateOnNewVersion(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/migrateOnNewVersion";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountLineServiceNamePhoneRma(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/rma";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/abbreviatedNumber/$abbreviatedNumber
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountLineServiceNameClick2CallUser(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyConsumption/$date/document
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/serviceInfos
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/fax/$serviceName/settings
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/hunting/agent/$agentId/queue/$queueId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/participants/$id/undeaf
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/screenListConditions/conditions/$conditionId
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountServiceServiceNameRepaymentConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/repaymentConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameRepaymentConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/repaymentConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/rsva/$serviceName/scheduledRateCode
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/conference/$serviceName/settings
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyPabx/$serviceName/hunting
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/hunting/agent/$agentId/queue/$queueId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/screen/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/line/$serviceName
	* Message : Missing identifier.
	*/


	public long[] getBillingAccountVoicemailServiceNameGreetings(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String dir) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dir=" + dir;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountVoicemailServiceNameGreetings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/historyRepaymentConsumption/$date
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountRedirect(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/redirect";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/conference/$serviceName/participants/$id/kick
	* Message : Missing identifier.
	*/


	public long postBillingAccountLineServiceNameClick2CallUser(java.lang.String password, java.lang.String login, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("login", login);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long.class);
	}

	public long[] getBillingAccountServiceServiceNamePreviousVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String planType, java.lang.String destinationType, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/previousVoiceConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "planType=" + planType;
		__data += "destinationType=" + destinationType;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		__data += "wayType=" + wayType;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNamePreviousVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/previousVoiceConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/rsva/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String postBillingAccountPhonebook(java.lang.String name, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/tones
	* Message : Missing identifier.
	*/


	public java.lang.String[] getBillingAccountNumber(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/number";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
