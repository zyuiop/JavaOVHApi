package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Vrack;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class VrackImpl implements Vrack { 

	private final OVHRawCalls client;

	public VrackImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public java.lang.String[] getVrack() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/vrack";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Vrack getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Vrack.class);
	}

	public java.lang.String[] getServiceNameLegacyVrack(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/legacyVrack";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameDedicatedConnect(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedConnect";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.CloudProject getServiceNameCloudProjectProject(java.lang.String serviceName, java.lang.String project) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/cloudProject/" + project + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "project=" + project;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.CloudProject.class);
	}

	public java.lang.String[] getServiceNameIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud getServiceNameDedicatedCloudDedicatedCloud(java.lang.String serviceName, java.lang.String dedicatedCloud) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedCloud/" + dedicatedCloud + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "dedicatedCloud=" + dedicatedCloud;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameLegacyVrackLegacyVrack(java.lang.String serviceName, java.lang.String legacyVrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/legacyVrack/" + legacyVrack + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public void putServiceNameDedicatedConnectName(net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect param0, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedConnect/" + name + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameDedicatedCloud(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedCloud";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.LegacyVrack getServiceNameLegacyVrackLegacyVrack(java.lang.String serviceName, java.lang.String legacyVrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/legacyVrack/" + legacyVrack + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "legacyVrack=" + legacyVrack;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.LegacyVrack.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameIpIpAnnounceInZone(java.lang.String zone, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip/" + ip + "/announceInZone";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.AllowedServices getServiceNameAllowedServices(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/allowedServices";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.AllowedServices.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameLegacyVrack(java.lang.String legacyVrack, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/legacyVrack";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("legacyVrack", legacyVrack);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public java.lang.String[] getServiceNameDedicatedServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedServer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameDedicatedServer(java.lang.String dedicatedServer, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedServer";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dedicatedServer", dedicatedServer);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameDedicatedServerDedicatedServer(java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedServer/" + dedicatedServer + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameIpIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameIp(java.lang.String block, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("block", block);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public java.lang.String[] getServiceNameIpIpAvailableZone(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip/" + ip + "/availableZone";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect getServiceNameDedicatedConnectName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedConnect/" + name + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect.class);
	}

	public java.lang.String[] getServiceNameCloudProject(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/cloudProject";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicated.server.MrtgTimestampValue[] getServiceNameDedicatedServerDedicatedServerMrtg(java.lang.String period, java.lang.String type, java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedServer/" + dedicatedServer + "/mrtg";
		String __data = "?";
		__data += "period=" + period;
		__data += "type=" + type;
		__data += "serviceName=" + serviceName;
		__data += "dedicatedServer=" + dedicatedServer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicated.server.MrtgTimestampValue[].class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.vrack.Vrack param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameDedicatedCloud(java.lang.String dedicatedCloud, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedCloud";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("dedicatedCloud", dedicatedCloud);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Ip getServiceNameIpIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/ip/" + ip + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Ip.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameCloudProjectProject(java.lang.String serviceName, java.lang.String project) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/cloudProject/" + project + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer getServiceNameDedicatedServerDedicatedServer(java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedServer/" + dedicatedServer + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "dedicatedServer=" + dedicatedServer;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameDedicatedCloudDedicatedCloud(java.lang.String serviceName, java.lang.String dedicatedCloud) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/vrack/" + serviceName + "/dedicatedCloud/" + dedicatedCloud + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

}
