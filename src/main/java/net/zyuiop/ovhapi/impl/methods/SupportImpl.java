package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Support;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class SupportImpl implements Support { 

	private final OVHRawCalls client;

	public SupportImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.support.Ticket getTicketsTicketId(long ticketId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "";
		String __data = "?";
		__data += "ticketId=" + ticketId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.support.Ticket.class);
	}

	public net.zyuiop.ovhapi.api.objects.support.NewMessageInfo postTicketsCreate(java.lang.String body, java.lang.String subject, java.lang.String type, java.lang.String serviceName, java.lang.String category, java.lang.String product) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/create";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("body", body);
		__dataMap.put("subject", subject);
		__dataMap.put("type", type);
		__dataMap.put("serviceName", serviceName);
		__dataMap.put("category", category);
		__dataMap.put("product", product);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.support.NewMessageInfo.class);
	}

	public net.zyuiop.ovhapi.api.objects.support.NewMessageInfo postTicketsCreate(java.lang.String body, java.lang.String subject, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/create";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("body", body);
		__dataMap.put("subject", subject);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.support.NewMessageInfo.class);
	}

	public void postTicketsTicketIdClose(long ticketId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/close";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getTickets(java.util.Date minCreationDate, java.lang.String subject, java.lang.String status, java.lang.String serviceName, java.util.Date maxCreationDate, java.lang.String category, java.lang.String product) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets";
		String __data = "?";
		__data += "minCreationDate=" + minCreationDate;
		__data += "subject=" + subject;
		__data += "status=" + status;
		__data += "serviceName=" + serviceName;
		__data += "maxCreationDate=" + maxCreationDate;
		__data += "category=" + category;
		__data += "product=" + product;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getTickets() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void postTicketsTicketIdReopen(long ticketId, java.lang.String body) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/reopen";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("body", body);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.support.Message[] getTicketsTicketIdMessages(long ticketId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/messages";
		String __data = "?";
		__data += "ticketId=" + ticketId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.support.Message[].class);
	}

	public void postTicketsTicketIdReply(long ticketId, java.lang.String body) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/reply";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("body", body);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
