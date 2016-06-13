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
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/ripe";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getIpSpam(java.lang.String ip, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/spam";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpSpam(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/spam";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationIp getIpMitigationIpOnMitigation(java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation/" + ipOnMitigation + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationIp.class);
	}

	public java.lang.String getIpMitigationProfiles(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigationProfiles";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void deleteIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void postIpAntihackIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/antihack/" + ipBlocked + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.GameMitigation getIpGameIpOnGame(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/game/" + ipOnGame + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.GameMitigation.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseIp getIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/reverse/" + ipReverse + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.ReverseIp.class);
	}

	public long[] getIpGameIpOnGameRule(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/game/" + ipOnGame + "/rule";
		String __data = "?";
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
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/arp/" + ipBlocked + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public long[] getIpPhishing(java.lang.String ip, java.lang.String ipOnAntiphishing, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/phishing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getIpPhishing(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/phishing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken postIpMigrationToken(java.lang.String customerId, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/migrationToken";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("customerId", customerId);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationIp postIpMitigation(java.lang.String ipOnMitigation, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipOnMitigation", ipOnMitigation);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationIp.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/portsRedirection
	* Message : Missing identifier.
	*/


	public java.lang.String getIpAntihack(java.lang.String ip, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/antihack";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpAntihack(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/antihack";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getLoadBalancingServiceNameInternalNatIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/internalNatIp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseWindows(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/windows";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseWindows(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/windows";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.Ip getIp(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.Ip.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.RipeInfos getIpRipe(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/ripe";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.RipeInfos.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpPark(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/park";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpTask.class);
	}

	public java.lang.String deleteIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putIpFirewallIpOnFirewall(net.zyuiop.ovhapi.api.objects.ip.FirewallIp param0, java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpChangeOrg(java.lang.String organisation, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/changeOrg";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("organisation", organisation);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.SpamIp getIpSpamIpSpamming(java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/spam/" + ipSpamming + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.SpamIp.class);
	}

	public long[] getIpFirewallIpOnFirewallRule(java.lang.String ip, java.lang.String ipOnFirewall, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "/rule";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getIpFirewallIpOnFirewallRule(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "/rule";
		String __data = "?";
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
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.FirewallIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.SpamIp postIpSpamIpSpammingUnblock(java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/spam/" + ipSpamming + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.SpamIp.class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/game/$ipOnGame/rule/$id
	* Message : Missing identifier.
	*/


	public java.lang.String getIpLicensePlesk(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/plesk";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicensePlesk(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/plesk";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putLoadBalancingServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/serviceInfos";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public void putIpMitigationIpOnMitigation(net.zyuiop.ovhapi.api.objects.ip.MitigationIp param0, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation/" + ipOnMitigation + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingIp getLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpTerminate(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/terminate";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpTask.class);
	}

	public java.lang.String getIpReverse(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/reverse";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp getLoadBalancingServiceNameBackendBackend(java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend/" + backend + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule deleteIpFirewallIpOnFirewallRuleSequence(java.lang.String ip, java.lang.String ipOnFirewall, long sequence) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "/rule/" + sequence + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameStickiness(java.lang.String stickiness, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/stickiness";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("stickiness", stickiness);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public void deleteIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/reverse/" + ipReverse + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getIpLicenseWorklight(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/worklight";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseWorklight(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/worklight";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpGame(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/game";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putLoadBalancingServiceNameBackendBackend(net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp param0, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend/" + backend + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationProfile getIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationProfile.class);
	}

	public long[] getLoadBalancingServiceNamePortsRedirection(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/portsRedirection";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseIp postIpReverse(java.lang.String ipReverse, java.lang.String reverse, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/reverse";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipReverse", ipReverse);
		__dataMap.put("reverse", reverse);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.ReverseIp.class);
	}

	public java.lang.String getLoadBalancingServiceNameProbeIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/probeIp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putIpMitigationProfilesIpMitigationProfile(net.zyuiop.ovhapi.api.objects.ip.MitigationProfile param0, java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask getLoadBalancingServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/task/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationProfile postIpMitigationProfiles(java.lang.String ipMitigationProfile, long autoMitigationTimeOut, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigationProfiles";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipMitigationProfile", ipMitigationProfile);
		__dataMap.put("autoMitigationTimeOut", autoMitigationTimeOut);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationProfile.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationIp deleteIpMitigationIpOnMitigation(java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation/" + ipOnMitigation + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationIp.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.Antiphishing getIpPhishingId(java.lang.String ip, long id) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/phishing/" + id + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.Antiphishing.class);
	}

	public java.lang.String getIpLicenseSqlserver(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/sqlserver";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseSqlserver(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/sqlserver";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation postIpDelegation(java.lang.String target, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/delegation";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("target", target);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation.class);
	}

	public java.lang.String getIpLicenseDirectadmin(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/directadmin";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseDirectadmin(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/directadmin";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/firewall/$ipOnFirewall/rule
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule postIpFirewallIpOnFirewallRule(java.lang.String protocol, long sequence, java.lang.String action, java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "/rule";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("protocol", protocol);
		__dataMap.put("sequence", sequence);
		__dataMap.put("action", action);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation getIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/delegation/" + target + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation.class);
	}

	public java.lang.String getIp(java.lang.String ip, java.lang.String routedToServiceName, java.lang.String type, java.lang.String description) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//ip";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIp() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0//ip";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameImportCustomSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/importCustomSsl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		__dataMap.put("chain", chain);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameImportCustomSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/importCustomSsl";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("certificate", certificate);
		__dataMap.put("key", key);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendSetWeight(long weight, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend/" + backend + "/setWeight";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("weight", weight);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public long[] getLoadBalancingServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationStats getIpMitigationIpOnMitigationStats(java.util.Date to, java.util.Date from, java.lang.String scale, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation/" + ipOnMitigation + "/stats";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationStats.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.MitigationDetailedStats getIpMitigationIpOnMitigationTopStream(java.util.Date date, java.lang.String scale, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation/" + ipOnMitigation + "/topStream";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.MitigationDetailedStats.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpTask getIpTaskTaskId(java.lang.String ip, long taskId) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/task/" + taskId + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule getIpFirewallIpOnFirewallRuleSequence(java.lang.String ip, java.lang.String ipOnFirewall, long sequence) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall/" + ipOnFirewall + "/rule/" + sequence + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask deleteLoadBalancingServiceNameBackendBackend(java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend/" + backend + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public void deleteIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/delegation/" + target + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken getIpMigrationToken(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/migrationToken";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken.class);
	}

	public java.lang.String getIpMitigation(java.lang.String ip, boolean auto, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpMitigation(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/mitigation";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getLoadBalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseCpanel(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/cpanel";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseCpanel(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/cpanel";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/game/$ipOnGame/rule
	* Message : Missing identifier.
	*/


	public net.zyuiop.ovhapi.api.objects.ip.IpTask postIpMove(java.lang.String to, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/move";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("to", to);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.IpTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackend(java.lang.String ipBackend, java.lang.String probe, java.lang.String serviceName, long weight) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBackend", ipBackend);
		__dataMap.put("probe", probe);
		__dataMap.put("weight", weight);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackend(java.lang.String ipBackend, java.lang.String probe, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipBackend", ipBackend);
		__dataMap.put("probe", probe);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask deleteLoadBalancingServiceNamePortsRedirectionSrcPort(java.lang.String serviceName, long srcPort) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/portsRedirection/" + srcPort + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.FirewallIp postIpFirewall(java.lang.String ipOnFirewall, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("ipOnFirewall", ipOnFirewall);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.FirewallIp.class);
	}

	public java.lang.String getLoadBalancingServiceNameBackend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.BlockedIp getIpAntihackIpBlocked(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/antihack/" + ipBlocked + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.BlockedIp.class);
	}

	public java.lang.String getIpDelegation(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/delegation";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public long[] getIpTask(java.lang.String ip, java.lang.String function, java.lang.String status) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public long[] getIpTask(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/task";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

	public net.zyuiop.ovhapi.api.objects.services.Service getLoadBalancingServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/serviceInfos";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.services.Service.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameRestoreSsl(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/restoreSsl";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.SpamStats getIpSpamIpSpammingStats(java.util.Date to, java.util.Date from, java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/spam/" + ipSpamming + "/stats";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.SpamStats.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.ArpBlockedIp getIpArpIpBlocked(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/arp/" + ipBlocked + "";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.ArpBlockedIp.class);
	}

	public void putIp(net.zyuiop.ovhapi.api.objects.ip.Ip param0, java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getIpFirewall(java.lang.String ip, java.lang.String state, boolean enabled) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpFirewall(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/firewall";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpArp(java.lang.String ip, java.lang.String state) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/arp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpArp(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/arp";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseVirtuozzo(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/virtuozzo";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseVirtuozzo(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/virtuozzo";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public void putIpGameIpOnGame(net.zyuiop.ovhapi.api.objects.ip.GameMitigation param0, java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/game/" + ipOnGame + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("null", null);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.PUT;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}

	public java.lang.String getLoadBalancingServiceNameAllowedBackends(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/allowedBackends";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendBackupState(boolean backupStateSet, java.lang.String serviceName, java.lang.String backend, java.lang.String mainBackendIp) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend/" + backend + "/backupState";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("backupStateSet", backupStateSet);
		__dataMap.put("mainBackendIp", mainBackendIp);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendBackupState(boolean backupStateSet, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/loadBalancing/" + serviceName + "/backend/" + backend + "/backupState";
		Map<Object, Object> __dataMap = new HashMap<>();
		__dataMap.put("backupStateSet", backupStateSet);
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask.class);
	}

	public java.lang.String getIpLicenseCloudLinux(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/cloudLinux";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

	public java.lang.String getIpLicenseCloudLinux(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/" + ip + "/license/cloudLinux";
		String __data = "?";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}

}
