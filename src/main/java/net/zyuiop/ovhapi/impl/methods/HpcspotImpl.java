package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Hpcspot;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class HpcspotImpl implements Hpcspot { 

	private final OVHRawCalls client;

	public HpcspotImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hpcspot/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.hpcspot.Account getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hpcspot/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.hpcspot.AccountImpl.class);
	}

	public long[] getServiceNameConsumption(java.lang.String serviceName, long hpcspotItemId, java.util.Date hpcspotItemEndDateTo, long orderId, java.lang.String type, java.util.Date hpcspotItemEndDateFrom) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hpcspot/" + serviceName + "/consumption";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "hpcspotItemId=" + hpcspotItemId;
		__data += "hpcspotItemEndDate.to=" + hpcspotItemEndDateTo;
		__data += "orderId=" + orderId;
		__data += "type=" + type;
		__data += "hpcspotItemEndDate.from=" + hpcspotItemEndDateFrom;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameConsumption(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hpcspot/" + serviceName + "/consumption";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hpcspot/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getHpcspot() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/hpcspot/hpcspot";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /hpcspot/$serviceName/consumption/$id
	* Message : Missing identifier.
	*/


}
