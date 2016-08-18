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

	public void postServiceNameSendersSenderValidate(java.lang.String code, java.lang.String serviceName, java.lang.String sender) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders/" + sender + "/validate";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("code", code);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameUsersLoginReceiversSlotId(java.lang.String serviceName, java.lang.String login, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers/" + slotId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
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

	public long[] getServiceNameReceivers(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /sms/ptts
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/seeOffers
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/senders/$sender
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/incoming/$id
	* Message : Missing identifier.
	*/


	public void deleteServiceNameUsersLoginOutgoingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/outgoing/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/jobs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/jobs
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : PUT > /sms/$serviceName
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/users/$login/receivers
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/users/$login/receivers/$slotId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/


	public void deleteServiceNameIncomingId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/incoming/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/receivers
	* Message : Missing identifier.
	*/


	public void deleteServiceNameJobsId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs/" + id + "";
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

	public java.lang.String[] getServiceNameSenders(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/senders";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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

	public void deleteServiceNameBlacklistsNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/blacklists/" + number + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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

	public void deleteServiceNameUsersLoginJobsId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/exceptions
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameBlacklists(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/blacklists";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /sms/$serviceName/users/$login
	* Message : Missing identifier.
	*/


	public long[] getServiceNameUsersLoginJobs(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/jobs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /sms/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/templatesControl/$name
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/users/$login/outgoing/$id
	* Message : Missing identifier.
	*/


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

	public void deleteServiceNameUsersLoginIncomingId(java.lang.String serviceName, java.lang.String login, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/incoming/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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


	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/outgoing/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/users/$login/jobs/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/receivers/$slotId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/outgoing/$id/hlr
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/blacklists/$number
	* Message : Missing identifier.
	*/


	public long[] getServiceNameUsersLoginReceivers(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "/receivers";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "login=" + login;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/users/$login/receivers/$slotId/clean
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/jobs/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/users/$login
	* Message : Missing identifier.
	*/


	public void deleteServiceNameUsersLogin(java.lang.String serviceName, java.lang.String login) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/users/" + login + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getSms() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/sms";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/receivers/$slotId/clean
	* Message : Missing identifier.
	*/


	public long[] getServiceNameJobs(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/jobs";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/users/$login/jobs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /sms/$serviceName/users/$login/jobs
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/users/$login/outgoing/$id/hlr
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : PUT > /sms/$serviceName/senders/$sender
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName
	* Message : Missing identifier.
	*/


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

	public void deleteServiceNameReceiversSlotId(java.lang.String serviceName, long slotId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/receivers/" + slotId + "";
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


	/*
	* Method creation failed.
	* Involved method : GET > /sms/$serviceName/users/$login/incoming/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getServiceNameTemplatesControl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/sms/" + serviceName + "/templatesControl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
