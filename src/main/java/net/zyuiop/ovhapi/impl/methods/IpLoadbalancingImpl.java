package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.IpLoadbalancing;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class IpLoadbalancingImpl implements IpLoadbalancing { 

	private final OVHRawCalls client;

	public IpLoadbalancingImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/server/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ipLoadbalancing/$serviceName/backend/$id
	* Message : Missing identifier.
	*/


	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameBackendIdServerLinkId(java.lang.String serviceName, long id, long linkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backend/" + id + "/server/" + linkId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getIpLoadbalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//ipLoadbalancing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getServiceNameBackendIdServer(java.lang.String serviceName, long id, java.lang.String cookie) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backend/" + id + "/server";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameBackendIdServer(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backend/" + id + "/server";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteServiceNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/server/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameBackend(java.lang.String serviceName, java.lang.String zone) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backend";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameBackend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backend";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/frontend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/frontend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ipLoadbalancing/$serviceName/backend/$id/server/$linkId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/refresh
	* Message : Missing identifier.
	*/


	public void deleteServiceNameFrontendId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/frontend/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/backend/$id/server/$linkId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/backend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/backend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/probeIp/$zone
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/backend/$id/server
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/backend/$id/server
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/ssl/$id
	* Message : Missing identifier.
	*/


	public long[] getServiceNameServer(java.lang.String serviceName, java.lang.String status, java.lang.String zone, java.lang.String address) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/server";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/server";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.Ip getServiceNameAllowedServers(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/allowedServers";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.Ip.class);
	}

	public long[] getServiceNameSsl(java.lang.String serviceName, java.lang.String serial, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String action) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/server
	* Message : Missing identifier.
	*/


	public void deleteServiceNameBackendId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/backend/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameNatIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/natIp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /ipLoadbalancing/$serviceName/frontend/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/task/$id
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/frontend/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/ssl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ipLoadbalancing/$serviceName/ssl
	* Message : Missing identifier.
	*/


	public void deleteServiceNameSslId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ssl/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getServiceNameFailover(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/failover";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("contactAdmin", contactAdmin);
		__dataMap.put("contactTech", contactTech);
		__dataMap.put("contactBilling", contactBilling);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ipLoadbalancing/$serviceName/backend/$id
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameProbeIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/probeIp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /ipLoadbalancing/$serviceName/server/$id
	* Message : Missing identifier.
	*/


	public long[] getServiceNameFrontend(java.lang.String serviceName, java.lang.String zone, long defaultBackendId, java.lang.String port) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/frontend";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameFrontend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/frontend";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public java.lang.String getAvailableZones() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/availableZones";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameAvailableServerZones(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + serviceName + "/availableServerZones";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

}
