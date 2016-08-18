package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Sms;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class SmsImpl implements Sms { 

	private final OVHRawCalls client;

	public SmsImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String postServiceNameSenders(java.lang.String sender, java.lang.String serviceName, java.lang.String reason, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("sender", sender);
		__dataMap.put("reason", reason);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameSenders(java.lang.String sender, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("sender", sender);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/document";
		String __data = "?";
		__data += "wayType=" + wayType;
		__data += "serviceName=" + serviceName;
		__data += "tag=" + tag;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDocument(java.lang.String wayType, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/document";
		String __data = "?";
		__data += "wayType=" + wayType;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Sender getServiceNameSendersSender(java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders/" + sender + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "sender=" + sender;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Sender.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.sms.Account param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameBlacklistsNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/blacklists/" + number + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver getServiceNameReceiversSlotId(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers/" + slotId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "slotId=" + slotId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport postServiceNameUsersLoginReceiversSlotIdClean(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers/" + slotId + "/clean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport.class);
	}

	public java.lang.String getServiceNameReceiversSlotIdCsv(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers/" + slotId + "/csv";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "slotId=" + slotId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getServiceNameReceivers(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Outgoing getServiceNameOutgoingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/outgoing/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Outgoing.class);
	}

	public void postServiceNameTransferCredits(double credits, java.lang.String smsAccountTarget, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/transferCredits";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("credits", credits);
		__dataMap.put("smsAccountTarget", smsAccountTarget);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.PackOffer[] getServiceNameSeeOffers(java.lang.String countryDestination, java.lang.String countryCurrencyPrice, long quantity, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/seeOffers";
		String __data = "?";
		__data += "countryDestination=" + countryDestination;
		__data += "countryCurrencyPrice=" + countryCurrencyPrice;
		__data += "quantity=" + quantity;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.PackOffer[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Job getServiceNameJobsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Job.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.User getServiceNameUsersLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.User.class);
	}

	public void deleteServiceNameSendersSender(java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders/" + sender + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameUsersLoginDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String login, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/document";
		String __data = "?";
		__data += "wayType=" + wayType;
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "tag=" + tag;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUsersLoginDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/document";
		String __data = "?";
		__data += "wayType=" + wayType;
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport postServiceNameReceiversSlotIdClean(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers/" + slotId + "/clean";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport.class);
	}

	public java.lang.String getServiceNameUsersLoginReceiversSlotIdCsv(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers/" + slotId + "/csv";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "slotId=" + slotId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postServiceNameSendersSenderValidate(java.lang.String code, java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders/" + sender + "/validate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameTemplatesControl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/templatesControl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteServiceNameUsersLoginOutgoingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/outgoing/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameOutgoing(java.lang.String serviceName, java.lang.String receiver, long differedDelivery, long deliveryReceipt, java.util.Date creationDatetimeFrom, long ptt, java.lang.String sender, java.lang.String tag, java.util.Date creationDatetimeTo) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/outgoing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "receiver=" + receiver;
		__data += "differedDelivery=" + differedDelivery;
		__data += "deliveryReceipt=" + deliveryReceipt;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		__data += "ptt=" + ptt;
		__data += "sender=" + sender;
		__data += "tag=" + tag;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameOutgoing(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/outgoing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameJobs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteServiceNameUsersLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver postServiceNameReceivers(java.lang.String csvUrl, long slotId, java.lang.String description, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("csvUrl", csvUrl);
		__dataMap.put("slotId", slotId);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Exception[] getServiceNameExceptions(java.lang.String receiver, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/exceptions";
		String __data = "?";
		__data += "receiver=" + receiver;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Exception[].class);
	}

	public void deleteServiceNameUsersLoginReceiversSlotId(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers/" + slotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameUsersLoginReceivers(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver getServiceNameUsersLoginReceiversSlotId(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers/" + slotId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "slotId=" + slotId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public void deleteServiceNameUsersLoginJobsId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameUsersLoginIncomingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/incoming/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameUsersLoginIncoming(java.lang.String serviceName, java.lang.String login, java.lang.String sender, java.lang.String tag) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/incoming";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "sender=" + sender;
		__data += "tag=" + tag;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUsersLoginIncoming(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/incoming";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUsersLoginJobs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Account getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Account.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Outgoing getServiceNameUsersLoginOutgoingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/outgoing/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Outgoing.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Blacklist getServiceNameBlacklistsNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/blacklists/" + number + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "number=" + number;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Blacklist.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver postServiceNameUsersLoginReceivers(java.lang.String csvUrl, long slotId, java.lang.String description, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("csvUrl", csvUrl);
		__dataMap.put("slotId", slotId);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public void postServiceNameUsers(java.lang.String password, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		__dataMap.put("login", login);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameOutgoingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/outgoing/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameSendersSender(net.zyuiop.ovhapi.api.objects.sms.Sender param0, java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders/" + sender + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Hlr getServiceNameOutgoingIdHlr(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/outgoing/" + id + "/hlr";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Hlr.class);
	}

	public void putServiceNameUsersLogin(net.zyuiop.ovhapi.api.objects.sms.User param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Hlr getServiceNameUsersLoginOutgoingIdHlr(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/outgoing/" + id + "/hlr";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Hlr.class);
	}

	public long[] getServiceNameUsersLoginOutgoing(java.lang.String serviceName, java.lang.String login, java.lang.String receiver, long differedDelivery, long deliveryReceipt, long ptt, java.lang.String sender, java.lang.String tag) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/outgoing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "receiver=" + receiver;
		__data += "differedDelivery=" + differedDelivery;
		__data += "deliveryReceipt=" + deliveryReceipt;
		__data += "ptt=" + ptt;
		__data += "sender=" + sender;
		__data += "tag=" + tag;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUsersLoginOutgoing(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/outgoing";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.PttDetails getPtts(long ptt) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/ptts";
		String __data = "?";
		__data += "ptt=" + ptt;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.PttDetails.class);
	}

	public java.lang.String[] getServiceNameSenders(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Incoming getServiceNameUsersLoginIncomingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/incoming/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Incoming.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameUsersLoginJobs(java.lang.String message, java.lang.String serviceName, java.lang.String login, boolean noStopClause, java.lang.String priority, long validityPeriod, boolean senderForResponse, java.lang.String receivers, java.lang.String charset, java.lang.String coding, long differedPeriod, java.lang.String receiversSlotId, java.lang.String sender, java.lang.String tag, java.lang.String receiversDocumentUrl, java.lang.String _class) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("message", message);
		__dataMap.put("noStopClause", noStopClause);
		__dataMap.put("priority", priority);
		__dataMap.put("validityPeriod", validityPeriod);
		__dataMap.put("senderForResponse", senderForResponse);
		__dataMap.put("receivers", receivers);
		__dataMap.put("charset", charset);
		__dataMap.put("coding", coding);
		__dataMap.put("differedPeriod", differedPeriod);
		__dataMap.put("receiversSlotId", receiversSlotId);
		__dataMap.put("sender", sender);
		__dataMap.put("tag", tag);
		__dataMap.put("receiversDocumentUrl", receiversDocumentUrl);
		__dataMap.put("class", _class);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameUsersLoginJobs(java.lang.String message, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("message", message);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public long[] getServiceNameIncoming(java.lang.String serviceName, java.lang.String sender, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/incoming";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "sender=" + sender;
		__data += "tag=" + tag;
		__data += "creationDatetime.to=" + creationDatetimeTo;
		__data += "creationDatetime.from=" + creationDatetimeFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameIncoming(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/incoming";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteServiceNameIncomingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/incoming/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameUsers(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Incoming getServiceNameIncomingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/incoming/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Incoming.class);
	}

	public java.lang.String[] getSms() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/sms";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteServiceNameReceiversSlotId(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers/" + slotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.TemplateControl getServiceNameTemplatesControlName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/templatesControl/" + name + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.TemplateControl.class);
	}

	public java.lang.String[] getServiceNameBlacklists(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/blacklists";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Job getServiceNameUsersLoginJobsId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.Job.class);
	}

	public void postServiceNameTemplatesControl(java.lang.String name, java.lang.String activity, java.lang.String message, java.lang.String serviceName, java.lang.String reason, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/templatesControl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("activity", activity);
		__dataMap.put("message", message);
		__dataMap.put("reason", reason);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameTemplatesControl(java.lang.String name, java.lang.String activity, java.lang.String message, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/templatesControl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("activity", activity);
		__dataMap.put("message", message);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameJobsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameJobs(java.lang.String message, java.lang.String serviceName, boolean noStopClause, java.lang.String priority, long validityPeriod, boolean senderForResponse, java.lang.String receivers, java.lang.String charset, java.lang.String coding, long differedPeriod, java.lang.String receiversSlotId, java.lang.String sender, java.lang.String tag, java.lang.String receiversDocumentUrl, java.lang.String _class) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("message", message);
		__dataMap.put("noStopClause", noStopClause);
		__dataMap.put("priority", priority);
		__dataMap.put("validityPeriod", validityPeriod);
		__dataMap.put("senderForResponse", senderForResponse);
		__dataMap.put("receivers", receivers);
		__dataMap.put("charset", charset);
		__dataMap.put("coding", coding);
		__dataMap.put("differedPeriod", differedPeriod);
		__dataMap.put("receiversSlotId", receiversSlotId);
		__dataMap.put("sender", sender);
		__dataMap.put("tag", tag);
		__dataMap.put("receiversDocumentUrl", receiversDocumentUrl);
		__dataMap.put("class", _class);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameJobs(java.lang.String message, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("message", message);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

}
