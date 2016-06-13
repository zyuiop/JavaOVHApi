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

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameIp(java.lang.String block, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ip";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("block", block);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + taskId + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public java.lang.String getServiceNameIpIpAvailableZone(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ip/" + ip + "/availableZone";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameDedicatedCloudDedicatedCloud(java.lang.String serviceName, java.lang.String dedicatedCloud) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedCloud/" + dedicatedCloud + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.CloudProject getServiceNameCloudProjectProject(java.lang.String serviceName, java.lang.String project) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cloudProject/" + project + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.CloudProject.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Vrack getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Vrack.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Ip getServiceNameIpIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ip/" + ip + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Ip.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer getServiceNameDedicatedServerDedicatedServer(java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedServer/" + dedicatedServer + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect getServiceNameDedicatedConnectName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedConnect/" + name + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /vrack/$serviceName/dedicatedServer/$dedicatedServer/mrtg
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.vrack.AllowedServices getServiceNameAllowedServices(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/allowedServices";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.AllowedServices.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameDedicatedCloud(java.lang.String dedicatedCloud, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedCloud";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dedicatedCloud", dedicatedCloud);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public java.lang.String getServiceNameDedicatedCloud(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedCloud";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameDedicatedServer(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedServer";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameIpIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ip/" + ip + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public java.lang.String getServiceNameDedicatedConnect(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedConnect";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameDedicatedServer(java.lang.String dedicatedServer, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedServer";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("dedicatedServer", dedicatedServer);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud getServiceNameDedicatedCloudDedicatedCloud(java.lang.String serviceName, java.lang.String dedicatedCloud) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedCloud/" + dedicatedCloud + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud.class);
	}

	public void putServiceNameDedicatedConnectName(net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect param0, java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedConnect/" + name + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public java.lang.String getServiceNameCloudProject(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cloudProject";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameIp(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ip";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getServiceNameLegacyVrack(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/legacyVrack";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String getVrack() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//vrack";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameLegacyVrack(java.lang.String legacyVrack, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/legacyVrack";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("legacyVrack", legacyVrack);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameCloudProjectProject(java.lang.String serviceName, java.lang.String project) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/cloudProject/" + project + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameIpIpAnnounceInZone(java.lang.String zone, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/ip/" + ip + "/announceInZone";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("zone", zone);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameDedicatedServerDedicatedServer(java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/dedicatedServer/" + dedicatedServer + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.vrack.Vrack param0, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.LegacyVrack getServiceNameLegacyVrackLegacyVrack(java.lang.String serviceName, java.lang.String legacyVrack) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/legacyVrack/" + legacyVrack + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.LegacyVrack.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameLegacyVrackLegacyVrack(java.lang.String serviceName, java.lang.String legacyVrack) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/legacyVrack/" + legacyVrack + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

}
