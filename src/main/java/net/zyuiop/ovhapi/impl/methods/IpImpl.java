package net.zyuiop.ovhapi.impl.methods;

import net.zyuiop.ovhapi.api.methods.Ip;
import com.google.gson.Gson;
import net.zyuiop.ovhapi.api.OVHApiMethod;
import java.util.HashMap;
import java.util.Map;
import net.zyuiop.ovhapi.impl.OVHRawCalls;
import java.net.URL;
public class IpImpl implements Ip { 

	private final OVHRawCalls client;

	public IpImpl(OVHRawCalls client) { 
		this.client = client;
	}

	public void putIpRipe(net.zyuiop.ovhapi.api.objects.ip.RipeInfos param0, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/ripe";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getIpSpam(java.lang.String ip, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/spam";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpSpam(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/spam";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationIp getIpMitigationIpOnMitigation(java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation/" + ipOnMitigation + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnMitigation=" + ipOnMitigation;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationIpImpl.class);
	}

	public java.lang.String[] getIpMitigationProfiles(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void deleteIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postIpAntihackIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/antihack/" + ipBlocked + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.GameMitigation getIpGameIpOnGame(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/game/" + ipOnGame + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnGame=" + ipOnGame;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.GameMitigationImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseIp getIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/reverse/" + ipReverse + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipReverse=" + ipReverse;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.ReverseIpImpl.class);
	}

	public long[] getIpGameIpOnGameRule(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/game/" + ipOnGame + "/rule";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnGame=" + ipOnGame;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : DELETE > /ip/$ip/game/$ipOnGame/rule/$id
	* Message : Missing identifier.
	*/


	public void postIpArpIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/arp/" + ipBlocked + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getIpPhishing(java.lang.String ip, java.lang.String ipOnAntiphishing, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/phishing";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnAntiphishing=" + ipOnAntiphishing;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getIpPhishing(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/phishing";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken postIpMigrationToken(java.lang.String customerId, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/migrationToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("customerId", customerId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpMigrationTokenImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationIp postIpMitigation(java.lang.String ipOnMitigation, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipOnMitigation", ipOnMitigation);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationIpImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/portsRedirection
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpAntihack(java.lang.String ip, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/antihack";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpAntihack(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/antihack";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String getLoadBalancingServiceNameInternalNatIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/internalNatIp";
		String __data = "?";
		__data += "zone=" + zone;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String[] getIpLicenseWindows(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/windows";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseWindows(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/windows";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.Ip getIp(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.RipeInfos getIpRipe(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/ripe";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.RipeInfosImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpPark(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/park";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpTaskImpl.class);
	}

	public java.lang.String deleteIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putIpFirewallIpOnFirewall(net.zyuiop.ovhapi.api.objects.ip.FirewallIp param0, java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpChangeOrg(java.lang.String organisation, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/changeOrg";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("organisation", organisation);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.SpamIp getIpSpamIpSpamming(java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/spam/" + ipSpamming + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipSpamming=" + ipSpamming;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.SpamIpImpl.class);
	}

	public long[] getIpFirewallIpOnFirewallRule(java.lang.String ip, java.lang.String ipOnFirewall, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "/rule";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnFirewall=" + ipOnFirewall;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getIpFirewallIpOnFirewallRule(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "/rule";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnFirewall=" + ipOnFirewall;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/loadBalancing/$serviceName/portsRedirection/$srcPort
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.ip.FirewallIp getIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnFirewall=" + ipOnFirewall;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.FirewallIpImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.SpamIp postIpSpamIpSpammingUnblock(java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/spam/" + ipSpamming + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.SpamIpImpl.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/game/$ipOnGame/rule/$id
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpLicensePlesk(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/plesk";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicensePlesk(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/plesk";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putLoadBalancingServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/serviceInfos";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putIpMitigationIpOnMitigation(net.zyuiop.ovhapi.api.objects.ip.MitigationIp param0, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation/" + ipOnMitigation + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingIp getLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingIpImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpTerminate(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpTaskImpl.class);
	}

	public java.lang.String[] getIpReverse(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/reverse";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp getLoadBalancingServiceNameBackendBackend(java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend/" + backend + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "backend=" + backend;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingBackendIpImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule deleteIpFirewallIpOnFirewallRuleSequence(java.lang.String ip, java.lang.String ipOnFirewall, long sequence) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "/rule/" + sequence + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.FirewallNetworkRuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameStickiness(java.lang.String stickiness, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/stickiness";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("stickiness", stickiness);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public void deleteIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/reverse/" + ipReverse + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getIpLicenseWorklight(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/worklight";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseWorklight(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/worklight";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpGame(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/game";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putLoadBalancingServiceNameBackendBackend(net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp param0, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend/" + backend + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationProfile getIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipMitigationProfile=" + ipMitigationProfile;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationProfileImpl.class);
	}

	public long[] getLoadBalancingServiceNamePortsRedirection(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/portsRedirection";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseIp postIpReverse(java.lang.String ipReverse, java.lang.String reverse, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/reverse";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipReverse", ipReverse);
		__dataMap.put("reverse", reverse);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.ReverseIpImpl.class);
	}

	public java.lang.String[] getLoadBalancingServiceNameProbeIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/probeIp";
		String __data = "?";
		__data += "zone=" + zone;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putIpMitigationProfilesIpMitigationProfile(net.zyuiop.ovhapi.api.objects.ip.MitigationProfile param0, java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask getLoadBalancingServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationProfile postIpMitigationProfiles(java.lang.String ipMitigationProfile, long autoMitigationTimeOut, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipMitigationProfile", ipMitigationProfile);
		__dataMap.put("autoMitigationTimeOut", autoMitigationTimeOut);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationProfileImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationIp deleteIpMitigationIpOnMitigation(java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation/" + ipOnMitigation + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationIpImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.Antiphishing getIpPhishingId(java.lang.String ip, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/phishing/" + id + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "id=" + id;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.AntiphishingImpl.class);
	}

	public java.lang.String[] getIpLicenseSqlserver(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/sqlserver";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseSqlserver(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/sqlserver";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation postIpDelegation(java.lang.String target, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/delegation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("target", target);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.ReverseDelegationImpl.class);
	}

	public java.lang.String[] getIpLicenseDirectadmin(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/directadmin";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseDirectadmin(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/directadmin";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/firewall/$ipOnFirewall/rule
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule postIpFirewallIpOnFirewallRule(java.lang.String protocol, long sequence, java.lang.String action, java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "/rule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("sequence", sequence);
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.FirewallNetworkRuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation getIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/delegation/" + target + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "target=" + target;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.ReverseDelegationImpl.class);
	}

	public java.lang.String[] getIp(java.lang.String ip, java.lang.String routedToServiceName, java.lang.String type, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/ip";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "routedTo.serviceName=" + routedToServiceName;
		__data += "type=" + type;
		__data += "description=" + description;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIp() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/ip";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameImportCustomSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/importCustomSsl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		__dataMap.put("chain", chain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameImportCustomSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/importCustomSsl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendSetWeight(long weight, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend/" + backend + "/setWeight";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("weight", weight);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public long[] getLoadBalancingServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationStats[] getIpMitigationIpOnMitigationStats(java.util.Date to, java.util.Date from, java.lang.String scale, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation/" + ipOnMitigation + "/stats";
		String __data = "?";
		__data += "to=" + to;
		__data += "from=" + from;
		__data += "scale=" + scale;
		__data += "ip=" + ip;
		__data += "ipOnMitigation=" + ipOnMitigation;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationStatsImpl[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationDetailedStats[] getIpMitigationIpOnMitigationTopStream(java.util.Date date, java.lang.String scale, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation/" + ipOnMitigation + "/topStream";
		String __data = "?";
		__data += "date=" + date;
		__data += "scale=" + scale;
		__data += "ip=" + ip;
		__data += "ipOnMitigation=" + ipOnMitigation;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.MitigationDetailedStatsImpl[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask getIpTaskTaskId(java.lang.String ip, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/task/" + taskId + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "taskId=" + taskId;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule getIpFirewallIpOnFirewallRuleSequence(java.lang.String ip, java.lang.String ipOnFirewall, long sequence) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "/rule/" + sequence + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipOnFirewall=" + ipOnFirewall;
		__data += "sequence=" + sequence;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.FirewallNetworkRuleImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask deleteLoadBalancingServiceNameBackendBackend(java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend/" + backend + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public void deleteIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/delegation/" + target + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken getIpMigrationToken(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/migrationToken";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpMigrationTokenImpl.class);
	}

	public java.lang.String[] getIpMitigation(java.lang.String ip, boolean auto, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "auto=" + auto;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpMitigation(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigation";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getLoadBalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseCpanel(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/cpanel";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseCpanel(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/cpanel";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/game/$ipOnGame/rule
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpMove(java.lang.String to, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/move";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("to", to);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.IpTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackend(java.lang.String ipBackend, java.lang.String probe, java.lang.String serviceName, long weight) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBackend", ipBackend);
		__dataMap.put("probe", probe);
		__dataMap.put("weight", weight);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackend(java.lang.String ipBackend, java.lang.String probe, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBackend", ipBackend);
		__dataMap.put("probe", probe);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask deleteLoadBalancingServiceNamePortsRedirectionSrcPort(java.lang.String serviceName, long srcPort) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/portsRedirection/" + srcPort + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.FirewallIp postIpFirewall(java.lang.String ipOnFirewall, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipOnFirewall", ipOnFirewall);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.FirewallIpImpl.class);
	}

	public java.lang.String[] getLoadBalancingServiceNameBackend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.BlockedIp getIpAntihackIpBlocked(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/antihack/" + ipBlocked + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipBlocked=" + ipBlocked;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.BlockedIpImpl.class);
	}

	public java.lang.String[] getIpDelegation(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/delegation";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public long[] getIpTask(java.lang.String ip, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/task";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "function=" + function;
		__data += "status=" + status;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getIpTask(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/task";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getLoadBalancingServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/serviceInfos";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.services.ServiceImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameRestoreSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/restoreSsl";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.SpamStats[] getIpSpamIpSpammingStats(java.util.Date to, java.util.Date from, java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/spam/" + ipSpamming + "/stats";
		String __data = "?";
		__data += "to=" + to;
		__data += "from=" + from;
		__data += "ip=" + ip;
		__data += "ipSpamming=" + ipSpamming;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.SpamStatsImpl[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ArpBlockedIp getIpArpIpBlocked(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/arp/" + ipBlocked + "";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipBlocked=" + ipBlocked;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.ArpBlockedIpImpl.class);
	}

	public void putIp(net.zyuiop.ovhapi.api.objects.ip.Ip param0, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getIpFirewall(java.lang.String ip, java.lang.String state, boolean enabled) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "state=" + state;
		__data += "enabled=" + enabled;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpFirewall(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpArp(java.lang.String ip, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/arp";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "state=" + state;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpArp(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/arp";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseVirtuozzo(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/virtuozzo";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseVirtuozzo(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/virtuozzo";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public void putIpGameIpOnGame(net.zyuiop.ovhapi.api.objects.ip.GameMitigation param0, java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/game/" + ipOnGame + "";
		String __data = new Gson().toJson(param0);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String[] getLoadBalancingServiceNameAllowedBackends(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/allowedBackends";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendBackupState(boolean backupStateSet, java.lang.String serviceName, java.lang.String backend, java.lang.String mainBackendIp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend/" + backend + "/backupState";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("backupStateSet", backupStateSet);
		__dataMap.put("mainBackendIp", mainBackendIp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendBackupState(boolean backupStateSet, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend/" + backend + "/backupState";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("backupStateSet", backupStateSet);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.impl.objects.ip.LoadBalancingTaskImpl.class);
	}

	public java.lang.String[] getIpLicenseCloudLinux(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/cloudLinux";
		String __data = "?";
		__data += "ip=" + ip;
		__data += "ipAddress=" + ipAddress;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpLicenseCloudLinux(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/license/cloudLinux";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

}
