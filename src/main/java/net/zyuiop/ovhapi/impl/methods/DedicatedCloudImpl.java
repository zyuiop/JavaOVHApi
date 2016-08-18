package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.DedicatedCloud;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class DedicatedCloudImpl implements DedicatedCloud { 

	private final OVHRawCalls client;

	public DedicatedCloudImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public void putServiceNameTaskTaskId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task param0, java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/task/" + taskId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameAllowedNetwork(java.lang.String network, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/allowedNetwork";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("network", network);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public long[] getServiceNameFiler(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameOrderNewFilerHourly(java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/orderNewFilerHourly";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameDatacenterDatacenterIdBackup(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/backup";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenterDatacenterIdBackup(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/backup";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUser(java.lang.String name, java.lang.String serviceName, boolean canAddRessource, java.lang.String email, java.lang.String right, java.lang.String password, java.lang.String vmNetworkRole, java.lang.String networkRole) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		__dataMap.put("canAddRessource", canAddRessource);
		__dataMap.put("email", email);
		__dataMap.put("right", right);
		__dataMap.put("password", password);
		__dataMap.put("vmNetworkRole", vmNetworkRole);
		__dataMap.put("networkRole", networkRole);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUser(java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Right getServiceNameUserUserIdRightRightId(java.lang.String serviceName, long userId, long rightId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/right/" + rightId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		__data += "rightId=" + rightId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Right.class);
	}

	public void putServiceNameDatacenterDatacenterId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Datacenter param0, java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameVlan(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vlan";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPrices getServiceNameNewPrices(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/newPrices";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPrices.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.host.Profile[] getServiceNameDatacenterDatacenterIdOrderableHostProfiles(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/orderableHostProfiles";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.host.Profile[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Filer getServiceNameFilerFilerId(java.lang.String serviceName, long filerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/filer/" + filerId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "filerId=" + filerId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Filer.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.PasswordPolicy getServiceNamePasswordPolicy(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/passwordPolicy";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.PasswordPolicy.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud getServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vrack/" + vrack + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "vrack=" + vrack;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud.class);
	}

	public java.lang.String[] getServiceNameOrderableIpCountries(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/orderableIpCountries";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangeProperties(java.lang.String serviceName, long userId, java.lang.String email, boolean fullAdminRo, boolean canManageIpFailOvers, boolean canManageNetwork) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/changeProperties";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("email", email);
		__dataMap.put("fullAdminRo", fullAdminRo);
		__dataMap.put("canManageIpFailOvers", canManageIpFailOvers);
		__dataMap.put("canManageNetwork", canManageNetwork);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangeProperties(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/changeProperties";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public void putServiceNameUserUserIdTaskTaskId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task param0, java.lang.String serviceName, long userId, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/task/" + taskId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.DedicatedCloud getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.DedicatedCloud.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.filer.Profile[] getServiceNameDatacenterDatacenterIdOrderableFilerProfiles(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/orderableFilerProfiles";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.filer.Profile[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUpgradeHypervisor(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/upgradeHypervisor";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.AllowedNetwork getServiceNameAllowedNetworkNetworkAccessId(java.lang.String serviceName, long networkAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/allowedNetwork/" + networkAccessId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "networkAccessId=" + networkAccessId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.AllowedNetwork.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdResetPassword(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/resetPassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameDatacenterDatacenterIdHost(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/host";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task getServiceNameUserUserIdTaskTaskId(java.lang.String serviceName, long userId, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.User getServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.User.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenterDatacenterIdOrderNewFilerHourly(java.lang.String name, java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/orderNewFilerHourly";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public void putServiceNameUserUserId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.User param0, java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.CommercialRange getCommercialRangeCommercialRangeName(java.lang.String commercialRangeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/commercialRange/" + commercialRangeName + "";
		String __data = "?";
		__data += "commercialRangeName=" + commercialRangeName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), net.zyuiop.ovhapi.api.objects.dedicatedcloud.CommercialRange.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Ip getServiceNameIpNetwork(java.lang.String serviceName, java.lang.String network) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/ip/" + network + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "network=" + network;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Ip.class);
	}

	public void putServiceName(net.zyuiop.ovhapi.api.objects.dedicatedcloud.DedicatedCloud param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Datacenter getServiceNameDatacenterDatacenterId(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Datacenter.class);
	}

	public java.lang.String[] getServiceNameCommercialRangeOrderable(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/commercialRange/orderable";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenter(java.lang.String serviceName, java.lang.String commercialRangeName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("commercialRangeName", commercialRangeName);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Vlan getServiceNameVlanVlanId(java.lang.String serviceName, long vlanId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vlan/" + vlanId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "vlanId=" + vlanId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Vlan.class);
	}

	public java.lang.String[] getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vrack";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Capabilities getServiceNameCapabilities(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/capabilities";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Capabilities.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdDisable(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/disable";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangePassword(java.lang.String serviceName, long userId, java.lang.String password) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("password", password);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangePassword(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/changePassword";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public java.lang.String[] getCommercialRange() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/commercialRange";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, false), java.lang.String[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdEnable(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/enable";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/vrack/" + vrack + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.vrack.Task.class);
	}

	public java.lang.String[] getServiceNameCommercialRangeCompliance(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/commercialRange/compliance";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenterDatacenterIdOrderNewHostHourly(java.lang.String name, java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/orderNewHostHourly";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public void putServiceNameDatacenterDatacenterIdTaskTaskId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task param0, java.lang.String serviceName, long datacenterId, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/task/" + taskId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameUserUserIdRight(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/right";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "userId=" + userId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void putServiceNameAllowedNetworkNetworkAccessId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.AllowedNetwork param0, java.lang.String serviceName, long networkAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/allowedNetwork/" + networkAccessId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Host getServiceNameDatacenterDatacenterIdHostHostId(java.lang.String serviceName, long datacenterId, long hostId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/host/" + hostId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		__data += "hostId=" + hostId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Host.class);
	}

	public long[] getServiceNameUser(java.lang.String serviceName, java.lang.String name) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "name=" + name;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public long[] getServiceNameDatacenterDatacenterIdFiler(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/filer";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Backup getServiceNameDatacenterDatacenterIdBackup(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/backup";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Backup.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameAllowedNetworkNetworkAccessId(java.lang.String serviceName, long networkAccessId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/allowedNetwork/" + networkAccessId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Filer getServiceNameDatacenterDatacenterIdFilerFilerId(java.lang.String serviceName, long datacenterId, long filerId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/filer/" + filerId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		__data += "filerId=" + filerId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Filer.class);
	}

	public void putServiceNameUserUserIdRightRightId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Right param0, java.lang.String serviceName, long userId, long rightId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/user/" + userId + "/right/" + rightId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getDedicatedCloud() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/dedicatedCloud";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameAllowedNetwork(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/allowedNetwork";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameDatacenterDatacenterId(java.lang.String serviceName, long datacenterId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task getServiceNameDatacenterDatacenterIdTaskTaskId(java.lang.String serviceName, long datacenterId, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/datacenter/" + datacenterId + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "datacenterId=" + datacenterId;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task.class);
	}

	public java.lang.String[] getServiceNameIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/dedicatedCloud/" + serviceName + "/ip";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
