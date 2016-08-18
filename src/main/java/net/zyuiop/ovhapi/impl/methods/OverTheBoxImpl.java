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

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/cancelResiliation";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.Service getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.Device getServiceNameDevice(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.Device.class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction postServiceNameDeviceActions(java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/actions";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction.class);
	}

	public java.lang.String[] getServiceNameAvailableReleaseChannels(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/availableReleaseChannels";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameRemoteAccesses(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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

	public void deleteServiceNameRemoteAccessesRemoteAccessId(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses/" + remoteAccessId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction getServiceNameDeviceActionsActionId(java.lang.String serviceName, java.lang.String actionId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/actions/" + actionId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "actionId=" + actionId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.DeviceAction.class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess postServiceNameRemoteAccesses(long exposedPort, java.lang.String serviceName, java.lang.String allowedIp, java.lang.String publicKey, java.util.Date expirationDate) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("exposedPort", exposedPort);
		__dataMap.put("allowedIp", allowedIp);
		__dataMap.put("publicKey", publicKey);
		__dataMap.put("expirationDate", expirationDate);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess.class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess postServiceNameRemoteAccesses(long exposedPort, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("exposedPort", exposedPort);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess.class);
	}

	public java.lang.String[] getOverTheBox() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/overTheBox";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameTasks(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/tasks";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.DeviceForRegistration[] postDevices() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/devices";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.DeviceForRegistration[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.overthebox.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.Task getServiceNameTasksTaskId(java.lang.String serviceName, java.lang.String taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/tasks/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.Task.class);
	}

	public void deleteServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameDeviceActions(java.lang.String serviceName, java.lang.String status, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/actions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDeviceActions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/actions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess getServiceNameRemoteAccessesRemoteAccessId(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses/" + remoteAccessId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "remoteAccessId=" + remoteAccessId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.RemoteAccess.class);
	}

	public java.lang.String[] getAvailableOffers() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/availableOffers";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.overthebox.AvailableDeviceAction[] getServiceNameDeviceAvailableActions(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/device/availableActions";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.overthebox.AvailableDeviceAction[].class);
	}

	public void postServiceNameRemoteAccessesRemoteAccessIdAuthorize(java.lang.String serviceName, java.lang.String remoteAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/overTheBox/" + serviceName + "/remoteAccesses/" + remoteAccessId + "/authorize";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

}
