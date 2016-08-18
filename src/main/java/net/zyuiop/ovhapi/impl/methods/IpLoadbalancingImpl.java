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

	public long[] getServiceNameBackend(java.lang.String serviceName, java.lang.String zone) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "zone=" + zone;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameBackend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameBackendIdServer(java.lang.String serviceName, long id, java.lang.String cookie) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		__data += "cookie=" + cookie;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameBackendIdServer(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer getServiceNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/server/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Ip getServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Ip.class);
	}

	public void putServiceNameBackendId(net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameTask(java.lang.String serviceName, java.lang.String action) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "action=" + action;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/changeContact";
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
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/changeContact";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public void deleteServiceNameSslId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/ssl/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putServiceNameBackendIdServerLinkId(net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server param0, java.lang.String serviceName, long id, long linkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server/" + linkId + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend getServiceNameBackendId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend.class);
	}

	public long[] getServiceNameSsl(java.lang.String serviceName, java.lang.String serial, java.lang.String type) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/ssl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "serial=" + serial;
		__data += "type=" + type;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/ssl";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Task getServiceNameTaskId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/task/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Task.class);
	}

	public java.lang.String[] getServiceNameProbeIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/probeIp";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.Ip[] getServiceNameAllowedServers(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/allowedServers";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.Ip[].class);
	}

	public void deleteServiceNameServerId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/server/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public void deleteServiceNameFrontendId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server postServiceNameBackendIdServer(long serverId, java.lang.String serviceName, long id, boolean ssl, java.lang.String cookie, java.lang.String proxyProtocolVersion, java.lang.String chain, long weight, boolean backup, boolean probe) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("serverId", serverId);
		__dataMap.put("ssl", ssl);
		__dataMap.put("cookie", cookie);
		__dataMap.put("proxyProtocolVersion", proxyProtocolVersion);
		__dataMap.put("chain", chain);
		__dataMap.put("weight", weight);
		__dataMap.put("backup", backup);
		__dataMap.put("probe", probe);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server postServiceNameBackendIdServer(long serverId, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("serverId", serverId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl getServiceNameSslId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/ssl/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl.class);
	}

	public void putServiceNameServerId(net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/server/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend getServiceNameFrontendId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend/" + id + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend.class);
	}

	public java.lang.String[] getIpLoadbalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/ipLoadbalancing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getServiceNameFailover(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/failover";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Task postServiceNameRefresh(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/refresh";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Task.class);
	}

	public void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void deleteServiceNameBackendId(java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameAvailableServerZones(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/availableServerZones";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putServiceNameFrontendId(net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend param0, java.lang.String serviceName, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend/" + id + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getServiceNameFrontend(java.lang.String serviceName, java.lang.String zone, long defaultBackendId, java.lang.String port) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "zone=" + zone;
		__data += "defaultBackendId=" + defaultBackendId;
		__data += "port=" + port;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameFrontend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend postServiceNameFrontend(java.lang.String zone, java.lang.String port, java.lang.String serviceName, java.lang.String redirectLocation, boolean ssl, long defaultBackendId, boolean hsts) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		__dataMap.put("port", port);
		__dataMap.put("redirectLocation", redirectLocation);
		__dataMap.put("ssl", ssl);
		__dataMap.put("defaultBackendId", defaultBackendId);
		__dataMap.put("hsts", hsts);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend postServiceNameFrontend(java.lang.String zone, java.lang.String port, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/frontend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		__dataMap.put("port", port);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Frontend.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer postServiceNameServer(java.lang.String status, java.lang.String address, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/server";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("status", status);
		__dataMap.put("address", address);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.CustomerServer.class);
	}

	public void deleteServiceNameBackendIdServerLinkId(java.lang.String serviceName, long id, long linkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server/" + linkId + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getServiceNameNatIp(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/natIp";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getAvailableZones() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/availableZones";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/ssl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		__dataMap.put("chain", chain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/ssl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Ssl.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend postServiceNameBackend(java.lang.String zone, java.lang.String type, java.lang.String serviceName, java.lang.String balance, java.lang.String probe, long port, java.lang.String stickiness) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		__dataMap.put("type", type);
		__dataMap.put("balance", balance);
		__dataMap.put("probe", probe);
		__dataMap.put("port", port);
		__dataMap.put("stickiness", stickiness);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend postServiceNameBackend(java.lang.String zone, java.lang.String type, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("zone", zone);
		__dataMap.put("type", type);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server getServiceNameBackendIdServerLinkId(java.lang.String serviceName, long id, long linkId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/backend/" + id + "/server/" + linkId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "id=" + id;
		__data += "linkId=" + linkId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.Backend_Server.class);
	}

	public net.zyuiop.ovhapi.api.objects.iploadbalancing.ip.ProbeIp getServiceNameProbeIpZone(java.lang.String serviceName, java.lang.String zone) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/probeIp/" + zone + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "zone=" + zone;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.iploadbalancing.ip.ProbeIp.class);
	}

	public long[] getServiceNameServer(java.lang.String serviceName, java.lang.String status, java.lang.String zone, java.lang.String address) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/server";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "status=" + status;
		__data += "zone=" + zone;
		__data += "address=" + address;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getServiceNameServer(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ipLoadbalancing/" + serviceName + "/server";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

}
