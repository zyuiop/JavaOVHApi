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

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber getBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber.class);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountServiceServiceNamePreviousVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String planType, java.lang.String destinationType, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/previousVoiceConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNamePreviousVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/previousVoiceConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getNumberRanges(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/number/ranges";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountVoicemailServiceNameGreetingsIdDownload(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "/download";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public java.lang.String getBillingAccountEasyPabx(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Phone getBillingAccountLineServiceNamePhone(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Phone.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent getBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions/" + conditionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/sound/" + soundId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountLineServiceNamePhoneRma(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/rma";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getSpare() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VoiceConsumption getBillingAccountServiceServiceNameVoiceConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/voiceConsumption/" + consumptionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.VoiceConsumption.class);
	}

	public void postBillingAccountServiceServiceNameCancelTermination(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/cancelTermination";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Voicemail getBillingAccountVoicemailServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Voicemail.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountCancelTermination(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/cancelTermination";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountMiniPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.MiniPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("queueId", queueId);
		dataMap.put("position", position);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EventToken getBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/eventToken";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EventToken.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu postBillingAccountOvhPabxServiceNameMenu(java.lang.String name, long invalidSound, long greetSound, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		dataMap.put("invalidSound", invalidSound);
		dataMap.put("greetSound", greetSound);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu.class);
	}

	public long[] getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/soundUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/soundUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Fax getBillingAccountFaxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Fax.class);
	}

	public void putBillingAccountEasyPabxServiceNameHunting(net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountLineServiceNameTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/tones";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountConferenceServiceNameParticipants(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void postBillingAccountLineServiceNameClick2CallUserIdChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public void postBillingAccountTimeConditionServiceNameCondition(java.lang.String hourEnd, java.lang.String policy, java.lang.String day, java.lang.String hourBegin, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "/condition";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("hourEnd", hourEnd);
		dataMap.put("policy", policy);
		dataMap.put("day", day);
		dataMap.put("hourBegin", hourBegin);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.LineOptions getBillingAccountLineServiceNameOptions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/options";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.LineOptions.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionTime/$conditionId
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameUnlock(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/unlock";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public java.lang.String getAccessories(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/accessories";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.MiniPabx getBillingAccountMiniPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.MiniPabx.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameMenu(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EventToken getBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/eventToken";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EventToken.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountDdiServiceNameChangeDestination(java.lang.String destination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ddi/" + serviceName + "/changeDestination";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("destination", destination);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry getBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent getBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DirectoryHeadingPJ getBillingAccountServiceServiceNameDirectoryGetDirectoryServiceCode(java.lang.String apeCode, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/directory/getDirectoryServiceCode";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DirectoryHeadingPJ.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting getBillingAccountMiniPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceParticipants getBillingAccountConferenceServiceNameParticipantsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceParticipants.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting getBillingAccountEasyHuntingServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption postBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount, java.lang.String billingNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyRepaymentConsumption";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("billingNumber", billingNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption postBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyRepaymentConsumption";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption.class);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountServiceServiceName(net.zyuiop.ovhapi.api.objects.telephony.TelephonyService param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountMiniPabxServiceNameHunting(net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountLineServiceNamePhoneFunctionKey(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/functionKey";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/records";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountOvhPabxServiceNameMenuMenuId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu param0, java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getSpareSpareServiceInfos(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, java.lang.String callerIdNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("callerIdNumber", callerIdNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList.class);
	}

	public void putBillingAccountLineServiceName(net.zyuiop.ovhapi.api.objects.telephony.Line param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PreviousVoiceConsumption getBillingAccountServiceServiceNamePreviousVoiceConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/previousVoiceConsumption/" + consumptionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PreviousVoiceConsumption.class);
	}

	public java.lang.String getBillingAccountMiniPabx(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putBillingAccountLineServiceNamePhoneFunctionKeyKeyNum(net.zyuiop.ovhapi.api.objects.telephony.FunctionKey param0, java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/functionKey/" + keyNum + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryRepaymentConsumptionDateDocument(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyRepaymentConsumption/" + date + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public long[] getBillingAccountServiceServiceNameRepaymentConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/repaymentConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameRepaymentConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/repaymentConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void postBillingAccountSchedulerServiceNameEvents(java.util.Date dateStart, java.lang.String category, java.util.Date dateEnd, java.lang.String title, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dateStart", dateStart);
		dataMap.put("category", category);
		dataMap.put("dateEnd", dateEnd);
		dataMap.put("title", title);
		dataMap.put("uid", uid);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountSchedulerServiceNameEvents(java.util.Date dateStart, java.lang.String category, java.util.Date dateEnd, java.lang.String title, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dateStart", dateStart);
		dataMap.put("category", category);
		dataMap.put("dateEnd", dateEnd);
		dataMap.put("title", title);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions getBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdDeaf(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/deaf";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNameTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/tones/toneUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.util.Date getBillingAccountHistoryTollfreeConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyTollfreeConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.util.Date.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/soundUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/soundUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties getBillingAccountConferenceServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/settings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties.class);
	}

	public void putBillingAccountLineServiceNamePhonePhonebookBookKey(net.zyuiop.ovhapi.api.objects.telephony.Phonebook param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings getBillingAccountEasyHuntingServiceNameScreenListConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings.class);
	}

	public java.lang.String getBillingAccountRsva(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameTask(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameTask(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountFaxServiceNameCampaigns(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent getBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("queueId", queueId);
		dataMap.put("position", position);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public long[] getBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long postBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, java.lang.String homeMobile, java.lang.String workMobile, java.lang.String homePhone, java.lang.String workPhone) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("group", group);
		dataMap.put("name", name);
		dataMap.put("surname", surname);
		dataMap.put("homeMobile", homeMobile);
		dataMap.put("workMobile", workMobile);
		dataMap.put("homePhone", homePhone);
		dataMap.put("workPhone", workPhone);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}

	public long postBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("group", group);
		dataMap.put("name", name);
		dataMap.put("surname", surname);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}

	public void deleteBillingAccountServiceServiceName(java.lang.String reason, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String details) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountServiceServiceName(java.lang.String reason, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountSchedulerServiceName(net.zyuiop.ovhapi.api.objects.telephony.Scheduler param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry postBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String action, long position, java.lang.String dtmf, java.lang.String billingAccount, java.lang.String serviceName, long menuId, java.lang.String actionParam) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("action", action);
		dataMap.put("position", position);
		dataMap.put("dtmf", dtmf);
		dataMap.put("actionParam", actionParam);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry postBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String action, long position, java.lang.String dtmf, java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("action", action);
		dataMap.put("position", position);
		dataMap.put("dtmf", dtmf);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveStatistics(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveStatistics";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/records/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DirectoryWayType getBillingAccountServiceServiceNameDirectoryGetWayTypes(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/directory/getWayTypes";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DirectoryWayType.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RateCodeInformation getBillingAccountRsvaServiceNameAllowedRateCodes(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva/" + serviceName + "/allowedRateCodes";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.RateCodeInformation.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountOvhPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.OvhPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdWhisper(java.lang.String whisperingMode, java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/whisper";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("whisperingMode", whisperingMode);
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties getBillingAccountVxmlServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/vxml/" + serviceName + "/settings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties.class);
	}

	public void deleteBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String postBillingAccountFaxServiceNameSettingsChangePassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/settings/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdTransfer(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/transfer";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabx getBillingAccountOvhPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabx.class);
	}

	public void putBillingAccountEasyHuntingServiceNameTimeConditions(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountVoicemailServiceNameSettingsChangeRouting(java.lang.String routing, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/settings/changeRouting";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("routing", routing);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "/liveStatus";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public void putBillingAccountFaxServiceName(net.zyuiop.ovhapi.api.objects.telephony.Fax param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountEasyHuntingServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/records";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList/" + conditionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Scheduler getBillingAccountSchedulerServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Scheduler.class);
	}

	public void postBillingAccountVoicemailServiceNameMigrateOnNewVersion(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/migrateOnNewVersion";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameLock(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/lock";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdIntercept(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/intercept";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void postBillingAccountFaxServiceNameCampaignsIdStart(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/start";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountVoicemail(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteBillingAccount(java.lang.String reason, java.lang.String billingAccount, java.lang.String details) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccount(java.lang.String reason, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.LinePhone getLineOfferPhones(java.lang.String country, java.lang.String offer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/line/offer/phones";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.LinePhone.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent getBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public java.lang.String postBillingAccountFaxServiceNameSettingsNewPassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/settings/newPassword";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postBillingAccountEventToken(java.lang.String expiration, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/eventToken";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("expiration", expiration);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls.class);
	}

	public long[] getBillingAccountScreenServiceNameScreenLists(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen/" + serviceName + "/screenLists";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountTimeConditionServiceNameOptions(net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "/options";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxProperties getBillingAccountFaxServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/settings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxProperties.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCalls(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/sound/" + soundId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountSchedulerServiceNameEventsUid(net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountLineServiceNameOptions(net.zyuiop.ovhapi.api.objects.telephony.LineOptions param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/options";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountPhonebook(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountEasyPabxServiceNameHuntingTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/tones";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Tones.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule.class);
	}

	public java.lang.String getTelephony() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//telephony";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.BillingAccount getBillingAccount(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.BillingAccount.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup postBillingAccountAbbreviatedNumber(java.lang.String destinationNumber, long abbreviatedNumber, java.lang.String name, java.lang.String surname, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/abbreviatedNumber";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("destinationNumber", destinationNumber);
		dataMap.put("abbreviatedNumber", abbreviatedNumber);
		dataMap.put("name", name);
		dataMap.put("surname", surname);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountMiniPabxServiceNameTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/tones";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Tones.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber postBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String destinationNumber, long abbreviatedNumber, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("destinationNumber", destinationNumber);
		dataMap.put("abbreviatedNumber", abbreviatedNumber);
		dataMap.put("name", name);
		dataMap.put("surname", surname);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.TimeCondition getBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "/condition/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.TimeCondition.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo getBillingAccountServiceServiceNameDirectory(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/directory";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VoicemailMessages getBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.VoicemailMessages.class);
	}

	public java.lang.String getBillingAccountLineServiceNameAvailableSipDomains(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/availableSipDomains";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdEavesdrop(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/eavesdrop";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Phonebook getBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Phonebook.class);
	}

	public java.lang.String getBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdWhisper(java.lang.String whisperingMode, java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/whisper";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("whisperingMode", whisperingMode);
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("queueId", queueId);
		dataMap.put("position", position);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public java.lang.String getBillingAccountDdi(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ddi";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putBillingAccountVxmlServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/vxml/" + serviceName + "/settings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionTime/$conditionId
	* Message : Missing identifier.
	*/


	public void postBillingAccountServiceServiceNameChangeOfBillingAccount(java.lang.String billingAccountDestination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/changeOfBillingAccount";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("billingAccountDestination", billingAccountDestination);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHunting getBillingAccountEasyHuntingServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHunting.class);
	}

	public java.lang.String getBillingAccountService(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup getBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup.class);
	}

	public void putBillingAccountPhonebookBookKeyPhonebookContactId(net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact param0, java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions/conditions
	* Message : Missing identifier.
	*/


	public void putBillingAccountLineServiceNamePhoneRmaId(net.zyuiop.ovhapi.api.objects.telephony.Rma param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/rma/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTimeConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime/" + conditionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountEasyPabxServiceNameHuntingTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/tones";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/line/$serviceName/statistics
	* Message : Missing identifier.
	*/


	public void putBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList/" + conditionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList.class);
	}

	public void deleteBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "/condition/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String postBillingAccountPhonebook(java.lang.String name, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption getBillingAccountHistoryRepaymentConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyRepaymentConsumption/" + date + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String policy) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountServiceServiceNameDirectory(net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/directory";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Number getBillingAccountNumberServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/number/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Number.class);
	}

	public java.lang.String getBillingAccountTimeCondition(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation postBillingAccountRsvaServiceNameScheduleRateCode(java.lang.String rateCode, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva/" + serviceName + "/scheduleRateCode";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("rateCode", rateCode);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation.class);
	}

	public void postBillingAccountVoicemailServiceNameGreetingsIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "/move";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dir", dir);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountLine(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postBillingAccountLineServiceNamePhonePhonebook(java.lang.String name, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountMiniPabxServiceNameTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/tones/toneUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountLineServiceNameTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/tones";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Tones.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Vxml getBillingAccountVxmlServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/vxml/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Vxml.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "/liveStatus";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber getNumberSpecificNumbers(java.lang.String country, java.lang.String type, java.lang.String zone, java.lang.String range) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/number/specificNumbers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber getNumberSpecificNumbers(java.lang.String country, java.lang.String type) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/number/specificNumbers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber.class);
	}

	public net.zyuiop.ovhapi.api.objects.spare.telephony.TelephonySpare getSpareSpare(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.spare.telephony.TelephonySpare.class);
	}

	public void postBillingAccountVoicemailServiceNameSettingsChangePassword(java.lang.String password, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/settings/changePassword";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteSpareSpare(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountLineServiceNamePhonePhonebook(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord getBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/records/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord.class);
	}

	public void putBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry param0, java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Ddi getBillingAccountDdiServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ddi/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Ddi.class);
	}

	public void postBillingAccountFaxServiceNameCampaignsIdStop(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/stop";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountLineServiceNameClick2CallUser(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getBillingAccountLineServiceNameAutomaticCall(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/automaticCall";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdEnergy(long value, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/energy";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("value", value);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Conference getBillingAccountConferenceServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Conference.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaignDetail getBillingAccountFaxServiceNameCampaignsIdDetail(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/detail";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaignDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNamePhoneRefreshScreen(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/refreshScreen";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound getBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/sound/" + soundId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound.class);
	}

	public void postBillingAccountRsvaServiceNameCancelScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva/" + serviceName + "/cancelScheduledRateCode";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountVoicemailServiceNameDirectories(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String dir) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/directories";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountVoicemailServiceNameDirectories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/directories";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DatetimeAndIpvalue getBillingAccountLineServiceNameIps(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/ips";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DatetimeAndIpvalue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.LineOffer getFaxOffers(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/fax/offers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.LineOffer.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DiagnosticReport getBillingAccountServiceServiceNameDiagnosticReports(java.lang.String dayInterval, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/diagnosticReports";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DiagnosticReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Rma getBillingAccountLineServiceNamePhoneRmaId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/rma/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Rma.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster getBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics getBillingAccountServiceServiceNameVoiceConsumptionConsumptionIdCallDiagnostics(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/voiceConsumption/" + consumptionId + "/callDiagnostics";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics.class);
	}

	public long[] getBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountLineServiceNamePhoneMerchandiseAvailable(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/merchandiseAvailable";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putBillingAccountEasyHuntingServiceName(net.zyuiop.ovhapi.api.objects.telephony.EasyHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task getBillingAccountServiceServiceNameTaskTaskId(java.lang.String billingAccount, java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/task/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountScreenServiceName(net.zyuiop.ovhapi.api.objects.telephony.Screen param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public void putBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryConsumption getBillingAccountHistoryConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyConsumption/" + date + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryConsumption.class);
	}

	public void postBillingAccountScreenServiceNameScreenLists(java.lang.String callNumber, java.lang.String type, java.lang.String nature, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen/" + serviceName + "/screenLists";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("callNumber", callNumber);
		dataMap.put("type", type);
		dataMap.put("nature", nature);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound getBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/sound/" + soundId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound.class);
	}

	public void deleteBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/eventToken";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountFaxServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.FaxProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/settings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(boolean enable, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, java.lang.String screenListType, java.lang.String schedulerCategory) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("enable", enable);
		dataMap.put("position", position);
		dataMap.put("screenListType", screenListType);
		dataMap.put("schedulerCategory", schedulerCategory);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(boolean enable, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("enable", enable);
		dataMap.put("position", position);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent postBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String agentNumber, long position, boolean logged, long noReplyTimer, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("agentNumber", agentNumber);
		dataMap.put("position", position);
		dataMap.put("logged", logged);
		dataMap.put("noReplyTimer", noReplyTimer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public java.lang.String getBillingAccountRedirect(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/redirect";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public double[] getBillingAccountPortabilities(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/portabilities";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), double[].class);
	}

	public void deleteBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/eventToken";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountTimeConditionServiceNameCondition(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "/condition";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent postBillingAccountOvhPabxServiceNameHuntingAgent(long wrapUpTime, java.lang.String number, long simultaneousLines, java.lang.String status, long timeout, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("wrapUpTime", wrapUpTime);
		dataMap.put("number", number);
		dataMap.put("simultaneousLines", simultaneousLines);
		dataMap.put("status", status);
		dataMap.put("timeout", timeout);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountVoicemailServiceNameDirectoriesIdDownload(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "/download";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountVoicemailServiceName(net.zyuiop.ovhapi.api.objects.telephony.Voicemail param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountLineServiceNamePhoneFunctionKeyKeyNumAvailableFunction(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/functionKey/" + keyNum + "/availableFunction";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryTollfreeConsumption getBillingAccountHistoryTollfreeConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyTollfreeConsumption/" + date + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryTollfreeConsumption.class);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountSchedulerServiceNameImportIcsCalendar(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/importIcsCalendar";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Redirect getBillingAccountRedirectServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/redirect/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Redirect.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu getBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu.class);
	}

	public java.lang.String getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/compatibleReplacement";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("queueId", queueId);
		dataMap.put("position", position);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public void putBillingAccountNumberServiceName(net.zyuiop.ovhapi.api.objects.telephony.Number param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/number/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen/" + serviceName + "/screenLists/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountAbbreviatedNumber(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/abbreviatedNumber";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdTransfer(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/transfer";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan getBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan.class);
	}

	public java.lang.String getBillingAccountLineServiceNameOptionsAvailableCodecs(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/options/availableCodecs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountRedirectServiceNameChangeDestination(java.lang.String destination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/redirect/" + serviceName + "/changeDestination";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("destination", destination);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void deleteBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountEasyHuntingServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/sound";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord getBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/records/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord.class);
	}

	public long postBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String bookKey, java.lang.String homeMobile, java.lang.String workMobile, java.lang.String homePhone, java.lang.String workPhone) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("group", group);
		dataMap.put("name", name);
		dataMap.put("surname", surname);
		dataMap.put("homeMobile", homeMobile);
		dataMap.put("workMobile", workMobile);
		dataMap.put("homePhone", homePhone);
		dataMap.put("workPhone", workPhone);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}

	public long postBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String group, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("group", group);
		dataMap.put("name", name);
		dataMap.put("surname", surname);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.TelephonyService getBillingAccountServiceServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.TelephonyService.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Click2CallUser getBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Click2CallUser.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation getBillingAccountRsvaServiceNameCurrentRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva/" + serviceName + "/currentRateCode";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountLineServiceNameClick2CallUserIdClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, long id, java.lang.String callingNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "/click2Call";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("calledNumber", calledNumber);
		dataMap.put("callingNumber", callingNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountLineServiceNameClick2CallUserIdClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "/click2Call";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("calledNumber", calledNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public java.lang.String postBillingAccountServiceServiceNameEventToken(java.lang.String expiration, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/eventToken";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("expiration", expiration);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putBillingAccountConferenceServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/settings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putSpareSpareServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyPabxServiceNameHuntingTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/tones/toneUpload";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("url", url);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public java.lang.String getBillingAccountNumber(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/number";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign postBillingAccountFaxServiceNameCampaigns(java.lang.String recipientsType, java.lang.String documentId, java.lang.String name, java.lang.String sendType, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String recipientsDocId, java.lang.String recipientsList, java.util.Date sendDate) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("recipientsType", recipientsType);
		dataMap.put("documentId", documentId);
		dataMap.put("name", name);
		dataMap.put("sendType", sendType);
		dataMap.put("recipientsDocId", recipientsDocId);
		dataMap.put("recipientsList", recipientsList);
		dataMap.put("sendDate", sendDate);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign postBillingAccountFaxServiceNameCampaigns(java.lang.String recipientsType, java.lang.String documentId, java.lang.String name, java.lang.String sendType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("recipientsType", recipientsType);
		dataMap.put("documentId", documentId);
		dataMap.put("name", name);
		dataMap.put("sendType", sendType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign.class);
	}

	public void postSpareSpareReplace(java.lang.String domain, java.lang.String ip, java.lang.String spare) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/" + spare + "/replace";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("domain", domain);
		dataMap.put("ip", ip);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign getBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign.class);
	}

	public long[] getBillingAccountServiceServiceNameFaxConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/faxConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameFaxConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/faxConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String postBillingAccountLineServiceNameAutomaticCall(java.lang.String calledNumber, boolean isAnonymous, java.lang.String dialplan, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String playbackAudioFileDialplan, java.lang.String callingNumber, java.lang.String bridgeNumberDialplan, java.lang.String ttsTextDialplan, long timeout) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/automaticCall";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("calledNumber", calledNumber);
		dataMap.put("isAnonymous", isAnonymous);
		dataMap.put("dialplan", dialplan);
		dataMap.put("playbackAudioFileDialplan", playbackAudioFileDialplan);
		dataMap.put("callingNumber", callingNumber);
		dataMap.put("bridgeNumberDialplan", bridgeNumberDialplan);
		dataMap.put("ttsTextDialplan", ttsTextDialplan);
		dataMap.put("timeout", timeout);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postBillingAccountLineServiceNameAutomaticCall(java.lang.String calledNumber, boolean isAnonymous, java.lang.String dialplan, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/automaticCall";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("calledNumber", calledNumber);
		dataMap.put("isAnonymous", isAnonymous);
		dataMap.put("dialplan", dialplan);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountNumberServiceNameChangeFeatureType(java.lang.String featureType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/number/" + serviceName + "/changeFeatureType";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("featureType", featureType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdUndeaf(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/undeaf";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.CallsGenerated getBillingAccountLineServiceNameAutomaticCallIdentifier(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String identifier) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/automaticCall/" + identifier + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.CallsGenerated.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdIntercept(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/intercept";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public java.lang.String getBillingAccountVoicemailServiceNameSettingsRouting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/settings/routing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getBillingAccountVoicemailServiceNameGreetings(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String dir) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountVoicemailServiceNameGreetings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccount(net.zyuiop.ovhapi.api.objects.telephony.BillingAccount param0, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Rsva getBillingAccountRsvaServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Rsva.class);
	}

	public void putBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber param0, java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FunctionKey getBillingAccountLineServiceNamePhoneFunctionKeyKeyNum(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/functionKey/" + keyNum + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FunctionKey.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdMute(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/mute";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /telephony/$billingAccount/ovhPabx/$serviceName/dialplan/$dialplanId/extension/$extensionId/conditionTime
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.telephony.ScreenList getBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen/" + serviceName + "/screenLists/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.ScreenList.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.util.Date getBillingAccountHistoryConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.util.Date.class);
	}

	public void putBillingAccountDdiServiceName(net.zyuiop.ovhapi.api.objects.telephony.Ddi param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ddi/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNamePhoneReboot(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/reboot";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(boolean negativeAction, java.lang.String action, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, java.lang.String actionParam) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("negativeAction", negativeAction);
		dataMap.put("action", action);
		dataMap.put("position", position);
		dataMap.put("actionParam", actionParam);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(boolean negativeAction, java.lang.String action, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("negativeAction", negativeAction);
		dataMap.put("action", action);
		dataMap.put("position", position);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.GenericScreen getBillingAccountTimeConditionServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.GenericScreen.class);
	}

	public void putBillingAccountPhonebookBookKey(net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster param0, java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent postBillingAccountEasyHuntingServiceNameHuntingAgent(long wrapUpTime, java.lang.String number, long simultaneousLines, java.lang.String status, long timeout, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("wrapUpTime", wrapUpTime);
		dataMap.put("number", number);
		dataMap.put("simultaneousLines", simultaneousLines);
		dataMap.put("status", status);
		dataMap.put("timeout", timeout);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public void deleteBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent getBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation getBillingAccountRsvaServiceNameScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/rsva/" + serviceName + "/scheduledRateCode";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VoicemailGreetings getBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.VoicemailGreetings.class);
	}

	public java.lang.String getNumberZones(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/number/zones";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdUnmute(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/unmute";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public java.lang.String getBillingAccountSchedulerServiceNameEvents(java.lang.String billingAccount, java.lang.String serviceName, java.util.Date dateEndFrom, java.util.Date dateStartTo, java.util.Date dateEndTo, java.util.Date dateStartFrom, java.lang.String categories) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getBillingAccountSchedulerServiceNameEvents(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler/" + serviceName + "/events";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getBillingAccountConference(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putBillingAccountVoicemailServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/settings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions/conditions/$conditionId
	* Message : Missing identifier.
	*/


	public void putBillingAccountEasyPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.EasyPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountScheduler(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/scheduler";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getBillingAccountEasyHunting(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long postBillingAccountVoicemailServiceNameGreetings(java.lang.String documentId, java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/greetings";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("documentId", documentId);
		dataMap.put("dir", dir);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}

	public void putBillingAccountEasyHuntingServiceNameScreenListConditions(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.LineOffer getLineOffers(java.lang.String country) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/line/offers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.LineOffer.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdHangup(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/hangup";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceInformations getBillingAccountConferenceServiceNameInformations(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/informations";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceInformations.class);
	}

	public java.lang.String getBillingAccountVxml(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/vxml";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact getBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /telephony/$billingAccount/easyHunting/$serviceName/timeConditions/conditions/$conditionId
	* Message : Missing identifier.
	*/


	public void deleteBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue getBillingAccountEasyHuntingServiceNameHuntingQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryConsumptionDateFile(java.lang.String extension, java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyConsumption/" + date + "/file";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public java.lang.String getBillingAccountFax(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getBillingAccountOvhPabx(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.util.Date getBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyRepaymentConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.util.Date.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplan(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting getBillingAccountOvhPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String screenListType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryTollfreeConsumptionDateDocument(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyTollfreeConsumption/" + date + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RmaReturn postBillingAccountLineServiceNamePhoneRma(java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String newMerchandise, net.zyuiop.ovhapi.api.objects.telephony.Contact shippingContact) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/rma";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("type", type);
		dataMap.put("newMerchandise", newMerchandise);
		dataMap.put("shippingContact", shippingContact);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.RmaReturn.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RmaReturn postBillingAccountLineServiceNamePhoneRma(java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/phone/rma";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.RmaReturn.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent postBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String agentNumber, long position, boolean logged, long noReplyTimer, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("agentNumber", agentNumber);
		dataMap.put("position", position);
		dataMap.put("logged", logged);
		dataMap.put("noReplyTimer", noReplyTimer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Portability getBillingAccountPortabilitiesId(java.lang.String billingAccount, double id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/portabilities/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Portability.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getBillingAccountServiceInfos(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void deleteBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions postBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String screenListType, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String callerIdNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("screenListType", screenListType);
		dataMap.put("callerIdNumber", callerIdNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions postBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String screenListType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("screenListType", screenListType);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "/liveStatus";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountOvhPabxServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/sound";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountFaxServiceNameSettingsSendFax(java.lang.String pdfUrl, java.lang.String recipients, java.lang.String billingAccount, java.lang.String serviceName, java.util.Date dateSchedule) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/settings/sendFax";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("pdfUrl", pdfUrl);
		dataMap.put("recipients", recipients);
		dataMap.put("dateSchedule", dateSchedule);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountFaxServiceNameSettingsSendFax(java.lang.String pdfUrl, java.lang.String recipients, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/fax/" + serviceName + "/settings/sendFax";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("pdfUrl", pdfUrl);
		dataMap.put("recipients", recipients);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting getBillingAccountEasyPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryConsumptionDateDocument(java.lang.String extension, java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/historyConsumption/" + date + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public void putBillingAccountAbbreviatedNumberAbbreviatedNumber(net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup param0, java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue getBillingAccountOvhPabxServiceNameHuntingQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue.class);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountLineServiceNameClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String callingNumber, boolean intercom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2Call";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("calledNumber", calledNumber);
		dataMap.put("callingNumber", callingNumber);
		dataMap.put("intercom", intercom);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postBillingAccountLineServiceNameClick2Call(java.lang.String calledNumber, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2Call";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("calledNumber", calledNumber);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistory getBillingAccountConferenceServiceNameHistoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/histories/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistory.class);
	}

	public void putBillingAccountRedirectServiceName(net.zyuiop.ovhapi.api.objects.telephony.Redirect param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/redirect/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdHangup(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/hangup";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public double[] getBillingAccountAllowedCreditThreshold(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/allowedCreditThreshold";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), double[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxConsumption getBillingAccountServiceServiceNameFaxConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/faxConsumption/" + consumptionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdKick(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/kick";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountConferenceServiceNameHistories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/conference/" + serviceName + "/histories";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "/liveStatus";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public long postBillingAccountLineServiceNameClick2CallUser(java.lang.String password, java.lang.String login, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "/click2CallUser";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("login", login);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTime(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getSpareBrands() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/spare/brands";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyPabx getBillingAccountEasyPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyPabx.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Line getBillingAccountLineServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/line/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Line.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings getBillingAccountEasyHuntingServiceNameTimeConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan postBillingAccountOvhPabxServiceNameDialplan(java.lang.String showCallerNumber, java.lang.String name, long transferTimeout, boolean anonymousRejection, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("showCallerNumber", showCallerNumber);
		dataMap.put("name", name);
		dataMap.put("transferTimeout", transferTimeout);
		dataMap.put("anonymousRejection", anonymousRejection);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RepaymentConsumption getBillingAccountServiceServiceNameRepaymentConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/repaymentConsumption/" + consumptionId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.RepaymentConsumption.class);
	}

	public void postBillingAccountVoicemailServiceNameDirectoriesIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "/move";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dir", dir);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/records/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountServiceServiceNameVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String planType, java.lang.String destinationType, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom, java.lang.String wayType) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/voiceConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getBillingAccountServiceServiceNameVoiceConsumption(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/service/" + serviceName + "/voiceConsumption";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions param0, java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdEavesdrop(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/eavesdrop";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("number", number);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties getBillingAccountVoicemailServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/voicemail/" + serviceName + "/settings";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveStatistics(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveStatistics";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics.class);
	}

	public java.lang.String getBillingAccountScreen(java.lang.String billingAccount) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions getBillingAccountTimeConditionServiceNameOptions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/timeCondition/" + serviceName + "/options";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Screen getBillingAccountScreenServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/screen/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.telephony.Screen.class);
	}

	public void deleteBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putBillingAccountMiniPabxServiceNameTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + billingAccount + "/miniPabx/" + serviceName + "/tones";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

}
