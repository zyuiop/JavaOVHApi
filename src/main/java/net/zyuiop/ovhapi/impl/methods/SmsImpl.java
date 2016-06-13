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

	public net.zyuiop.ovhapi.api.objects.sms.Outgoing getServiceNameUsersLoginOutgoingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/outgoing/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Outgoing.class);
	}

	public void postServiceNameSendersSenderValidate(java.lang.String code, java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders/" + sender + "/validate";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("code", code);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameSenders(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNameSendersSender(net.zyuiop.ovhapi.api.objects.sms.Sender param0, java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders/" + sender + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteServiceNameJobsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/jobs/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteServiceNameUsersLoginIncomingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/incoming/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postServiceNameTransferCredits(double credits, java.lang.String smsAccountTarget, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/transferCredits";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("credits", credits);
		dataMap.put("smsAccountTarget", smsAccountTarget);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameReceiversSlotIdCsv(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/receivers/" + slotId + "/csv";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDocument(java.lang.String wayType, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver postServiceNameReceivers(java.lang.String csvUrl, long slotId, java.lang.String description, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/receivers";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("csvUrl", csvUrl);
		dataMap.put("slotId", slotId);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Hlr getServiceNameOutgoingIdHlr(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/outgoing/" + id + "/hlr";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Hlr.class);
	}

	public void deleteServiceNameIncomingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/incoming/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameUsersLoginJobs(java.lang.String message, java.lang.String serviceName, java.lang.String login, boolean noStopClause, java.lang.String priority, long validityPeriod, boolean senderForResponse, java.lang.String receivers, java.lang.String charset, java.lang.String coding, long differedPeriod, java.lang.String receiversSlotId, java.lang.String sender, java.lang.String tag, java.lang.String receiversDocumentUrl, java.lang.String _class) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/jobs";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("message", message);
		dataMap.put("noStopClause", noStopClause);
		dataMap.put("priority", priority);
		dataMap.put("validityPeriod", validityPeriod);
		dataMap.put("senderForResponse", senderForResponse);
		dataMap.put("receivers", receivers);
		dataMap.put("charset", charset);
		dataMap.put("coding", coding);
		dataMap.put("differedPeriod", differedPeriod);
		dataMap.put("receiversSlotId", receiversSlotId);
		dataMap.put("sender", sender);
		dataMap.put("tag", tag);
		dataMap.put("receiversDocumentUrl", receiversDocumentUrl);
		dataMap.put("class", _class);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameUsersLoginJobs(java.lang.String message, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/jobs";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("message", message);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public java.lang.String getServiceNameUsers(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameTemplatesControl(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templatesControl";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getSms() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//sms";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Incoming getServiceNameUsersLoginIncomingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/incoming/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Incoming.class);
	}

	public void postServiceNameUsers(java.lang.String password, java.lang.String login, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("password", password);
		dataMap.put("login", login);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Blacklist getServiceNameBlacklistsNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/blacklists/" + number + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Blacklist.class);
	}

	public void deleteServiceNameUsersLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameReceivers(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/receivers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Account getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Account.class);
	}

	public long[] getServiceNameIncoming(java.lang.String serviceName, java.lang.String sender, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/incoming";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameIncoming(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/incoming";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void deleteServiceNameUsersLoginJobsId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/jobs/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport postServiceNameReceiversSlotIdClean(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/receivers/" + slotId + "/clean";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport.class);
	}

	public void deleteServiceNameSendersSender(java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders/" + sender + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameUsersLoginIncoming(java.lang.String serviceName, java.lang.String login, java.lang.String sender, java.lang.String tag) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/incoming";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameUsersLoginIncoming(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/incoming";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getServiceNameUsersLoginReceiversSlotIdCsv(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/receivers/" + slotId + "/csv";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUsersLoginDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String login, java.lang.String tag, java.util.Date creationDatetimeTo, java.util.Date creationDatetimeFrom) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameUsersLoginDocument(java.lang.String wayType, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/document";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteServiceNameUsersLoginReceiversSlotId(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/receivers/" + slotId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameBlacklists(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/blacklists";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postServiceNameTemplatesControl(java.lang.String name, java.lang.String activity, java.lang.String message, java.lang.String serviceName, java.lang.String reason, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templatesControl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		dataMap.put("activity", activity);
		dataMap.put("message", message);
		dataMap.put("reason", reason);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postServiceNameTemplatesControl(java.lang.String name, java.lang.String activity, java.lang.String message, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templatesControl";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		dataMap.put("activity", activity);
		dataMap.put("message", message);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameUsersLoginReceivers(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/receivers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Sender getServiceNameSendersSender(java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders/" + sender + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Sender.class);
	}

	public void putServiceNameUsersLogin(net.zyuiop.ovhapi.api.objects.sms.User param0, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Job getServiceNameJobsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/jobs/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Job.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport postServiceNameUsersLoginReceiversSlotIdClean(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/receivers/" + slotId + "/clean";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.ReceiversAsynchronousCleanReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Hlr getServiceNameUsersLoginOutgoingIdHlr(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/outgoing/" + id + "/hlr";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Hlr.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver getServiceNameReceiversSlotId(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/receivers/" + slotId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public java.lang.String postServiceNameSenders(java.lang.String sender, java.lang.String serviceName, java.lang.String reason, java.lang.String description) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("sender", sender);
		dataMap.put("reason", reason);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNameSenders(java.lang.String sender, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/senders";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("sender", sender);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void deleteServiceNameReceiversSlotId(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/receivers/" + slotId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Job getServiceNameUsersLoginJobsId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/jobs/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Job.class);
	}

	public long[] getServiceNameUsersLoginJobs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/jobs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.User getServiceNameUsersLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.User.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Exception getServiceNameExceptions(java.lang.String receiver, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/exceptions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Exception.class);
	}

	public long[] getServiceNameUsersLoginOutgoing(java.lang.String serviceName, java.lang.String login, java.lang.String receiver, long differedDelivery, long deliveryReceipt, long ptt, java.lang.String sender, java.lang.String tag) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/outgoing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameUsersLoginOutgoing(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/outgoing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.TemplateControl getServiceNameTemplatesControlName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/templatesControl/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.TemplateControl.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver postServiceNameUsersLoginReceivers(java.lang.String csvUrl, long slotId, java.lang.String description, java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/receivers";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("csvUrl", csvUrl);
		dataMap.put("slotId", slotId);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public long[] getServiceNameOutgoing(java.lang.String serviceName, java.lang.String receiver, long differedDelivery, long deliveryReceipt, java.util.Date creationDatetimeFrom, long ptt, java.lang.String sender, java.lang.String tag, java.util.Date creationDatetimeTo) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/outgoing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameOutgoing(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/outgoing";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.sms.Account param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteServiceNameOutgoingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/outgoing/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteServiceNameUsersLoginOutgoingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/outgoing/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Outgoing getServiceNameOutgoingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/outgoing/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Outgoing.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Task.class);
	}

	public long[] getServiceNameJobs(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/jobs";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameJobs(java.lang.String message, java.lang.String serviceName, boolean noStopClause, java.lang.String priority, long validityPeriod, boolean senderForResponse, java.lang.String receivers, java.lang.String charset, java.lang.String coding, long differedPeriod, java.lang.String receiversSlotId, java.lang.String sender, java.lang.String tag, java.lang.String receiversDocumentUrl, java.lang.String _class) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/jobs";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("message", message);
		dataMap.put("noStopClause", noStopClause);
		dataMap.put("priority", priority);
		dataMap.put("validityPeriod", validityPeriod);
		dataMap.put("senderForResponse", senderForResponse);
		dataMap.put("receivers", receivers);
		dataMap.put("charset", charset);
		dataMap.put("coding", coding);
		dataMap.put("differedPeriod", differedPeriod);
		dataMap.put("receiversSlotId", receiversSlotId);
		dataMap.put("sender", sender);
		dataMap.put("tag", tag);
		dataMap.put("receiversDocumentUrl", receiversDocumentUrl);
		dataMap.put("class", _class);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport postServiceNameJobs(java.lang.String message, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/jobs";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("message", message);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.SmsSendingReport.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Receiver getServiceNameUsersLoginReceiversSlotId(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/users/" + login + "/receivers/" + slotId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Receiver.class);
	}

	public void deleteServiceNameBlacklistsNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/blacklists/" + number + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.sms.PackOffer getServiceNameSeeOffers(java.lang.String countryDestination, java.lang.String countryCurrencyPrice, long quantity, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/seeOffers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.PackOffer.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.PttDetails getPtts(long ptt) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/ptts";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.PttDetails.class);
	}

	public net.zyuiop.ovhapi.api.objects.sms.Incoming getServiceNameIncomingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/incoming/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.sms.Incoming.class);
	}

}
