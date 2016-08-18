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

	public net.zyuiop.ovhapi.api.objects.telephony.Redirect getBillingAccountRedirectServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/redirect/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Redirect.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(boolean negativeAction, java.lang.String action, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, java.lang.String actionParam) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("negativeAction", negativeAction);
		__dataMap.put("action", action);
		__dataMap.put("position", position);
		__dataMap.put("actionParam", actionParam);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRule(boolean negativeAction, java.lang.String action, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("negativeAction", negativeAction);
		__dataMap.put("action", action);
		__dataMap.put("position", position);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule.class);
	}

	public java.lang.String[] getBillingAccountScreen(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties getBillingAccountConferenceServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/settings";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties.class);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdEavesdrop(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/eavesdrop";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public java.lang.String postBillingAccountFaxServiceNameSettingsNewPassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings/newPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putBillingAccountMiniPabxServiceNameHunting(net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccount(net.zyuiop.ovhapi.api.objects.telephony.BillingAccount param0, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountVoicemailServiceNameGreetingsIdDownload(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "/download";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Conference getBillingAccountConferenceServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Conference.class);
	}

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

	public void putBillingAccountFaxServiceName(net.zyuiop.ovhapi.api.objects.telephony.Fax param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent getBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "uid=" + uid;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent.class);
	}

	public void putBillingAccountNumberServiceName(net.zyuiop.ovhapi.api.objects.telephony.Number param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/number/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting getBillingAccountEasyPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "/liveStatus";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.LinePhone[] getLineOfferPhones(java.lang.String country, java.lang.String offer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/line/offer/phones";
		String __data = "?";
		__data += "country=" + country;
		__data += "offer=" + offer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.LinePhone[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdDeaf(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/deaf";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Portability getBillingAccountPortabilitiesId(java.lang.String billingAccount, double id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portabilities/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Portability.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue getBillingAccountOvhPabxServiceNameHuntingQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdWhisper(java.lang.String whisperingMode, java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/whisper";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("whisperingMode", whisperingMode);
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
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

	public java.lang.String getBillingAccountVoicemailServiceNameSettingsRouting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings/routing";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DirectoryWayType[] getBillingAccountServiceServiceNameDirectoryGetWayTypes(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/directory/getWayTypes";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DirectoryWayType[].class);
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

	public long[] getBillingAccountOvhPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveStatistics(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveStatistics";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameUnlock(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/unlock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void deleteBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountOvhPabxServiceNameDialplan(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditions param0, java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions/" + conditionId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList/" + conditionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		__data += "conditionId=" + conditionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign getBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign.class);
	}

	public void deleteBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PreviousVoiceConsumption getBillingAccountServiceServiceNamePreviousVoiceConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/previousVoiceConsumption/" + consumptionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "consumptionId=" + consumptionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PreviousVoiceConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryTollfreeConsumptionDateDocument(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyTollfreeConsumption/" + date + "/document";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.MiniPabx getBillingAccountMiniPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.MiniPabx.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditions getBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions/" + conditionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "conditionId=" + conditionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditions.class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent postBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String agentNumber, long position, boolean logged, long noReplyTimer, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("agentNumber", agentNumber);
		__dataMap.put("position", position);
		__dataMap.put("logged", logged);
		__dataMap.put("noReplyTimer", noReplyTimer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdTransfer(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/transfer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void postBillingAccountFaxServiceNameCampaignsIdStart(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/start";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNamePhoneRefreshScreen(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/refreshScreen";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption postBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount, java.lang.String billingNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyRepaymentConsumption";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("billingNumber", billingNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption postBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyRepaymentConsumption";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption.class);
	}

	public void deleteBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyPabx getBillingAccountEasyPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyPabx.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent postBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String agentNumber, long position, boolean logged, long noReplyTimer, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("agentNumber", agentNumber);
		__dataMap.put("position", position);
		__dataMap.put("logged", logged);
		__dataMap.put("noReplyTimer", noReplyTimer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdIntercept(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/intercept";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameSound(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/sound";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountFaxServiceNameSettingsSendFax(java.lang.String pdfUrl, java.lang.String recipients, java.lang.String billingAccount, java.lang.String serviceName, java.util.Date dateSchedule) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings/sendFax";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("pdfUrl", pdfUrl);
		__dataMap.put("recipients", recipients);
		__dataMap.put("dateSchedule", dateSchedule);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountFaxServiceNameSettingsSendFax(java.lang.String pdfUrl, java.lang.String recipients, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings/sendFax";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("pdfUrl", pdfUrl);
		__dataMap.put("recipients", recipients);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgent(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("queueId", queueId);
		__dataMap.put("position", position);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public java.lang.String[] getSpareBrands() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/brands";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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

	public java.lang.String[] getBillingAccountService(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent postBillingAccountEasyHuntingServiceNameHuntingAgent(long wrapUpTime, java.lang.String number, long simultaneousLines, java.lang.String status, long timeout, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("wrapUpTime", wrapUpTime);
		__dataMap.put("number", number);
		__dataMap.put("simultaneousLines", simultaneousLines);
		__dataMap.put("status", status);
		__dataMap.put("timeout", timeout);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public java.util.Date[] getBillingAccountHistoryTollfreeConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyTollfreeConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryRepaymentConsumptionDateDocument(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyRepaymentConsumption/" + date + "/document";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public void putBillingAccountMiniPabxServiceNameTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/tones";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics getBillingAccountServiceServiceNameVoiceConsumptionConsumptionIdCallDiagnostics(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/voiceConsumption/" + consumptionId + "/callDiagnostics";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "consumptionId=" + consumptionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.CallDiagnostics.class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabx getBillingAccountOvhPabxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabx.class);
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

	public void deleteBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountRedirectServiceNameChangeDestination(java.lang.String destination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/redirect/" + serviceName + "/changeDestination";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("destination", destination);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting getBillingAccountMiniPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.MiniPabxHunting.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "/liveStatus";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public java.util.Date[] getBillingAccountHistoryConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdTransfer(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/transfer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan postBillingAccountOvhPabxServiceNameDialplan(java.lang.String showCallerNumber, java.lang.String name, long transferTimeout, boolean anonymousRejection, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("showCallerNumber", showCallerNumber);
		__dataMap.put("name", name);
		__dataMap.put("transferTimeout", transferTimeout);
		__dataMap.put("anonymousRejection", anonymousRejection);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan.class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNamePhoneReboot(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/reboot";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup getBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "abbreviatedNumber=" + abbreviatedNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup.class);
	}

	public void putBillingAccountServiceServiceName(net.zyuiop.ovhapi.api.objects.telephony.TelephonyService param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RateCodeInformation[] getBillingAccountRsvaServiceNameAllowedRateCodes(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "/allowedRateCodes";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.RateCodeInformation[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign postBillingAccountFaxServiceNameCampaigns(java.lang.String recipientsType, java.lang.String documentId, java.lang.String name, java.lang.String sendType, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String recipientsDocId, java.lang.String recipientsList, java.util.Date sendDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("recipientsType", recipientsType);
		__dataMap.put("documentId", documentId);
		__dataMap.put("name", name);
		__dataMap.put("sendType", sendType);
		__dataMap.put("recipientsDocId", recipientsDocId);
		__dataMap.put("recipientsList", recipientsList);
		__dataMap.put("sendDate", sendDate);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign postBillingAccountFaxServiceNameCampaigns(java.lang.String recipientsType, java.lang.String documentId, java.lang.String name, java.lang.String sendType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("recipientsType", recipientsType);
		__dataMap.put("documentId", documentId);
		__dataMap.put("name", name);
		__dataMap.put("sendType", sendType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaign.class);
	}

	public void deleteBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/eventToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueue(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("queueId", queueId);
		__dataMap.put("position", position);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public double[] getBillingAccountPortabilities(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/portabilities";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), double[].class);
	}

	public void deleteBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/condition/" + id + "";
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

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdIntercept(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/intercept";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void postBillingAccountFaxServiceNameCampaignsIdStop(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/stop";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenListConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DirectoryHeadingPJ[] getBillingAccountServiceServiceNameDirectoryGetDirectoryServiceCode(java.lang.String apeCode, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/directory/getDirectoryServiceCode";
		String __data = "?";
		__data += "apeCode=" + apeCode;
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DirectoryHeadingPJ[].class);
	}

	public java.lang.String[] getAccessories(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/accessories";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Rsva getBillingAccountRsvaServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Rsva.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdMute(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/mute";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties getBillingAccountVxmlServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/vxml/" + serviceName + "/settings";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster getBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "bookKey=" + bookKey;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster.class);
	}

	public void postBillingAccountVoicemailServiceNameGreetingsIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "/move";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dir", dir);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountScreenServiceName(net.zyuiop.ovhapi.api.objects.telephony.Screen param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdKick(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/kick";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Rma getBillingAccountLineServiceNamePhoneRmaId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/rma/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Rma.class);
	}

	public void postBillingAccountVoicemailServiceNameDirectoriesIdMove(java.lang.String dir, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "/move";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dir", dir);
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

	public java.lang.String[] getBillingAccountPhonebook(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Screen getBillingAccountScreenServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Screen.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Scheduler getBillingAccountSchedulerServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Scheduler.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions postBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String screenListType, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String callerIdNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("screenListType", screenListType);
		__dataMap.put("callerIdNumber", callerIdNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions postBillingAccountEasyHuntingServiceNameScreenListConditionsConditions(java.lang.String screenListType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("screenListType", screenListType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DatetimeAndIpvalue[] getBillingAccountLineServiceNameIps(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/ips";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DatetimeAndIpvalue[].class);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountVxmlServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.VxmlProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/vxml/" + serviceName + "/settings";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings getBillingAccountEasyHuntingServiceNameScreenListConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings.class);
	}

	public void postBillingAccountCancelTermination(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/cancelTermination";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountLineServiceNameTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/tones/toneUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry param0, java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountMiniPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountRedirectServiceName(net.zyuiop.ovhapi.api.objects.telephony.Redirect param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/redirect/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.LineOptions getBillingAccountLineServiceNameOptions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/options";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.LineOptions.class);
	}

	public void postBillingAccountServiceServiceNameChangeOfBillingAccount(java.lang.String billingAccountDestination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/changeOfBillingAccount";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("billingAccountDestination", billingAccountDestination);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountEasyPabxServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdHangup(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/hangup";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public java.lang.String postBillingAccountPhonebook(java.lang.String name, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getBillingAccountLineServiceNamePhoneFunctionKey(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/functionKey";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound getBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/sound/" + soundId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "soundId=" + soundId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound.class);
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

	public java.lang.String[] getBillingAccountMiniPabx(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent getBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentNumber=" + agentNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact getBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "bookKey=" + bookKey;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact.class);
	}

	public java.lang.String[] getBillingAccountLine(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountScheduler(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void postBillingAccountServiceServiceNameCancelTermination(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/cancelTermination";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/records/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountMiniPabxServiceNameTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/tones";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Tones.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistory getBillingAccountConferenceServiceNameHistoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/histories/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistory.class);
	}

	public void putBillingAccountLineServiceName(net.zyuiop.ovhapi.api.objects.telephony.Line param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountVoicemailServiceName(net.zyuiop.ovhapi.api.objects.telephony.Voicemail param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Click2CallUser getBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Click2CallUser.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveStatistics(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveStatistics";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveStatistics.class);
	}

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

	public void putBillingAccountEasyPabxServiceNameHuntingTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/tones";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Phonebook getBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "bookKey=" + bookKey;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Phonebook.class);
	}

	public java.util.Date[] getBillingAccountHistoryRepaymentConsumption(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyRepaymentConsumption";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.util.Date[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Fax getBillingAccountFaxServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Fax.class);
	}

	public void putBillingAccountEasyHuntingServiceName(net.zyuiop.ovhapi.api.objects.telephony.EasyHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public java.lang.String[] getBillingAccountOvhPabx(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Vxml getBillingAccountVxmlServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/vxml/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Vxml.class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgent(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("queueId", queueId);
		__dataMap.put("position", position);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountMiniPabxServiceNameTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/tones/toneUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void deleteBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/eventToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountConferenceServiceNameHistories(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/histories";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putBillingAccountLineServiceNamePhoneRmaId(net.zyuiop.ovhapi.api.objects.telephony.Rma param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/rma/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public void deleteBillingAccountFaxServiceNameCampaignsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "";
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

	public void putBillingAccountMiniPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.MiniPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent postBillingAccountOvhPabxServiceNameHuntingAgent(long wrapUpTime, java.lang.String number, long simultaneousLines, java.lang.String status, long timeout, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("wrapUpTime", wrapUpTime);
		__dataMap.put("number", number);
		__dataMap.put("simultaneousLines", simultaneousLines);
		__dataMap.put("status", status);
		__dataMap.put("timeout", timeout);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public void deleteBillingAccountLineServiceNameClick2CallUserId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdUnmute(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/unmute";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.TimeCondition getBillingAccountTimeConditionServiceNameConditionId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/condition/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.TimeCondition.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation getBillingAccountRsvaServiceNameScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "/scheduledRateCode";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EventToken getBillingAccountEventToken(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/eventToken";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EventToken.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountSchedulerServiceNameImportIcsCalendar(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/importIcsCalendar";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountVoicemailServiceNameDirectoriesIdDownload(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "/download";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(boolean enable, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, java.lang.String screenListType, java.lang.String schedulerCategory) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("enable", enable);
		__dataMap.put("position", position);
		__dataMap.put("screenListType", screenListType);
		__dataMap.put("schedulerCategory", schedulerCategory);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtension(boolean enable, long position, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("enable", enable);
		__dataMap.put("position", position);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension.class);
	}

	public java.lang.String[] getBillingAccountFax(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task getBillingAccountServiceServiceNameTaskTaskId(java.lang.String billingAccount, java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdEavesdrop(java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/eavesdrop";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountLineServiceNamePhonePhonebookBookKey(net.zyuiop.ovhapi.api.objects.telephony.Phonebook param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
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

	public java.lang.String[] getBillingAccountLineServiceNamePhoneMerchandiseAvailable(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/merchandiseAvailable";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putBillingAccountSchedulerServiceName(net.zyuiop.ovhapi.api.objects.telephony.Scheduler param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxCampaignDetail getBillingAccountFaxServiceNameCampaignsIdDetail(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns/" + id + "/detail";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxCampaignDetail.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdEnergy(long value, java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/energy";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("value", value);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountLineServiceNameOptions(net.zyuiop.ovhapi.api.objects.telephony.LineOptions param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/options";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getBillingAccountServiceInfos(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/serviceInfos";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void deleteBillingAccountLineServiceNamePhonePhonebookBookKey(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent getBillingAccountEasyHuntingServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public long[] getBillingAccountOvhPabxServiceNameRecords(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/records";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putBillingAccountServiceServiceNameDirectory(net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/directory";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountEasyHuntingServiceNameTimeConditions(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTimeConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RmaReturn postBillingAccountLineServiceNamePhoneRma(java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String newMerchandise, net.zyuiop.ovhapi.api.objects.telephony.Contact shippingContact) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/rma";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		__dataMap.put("newMerchandise", newMerchandise);
		__dataMap.put("shippingContact", shippingContact);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.RmaReturn.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RmaReturn postBillingAccountLineServiceNamePhoneRma(java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/rma";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.RmaReturn.class);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameLock(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/lock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions getBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "conditionId=" + conditionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxConsumption getBillingAccountServiceServiceNameFaxConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/faxConsumption/" + consumptionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "consumptionId=" + consumptionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxConsumption.class);
	}

	public long[] getBillingAccountAbbreviatedNumber(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation postBillingAccountRsvaServiceNameScheduleRateCode(java.lang.String rateCode, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "/scheduleRateCode";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("rateCode", rateCode);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation.class);
	}

	public void postBillingAccountVoicemailServiceNameSettingsChangeRouting(java.lang.String routing, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings/changeRouting";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("routing", routing);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo getBillingAccountServiceServiceNameDirectory(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/directory";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DirectoryInfo.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getTelephony() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/telephony";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putBillingAccountFaxServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.FaxProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
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

	public void putBillingAccountLineServiceNameTones(net.zyuiop.ovhapi.api.objects.telephony.Tones param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/tones";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postBillingAccountVoicemailServiceNameMigrateOnNewVersion(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/migrateOnNewVersion";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension.class);
	}

	public void putBillingAccountAbbreviatedNumberAbbreviatedNumber(net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup param0, java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionTime postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTime(java.lang.String timeFrom, java.lang.String timeTo, java.lang.String weekDay, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("timeFrom", timeFrom);
		__dataMap.put("timeTo", timeTo);
		__dataMap.put("weekDay", weekDay);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionTime.class);
	}

	public java.lang.String postBillingAccountFaxServiceNameSettingsChangePassword(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameTimeConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditions postBillingAccountEasyHuntingServiceNameTimeConditionsConditions(java.lang.String timeFrom, java.lang.String timeTo, java.lang.String weekDay, java.lang.String policy, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions/conditions";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("timeFrom", timeFrom);
		__dataMap.put("timeTo", timeTo);
		__dataMap.put("weekDay", weekDay);
		__dataMap.put("policy", policy);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditions.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.DiagnosticReport[] getBillingAccountServiceServiceNameDiagnosticReports(java.lang.String dayInterval, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/diagnosticReports";
		String __data = "?";
		__data += "dayInterval=" + dayInterval;
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DiagnosticReport[].class);
	}

	public void deleteBillingAccountSchedulerServiceNameEventsUid(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountPhonebookBookKey(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHunting getBillingAccountEasyHuntingServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHunting.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.BillingAccount getBillingAccount(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.BillingAccount.class);
	}

	public void deleteBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountConferenceServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.ConferenceProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/settings";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getBillingAccountVxml(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/vxml";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry postBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String action, long position, java.lang.String dtmf, java.lang.String billingAccount, java.lang.String serviceName, long menuId, java.lang.String actionParam) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		__dataMap.put("position", position);
		__dataMap.put("dtmf", dtmf);
		__dataMap.put("actionParam", actionParam);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry postBillingAccountOvhPabxServiceNameMenuMenuIdEntry(java.lang.String action, long position, java.lang.String dtmf, java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		__dataMap.put("position", position);
		__dataMap.put("dtmf", dtmf);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu postBillingAccountOvhPabxServiceNameMenu(java.lang.String name, long invalidSound, long greetSound, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("invalidSound", invalidSound);
		__dataMap.put("greetSound", greetSound);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan getBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplan.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent getBillingAccountOvhPabxServiceNameHuntingAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgent.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountNumberServiceNameChangeFeatureType(java.lang.String featureType, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/number/" + serviceName + "/changeFeatureType";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("featureType", featureType);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions getBillingAccountTimeConditionServiceNameOptions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/options";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue getBillingAccountEasyHuntingServiceNameHuntingQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent getBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentNumber=" + agentNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent.class);
	}

	public void putSpareSpareServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.VoicemailGreetings getBillingAccountVoicemailServiceNameGreetingsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/greetings/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.VoicemailGreetings.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FunctionKey getBillingAccountLineServiceNamePhoneFunctionKeyKeyNum(java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/functionKey/" + keyNum + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "keyNum=" + keyNum;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FunctionKey.class);
	}

	public void putBillingAccountServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public double[] getBillingAccountAllowedCreditThreshold(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/allowedCreditThreshold";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), double[].class);
	}

	public void putBillingAccountEasyPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.EasyPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryTollfreeConsumption getBillingAccountHistoryTollfreeConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyTollfreeConsumption/" + date + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryTollfreeConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyPabxServiceNameHuntingTonesToneUpload(java.lang.String url, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/tones/toneUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public long[] getBillingAccountFaxServiceNameCampaigns(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/campaigns";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public void putBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber param0, java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Number getBillingAccountNumberServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/number/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Number.class);
	}

	public void putBillingAccountLineServiceNamePhonePhonebookBookKeyPhonebookContactId(net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/records/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/soundUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/soundUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

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

	public void putBillingAccountOvhPabxServiceName(net.zyuiop.ovhapi.api.objects.telephony.OvhPabx param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public net.zyuiop.ovhapi.api.objects.telephony.VoicemailMessages getBillingAccountVoicemailServiceNameDirectoriesId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/directories/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.VoicemailMessages.class);
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

	public long[] getBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.LineOffer[] getFaxOffers(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/fax/offers";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.LineOffer[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ScreenList getBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "/screenLists/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.ScreenList.class);
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

	public void postBillingAccountRsvaServiceNameCancelScheduledRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "/cancelScheduledRateCode";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.Voicemail getBillingAccountVoicemailServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Voicemail.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber getBillingAccountLineServiceNameAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, java.lang.String serviceName, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber/" + abbreviatedNumber + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "abbreviatedNumber=" + abbreviatedNumber;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountLineServiceNameTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/tones";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Tones.class);
	}

	public void putBillingAccountSchedulerServiceNameEventsUid(net.zyuiop.ovhapi.api.objects.telephony.SchedulerEvent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String uid) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/scheduler/" + serviceName + "/events/" + uid + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceParticipants getBillingAccountConferenceServiceNameParticipantsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceParticipants.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu getBillingAccountOvhPabxServiceNameMenuMenuId(java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "menuId=" + menuId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu.class);
	}

	public java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "/compatibleReplacement";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountPhonebookBookKey(net.zyuiop.ovhapi.api.objects.telephony.PhonebookMaster param0, java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, java.lang.String callerIdNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("callerIdNumber", callerIdNumber);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList postBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionScreenList(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionScreenList";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionScreenList.class);
	}

	public void deleteBillingAccountScreenServiceNameScreenListsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "/screenLists/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public void putBillingAccountEasyPabxServiceNameHuntingAgentAgentNumber(net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.EventToken getBillingAccountServiceServiceNameEventToken(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/eventToken";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EventToken.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.FaxProperties getBillingAccountFaxServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/fax/" + serviceName + "/settings";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.FaxProperties.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdLiveCallsIdHangup(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/hangup";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Phone getBillingAccountLineServiceNamePhone(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Phone.class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.CallsGenerated getBillingAccountLineServiceNameAutomaticCallIdentifier(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String identifier) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/automaticCall/" + identifier + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "identifier=" + identifier;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.CallsGenerated.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation getBillingAccountRsvaServiceNameCurrentRateCode(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/rsva/" + serviceName + "/currentRateCode";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.DetailedRateCodeInformation.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionTime getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTimeConditionId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime/" + conditionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		__data += "conditionId=" + conditionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionTime.class);
	}

	public net.zyuiop.ovhapi.api.objects.complextype.UnitAndValues getBillingAccountLineServiceNameStatistics(java.lang.String timeframe, java.lang.String type, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/statistics";
		String __data = "?";
		__data += "timeframe=" + timeframe;
		__data += "type=" + type;
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.complextype.UnitAndValues.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryConsumption getBillingAccountHistoryConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyConsumption/" + date + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryConsumption.class);
	}

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdConditionTimeConditionId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionConditionTime param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/conditionTime/" + conditionId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getBillingAccountScreenServiceNameScreenLists(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/screen/" + serviceName + "/screenLists";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditions param0, java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountEasyHuntingServiceNameScreenListConditionsConditionsConditionId(java.lang.String billingAccount, java.lang.String serviceName, long conditionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions/conditions/" + conditionId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact getBillingAccountPhonebookBookKeyPhonebookContactId(java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "bookKey=" + bookKey;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule getBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "dialplanId=" + dialplanId;
		__data += "extensionId=" + extensionId;
		__data += "ruleId=" + ruleId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/soundUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameSoundUpload(java.lang.String url, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/soundUpload";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("url", url);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

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

	public java.lang.String[] getBillingAccountTimeCondition(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/sound/" + soundId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getSpareSpareServiceInfos(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "/serviceInfos";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.RepaymentConsumption getBillingAccountServiceServiceNameRepaymentConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/repaymentConsumption/" + consumptionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "consumptionId=" + consumptionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.RepaymentConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Line getBillingAccountLineServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Line.class);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry getBillingAccountOvhPabxServiceNameMenuMenuIdEntryEntryId(java.lang.String billingAccount, java.lang.String serviceName, long menuId, long entryId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "/entry/" + entryId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "menuId=" + menuId;
		__data += "entryId=" + entryId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenuEntry.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsId(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueueLiveCalls.class);
	}

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionIdRuleRuleId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtensionRule param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId, long ruleId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "/rule/" + ruleId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingQueueQueueIdAgentAgentId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountPhonebookBookKeyPhonebookContactId(net.zyuiop.ovhapi.api.objects.telephony.PhonebookContact param0, java.lang.String billingAccount, java.lang.String bookKey, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup postBillingAccountAbbreviatedNumber(java.lang.String destinationNumber, long abbreviatedNumber, java.lang.String name, java.lang.String surname, java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("destinationNumber", destinationNumber);
		__dataMap.put("abbreviatedNumber", abbreviatedNumber);
		__dataMap.put("name", name);
		__dataMap.put("surname", surname);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumberGroup.class);
	}

	public long[] getBillingAccountEasyHuntingServiceNameHuntingAgent(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.ConferenceInformations getBillingAccountConferenceServiceNameInformations(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/informations";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.ConferenceInformations.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound getBillingAccountEasyHuntingServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/sound/" + soundId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "soundId=" + soundId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxSound.class);
	}

	public void putBillingAccountEasyPabxServiceNameHunting(net.zyuiop.ovhapi.api.objects.telephony.EasyPabxHunting param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties getBillingAccountVoicemailServiceNameSettings(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue postBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueue(long queueId, long position, java.lang.String billingAccount, java.lang.String serviceName, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("queueId", queueId);
		__dataMap.put("position", position);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber[] getNumberSpecificNumbers(java.lang.String country, java.lang.String type, java.lang.String zone, java.lang.String range) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/number/specificNumbers";
		String __data = "?";
		__data += "country=" + country;
		__data += "type=" + type;
		__data += "zone=" + zone;
		__data += "range=" + range;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber[] getNumberSpecificNumbers(java.lang.String country, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/number/specificNumbers";
		String __data = "?";
		__data += "country=" + country;
		__data += "type=" + type;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.SpecificNumber[].class);
	}

	public java.lang.String[] getSpare() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting getBillingAccountEasyHuntingServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public java.lang.String[] getBillingAccountNumber(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/number";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteBillingAccountOvhPabxServiceNameSoundSoundId(java.lang.String billingAccount, java.lang.String serviceName, long soundId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/sound/" + soundId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.TelephonyService getBillingAccountServiceServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.TelephonyService.class);
	}

	public java.lang.String[] getBillingAccountVoicemail(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getBillingAccountLineServiceNameClick2CallUser(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/click2CallUser";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putBillingAccountOvhPabxServiceNameMenuMenuId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxMenu param0, java.lang.String billingAccount, java.lang.String serviceName, long menuId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/menu/" + menuId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
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

	public void putBillingAccountTimeConditionServiceNameOptions(net.zyuiop.ovhapi.api.objects.telephony.TimeConditionOptions param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "/options";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Ddi getBillingAccountDdiServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ddi/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Ddi.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountOvhPabxServiceNameHuntingQueueQueueIdAgentAgentIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long queueId, long agentId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/agent/" + agentId + "/liveStatus";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "queueId=" + queueId;
		__data += "agentId=" + agentId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public void deleteSpareSpare(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
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

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountOvhPabxServiceNameHuntingQueueQueueIdLiveCallsIdWhisper(java.lang.String whisperingMode, java.lang.String number, java.lang.String billingAccount, java.lang.String serviceName, long queueId, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue/" + queueId + "/liveCalls/" + id + "/whisper";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("whisperingMode", whisperingMode);
		__dataMap.put("number", number);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

	public void putBillingAccountLineServiceNamePhoneFunctionKeyKeyNum(net.zyuiop.ovhapi.api.objects.telephony.FunctionKey param0, java.lang.String billingAccount, java.lang.String serviceName, long keyNum) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/functionKey/" + keyNum + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getNumberZones(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/number/zones";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountEasyPabx(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putBillingAccountMiniPabxServiceNameHuntingAgentAgentNumber(net.zyuiop.ovhapi.api.objects.telephony.EasyMiniPabxHuntingAgent param0, java.lang.String billingAccount, java.lang.String serviceName, java.lang.String agentNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/miniPabx/" + serviceName + "/hunting/agent/" + agentNumber + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.GenericScreen getBillingAccountTimeConditionServiceName(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/timeCondition/" + serviceName + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.GenericScreen.class);
	}

	public java.lang.String postBillingAccountLineServiceNamePhonePhonebook(java.lang.String name, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/phone/phonebook";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteBillingAccountOvhPabxServiceNameDialplanDialplanId(java.lang.String billingAccount, java.lang.String serviceName, long dialplanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueIdLiveStatus(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "/liveStatus";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentLiveStatus.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting getBillingAccountOvhPabxServiceNameHunting(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHunting.class);
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

	public java.lang.String[] getBillingAccountConference(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putBillingAccountEasyHuntingServiceNameHuntingQueueQueueId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingQueue param0, java.lang.String billingAccount, java.lang.String serviceName, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/queue/" + queueId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountOvhPabxServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putBillingAccountDdiServiceName(net.zyuiop.ovhapi.api.objects.telephony.Ddi param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ddi/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
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

	public long[] getBillingAccountPhonebookBookKeyPhonebookContact(java.lang.String billingAccount, java.lang.String bookKey) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/phonebook/" + bookKey + "/phonebookContact";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "bookKey=" + bookKey;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue getBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "agentId=" + agentId;
		__data += "queueId=" + queueId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxHuntingAgentQueue.class);
	}

	public net.zyuiop.ovhapi.api.objects.spare.telephony.TelephonySpare getSpareSpare(java.lang.String spare) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/spare/" + spare + "";
		String __data = "?";
		__data += "spare=" + spare;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.spare.telephony.TelephonySpare.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountConferenceServiceNameParticipantsIdUndeaf(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/conference/" + serviceName + "/participants/" + id + "/undeaf";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryConsumptionDateFile(java.lang.String extension, java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyConsumption/" + date + "/file";
		String __data = "?";
		__data += "extension=" + extension;
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber postBillingAccountLineServiceNameAbbreviatedNumber(java.lang.String destinationNumber, long abbreviatedNumber, java.lang.String name, java.lang.String surname, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/line/" + serviceName + "/abbreviatedNumber";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("destinationNumber", destinationNumber);
		__dataMap.put("abbreviatedNumber", abbreviatedNumber);
		__dataMap.put("name", name);
		__dataMap.put("surname", surname);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.AbbreviatedNumber.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord getBillingAccountOvhPabxServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/records/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord.class);
	}

	public java.lang.String[] getBillingAccountRedirect(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/redirect";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getBillingAccountEasyHunting(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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

	public net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption getBillingAccountHistoryRepaymentConsumptionDate(java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyRepaymentConsumption/" + date + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.HistoryRepaymentConsumption.class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.PcsFile getBillingAccountHistoryConsumptionDateDocument(java.lang.String extension, java.lang.String billingAccount, java.util.Date date) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/historyConsumption/" + date + "/document";
		String __data = "?";
		__data += "extension=" + extension;
		__data += "billingAccount=" + billingAccount;
		__data += "date=" + date;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.PcsFile.class);
	}

	public void putBillingAccountOvhPabxServiceNameDialplanDialplanIdExtensionExtensionId(net.zyuiop.ovhapi.api.objects.telephony.OvhPabxDialplanExtension param0, java.lang.String billingAccount, java.lang.String serviceName, long dialplanId, long extensionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/dialplan/" + dialplanId + "/extension/" + extensionId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Tones getBillingAccountEasyPabxServiceNameHuntingTones(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyPabx/" + serviceName + "/hunting/tones";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Tones.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.VoiceConsumption getBillingAccountServiceServiceNameVoiceConsumptionConsumptionId(java.lang.String billingAccount, java.lang.String serviceName, long consumptionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/service/" + serviceName + "/voiceConsumption/" + consumptionId + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "consumptionId=" + consumptionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.VoiceConsumption.class);
	}

	public java.lang.String[] getBillingAccountDdi(java.lang.String billingAccount) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ddi";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord getBillingAccountEasyHuntingServiceNameRecordsId(java.lang.String billingAccount, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/records/" + id + "";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.OvhPabxRecord.class);
	}

	public void putBillingAccountVoicemailServiceNameSettings(net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/voicemail/" + serviceName + "/settings";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountEasyHuntingServiceNameHuntingAgentAgentIdQueueQueueId(java.lang.String billingAccount, java.lang.String serviceName, long agentId, long queueId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/hunting/agent/" + agentId + "/queue/" + queueId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteBillingAccountAbbreviatedNumberAbbreviatedNumber(java.lang.String billingAccount, long abbreviatedNumber) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/abbreviatedNumber/" + abbreviatedNumber + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.LineOffer[] getLineOffers(java.lang.String country) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/line/offers";
		String __data = "?";
		__data += "country=" + country;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.LineOffer[].class);
	}

	public long[] getBillingAccountOvhPabxServiceNameHuntingQueue(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ovhPabx/" + serviceName + "/hunting/queue";
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

	public void putBillingAccountEasyHuntingServiceNameScreenListConditions(net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingScreenListsConditionsSettings param0, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/screenListConditions";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.telephony.Task postBillingAccountDdiServiceNameChangeDestination(java.lang.String destination, java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/ddi/" + serviceName + "/changeDestination";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("destination", destination);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.Task.class);
	}

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

	public net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings getBillingAccountEasyHuntingServiceNameTimeConditions(java.lang.String billingAccount, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/telephony/" + billingAccount + "/easyHunting/" + serviceName + "/timeConditions";
		String __data = "?";
		__data += "billingAccount=" + billingAccount;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.telephony.EasyHuntingTimeConditionsSettings.class);
	}

}
