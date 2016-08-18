package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Router;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class RouterImpl implements Router { 

	private final OVHRawCalls client;

	public RouterImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNameVpnIdSetPsk(java.lang.String psk, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn/" + id + "/setPsk";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("psk", psk);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public java.lang.String[] getServiceNamePrivateLink(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.router.PrivateLinkRequest getServiceNamePrivateLinkPeerServiceNameRequest(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/request";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "peerServiceName=" + peerServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.PrivateLinkRequest.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.PrivateLinkRoute getServiceNamePrivateLinkPeerServiceNameRouteNetwork(java.lang.String serviceName, java.lang.String peerServiceName, java.lang.String network) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/route/" + network + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "peerServiceName=" + peerServiceName;
		__data += "network=" + network;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.PrivateLinkRoute.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNameVpnId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNamePrivateLinkPeerServiceName(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNamePrivateLinkPeerServiceNameRouteNetwork(java.lang.String serviceName, java.lang.String peerServiceName, java.lang.String network) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/route/" + network + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNameNetwork(java.lang.String ipNet, java.lang.String description, java.lang.String serviceName, long vlanTag) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipNet", ipNet);
		__dataMap.put("description", description);
		__dataMap.put("vlanTag", vlanTag);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNameNetwork(java.lang.String ipNet, java.lang.String description, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipNet", ipNet);
		__dataMap.put("description", description);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public java.lang.String postServiceNamePrivateLinkPeerServiceNameRequestManage(java.lang.String action, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/request/manage";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String[] getServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/route";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "peerServiceName=" + peerServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceNameNetworkIpNet(net.zyuiop.ovhapi.api.objects.router.Network param0, java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network/" + ipNet + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNameNetworkIpNet(java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network/" + ipNet + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/task/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Router getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Router.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String network, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "/route";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("network", network);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public void putServiceNameVpnId(net.zyuiop.ovhapi.api.objects.router.Vpn param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.router.PrivateLink getServiceNamePrivateLinkPeerServiceName(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "peerServiceName=" + peerServiceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.PrivateLink.class);
	}

	public void putServiceNamePrivateLinkPeerServiceName(net.zyuiop.ovhapi.api.objects.router.PrivateLink param0, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink/" + peerServiceName + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.router.Vpn getServiceNameVpnId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Vpn.class);
	}

	public java.lang.String[] getRouter() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/router";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameNetwork(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getServiceNameVpn(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Network getServiceNameNetworkIpNet(java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/network/" + ipNet + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "ipNet=" + ipNet;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Network.class);
	}

	public java.lang.String postServiceNamePrivateLink(java.lang.String peerServiceName, java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/privateLink";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("peerServiceName", peerServiceName);
		__dataMap.put("name", name);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Vpn postServiceNameVpn(java.lang.String psk, java.lang.String serverPrivNet, java.lang.String clientPrivNet, java.lang.String serviceName, java.lang.String clientIp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("psk", psk);
		__dataMap.put("serverPrivNet", serverPrivNet);
		__dataMap.put("clientPrivNet", clientPrivNet);
		__dataMap.put("clientIp", clientIp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Vpn.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Vpn postServiceNameVpn(java.lang.String psk, java.lang.String serverPrivNet, java.lang.String clientPrivNet, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/router/" + serviceName + "/vpn";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("psk", psk);
		__dataMap.put("serverPrivNet", serverPrivNet);
		__dataMap.put("clientPrivNet", clientPrivNet);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.router.Vpn.class);
	}

}
