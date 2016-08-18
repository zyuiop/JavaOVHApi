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

	public void postTicketsTicketIdReply(long ticketId, java.lang.String body) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/reply";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("body", body);
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


	/*
	* Method creation failed.
	* Involved method : POST > /support/tickets/create
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /support/tickets/create
	* Message : Missing identifier.
	*/


	public void postTicketsTicketIdClose(long ticketId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/close";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /support/tickets/$ticketId/messages
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /support/tickets/$ticketId
	* Message : Missing identifier.
	*/


	public void postTicketsTicketIdReopen(long ticketId, java.lang.String body) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/support/tickets/" + ticketId + "/reopen";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("body", body);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
