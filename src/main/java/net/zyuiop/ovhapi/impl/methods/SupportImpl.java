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

	public net.zyuiop.ovhapi.api.objects.support.NewMessageInfo postTicketsCreate(java.lang.String body, java.lang.String subject, java.lang.String type, java.lang.String serviceName, java.lang.String category, java.lang.String product) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/create";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("body", body);
		dataMap.put("subject", subject);
		dataMap.put("type", type);
		dataMap.put("serviceName", serviceName);
		dataMap.put("category", category);
		dataMap.put("product", product);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.support.NewMessageInfo.class);
	}

	public net.zyuiop.ovhapi.api.objects.support.NewMessageInfo postTicketsCreate(java.lang.String body, java.lang.String subject, java.lang.String type) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/create";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("body", body);
		dataMap.put("subject", subject);
		dataMap.put("type", type);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.support.NewMessageInfo.class);
	}

	public void postTicketsTicketIdClose(long ticketId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/" + ticketId + "/close";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postTicketsTicketIdReopen(long ticketId, java.lang.String body) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/" + ticketId + "/reopen";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("body", body);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postTicketsTicketIdReply(long ticketId, java.lang.String body) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/" + ticketId + "/reply";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("body", body);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.support.Ticket getTicketsTicketId(long ticketId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/" + ticketId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.support.Ticket.class);
	}

	public long[] getTickets(java.util.Date minCreationDate, java.lang.String subject, java.lang.String status, java.lang.String serviceName, java.util.Date maxCreationDate, java.lang.String category, java.lang.String product) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getTickets() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.support.Message getTicketsTicketIdMessages(long ticketId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/tickets/" + ticketId + "/messages";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.support.Message.class);
	}

}
