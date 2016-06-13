package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.OverTheBox;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class OverTheBoxImpl implements OverTheBox { 

	private final OVHRawCalls client;

	public OverTheBoxImpl(OVHRawCalls client) { 
		this.client = client;
	}


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/tasks/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/device
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameRemoteAccesses(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/remoteAccesses";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /overTheBox/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String getAvailableOffers() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/availableOffers";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/remoteAccesses/$remoteAccessId
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameAvailableReleaseChannels(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/availableReleaseChannels";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postServiceNameRemoteAccessesRemoteAccessIdAuthorize(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/remoteAccesses/" + remoteAccessId + "/authorize";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
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


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/device/availableActions
	* Message : Missing identifier.
	*/


	public void deleteServiceNameRemoteAccessesRemoteAccessId(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/remoteAccesses/" + remoteAccessId + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void deleteServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public void postServiceNameLinkDevice(java.lang.String deviceId, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/linkDevice";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("deviceId", deviceId);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /overTheBox/$serviceName/device/actions
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/device/actions/$actionId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /overTheBox/devices
	* Message : Missing identifier.
	*/


	public java.lang.String getOverTheBox() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//overTheBox";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDeviceActions(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/device/actions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDeviceActions(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/device/actions";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cancelResiliation";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/tasks";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /overTheBox/$serviceName/remoteAccesses
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /overTheBox/$serviceName/remoteAccesses
	* Message : Missing identifier.
	*/


}
