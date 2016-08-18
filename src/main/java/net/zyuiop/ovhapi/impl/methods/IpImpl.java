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


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/mitigationProfiles
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpGame(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/game";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/terminate
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : DELETE > /ip/loadBalancing/$serviceName/backend/$backend
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/arp/$ipBlocked
	* Message : Missing identifier.
	*/


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

	public void deleteIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles/" + ipMitigationProfile + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/changeOrg
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ip/$ip/game/$ipOnGame
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/game/$ipOnGame
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


	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/restoreSsl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/phishing/$id
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/migrationToken
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/mitigation
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLoadBalancingServiceNameBackend(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/backend";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/backend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/backend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/spam/$ipSpamming/stats
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/firewall
	* Message : Missing identifier.
	*/


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
	* Involved method : PUT > /ip/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/move
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ip/$ip/mitigationProfiles/$ipMitigationProfile
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/firewall/$ipOnFirewall/rule
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/firewall/$ipOnFirewall/rule
	* Message : Missing identifier.
	*/


	public java.lang.String getLoadBalancingServiceNameInternalNatIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/internalNatIp";
		String __data = "?";
		__data += "zone=" + zone;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
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


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/task/$taskId
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLoadBalancing() throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing";
		String __data = "";
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/mitigation/$ipOnMitigation/topStream
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/spam/$ipSpamming
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /ip/$ip/mitigation/$ipOnMitigation
	* Message : Missing identifier.
	*/


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

	public void deleteIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/reverse/" + ipReverse + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/firewall/$ipOnFirewall
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /ip/$ip/game/$ipOnGame/rule/$id
	* Message : Missing identifier.
	*/


	public void postIpAntihackIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/antihack/" + ipBlocked + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
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


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/reverse
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/park
	* Message : Missing identifier.
	*/


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


	/*
	* Method creation failed.
	* Involved method : GET > /ip/loadBalancing/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/loadBalancing/$serviceName
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ip/$ip/ripe
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/game/$ipOnGame/rule/$id
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


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/mitigationProfiles/$ipMitigationProfile
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/loadBalancing/$serviceName/task/$taskId
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/importCustomSsl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/importCustomSsl
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ip/loadBalancing/$serviceName/serviceInfos
	* Message : Missing identifier.
	*/


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
	* Involved method : GET > /ip/loadBalancing/$serviceName/portsRedirection/$srcPort
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ip/loadBalancing/$serviceName/backend/$backend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/antihack/$ipBlocked
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /ip/$ip/firewall/$ipOnFirewall/rule/$sequence
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/ripe
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpReverse(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/reverse";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/backend/$backend/backupState
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/backend/$backend/backupState
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/mitigation/$ipOnMitigation
	* Message : Missing identifier.
	*/


	public void deleteIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/delegation/" + target + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/firewall/$ipOnFirewall/rule/$sequence
	* Message : Missing identifier.
	*/


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

	public long[] getLoadBalancingServiceNamePortsRedirection(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/portsRedirection";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/migrationToken
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLoadBalancingServiceNameProbeIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/probeIp";
		String __data = "?";
		__data += "zone=" + zone;
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
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


	/*
	* Method creation failed.
	* Involved method : PUT > /ip/$ip/mitigation/$ipOnMitigation
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : PUT > /ip/$ip/firewall/$ipOnFirewall
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/portsRedirection
	* Message : Missing identifier.
	*/


	public java.lang.String[] getLoadBalancingServiceNameAllowedBackends(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/allowedBackends";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}

	public java.lang.String[] getIpMitigationProfiles(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/mitigationProfiles";
		String __data = "?";
		__data += "ip=" + ip;
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

	public void postIpArpIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/arp/" + ipBlocked + "/unblock";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.POST;
		URL __url = new URL(__callUrl);
		this.client.callRaw(__url, __method, __data, true);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/reverse/$ipReverse
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/loadBalancing/$serviceName/backend/$backend
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/spam/$ipSpamming/unblock
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/backend/$backend/setWeight
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/delegation
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : DELETE > /ip/loadBalancing/$serviceName/portsRedirection/$srcPort
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : POST > /ip/$ip/game/$ipOnGame/rule
	* Message : Missing identifier.
	*/


	public java.lang.String[] getIpDelegation(java.lang.String ip) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/delegation";
		String __data = "?";
		__data += "ip=" + ip;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String[].class);
	}


	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/delegation/$target
	* Message : Missing identifier.
	*/



	/*
	* Method creation failed.
	* Involved method : GET > /ip/$ip/mitigation/$ipOnMitigation/stats
	* Message : Missing identifier.
	*/


	public java.lang.String deleteIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/" + ip + "/firewall/" + ipOnFirewall + "";
		Map<Object, Object> __dataMap = new HashMap<>();
		String __data = new Gson().toJson(__dataMap);
		OVHApiMethod __method = OVHApiMethod.DELETE;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), java.lang.String.class);
	}


	/*
	* Method creation failed.
	* Involved method : POST > /ip/loadBalancing/$serviceName/stickiness
	* Message : Missing identifier.
	*/


	public long[] getLoadBalancingServiceNameTask(java.lang.String serviceName) throws java.io.IOException {
		String __callUrl = "https://api.ovh.com/1.0/ip/loadBalancing/" + serviceName + "/task";
		String __data = "?";
		__data += "serviceName=" + serviceName;
		OVHApiMethod __method = OVHApiMethod.GET;
		URL __url = new URL(__callUrl);
		return new Gson().fromJson(this.client.callRaw(__url, __method, __data, true), long[].class);
	}

}
