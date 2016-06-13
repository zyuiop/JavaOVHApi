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

	public net.zyuiop.ovhapi.api.objects.router.PrivateLink getServiceNamePrivateLinkPeerServiceName(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.PrivateLink.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNamePrivateLinkPeerServiceName(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Vpn getServiceNameVpnId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Vpn.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Network getServiceNameNetworkIpNet(java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/network/" + ipNet + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Network.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNamePrivateLinkPeerServiceNameRouteNetwork(java.lang.String serviceName, java.lang.String peerServiceName, java.lang.String network) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "/route/" + network + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public void putServiceNameVpnId(net.zyuiop.ovhapi.api.objects.router.Vpn param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "/route";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public long[] getServiceNameVpn(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), long[].class);
	}

	public java.lang.String getServiceNamePrivateLink(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public java.lang.String postServiceNamePrivateLink(java.lang.String peerServiceName, java.lang.String name, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("peerServiceName", peerServiceName);
		dataMap.put("name", name);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.PrivateLinkRequest getServiceNamePrivateLinkPeerServiceNameRequest(java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "/request";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.PrivateLinkRequest.class);
	}

	public java.lang.String postServiceNamePrivateLinkPeerServiceNameRequestManage(java.lang.String action, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "/request/manage";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("action", action);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public void putServiceNameNetworkIpNet(net.zyuiop.ovhapi.api.objects.router.Network param0, java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/network/" + ipNet + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
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

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNameNetwork(java.lang.String ipNet, java.lang.String description, java.lang.String serviceName, long vlanTag) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/network";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ipNet", ipNet);
		dataMap.put("description", description);
		dataMap.put("vlanTag", vlanTag);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNameNetwork(java.lang.String ipNet, java.lang.String description, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/network";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("ipNet", ipNet);
		dataMap.put("description", description);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Vpn postServiceNameVpn(java.lang.String psk, java.lang.String serverPrivNet, java.lang.String clientPrivNet, java.lang.String serviceName, java.lang.String clientIp) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("psk", psk);
		dataMap.put("serverPrivNet", serverPrivNet);
		dataMap.put("clientPrivNet", clientPrivNet);
		dataMap.put("clientIp", clientIp);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Vpn.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Vpn postServiceNameVpn(java.lang.String psk, java.lang.String serverPrivNet, java.lang.String clientPrivNet, java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("psk", psk);
		dataMap.put("serverPrivNet", serverPrivNet);
		dataMap.put("clientPrivNet", clientPrivNet);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Vpn.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNamePrivateLinkPeerServiceNameRoute(java.lang.String network, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "/route";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("network", network);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.PrivateLinkRoute getServiceNamePrivateLinkPeerServiceNameRouteNetwork(java.lang.String serviceName, java.lang.String peerServiceName, java.lang.String network) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "/route/" + network + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.PrivateLinkRoute.class);
	}

	public java.lang.String getRouter() throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0//router";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Router getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Router.class);
	}

	public java.lang.String getServiceNameNetwork(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/network";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNameNetworkIpNet(java.lang.String serviceName, java.lang.String ipNet) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/network/" + ipNet + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task deleteServiceNameVpnId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn/" + id + "";
		Map<Object, Object> dataMap = new HashMap<>();
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.DELETE;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/task/" + id + "";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/serviceInfos";
		String data = "?";
		OVHApiMethod method = OVHApiMethod.GET;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void putServiceNamePrivateLinkPeerServiceName(net.zyuiop.ovhapi.api.objects.router.PrivateLink param0, java.lang.String serviceName, java.lang.String peerServiceName) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/privateLink/" + peerServiceName + "";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("null", null);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.PUT;
		URL url = new URL(callUrl);
		this.client.callRaw(url, method, data, true);
	}

	public net.zyuiop.ovhapi.api.objects.router.Task postServiceNameVpnIdSetPsk(java.lang.String psk, java.lang.String serviceName, long id) throws java.io.IOException {
		String callUrl = "https://api.ovh.com/1.0/" + serviceName + "/vpn/" + id + "/setPsk";
		Map<Object, Object> dataMap = new HashMap<>();
		dataMap.put("psk", psk);
		String data = new Gson().toJson(dataMap);
		OVHApiMethod method = OVHApiMethod.POST;
		URL url = new URL(callUrl);
		return new Gson().fromJson(this.client.callRaw(url, method, data, true), net.zyuiop.ovhapi.api.objects.router.Task.class);
	}

}
