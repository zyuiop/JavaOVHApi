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
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : PUT > /overTheBox/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String getAvailableOffers() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/availableOffers";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/remoteAccesses/$remoteAccessId
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameAvailableReleaseChannels(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/availableReleaseChannels";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postServiceNameRemoteAccessesRemoteAccessIdAuthorize(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses/" + remoteAccessId + "/authorize";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName/device/availableActions
	* Message : Missing identifier.
	*/


	public void deleteServiceNameRemoteAccessesRemoteAccessId(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses/" + remoteAccessId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postServiceNameLinkDevice(java.lang.String deviceId, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/linkDevice";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("deviceId", deviceId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
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
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/overTheBox";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDeviceActions(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/actions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDeviceActions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/actions";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/cancelResiliation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /overTheBox/$serviceName
	* Message : Missing identifier.
	*/


	public java.lang.String getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/tasks";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
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
